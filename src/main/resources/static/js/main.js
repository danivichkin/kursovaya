import '@babel/polyfill'
import 'api/resource'
import router from 'router/router'
import App from 'pages/App.vue'
import store from "./store/store";
import {connect} from "./util/ws";
import vuetify from 'plugins'
import Vue from "vue";

if (frontendData.profile) {
    connect()
}

new Vue({
    el: '#app',
    router,
    store,
    vuetify,
    render: a => a(App)
}).$mount('#app')