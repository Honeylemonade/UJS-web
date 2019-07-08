import Vue from 'vue'
import Router from 'vue-router'
//引入组件
import Home from '../components/Home'
import LogIn from '../components/LogIn'
import Register from '../components/Register'

Vue.use(Router);
export default new Router({
    routes: [
        {path: '/', component: Home},
        {path: '/login', component: LogIn},
        {path: '/register', component: Register},
    ],
    mode: 'history'
})