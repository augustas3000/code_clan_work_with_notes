<template lang="html">

  <div class="app-main-container">

    <div class="header-box">
      <header>
        <h2>Welcome to Scottish Munros Info Site</h2>
      </header>
    </div>


    <div class="map-and-sidebar-container">
      <div class="side-bar">

        <div class="map-filter">
          <h4>Map Filter:</h4>
            <div class="search-by-name">
              <p>By name</p>
              <input v-model="munroSearchString" type="text" name="search-input" value="" placeholder="Enter name">
            </div>

            <div class="search-by-dropdown">
              <p>Dropdown</p>
              <munros-dropdown-list v-bind:munros="munros"></munros-dropdown-list>

            </div>

            <div class="search-by-height">
              <p>Filter by Height</p>
              <!-- <input v-model="munroSearchString" type="number" name="height-input" value="" placeholder="Enter height"> -->
              <p>ToDo</p>
            </div>




            <div class="refresh-map">
              <hr>
              <button v-on:click="refreshMap" type="button" name="button">Refresh Map</button>
            </div>



        </div>

        <div class="">
          <h4>Selected Munro Details:</h4>
          <munros-dropdown-list-item-details v-if="selectedMunroDetails" v-bind:selected_munro="selectedMunroDetails"></munros-dropdown-list-item-details>
        </div>

        <div class="">
          <h4>Favorite munros:</h4>
          <fav-munros-list v-bind:fav_munros="favMunros"></fav-munros-list>
        </div>


      </div>

        <!-- make munros render on the map based on search bar results -->
        <div class="map-container">

          <my-map v-if="munroSearchString" v-bind:munros="munrosFiltered"></my-map>
          <my-map v-else-if="selectedMunro" v-bind:munros="selectedMunro"></my-map>

          <!-- <my-map v-else-if="selectedHeight" v-bind:bind:munros="selectedByHeightCats"</my-map> -->

          <my-map v-else v-bind:munros="munros"></my-map>
        </div>

    </div>


  </div>





</template>

<script>
import { eventBus } from "@/main.js";
// import VuedogBeerList from "@/components/VuedogBeerList";
// import VuedogBeerInfo from "@/components/VuedogBeerInfo";
// import VuedogHeader from "@/components/VuedogHeader";
// import VuedogFavouritesList from "@/components/VuedogFavouritesList";
import MyMap from './components/MyMap.vue'
import FavMunrosList from './components/FavMunrosList.vue'
import MunrosDropdownList from './components/MunrosDropdownList.vue'
import MunrosDropdownListItemDetails from './components/MunrosDropdownListItemDetails.vue'



export default {
  name: "app",
  components: {
    "my-map": MyMap,
    "fav-munros-list": FavMunrosList,
    "munros-dropdown-list": MunrosDropdownList,
    "munros-dropdown-list-item-details": MunrosDropdownListItemDetails

    // "fav-munros-list-item": FavMunroListItem
  },
  data() {
    return {
      munros: [],
      munroSearchString: "",
      favMunros: [],
      selectedMunro: null,
      selectedMunroDetails: null,
      // selectedHeight: 0 //500, 1000, 1500


    };
  },
  computed: {
    munrosFiltered() {

      if (this.munroSearchString) {
        return this.munros.filter(munro => {
          return munro.name.toLowerCase().includes(this.munroSearchString.toLowerCase())
        })
      }
    }
    //
    // selectedByHeightCats(height) {
    //
    //   for (let munro of this.munros) {
    //     munro.height >= 500
    //   }
    //
    //   {500: [],
    //    1000: [],
    //    1500: []}
    //
    // }
  },
  methods: {
      getMunros: function() {
      fetch('https://munroapi.herokuapp.com/munros').then(res => res.json()).then(munros => this.munros = munros)
    },
    refreshMap: function() {
      this.munroSearchString = "";
      this.selectedMunro = null;
    }
  },

  mounted() {
    this.getMunros();

    eventBus.$on('munro-added-to-fav', (munro) => {
      if (!this.favMunros.includes(munro)){
      this.favMunros.push(munro)
    }
  });


      eventBus.$on('munro-deleted-from-fav', (favMunro) => {
        if (this.favMunros.includes(favMunro)){
          let favMunroIndex = this.favMunros.indexOf(favMunro)
        this.favMunros.splice(favMunroIndex,1)
      }
    });

    eventBus.$on('munro-selected-from-dd', (selectedMunro) => {
      this.selectedMunro = [selectedMunro]
    });


    eventBus.$on('show-details-selected-dd', (selectedMunro) => {
      this.selectedMunroDetails = selectedMunro
    });

    eventBus.$on('close-details', (selected_munro) =>  {
      this.selectedMunroDetails = null;
    });

}
}
</script>

<style lang="css" scoped>


  .map-and-sidebar-container {
    display: flex;
    flex-grow: 1;
    flex-flow: row;

  }

  .side-bar {
    width: 20%;
  }

  .map-container {
    width: 80%;
    padding: 0 30px 0 30px;

  }

  .header-box {
    padding-top: 15px;
    height: 10vh;
  }

  .header-box header {

    text-align: center;

  }

  .app-main-container {


  }

</style>
