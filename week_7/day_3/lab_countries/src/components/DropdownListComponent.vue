<template lang="html">
  <!-- v-on:click="handleClick" -->

  <!-- to Dropdownlistcomponent -->
  <option v-bind:value="country">{{country.name}}</option>

  <!-- <li v-on:click="handleClick">{{country.name}}</li> -->

</template>


<script>


export default {
  name: 'list-component-dd',
  props: ['country'],

}
</script>

<style lang="css" scoped>
</style>
