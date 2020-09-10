<template>

    <v-card class="my-3" max-width="400">
        <v-img class="white--text align-end" height="200px" src="https://cdn.vuetifyjs.com/images/cards/docks.jpg">
            <v-card-title primary-title>
                {{ message.text }}
            </v-card-title>
        </v-img>

        <v-card-text class="pt-3">
            <div>
                <v-avatar
                    v-if="message.author && message.author.userpic"
                    size="36px"
                >
                    <img
                        :src="message.author.userpic"
                        :alt="message.author.name"
                    >
                </v-avatar>

                <v-avatar
                    v-else
                    size="48px"
                    color="indigo"
                >
                    <v-icon dark>mdi-account-circle</v-icon>
                </v-avatar>
                <span class="pl-3">{{ authorName }}</span>
            </div>

            <v-divider class="mx-12"></v-divider>

            <div class="pt-3">Card text</div>
        </v-card-text>

        <v-card-actions>
            <v-btn @click="edit" text>Edit</v-btn>
            <v-btn icon @click="del">
                <v-icon>delete</v-icon>
            </v-btn>
        </v-card-actions>
        <comment-list
            :comments="message.comments"
            :message-id="message.id"
        ></comment-list>
    </v-card>
</template>

<script>
import {mapActions} from 'vuex'
import CommentList from "../comment/CommentList.vue";

export default {
    props: ['message', 'editMessage'],
    components: { CommentList  },
    computed: {
        authorName() {
            return this.message.author ? this.message.author.name : 'unknown'
        }
    },
    methods: {
        ...mapActions(['removeMessageAction']),
        edit() {
            this.editMessage(this.message)
        },
        del() {
            this.removeMessageAction(this.message)
        }
    }
}
</script>


<style>
</style>