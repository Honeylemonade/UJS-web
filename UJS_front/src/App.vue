<template>
    <div id="app">
        <MyHeader></MyHeader>
        <router-view></router-view>
        <MyFooter></MyFooter>
    </div>
</template>

<script>

    import MyHeader from './components/MyHeader'
    import MyFooter from './components/MyFooter'

    export default {
        name: 'app',
        components: {
            MyHeader,
            MyFooter,
        },
        data:function () {
            return{
                user:''
            }
        }
    }
</script>

<style scoped>
    #app{
        height: 100%;

    }
</style>
