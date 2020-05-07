<template lang="html">

  <div class="parent-container">

    <!-- flex-box -->
    <div class="info-flex-box">
      <div class="parent-container__beer-info-container">
        <h1>Beer info:</h1>
        <beer-details v-bind:beer="selectedBeer"></beer-details>
      </div>

      <div class="parent-container__fav-beers-container">
        <h1>Favourites:</h1>
        <fav-beers-list v-bind:favbeers="favBeers"></fav-beers-list>

      </div>
    </div>


    <h1>Search all beers:</h1>

    <!-- <beer-select v-bind:beers="beers"></beer-select> -->

    <input  type="text"  v-model="searchTextString" placeholder="Search beer title.."/>



    <!-- css grid -->
    <div class="parent-container__beer-list-container">
      <beer-list v-if="searchTextString" v-bind:beers="filteredList"></beer-list>
      <beer-list v-else v-bind:beers="beers"></beer-list>
    </div>




  </div>


</template>

<script>
// importing components
import BeerList from './components/BeerList.vue'
import BeerDetails from './components/BeerDetails.vue'
import FavBeersList from './components/FavBeersList.vue'
import BeerItem from './components/BeerItem.vue'
// importing eventBus obj:
import { eventBus } from './main.js'
// import BeerSelect from './components/BeerSelect.vue'

export default {
  name: 'app',
  data() {
    return {
      beers: [],
      favBeers: [],

      // for transmitting back selected beer item through eventBus:
      selectedBeer: null,
      searchTextString: ""
    }
  },
  computed: {
  filteredList() {

    if (this.searchTextString) {
      return this.beers.filter(beer => {
        return beer.name.toLowerCase().includes(this.searchTextString.toLowerCase())
      })
    }
  },

},

      // loads up, mounted is auto called and beers fetched
    mounted(){
      // get all beers: read up more on Promise.all
      const pagesArray = [1,2,3,4,5];
      const promises = pagesArray.map((page) => {
        let url = 'https://api.punkapi.com/v2/beers?page=' + page + '&per_page=80';

        return fetch(url).then(res => {
          return res.json()
        })
        // .then(beers => beers)

      });

      Promise.all(promises).then((data) => {
        for (let promise_arr of data) {
          this.beers = this.beers.concat(promise_arr)
        }
      })







    // event bus listener - to listen on channel beer-selected, as soon as there is emission, get the data(beer):
      eventBus.$on('beer-selected', (beer) => {
        this.selectedBeer = beer;
      })

      eventBus.$on('beer-added-to-fav', (beer) => {
        if (!this.favBeers.includes(beer)){
          this.favBeers.push(beer);
        }
      })

      // another may be required for updating favourites
      // eventBus.$on('country-selected-dd', (country) => {
      //   this.selectedCountry = country;
    },

    components: {
      "beer-list": BeerList,
      "beer-details": BeerDetails,
      "beer-item": BeerItem,
      "fav-beers-list": FavBeersList,
      // "beer-select": BeerSelect
    }
}
</script>

<style lang="css" scoped>

  .info-flex-box {
    display: flex;
    flex-wrap: nowrap;
    flex-grow: 1;
    flex-direction: row;
    justify-content: space-between;
    padding-bottom: 4rem;
  }

  .parent-container__beer-info-container {
    width: 45%;


  }




  /* .parent-container__beer-info-container img {
    height: 100%;
  } */



  .parent-container__fav-beers-container {
    width: 45%;
  }

  .parent-container__beer-list-container {

  }






</style>
