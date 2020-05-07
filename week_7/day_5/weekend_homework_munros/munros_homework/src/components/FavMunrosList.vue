<template lang="html">

  <div class="fav-munros-container">
    <fav-munro-list-item v-for="(munro, index) in fav_munros" v-bind:key="index" v-bind:fav_munro="munro" v-bind:fav_munros="fav_munros"></fav-munro-list-item>
  </div>


</template>

<script>
import FavMunroListItem from './FavMunroListItem.vue'

export default {
  name: "fav-munros-list",
  props: ['fav_munros'],
  components: {
    "fav-munro-list-item": FavMunroListItem
  }
}
</script>

<style lang="css" scoped>

  .fav-munros-container {
    width: 100%;
    background-color: lightblue;
  }
</style>
