<template lang="html">
  <!-- v-on:click="handleClick" to emit an event on eventBus, channel - beer-selected, returning this.beeer
  v-on:click="handleClick">{{country.name}}
 -->

    <!-- this has to be a box on which we can click? -->
    <!-- <div class="beer-item-container" v-on:click="handleClick">
      {{beer.name}}
    </div> -->

<!-- from here -->

      <div class="beer-item-details-box" v-on:click="handleClick">

        <h4>{{ beer.name }}</h4>
        <img v-bind:src="beer.image_url" v-bind:alt="beer.name">
      </div>





</template>

<script>
import { eventBus } from '../main.js'

export default {
  name: 'beer-item',
  props: ['beer'],

  methods: {
    handleClick() {
      eventBus.$emit('beer-selected', this.beer)
    }
  }

}
</script>

<style lang="css" scoped>

  .beer-item-details-box {
    /* border: 1px solid red; */
    /* padding-left: 2rem;
    padding-right: 2rem;
    padding-top: 2rem; */
    text-align: center;
    background-color: #eefffb;
    border-radius: 1rem;
  }

  .beer-item-details-box img {
    padding-top: 3rem;
    max-height: 18rem;
  }

</style>
