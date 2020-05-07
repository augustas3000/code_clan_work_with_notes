<template lang="html">
  <div class="">
    <booking v-for="(booking, index) in bookings" v-bind:key="index" v-bind:booking="booking" ></booking>
  </div>
</template>

<script>
import Booking from './Booking.vue';
import BookingService from '../services/BookingService.js';
import { eventBus } from '../main.js';

export default {
  name: 'bookings',
  data () {
    return {
      bookings: []
    }
  },
  components: {
    'booking': Booking
  },
  mounted(){
    BookingService.getBookings()
    .then(bookings => this.bookings = bookings);

    eventBus.$on('booking-added', (booking) => {
      this.bookings.push(booking)
    });

    eventBus.$on('booking-deleted', (id) => {
      let index = this.bookings.findIndex(booking => booking._id === id)
      this.bookings.splice(index, 1)
    })

    eventBus.$on('update-button-clicked', (updatedBooking) => {
      // debugger;
      let index = this.bookings.findIndex(booking => updatedBooking._id === booking._id)
      this.bookings.splice(index, 1, updatedBooking)

    })
  }
}
</script>

<style lang="css" scoped>
</style>
