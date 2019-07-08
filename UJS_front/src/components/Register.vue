<template>
    <div class="container">
        <div class="py-2 text-center">
            <h2 class="display-4">欢迎注册江苏大学</h2>
            <h2 class="display-4">交流平台</h2>
            <p class="font-weight-lighter mt-3">欢迎来到注册页面，填写您的信息，点击提交即可加入此网站的用户计划！</p>
        </div>
        <div class="row justify-content-center">
            <div class="col-lg-6">
                <form novalidate="">
                    <!--姓名-->
                    <div class="mb-3">
                        <label for="name">姓名</label>
                        <input v-model="name" type="text" class="form-control" id="name"
                               placeholder="Name"
                               value=""
                               required="">
                        <div v-show="!existName&&hasClickRegiste" class="small text-danger">
                            请填写您的姓名
                        </div>
                        <div v-show="!regName&&hasClickRegiste" class="small text-danger">
                            请填写正确格式
                        </div>
                    </div>
                    <!--用户名-->
                    <div class="mb-3">
                        <label for="username">用户名</label>
                        <input @blur="checkDuplicateUserName" v-model="userName" type="text" class="form-control"
                               id="username" placeholder="Username"
                               required="">
                        <div v-show="!existUserName&&hasClickRegiste" class="small text-danger">
                            请填写您的用户名
                        </div>
                        <div v-show="duplicateUserName" class="small text-danger">
                            此用户名已存在
                        </div>
                        <div v-show="!regUserName&&hasClickRegiste" class="small text-danger">
                            请填写正确格式
                        </div>
                    </div>
                    <!--密码-->
                    <div class="mb-3">
                        <label for="password">密码</label>
                        <input v-model="password" type="password" class="form-control" id="password"
                               placeholder="Password" value=""
                               required="">
                        <div v-show="!existPassword&&hasClickRegiste" class="small text-danger">
                            请填写您的密码
                        </div>
                        <div v-show="!regPassword&&hasClickRegiste" class="small text-danger">
                            请填写正确格式
                        </div>
                    </div>
                    <!--性别-->
                    <div class="mb-3">
                        <div class="row ml-0 align-items-center">
                            <div class="my-3 ">性别&emsp;&emsp;&emsp;&emsp;&emsp;</div>
                            <div class="custom-control custom-radio custom-control-inline ">
                                <input value="1" type="radio" id="customRadio1" v-model="gender"
                                       class="custom-control-input">
                                <label class="custom-control-label" for="customRadio1">男&emsp;</label>
                            </div>
                            <div class="custom-control custom-radio ">
                                <input value="2" type="radio" id="customRadio2" v-model="gender" name="genderRadio"
                                       class="custom-control-input">
                                <label class="custom-control-label" for="customRadio2">女</label>
                            </div>
                            <div v-show="!existGender&&hasClickRegiste" class="small text-danger">
                                请选择您的性别
                            </div>
                        </div>

                    </div>
                    <!--日期-->
                    <div>
                        <div class="form-row">
                            <div class="col-lg-5 mb-3 input-group ">
                                <input v-model="year" type="text" class="form-control" id="year" placeholder="1999"
                                       required>
                                <div class="input-group-append">
                                    <span class="input-group-text">年</span>
                                </div>

                            </div>
                            <div class="col-lg-4 mb-3 input-group">
                                <input v-model="month" type="text" class="form-control" id="month" placeholder="09"
                                       required>
                                <div class="input-group-append">
                                    <span class="input-group-text">月</span>
                                </div>

                            </div>
                            <div class="col-lg-3 mb-3 input-group">
                                <input v-model="day" type="text" class="form-control" id="day" placeholder="09"
                                       required>
                                <div class="input-group-append">
                                    <span class="input-group-text">日</span>
                                </div>

                            </div>
                        </div>
                        <div class="row">
                            <div class="col-lg-5">
                                <div v-show="!existYear&&hasClickRegiste" class="small text-danger">
                                    请填写您的出生年
                                </div>
                                <div v-show="!regYear&&hasClickRegiste" class="small text-danger">
                                    请填写正确格式
                                </div>
                            </div>
                            <div class="col-lg-4">
                                <div v-show="!existMonth&&hasClickRegiste" class="small text-danger">
                                    请填写出生的月
                                </div>
                                <div v-show="!regMonth&&hasClickRegiste" class="small text-danger">
                                    请填写正确格式
                                </div>

                            </div>
                            <div class="col-lg-3">
                                <div v-show="!existDay&&hasClickRegiste" class="small text-danger">
                                    请填写您的出生日
                                </div>
                                <div v-show="!regDay&&hasClickRegiste" class="small text-danger">
                                    请填写正确格式
                                </div>
                            </div>
                        </div>
                    </div>
                    <!--邮箱-->
                    <div class="mb-3 ">
                        <label for="email">Email <span class="text-muted"></span></label>
                        <div class="input-group">
                            <input @blur="checkDuplicateEmail" v-model="email" type="email" class="form-control"
                                   id="email"
                                   placeholder="you@example.com">
                            <div class="input-group-append">
                                <span class="input-group-text">@</span>
                            </div>
                        </div>
                        <div v-show="!existEmail&&hasClickRegiste" class="small text-danger">
                            请填写您的邮箱
                        </div>
                        <div v-show="duplicateEmail" class="small text-danger">
                            此邮箱已被注册
                        </div>
                        <div v-show="!regEmail&&hasClickRegiste" class="small text-danger">
                            请填写正确格式
                        </div>
                    </div>
                    <!--电话号码-->
                    <div class="mb-3">
                        <label for="phone">电话号码</label>
                        <input @blur="checkDuplicateTelephoneNumber" v-model="telephoneNumber" type="text"
                               class="form-control" id="phone"
                               placeholder="xxx-xxx-xxxxx" required="">
                        <div v-show="!existTelephoneNumber&&hasClickRegiste" class="small text-danger">
                            请填写您的电话号码
                        </div>
                        <div v-show="duplicateTelephoneNumber" class="small text-danger">
                            此手机号码已被注册
                        </div>
                        <div v-show="!regTelephoneNumber&&hasClickRegiste" class="small text-danger">
                            请填写正确格式
                        </div>
                    </div>
                    <!--横线-->
                    <hr class="mb-4">
                    <div v-show="success" class="text-center text-success font-weight-lighter mb-2">注册成功! 2秒后跳转到登录页</div>
                    <button @click="registe" type="button" class="btn btn-success btn-lg btn-block">注册</button>
                </form>
            </div>
        </div>
    </div>
</template>

<script>
    export default {
        name: "Register",
        data: function () {
            return {
                name: '',
                userName: '',
                duplicateUserName: false,
                password: '',
                gender: '',
                year: '',
                month: '',
                day: '',
                email: '',
                duplicateEmail: false,
                telephoneNumber: '',
                duplicateTelephoneNumber: false,
                hasClickRegiste: false,
                success: false,
            }
        },
        computed: {
            existName: function () {
                if (this.name == '') {
                    return false;
                } else {
                    return true;
                }
            },
            existUserName: function () {
                if (this.userName == '') {
                    return false;
                } else {
                    return true;
                }
            },
            existPassword: function () {
                if (this.password == '') {
                    return false;
                } else {
                    return true;
                }
            },
            existGender: function () {
                if (this.gender == '') {
                    return false;
                } else {
                    return true;
                }
            },
            existYear: function () {
                if (this.year == '') {
                    return false;
                } else {
                    return true;
                }
            },
            existMonth: function () {
                if (this.month == '') {
                    return false;
                } else {
                    return true;
                }
            },
            existDay: function () {
                if (this.day == '') {
                    return false;
                } else {
                    return true;
                }
            },
            existEmail: function () {
                if (this.email == '') {
                    return false;
                } else {
                    return true;
                }
            },
            existTelephoneNumber: function () {
                if (this.telephoneNumber == '') {
                    return false;
                } else {
                    return true;
                }
            },
            existAll: function () {
                if (this.existName && this.existUserName && this.existPassword
                    && this.existGender && this.existYear && this.existMonth && this.existDay
                    && this.existEmail && this.existTelephoneNumber) {
                    return true;
                } else {
                    return false;
                }
            },
            regName: function () {
                var reg = /^[\u4e00-\u9fa5a-zA-Z0-9_-]{2,20}$/;
                return reg.test(this.name)
            },
            regUserName: function () {
                var reg = /^[\u4e00-\u9fa5a-zA-Z0-9_-]{2,20}$/;
                return reg.test(this.userName)
            },
            regPassword: function () {
                var reg = /^[\w_-]{1,30}$/;
                return reg.test(this.password)
            },
            regYear: function () {
                var reg = /^19[0-9][0-9]$|20[01][0-9]$/;
                return reg.test(this.year)
            },
            regMonth: function () {
                var reg = /^0[1-9]$|1[0-2]$/;
                return reg.test(this.month)
            },
            regDay: function () {
                var reg = /^0[1-9]$|1[0-9]$|2[0-9]$|30$/;
                return reg.test(this.day)
            },
            regEmail: function () {
                var reg = /^\w[-\w.+]{5,24}@([A-Za-z0-9][-A-Za-z0-9]+\.)+[A-Za-z]{2,14}$/;
                return reg.test(this.email)
            },
            regTelephoneNumber: function () {
                var reg = /^(13\d|14[579]|15[^4\D]|17[^49\D]|18\d)\d{8}$/;
                return reg.test(this.telephoneNumber)
            },
            regAll: function () {
                if (this.regName && this.regUserName && this.regPassword
                    && this.regYear && this.regMonth && this.regDay
                    && this.regEmail && this.regTelephoneNumber) {
                    return true;
                } else {
                    return false;
                }
            }
        },
        methods: {
            //判断用户名是否已存在
            checkDuplicateUserName: function () {
                this.axios.get("http://localhost:8080/user/" + encodeURI(this.userName)).then(response => {
                    if (response.data.userName === this.userName) {
                        this.duplicateUserName = true;
                    } else {
                        this.duplicateUserName = false;
                    }
                })

            },
            //判断邮箱是否已经被注册
            checkDuplicateEmail: function () {
                this.axios.get("http://localhost:8080/euser/" + encodeURI(this.email)).then(response => {
                    if (response.data.email === this.email) {
                        this.duplicateEmail = true;
                    } else {
                        this.duplicateEmail = false;
                    }
                });
            },
            //判断电话号码是否已经被注册
            checkDuplicateTelephoneNumber: function () {
                this.axios.get("http://localhost:8080/tuser/" + encodeURI(this.telephoneNumber)).then(response => {
                    if (response.data.telephoneNumber === this.telephoneNumber) {
                        this.duplicateTelephoneNumber = true;
                    } else {
                        this.duplicateTelephoneNumber = false;
                    }
                });
            },
            //注册操作
            registe: function () {
                //判断显示空的input
                this.hasClickRegiste = true;
                if (this.existAll && this.regAll
                    && !this.duplicateUserName && !this.duplicateEmail && !this.duplicateTelephoneNumber) {
                    //向数据库插入用户信息
                    var newUser = {
                        "userName": this.userName,
                        "gender": this.gender,
                        "birthday": Date.parse(this.year + "-" + this.month + "-" + this.day) / 1000,
                        "password": this.password,
                        "email": this.email,
                        "telephoneNumber": this.telephoneNumber
                    }
                    this.success=true;
                    this.axios.post("http://localhost:8080/user", newUser);
                    var temp = this;
                    setTimeout(function () {
                        temp.$router.push({path: '/login'});
                    }, 2000);

                }
            }
        }
    }
</script>

<style scoped>
</style>