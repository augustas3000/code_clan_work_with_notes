<template>
  <div>
    <h1>Munros</h1>
    <div class="main-container">
      <munros-list :munros='munros'></munros-list>
      <munro-detail v-bind:munro="selectedMunro"></munro-detail>
    </div>
  </div>
</template>

<script>

import MunrosList from './components/MunrosList.vue';
import { eventBus } from './main.js';
import MunroDetail from './components/MunroDetail.vue'

export default {
  name: 'app',
  data(){
    return {
      munros: [],
      selectedMunro: null
    };
  },
  // loads up, mounted is auto called and munroes fetched
  mounted(){
    fetch('https://munroapi.herokuapp.com/munros')
    .then(res => res.json())
    .then(munros => this.munros = munros)

    // event bus listener - to listen on this channel munro-selected
    eventBus.$on('munro-selected', (munro) => {
      this.selectedMunro = munro;
    })
  },
  components: {
    "munros-list": MunrosList,
    "munro-detail": MunroDetail
  }
}
</script>

<style>
  .main-container {
    display: flex;
    justify-content: space-between;
  }
</style>
