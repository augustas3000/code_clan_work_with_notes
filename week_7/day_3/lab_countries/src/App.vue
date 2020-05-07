<template lang="html">
  <div class="">

    <h1>Search Bar</h1>

    <country-select v-bind:countries="countries"></country-select>


    <hr>
    <h1>World Countries(Dropdown)</h1>
      <div class="main-container">
        <countries-dropdown v-bind:countries="countries"></countries-dropdown>
        <country-detail v-bind:country="selectedCountry"></country-detail>
      </div>

    <hr>
      <h1>World Countries(List)</h1>
      <div class="main-container">
          <!-- imported component: countries-list -->

          <countries-list v-bind:countries="countries" ></countries-list>

          <country-detail v-bind:country="selectedCountry"></country-detail>

      </div>
  </div>
</template>

<script>
import CountriesList from './components/CountriesList.vue'
import { eventBus } from './main.js'
import CountryDetail from './components/CountryDetail.vue'
import CountriesDropdown from './components/CountriesDropdown.vue'
import CountrySelect from './components/CountrySelect.vue'


export default {
  name: 'app',
  data(){
    return {
      countries: [],
      // for transmitting back selected country item through eventBus:
      selectedCountry: null
    };

  },
    // loads up, mounted is auto called and countries fetched
    mounted(){
      fetch('https://restcountries.eu/rest/v2/all').then(res => res.json()).then(countries => this.countries = countries)

  // event bus listener - to listen on this channel country-selected, as soon as there is emission, get the data(country):
      eventBus.$on('country-selected', (country) => {
        this.selectedCountry = country;
      })

      eventBus.$on('country-selected-dd', (country) => {
        this.selectedCountry = country;
      })


    },

    components: {
      "countries-list": CountriesList,
      "country-detail": CountryDetail,
      "countries-dropdown": CountriesDropdown,
      "country-select": CountrySelect
    }

}
</script>

<style lang="css">
    .main-container {
      display: flex;
      justify-content: space-between;
    }
</style>
