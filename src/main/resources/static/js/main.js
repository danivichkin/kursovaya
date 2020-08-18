import 'api/resource'
import App from 'pages/App.vue'
import {connect} from "./util/ws";
import vuetify from 'plugins'
import Vue from "vue";
import VueResource from "vue-resource";

if (frontendData.profile) {
    connect()
}


Vue.use(VueResource)

new Vue({
    el: '#app',
    vuetify,
    render: a => a(App)
}).$mount('#app')