<template>
    <v-container>
        <v-row>
            <v-col>
                <message-form :messageAttr="message"/>
                <v-col cols="3" sm="4">
                    <message-row v-for="message in sortedMessages"
                                 :key="message.id"
                                 :message="message"
                                 :editMessage="editMessage"/>
                    <lazy-loader></lazy-loader>
                </v-col>
            </v-col>
        </v-row>
    </v-container>
</template>

<script>
import MessageRow from 'components/messages/MessageRow.vue'
import MessageForm from 'components/messages/MessageForm.vue'
import {mapGetters} from 'vuex';
import LazyLoader from "../components/LazyLoader.vue";

export default {
    components: {
        LazyLoader,
        MessageRow,
        MessageForm
    },
    data() {
        return {
            message: null
        }
    },
    computed: mapGetters(['sortedMessages']),
    methods: {
        editMessage(message) {
            this.message = message
        }
    }
}
</script>

<style>
</style>