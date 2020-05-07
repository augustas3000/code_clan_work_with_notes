<template lang="html">
  <section>
    <h1>Hello to the Page</h1>
    <p>{{ message }}</p>
  </section>
</template>

<script>
export default {
  name: 'app',
  data() {
    return {
      message: 'Hello world!'
    }
  }
}

</script>

<style lang="css" scoped>
  p {
    background-color: red;
  }
</style>
