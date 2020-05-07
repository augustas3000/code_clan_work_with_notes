<template lang="html">

  <option v-bind:value="munro">{{munro.name}}</option>

</template>

<script>
export default {
name: 'munros-dropdown-list-item',
props: ['munro'],
}
</script>

<style lang="css" scoped>
</style>
