
<!-- countries dropdown -->
<template lang="html">
  <div class="">

      <!-- <ul>
        <list-component v-for="(country, index) in countries" v-bind:country="country" v-bind:key="index"></list-component>
      </ul> -->

      <select v-on:change="handleClickDD" v-model="selectedCountry">
        <!-- this one does not work, look up -->
        <option disabled value="Select a Country">Select a Country</option>

        <dropdown-list-component v-for="(country, index) in countries" v-bind:country="country" v-bind:key="index"></dropdown-list-component>

      </select>


  </div>
</template>

<script>
import { eventBus } from '../main.js'
import DropdownListComponent from './DropdownListComponent.vue';

export default {
  name: 'countries-dropdown',
  props: ['countries'],
  data() {
    return {
      selectedCountry: null
    }
  },
  methods: {
    handleClickDD() {
      eventBus.$emit('country-selected-dd', this.selectedCountry)
    }
  },
  components: {
    "dropdown-list-component": DropdownListComponent
  }

}
</script>

<style lang="css" scoped>
</style>
