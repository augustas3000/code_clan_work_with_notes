// new ES6 syntax:
import Vue from 'vue';

document.addEventListener('DOMContentLoaded', () => {

  new Vue({
    el: "#app",
    data: {
      greeting: "Hello World!"
    },
    methods: {
      updateGreeting: function(name) {
        this.greeting = `Hello ${name}`;
      }
    }
  });

  

});


// The el key tells Vue where the root element exists; the element where our Vue app will live. Since we want it to live in the #app DOM element, that’s going to be the value of this key.
