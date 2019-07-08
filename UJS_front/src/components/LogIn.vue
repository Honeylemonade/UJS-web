<template>
    <div>
        <div class="jumbotron text-center" style="width: 100%;padding-bottom:20px">
            <h1 class="display-4">江苏大学交流平台</h1>
            <p class="lead">Jiangsu University Communication Platform</p>
            <hr class="my-0 mb-4">
            <p style="width: 65%" class="font-weight-light mx-auto">欢迎来到江苏大学交流平台！在这里，您不仅可以获得江苏大学的最新资讯 <span class="badge badge-success">News</span>，
                还可以认识到许多有趣的朋友，立即登录，开始你的旅行吧。</p>
        </div>
    <div class="container justify-content-center align-content-center border">
            <!--表单-->
                <form @submit.prevent="submit" v-on:keypress.enter="submit" class="text-center my-5">
                    <img v-bind:src="src" class="img-fluid" width="70%" alt="login.svg">
                    <div class="my-4"></div>
                    <div class="form-group">
                        <input v-model="userName" type="text" class="form-control" id="userName" placeholder="用户名">
                        <input v-model="password" type="password" class="form-control" id="password" placeholder="密码">
                    </div>
                    <div v-show="isEmpty" class="text-center text-danger  small">请将表单信息填写完整</div>
                    <div v-show="isError" class="text-center text-danger  small">账号或密码错误</div>
                    <div class="row justify-content-center mb-2">
                        <button type="button" class="btn btn-link " data-toggle="tooltip" data-placement="left"
                                title="暂未实现此功能">忘记密码
                        </button>
                        <button class="btn btn-link">
                            <router-link to="/register">注册</router-link>
                        </button>
                    </div>
                    <button type="button" @click="submit" class="btn btn-secondary btn-block">登录</button>
                </form>
        </div>
    </div>
</template>


<script>
    import $ from 'jquery'

    export default {
        name: "LogIn",
        mounted() {
            $(document).ready(function () {
                $(function () {
                    $('[data-toggle="tooltip"]').tooltip()
                })
            })
        },
        data: function () {
            return {
                userName: '',
                password: '',
                isEmpty: false,
                isError: false,
                src: require('../assets/img/login.svg'),
            }
        },
        methods: {
            //提交登录信息
            submit: function () {
                if (this.userName == '' || this.password == '') {
                    this.isEmpty = true;
                    this.isError = false;
                } else {
                    this.isEmpty = false;
                    this.isError = false;
                    var url = 'http://localhost:8080/user/' + encodeURI(this.userName);
                    //进行身份比对
                    this.axios.get(url).then(response => {
                        if (response.data.password == this.password) {
                            this.$store.state.user = this.userName;
                            this.$router.push({path: '/'})
                        } else {
                            this.isError = true;
                        }

                    })
                }
            },
        }

    }
</script>

<style scoped>

    .container {
        max-width: 500px;
        height: 100%;
    }

    form {
        min-width: 300px;
        padding: 5px;
    }

    #userName {
        position: relative;
        margin-bottom: -1px;
        border-bottom-right-radius: 0;
        border-bottom-left-radius: 0;
        padding: 10px;
    }

    #userName:focus {
        z-index: 2;
    }

    #password {
        position: relative;
        margin-bottom: 10px;
        border-top-left-radius: 0;
        border-top-right-radius: 0;
        padding: 10px;
    }

    #password:focus {
        z-index: 2;
    }
</style>