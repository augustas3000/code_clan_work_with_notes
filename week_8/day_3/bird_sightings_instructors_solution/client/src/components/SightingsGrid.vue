<template lang="html">
	<div id="sightingsGrid">
		<sighting v-for="sighting, index in sightings" :key="index" :sighting="sighting" />
	</div>
</template>

<script>
import { eventBus } from '../main';
import SightingService from '../services/SightingService'
import Sighting from './Sighting';
export default {
	name: "sightings-grid",
	data () {
    return {
      sightings: []
    }
  },
	components: {
		'sighting': Sighting
	},
	mounted(){
    this.fetchData();
		eventBus.$on('sighting-added', sighting => this.sightings.push(sighting));

    eventBus.$on('sighting-deleted', id => {
      const index = this.sightings.findIndex(sighting => sighting._id === id);
      this.sightings.splice(index, 1);
    })
  },
  methods: {
    fetchData(){
      SightingService.getSightings()
      .then(sightings => this.sightings = sightings);
    }
  }
}
</script>

<style lang="css" scoped>
#sightingsGrid {
	display: flex;
	flex-wrap: wrap;
	justify-content: space-evenly;
}

</style>
