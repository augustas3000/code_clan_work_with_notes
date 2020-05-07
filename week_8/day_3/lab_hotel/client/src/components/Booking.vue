<template lang="html">
    <div class="booking">
      <h2>Name: {{booking.name}}</h2>
      <p>Height: {{booking.height}}</p>
      <p>Email: {{booking.email}}</p>
      <p>Checked In: {{booking.isCheckedIn}}</p>

      <button v-on:click="deleteBooking" type="button" name="button">Delete</button>
      <button v-on:click="updateBookingClicked" type="button" name="button">Update</button>
    </div>
</template>

<script>
import BookingService from '../services/BookingService.js';
import { eventBus } from '../main.js';


export default {
  name: 'booking',
  props: ['booking'],
  methods: {
    deleteBooking(){
      BookingService.deleteBooking(this.booking._id)
      .then(() => eventBus.$emit('booking-deleted', this.booking._id))
    },
    updateBookingClicked() {
      eventBus.$emit('booking-update-button-clicked', this.booking)
    }
    // updateBooking(e){
    //   e.preventDefault()
    //   const updatedbooking = {
    //     name: this.name,
    //     email: this.email,
    //     isCheckedIn: this.isCheckedIn
    //   }
    //
    //   BookingService.postBooking(updatedbooking)
    //   .then(res => eventBus.$emit('booking-updated', res))
    // }
  }

}
</script>

<style lang="css" scoped>
</style>
