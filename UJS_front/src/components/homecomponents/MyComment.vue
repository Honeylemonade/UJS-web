<template>
    <div v-show="currentUser!='游客'">
        <!--文本框-->
        <div class="row">
            <div class="col-11">
                <textarea class="form-control h-100" cols="80" rows="3" v-model="content"
                          placeholder="请自觉遵守互联网相关政策法规，严禁发布色情，暴力，反动言论。">
            </textarea>
            </div>
            <div class="col-1">
                <button @click="submit" class="btn btn-secondary h-100">发表评论</button>
            </div>
        </div>
        <hr>
        <!--显示评论区-->
        <div class="container ">
            <div v-show="index<5" v-bind:key="comment.time" v-for="(comment,index) in comments">

                <div class="row">
                    <div class="col-2 ">
                        <div>
                            <img v-bind:src="src" height="40px" alt="">
                        </div>
                        {{comment.userName}}
                    </div>
                    <div class="col-10 border">{{comment.content}}</div>
                </div>
                <div class="row justify-content-end">
                    <div class="col-10 text-muted text-right small">{{ getTime(comment.time) }}</div>
                </div>
                <hr>
            </div>
        </div>
    </div>
</template>

<script>
    export default {
        name: "MyComment",
        data() {
            return {
                content: '',
                comments: [],
                src: require('../../assets/img/commentHead.png')

            }
        },
        computed: {
            currentUser() {
                return this.$store.state.user;
            }
        },
        methods: {
            getTime(timeStamp) {
                timeStamp = timeStamp * 1000;
                var date = new Date(timeStamp);
                return date.toLocaleDateString().replace(/\//g, "-") + " " + date.toTimeString().substr(0, 8);
            }
            ,
            submit() {
                var comment = {
                    "userName": this.currentUser,
                    "content": this.content,
                    "time": Math.round(new Date() / 1000),
                }
                this.axios.post("http://localhost:8080/comment", comment).then(response => {
                    if (response != null) {
                        this.axios.get("http://localhost:8080/comment").then(respons => {
                            this.comments = respons.data;
                        })
                    }
                });
            }
        },
        mounted() {
            this.axios.get("http://localhost:8080/comment").then(respons => {
                this.comments = respons.data;
            })
        }
    }
</script>

<style scoped>
    /* placeholder字体大小  */
    textarea::-webkit-input-placeholder {
        font-size: 13px;
    }

    div {
        white-space: normal;
        word-break: break-all;
        word-wrap: break-word;
    }
</style>