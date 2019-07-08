<template>
    <div>
        <div class="card bg-light">
            <div class="bg-dark text-light text-center">
                <div class="display-4">{{temperature}}</div>
                <div class="font-weight-light">
                    <span>{{date}}</span>
                    <span>{{weekday}}</span>
                </div>
                <div class="font-weight-light">
                    <span>{{city}}</span>
                    <span>{{weather}}</span>
                </div>

            </div>
            <img class="card-img-top" v-bind:src="src" alt="Card image cap">
        </div>
    </div>
</template>

<script>
    export default {
        name: "MyWeather",
        data: function () {
            return {
                weather: '',
                city: '',
                temperature: '',
                src: require('../../assets/img/sunny.png'),
                date: '',
                weekday: '',

            }
        },
        mounted() {
            //获取天气参数
            this.axios.get('http://localhost:8080/weather').then(response => {
                //获取基本天气信息
                this.weather = response.data.result.future[0].weather;
                this.city = response.data.result.city;
                this.temperature = response.data.result.future[0].temperature;
                //获取图片源
                if (this.weather == '阴' || this.weather == '多云'
                    || this.weather == '阴转多云' || this.weather == '雾' || this.weather == '霾') {
                    this.src = require('../../assets/img/cloud.png');
                } else if (this.weather == '阵雨' || this.weather == '大雨' || this.weather == '中雨'
                    || this.weather == '小雨' || this.weather == '小到中雨' || this.weather == '中到大雨') {
                    this.src = require('../../assets/img/rain.png');
                } else if (this.weather == '雷阵雨' || this.weather == '暴雨' || this.weather == '大暴雨' ||
                    this.weather == '特大暴雨' || this.weather == '大到暴雨') {
                    this.src = require('../../assets/img/strom.png');
                } else {
                    this.src = require('../../assets/img/sunny.png');
                }
            })
            //获取日期参数
            this.axios.get('http://localhost:8080/calendar').then(response => {
                this.date = response.data.result.data.date;
                this.weekday = response.data.result.data.weekday;
            })

        }
    }
</script>

<style scoped>

</style>