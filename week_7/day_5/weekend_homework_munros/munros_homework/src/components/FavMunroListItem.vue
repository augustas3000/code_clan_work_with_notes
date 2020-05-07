<template lang="">

  <div class="munro-item-container">
      <div class="munro-item-container-info">
        <p>{{fav_munro.name}}</p>
        <p>Height: {{fav_munro.height}}m</p>
      </div>

      <div class="munro-item-container-actions">
        <button v-on:click="removeFavorite" type="button" name="button">Delete</button>
        <!-- <button type="button" name="button">More Info</button> -->
      </div>

  </div>


</template>

<script>
import { eventBus } from "@/main.js";


export default {
  name: "fav-munro-list-item",
  props: ['fav_munro'],

  methods: {
    removeFavorite: function() {
        eventBus.$emit("munro-deleted-from-fav", this.fav_munro);
    }
  }
}


</script>

<style lang="css" scoped>
  .munro-item-container {
    display: flex;

  }

  .munro-item-container-info {
    width: 80%;
  }

  .munro-item-container-actions {
    width: 20%;
    text-align: center;

  }

</style>
