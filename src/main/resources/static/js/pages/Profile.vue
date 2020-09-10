<template>
    <v-container class="grey lighten-5">
        <v-row no-gutters>
                <v-flex :xs6="!$vuetify.breakpoint.xsOnly">
                    <div class="title mb-3"> {{ profile.name }}</div>
                    <v-layout row justify-space-between>
                        <v-card>
                            <v-flex class="px-1">
                                <v-img :src="profile.userpic"></v-img>
                            </v-flex>
                        </v-card>
                        <v-flex class="px-1">
                            <v-layout column>
                                <v-flex>{{ profile.locale }}</v-flex>
                                <v-flex>{{ profile.email }}</v-flex>
                                <v-flex>{{ profile.lastVisit }}</v-flex>
                            </v-layout>
                        </v-flex>
                    </v-layout>
                </v-flex>
        </v-row>
    </v-container>

</template>

<script>
import {mapState} from 'vuex'

export default {
    name: "Profile",
    computed: mapState(['profile'])
}

</script>

<style scoped>
img {
    max-width: 100%;
    height: auto;
}
</style>