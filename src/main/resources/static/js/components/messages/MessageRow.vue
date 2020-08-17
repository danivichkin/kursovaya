<template>

    <v-card class="my-3" max-width="400" >
        <v-img class="white--text align-end" height="200px" src="https://cdn.vuetifyjs.com/images/cards/docks.jpg">
            <v-card-title primary-title>
                <i>({{ message.id }})</i>
                {{ message.text }}
            </v-card-title>
        </v-img>

        <v-card-text>
            КАРТОЧКА
        </v-card-text>

        <v-card-actions>
            <v-btn @click="edit" text>Edit</v-btn>
            <v-btn icon @click="del">
                <v-icon>delete</v-icon>
            </v-btn>
        </v-card-actions>
    </v-card>

</template>

<script>
export default {
    props: ['message', 'editMessage', 'deleteMessage', 'messages'],
    methods: {
        edit() {
            this.editMessage(this.message)
        },
        del() {
            this.deleteMessage(this.message)
        }
    }
}
</script>

<style>
</style>