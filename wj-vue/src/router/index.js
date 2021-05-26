import Vue from 'vue'
import Router from 'vue-router'
import AppIndex from '@/components/home/AppIndex'
import Login from '@/components/login'
import Home from '../components/Home'
import LibIndex from '../components/Lib/LibIndex'
import Employee from '../components/Lib/Employee'
Vue.use(Router)

export default new Router({
  mode: 'history',
  routes: [
    {
      path: '/login',
      name: 'Login',
      component: Login
    },
    {
      path: '/home',
      name: 'Home',
      component: Home,
      redirect: '/index',
      children: [
        {
          path: '/index',
          name: 'AppIndex',
          component: AppIndex,
          meta: {
            requireAuth: true
          }
        },
        {
          path: '/lib',
          name: 'Lib',
          component: LibIndex,
          meta: {
            requireAuth: true
          }
        },
        {
          path: '/jotter',
          name: 'Employee',
          component: Employee,
          meta: {
            requireAuth: true
          }
        }
      ]
    }
  ]
})
