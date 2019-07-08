<template>
    <div>
        <div class="container">
            <div class="row justify-content-center">
                <div class="display-4 mb-1">Welcome to my website!</div>
                <div class="text-center font-weight-light my-2 w-75 ">In this place, you can get the latest news about
                    Jiangsu University,
                    contact information for each department and links to the school's official website, you can also
                    play《Flappy bird》
                    with your friends, and check the latest ranking of you and your friends, enjoy it!
                </div>
            </div>
        </div>
        <div class="row justify-content-center">
            <div class="card w-100 bg-light">
                <div class="card-header text-center">
                    <span>江大新闻</span>
                    <a class="float-right text-muted text-dark "
                       href="http://www.ujs.edu.cn/system/resource/code/rss/rssfeed.jsp?type=list&treeid=1062&viewid=187881&mode=10&dbname=vsb&owner=1342798350&ownername=ujs&contentid=132545&number=20&httproot=">more</a>
                </div>
                <div class="card-body">
                    <div v-bind:key="newItem.date" v-for="newItem in news">
                        <div>
                            <span class="badge badge-success">New</span>
                            <a class="line-limit-length  text-dark" v-bind:href="newItem.url"> {{newItem.title.slice(0,34)}}</a>
                            <span class="text-muted small float-right">{{newItem.date.slice(0,16)}}</span>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</template>

<script>
    export default {
        name: "NewsBox",
        data: function () {
            return {
                news: ""
            }
        },
        mounted() {
            this.axios.get("http://localhost:8080/new").then(response => {
                this.news = response.data;
            })
        }
    }
</script>

<style scoped>

</style>