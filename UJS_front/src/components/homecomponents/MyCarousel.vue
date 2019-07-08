<template>
    <div>
        <div id="myCarousel" class="carousel slide" data-ride="carousel">
            <ol class="carousel-indicators">
                <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
                <li data-target="#myCarousel" data-slide-to="1" class=""></li>
                <li data-target="#myCarousel" data-slide-to="2" class=""></li>
            </ol>
            <div class="carousel-inner">
                <div class="carousel-item active">
                    <img class="first-slide d-block h-auto w-auto " v-bind:src="src1" alt="First slide">
                    <div class="container">
                        <div class="carousel-caption text-left">
                            <h1 class="display-4">My Lover Lies Under.</h1>
                            <p class="font-weight-light">Through the shadows of the old high rise, Cross the footnotes of self sacrifice, Some place somewhere there are bluer skies, My lover lies under.</p>
                            <p><a  class="btn  btn-primary" href="https://www.bilibili.com/video/av39228122?from=search&seid=4740752239632514127" role="button">Learn More</a></p>
                        </div>
                    </div>
                </div>
                <div class="carousel-item">
                    <img class="second-slide d-block h-auto w-auto" v-bind:src="src2" alt="Second slide">
                    <div class="container">
                        <div class="carousel-caption">
                            <h1 class="display-4">Don't Stop Me Now.</h1>
                            <p class="font-weight-light">Tonight I’m gonna have myself a real good time, I feel alive,
                                and the world turning inside out Yeah! And floating around in ecstasy, So don’t stop me now, Don’t stop me.</p>
                            <p><a  class="btn btn-primary" href="https://www.bilibili.com/video/av47347661?from=search&seid=10573322367349776533" role="button">Learn More</a></p>
                        </div>
                    </div>
                </div>
                <div class="carousel-item">
                    <img class="third-slide d-block h-auto w-auto" v-bind:src="src3" alt="Third slide">
                    <div class="container">
                        <div class="carousel-caption text-right">
                            <h1 class="display-4">Moon River.</h1>
                            <p class="font-weight-light">Moon river, wider than a mile, I'm crossing you in style some day, Oh, dream maker, you heart breaker, Wherever you're goin', I'm goin' your way.</p>
                            <p><a  class="btn btn-primary" href="https://www.bilibili.com/video/av22122919?from=search&seid=7072203391538671474" role="button">Learn More</a></p>
                        </div>
                    </div>
                </div>
            </div>
            <a class="carousel-control-prev" href="#myCarousel" role="button" data-slide="prev">
                <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                <span class="sr-only">Previous</span>
            </a>
            <a class="carousel-control-next"  href="#myCarousel" role="button" data-slide="next">
                <span class="carousel-control-next-icon" aria-hidden="true"></span>
                <span class="sr-only">Next</span>
            </a>
        </div>
    </div>
</template>

<script>
    import $ from 'jquery'
    import '../../assets/css/carousel.css'
    export default {
        name: "MyCarousel",
        mounted() {
            $("#myCarousel").carousel({
                interval:5000
            });
        },
        data(){
            return{
                src1:require('../../assets/img/background2.png'),
                src2:require('../../assets/img/background5.png'),
                src3:require('../../assets/img/background3.jpg'),
            }
        }
    }
</script>

<style scoped>

</style>