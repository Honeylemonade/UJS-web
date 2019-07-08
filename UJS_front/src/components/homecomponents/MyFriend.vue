<template>
    <div class="h-100" v-show="currentUser!='游客'">

        <div class="card bg-light h-100">
            <div class="card-header text-center">
                <div class="form-inline justify-content-center">
                    <input @keypress.enter="addFriend" v-model="friendUserName"
                           class="form-control form-control-sm mr-2 my-1"
                           type="search" placeholder="用户名" aria-label="Search">
                    <button @click="addFriend" class="btn  btn-sm btn-outline-success my-1 " type="button">添加好友</button>
                </div>
                <div v-show="hasBeanFriend" class=" text-danger small">您与"{{friendUserName}}"已经存在好友关系 !</div>
                <div v-show="dontExist" class=" text-danger small">此用户不存在 !</div>
                <div v-show="addSuccess" class=" text-success small">添加成功 !</div>
            </div>
            <!--如果没有朋友提示-->
            <div v-show="friends.length==0" class="text-center">
                <div class="h3 font-weight-light">您暂无好友,</div>
                <div class="h3 font-weight-light">结交些朋友吧！</div>
            </div>

                <table v-show="friends.length!=0" class="table text-center ">
                    <thead>
                    <tr>
                        <th scope="col">用户名</th>
                        <th scope="col">邮箱</th>
                        <th scope="col">删除好友</th>
                    </tr>
                    </thead>
                    <tbody>
                    <tr v-bind:key="friend.userName" v-for="(friend,index) in friends">
                        <td scope="row">{{friend.userName}}</td>
                        <td class="small">{{friend.email}}</td>
                        <td class="justify-content-center">
                            <button @click="deleteFriend(index)" type="button" class="btn btn-danger btn-sm justify-content-center text-center" aria-label="Close">
                                删除
                            </button>
                        </td>
                    </tr>
                    </tbody>
                </table>
            </div>
    </div>
</template>

<script>
    export default {
        name: "MyFriend",
        data() {
            return {
                friends: [],
                friendUserName: '',
                allUsers: [],
                hasBeanFriend: false,
                dontExist: false,
                addSuccess: false,


            }
        },
        methods: {
            addFriend() {
                //判断是否已经是好友
                for (let i = 0; i < this.friends.length; i++) {
                    if (this.friends[i].userName == this.friendUserName) {
                        this.hasBeanFriend = true;
                        this.dontExist = false;
                        this.addSuccess = false;
                        return;
                    }
                }
                //判断是否存在此用户
                for (let i = 0; i < this.allUsers.length; i++) {
                    if (this.allUsers[i].userName == this.friendUserName) {
                        //更新视图
                        let newFriendItem = {
                            birthday: null,
                            email: null,
                            gender: null,
                            id: null,
                            password: null,
                            telephoneNumber: null,
                            userName: null,
                        };
                        this.axios.get('http://localhost:8080/user/' + this.friendUserName).then(response => {
                            newFriendItem.birthday = response.data.birthday;
                            newFriendItem.email = response.data.email;
                            newFriendItem.gender = response.data.gender;
                            newFriendItem.id = response.data.id;
                            newFriendItem.password = response.data.password;
                            newFriendItem.telephoneNumber = response.data.telephoneNumber;
                            newFriendItem.userName = response.data.userName;
                        })
                        this.friends.push(newFriendItem);
                        //更新数据库
                        let friend = {
                            "reference": this.currentUser,
                            "referenced": this.friendUserName
                        }
                        this.axios.post('http://localhost:8080/friend', friend);
                        //不存在此用户
                        this.hasBeanFriend = false;
                        this.dontExist = false;
                        this.addSuccess = true;
                        return;
                    }
                }
                this.hasBeanFriend = false;
                this.dontExist = true;
                this.addSuccess = false;
            },
            deleteFriend(index) {

                //删除数据库中条目
                var deleteFriendItem = {
                    "reference": this.currentUser,
                    "referenced": this.friends[index].userName
                }
                this.axios.delete('http://localhost:8080/friend', {data: deleteFriendItem})
                //删除视图
                this.friends.splice(index, 1);
            },
        }
        ,
        computed: {
            currentUser() {
                return this.$store.state.user;
            },

        },
        mounted() {
            //获取好友信息
            this.axios.get('http://localhost:8080/friend/' + encodeURI(this.currentUser)).then(response => {
                this.friends = response.data;
            });
            //获取全部用户信息
            this.axios.get('http://localhost:8080/user').then(response => {
                this.allUsers = response.data;
            })
        }
    }
</script>

<style scoped>

</style>