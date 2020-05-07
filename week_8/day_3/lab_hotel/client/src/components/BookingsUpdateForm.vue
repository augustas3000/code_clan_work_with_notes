<template lang="html">
 <form v-if="name" v-on:submit="updateBtnClicked" class="" method="post">
   <h2>Update booking for {{name}}</h2>
   <div class="">
     <label for="name">Name:</label>
     <input v-model="name" type="text" name="" id="name">
   </div>
   <div class="">
     <label for="email">Email:</label>
     <input  v-model="email" type="text" name="" id="email">
   </div>

   <div class="">
     <label for="height">Height:</label>
     <input  v-model="height" type="number" name="" id="height">
   </div>

   <div class="">
     <label for="name">Status</label>
     <input  type="radio" v-model="isCheckedIn" id="checkedIn" name="isCheckedIn" value="true">
     <label for="checkedIn">Checked in</label><br>
     <input type="radio" v-model="isCheckedIn" id="notCheckedIn" name="isCheckedIn" value="false" selected>
     <label for="notCheckedIn">Not checked in</label><br>

   </div>
<input  type="submit" name="" value="Update Booking">
<button v-on:click="closeUpdateForm" type="button" name="button">Close form</button>
 </form>
</template>

<script>
import BookingService from '../services/BookingService.js';
import { eventBus } from '../main';

export default {
  name: 'bookings-update-form',
  data () {
    return {
      name: "",
      height: 0,
      email: "",
      isCheckedIn: "",
      currentBookingObj: null,
      updatedBookingObj: {name: "",
                          height: 0,
                          email: "",
                          isCheckedIn: false}
    }
  },
  methods: {
    updateBtnClicked(e) {
      e.preventDefault()
       if (this.currentBookingObj !== null) {
         this.updatedBookingObj.name = this.name;
         this.currentBookingObj.height = this.height,
         this.updatedBookingObj.email = this.email;
         this.updatedBookingObj.isCheckedIn = this.isCheckedIn
// debugger;
         BookingService.updateBooking(this.currentBookingObj._id, this.updatedBookingObj)
         .then((updatedDoc) => eventBus.$emit('update-button-clicked', updatedDoc))
         this.closeUpdateForm();
       }
    },
    closeUpdateForm() {
      this.isCheckedIn = "";
      this.height = 0;
      this.email = "";
      this.name = ""
    }
  },
  mounted() {
    eventBus.$on('booking-update-button-clicked', (booking) => {
      this.name = booking.name;
      this.height = booking.height;
      this.email = booking.email;
      this.isCheckedIn = booking.isCheckedIn;
      this.currentBookingObj = booking;
    })
  }

}
</script>




<style lang="css" scoped>
</style>
