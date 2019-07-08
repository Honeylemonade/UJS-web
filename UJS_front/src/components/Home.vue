<template>
    <div>
        <MyCarousel></MyCarousel>
        <div class="container">
            <div class="justify-content-center">
                <div class="col-lg-12 mb-4">
                    <NewsBox ></NewsBox>
                </div>

            </div>


            <div class="row mb-4">
                <div class="col-lg-4 mb-4">
                    <MyDepartment></MyDepartment>
                </div>
                <div class="col-lg-4 mb-4">
                    <MyOfficialLink></MyOfficialLink>
                </div>
                <div class="col-lg-4 mb-4">
                    <MyWeather></MyWeather>
                </div>

            </div>


            <div class="row justify-content-center mb-4">
                <div class="col-lg-4 mb-4">
                    <MyFriend></MyFriend>
                </div>
                <div class="col-lg-4 mb-4 text-center">
                    <MyGame></MyGame>
                </div>
                <div class="col-lg-4 mb-4">
                    <MyRank></MyRank>
                </div>
            </div>

            <div class=" mb-4">
                    <MyComment></MyComment>
            </div>
        </div>
    </div>
</template>

<script>
    import MyCarousel from './homecomponents/MyCarousel'
    import NewsBox from './homecomponents/NewsBox'
    import MyWeather from './homecomponents/MyWeather'
    import MyGame from './homecomponents/MyGame'
    import MyDepartment from './homecomponents/MyDepartment'
    import MyFriend from './homecomponents/MyFriend'
    import MyRank from './homecomponents/MyRank'
    import MyOfficialLink from './homecomponents/MyOfficialLink'
    import MyComment from './homecomponents/MyComment'

    export default {
        name: "Home",
        data: function () {
            return {}
        },
        methods: {},
        components: {
            MyCarousel,
            NewsBox,
            MyWeather,
            MyGame,
            MyDepartment,
            MyFriend,
            MyRank,
            MyOfficialLink,
            MyComment
        }
    }
</script>

<style scoped>
</style>