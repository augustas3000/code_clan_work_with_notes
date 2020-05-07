<template lang="html">

  <div class="fav-beers" v-if='favbeers'>
    <div class="beer-list-item-container--flex" v-for="(beer, index) in favbeers">
      <beer-item v-bind:beer="beer" v-bind:key="index"></beer-item>
      <!-- <beer-item-fav-list ></beer-item-fav-list> -->
      <button v-on:click="deleteFromFavs(index)" type="button" name="button">Remove</button>
    </div>

  </div>

</template>

<script>

import BeerItem from './BeerItem.vue';

export default {
  name: "beer-list",
  props: ['favbeers'],
  components: {
    "beer-item": BeerItem
  },
  methods: {
    deleteFromFavs(index) {
      this.favbeers.splice(index,1);
    }

  }
}
</script>

<style lang="css" scoped>
  .beer-list-item-container--flex {
    display: flex;
    justify-content: space-between;
  }



</style>
