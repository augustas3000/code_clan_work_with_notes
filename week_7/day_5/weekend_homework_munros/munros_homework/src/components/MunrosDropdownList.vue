<template lang="html">

  <div class="dropdown-list-container">
    <!-- v-on:change="handleClickDD" v-model="selectedCountry" -->
      <select v-model="selectedMunro" >
      <!-- this one does not work, look up -->
      <option disabled value="Select a munro">Select a munro</option>

      <munros-dropdown-list-item  v-for="(munro, index) in munros" v-bind:munro="munro" v-bind:key="index"></munros-dropdown-list-item>


    </select>

    <button v-on:click="showSelectionOnMap"type="button" name="button">Show on Map</button>
    <button v-on:click="showDetails" type="button" name="button">Show details</button>

  </div>


</template>

<script>
import MunrosDropdownListItem from './MunrosDropdownListItem.vue'
import { eventBus } from '../main.js'


export default {
  name: "munros-dropdown-list",
  data() {
    return {
      selectedMunro: null
    }
  },
  props: ['munros'],
  components: {
    "munros-dropdown-list-item": MunrosDropdownListItem
  },
  methods: {
    showSelectionOnMap() {
      eventBus.$emit('munro-selected-from-dd', this.selectedMunro )
    },
    showDetails() {
      
      eventBus.$emit('show-details-selected-dd', this.selectedMunro)
    }
  }
}
</script>

<style lang="css" scoped>
</style>
