<template lang="html">
  <div class="">
      <ul>
        <list-component v-for="(country, index) in countries" v-bind:country="country" v-bind:key="index"></list-component>
      </ul>
  </div>
</template>

<script>

import ListComponent from './ListComponent';

export default {
  name: 'countries-list',
  props: ['countries'],
  components: {
    "list-component": ListComponent
  }

}
</script>

<style lang="css" scoped>
</style>
