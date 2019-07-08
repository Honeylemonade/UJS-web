<template>
    <div class="h-100" v-show="currentUser!='游客'">
        <div class="card bg-light h-100">
            <div class="card-header text-center">
                <div class="my-1">好友排行榜</div>
            </div>
                <div>
                    <table class="table  text-center">
                        <thead >
                        <tr>
                            <th scope="col">名次</th>
                            <th scope="col">用户名</th>
                            <th scope="col">分数</th>
                        </tr>
                        </thead>
                        <tbody>
                        <tr v-bind:key="item.userName" v-for="(item,index) in rank">
                            <th scope="row">{{index+1}}</th>
                            <td>{{item.userName}}</td>
                            <td>{{item.score}}</td>
                        </tr>
                        <!--<tr  v-show="index<10" v-bind:key="item.userName" v-for="(item,index) in rank">
                            <th scope="row">{{index+1}}</th>
                            <td>{{item.userName}}</td>
                            <td>{{item.score}}</td>
                        </tr>-->

                        </tbody>
                    </table>
            </div>
        </div>
    </div>
</template>

<script>
    export default {
        name: "MyRank",
        data() {
            return {
                rank: [],

            }
        },
        computed: {
            currentUser() {
                return this.$store.state.user;
            }
        },
        mounted() {
            var url = 'http://localhost:8080/firendRank/';
            url = url + encodeURI(this.currentUser);
            this.axios.get(url).then(response => {
                this.rank = response.data;
            })
        }
    }
</script>

<style scoped>

</style>