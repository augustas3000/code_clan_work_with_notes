<template lang="html">

  <div v-if='beer'>

  <div class="beer-details">
    <h3>Name: {{ beer.name }}</h3>
    <p>Description: {{ beer.description }}</p>
    <p>Abv: {{ beer.abv }}</p>
    <p>First Brewed: {{ beer.first_brewed}}</p>
    <img v-bind:src="beer.image_url" v-bind:alt="beer.name">

    <button type="button" name="button" v-on:click="handleClickAddFav">Add to favourites</button>
  </div>

</div>


<!-- <div class="beer-details-container" v-else-if='filteredCountries'>

  <div class="country-details-container__country-box" v-for="(country, index) in filteredCountries">

    <h3>Name: {{ country.name }}</h3>
    <p>Capital: {{ country.capital }}</p>
    <p>Population: {{ country.population }}</p>
    <img v-bind:src="country.flag" alt="country-flag">
    <h4>Languages spoken:</h4>
    <p v-for="(language, index) in country.languages"> {{language.name}} </p>
  </div>
</div> -->





</template>

<script>
import { eventBus } from '../main.js'


export default {
  name: "beer-details",
  props: ['beer'],

  methods: {
    handleClickAddFav() {
  eventBus.$emit('beer-added-to-fav', this.beer)
  }
}
}
</script>

<style lang="css" scoped>

  /* img {
    max-height: 2rem;
  } */


  .beer-details img {
    padding-top: 2rem;
    padding-left: 2rem;
    max-height: 30rem;
  }

  button {
      display: block;
  }

</style>
