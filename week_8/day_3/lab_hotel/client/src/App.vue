<template lang="html">
<div id="app">
  <bookings-form></bookings-form>
  <hr>
  <bookings-update-form></bookings-update-form>
  <hr>
  <bookings></bookings>

</div>
</template>



<script>
import Bookings from './components/Bookings.vue';
import BookingsForm from './components/BookingsForm';
import BookingsUpdateForm from './components/BookingsUpdateForm';

export default {
name: 'app',
components: {
  'bookings': Bookings,
  'bookings-form': BookingsForm,
  'bookings-update-form': BookingsUpdateForm
}
}
</script>




<style lang="css" scoped>
</style>
