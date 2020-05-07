<!-- <template lang="html">
  <div class="">

    <input type="text"  v-model="searchTextString" placeholder="Search beer title.."/>

    <h3>Concurrent results:</h3>
    <country-detail v-bind:filteredCountries="filteredList"></country-detail>

  </div>
</template>

<script>

// import CountryDetail from './CountryDetail.vue';

export default {
  name: 'country-select',
  props: ['countries'],
  data(){
    return {
      searchTextString: "",
    };
  },
  computed: {
    filteredList() {

      if (this.searchTextString) {
        return this.countries.filter(country => {
          return country.name.toLowerCase().includes(this.searchTextString.toLowerCase())
        })
      }
    },

  },
  components: {
    "country-detail": CountryDetail
  }
}

</script>

<style lang="css" scoped>

</style> -->
