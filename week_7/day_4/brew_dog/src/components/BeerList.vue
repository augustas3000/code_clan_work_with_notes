<template lang="html">

  <div class="beer-list" v-if='beers'>
    <beer-item v-for="(beer, index) in beers" v-bind:beer="beer" v-bind:key="index"></beer-item>
  </div>
<!--
  <div class="beers-list">
    <div class="c" v-for="(beer, index) in beers">

    </div>
  </div> -->


</template>

<script>
import BeerItem from './BeerItem.vue';


export default {
  name: "beer-list",
  props: ['beers', 'favbeers'],
  components: {
    "beer-item": BeerItem
  }
}
</script>

<style lang="css" scoped>

  .beer-list {
    display: grid;
    grid-template-columns: repeat(auto-fill, minmax(16rem, 1fr));
    grid-gap: 2rem;
    padding: 3rem;
    grid-column-gap: 50px;
  }

</style>
