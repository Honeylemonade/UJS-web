<template>
    <div>
        <div>{{content}}</div>
        <button @click="change">点击我</button>
    </div>
</template>

<script>
    export default {
        name: 'HelloWorld',
        data: function () {
            return {
                content: '456'
            }
        },
        methods:{
            change:function () {
                this.content=Date.parse("2019-05-18")/1000;
            }
        }
    }
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>

</style>
