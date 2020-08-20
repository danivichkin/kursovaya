import 'api/resource'
import App from 'pages/App.vue'
import {connect} from "./util/ws";
import vuetify from 'plugins'
import Vue from "vue";

if (frontendData.profile) {
    connect()
}

new Vue({
    el: '#app',
    vuetify,
    render: a => a(App)
}).$mount('#app')