<template lang="html">

  <div v-if='country'>

    <div class="country-details-container__country-box--click">
      <h3>Name: {{ country.name }}</h3>
      <p>Capital: {{ country.capital }}</p>
      <p>Population: {{ country.population }}</p>
      <img v-bind:src="country.flag" alt="country-flag">
      <h4>Languages spoken:</h4>
      <p v-for="(language, index) in country.languages"> {{language.name}} </p>
    </div>

  </div>

  <div class="country-details-container" v-else-if='filteredCountries'>

    <div class="country-details-container__country-box" v-for="(country, index) in filteredCountries">

      <h3>Name: {{ country.name }}</h3>
      <p>Capital: {{ country.capital }}</p>
      <p>Population: {{ country.population }}</p>
      <img v-bind:src="country.flag" alt="country-flag">
      <h4>Languages spoken:</h4>
      <p v-for="(language, index) in country.languages"> {{language.name}} </p>
    </div>
  </div>


</template>

<script>
export default {
  name: 'country-detail',
  props: ['country',  'filteredCountries']
}
</script>

<style lang="css" scoped>

  .country-details-container {
    display: flex;
    flex-direction: row;
    flex-wrap: wrap;
    flex-grow: 0.5;
    justify-content: space-around;
  }

  .country-details-container__country-box {
    width: 15%;
    border: 1px solid black;
    padding: 15px;
    margin-bottom: 15px;
  }

  .country-details-container__country-box img {
    width: 100%;
  }

  .country-details-container__country-box p {
    margin: 0;
  }

  .country-details-container__country-box h3 {
    margin-bottom: 5px;
  }

  .country-details-container__country-box h4 {
    margin-bottom: 5px;
    margin-top: 5px;
  }

  .country-details-container__country-box--click {
    width: 15%;
    border: 1px solid black;
    padding: 15px;
    margin-bottom: 15px;
    margin-right: 150px;
    margin-left: auto;

  }

  .country-details-container__country-box--click img {
    width: 100%;
  }

</style>

<!-- Add the countries flag and languages spoken in the country to the country detail component -->
