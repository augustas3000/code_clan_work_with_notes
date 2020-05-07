<template lang="html">

  <div class="">
    <h3>Details:</h3>

    <h4>Name: {{selected_munro.name}}</h4>
    <p>Height: {{selected_munro.height}}</p>


    <p>Meaning: {{selected_munro.meaning}}</p>

    <h4>Geography</h4>
    <p>Region: {{selected_munro.region}}</p>
    <p>Grid Ref: {{selected_munro.gridref_letters}} {{selected_munro.gridref_eastings}} {{selected_munro.gridref_northings}}</p>

    <p>Lattitude: {{selected_munro.latlng_lat}}</p>
    <p>Longitude: {{selected_munro.latlng_lng}}</p>

    <button v-on:click="closeDetails" type="button" name="button">Close details</button>
  </div>
</template>

<script>
import { eventBus } from "@/main.js";

export default {
  name: "munros-dropdown-list-item-details",
  props: ['selected_munro'],
  methods: {
    closeDetails() {
      eventBus.$emit('close-details', this.selected_munro)
    }
  }
}
</script>

<style lang="css" scoped>
</style>
