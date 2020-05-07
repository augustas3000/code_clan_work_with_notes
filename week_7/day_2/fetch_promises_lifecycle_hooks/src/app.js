import Vue from 'vue';

document.addEventListener('DOMContentLoaded', () => {

  new Vue({
    // link Vue instance to element div with id of app
    el: '#app',
    data: {
      // fetched to
      dogImgURL: null
    },
    mounted(){
      // console.log("Hello from the mounted lifecycle hook");
      this.fetchDog();
    },
    methods: {
      fetchDog: function(){

        // The fetch method we’re going to implement wraps the asynchronous functionality of a request inside a Promise. That means we can write code to handle the result of our request, without having to give too much mind as to when our request is going to finish executing.
        // So let’s try and implement it now! Initially, we’ll assign our fetch implementation to a variable, so that we can log it out and examine it.

        // In our browser’s console, we should now see a pending Promise object, which if examine a bit closer we can see has a promiseStatus of resolved. Which is good for us, because now we can try and interact with the response the API gave us.

        // The primary way of interaction with a Promise is through its then method, which registers callbacks to receive either a promise’s eventual value or the reason why the promise cannot be fulfilled. This allows us to treat a promise like a returned object that we can attach callbacks to, instead of passing callbacks into a function, which was previously more commonplace. Let’s see then in action. to finish ....


        const request = fetch('https://dog.ceo/api/breeds/image/random')

        const response = request.then(response => response.json());


        const converted_response = response.then(converted_response => this.dogImgURL = converted_response.message)


      }
        // console.log(request);
    }
  });



});
