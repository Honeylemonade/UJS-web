<template>
    <div>
        <header>
            <nav class="navbar navbar-expand navbar-dark fixed-top bg-dark">
                <a class="navbar-brand">
                    <img v-bind:src="src" height="30" alt="">
                </a>
                <div class="collapse navbar-collapse" id="navbarCollapse">
                    <div class="navbar-nav ">
                        <router-link to="/" class=" nav-item  d-inline p-2 bg-dark text-white">
                            Home
                        </router-link>
                        <router-link to="/login" class=" nav-item  d-inline p-2 bg-dark text-white">
                            Login
                        </router-link>
                        <router-link to="/register" class=" nav-item  d-inline p-2 bg-dark text-white">
                            Register
                        </router-link>
                    </div>
                    <div class="container">
                        <div class="row justify-content-end">
                            <img v-bind:src="headSrc" height="30" alt="">
                            <div class="text-light align-middle pt-2 px-2">
                                {{currentUser}}
                            </div>
                        </div>
                    </div>
                </div>
            </nav>
        </header>
    </div>
</template>
<script>
    export default {
        name: "MyHeader",
        computed: {
            currentUser() {
                return this.$store.state.user;
            }
        },
        data() {
            return {
                src: require('../assets/img/logo2.png'),
                headSrc: require('../assets/img/head.png'),
            }
        }
    }
</script>

<style scoped>
    header {
        margin-bottom: 8px;
    }
</style>