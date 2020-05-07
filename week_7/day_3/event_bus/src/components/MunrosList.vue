<template lang="html">
  <div>
    <ul>
      <list-item v-for="(munro, index) in munros" :munro="munro" :key="index"></list-item>
    </ul>
  </div>

</template>

<script>
// only import when we gonan render something
import ListItem from './ListItem.vue';

export default {
  name: 'munros-list',
  props: ['munros'],
  components: {
    "list-item": ListItem
  }
}
</script>

<style lang="css" scoped>
</style>
