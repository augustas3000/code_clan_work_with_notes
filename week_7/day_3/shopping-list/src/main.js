// this is where the app is being kicked off from:

import Vue from 'vue'
import App from './App.vue'

Vue.config.productionTip = false



// A new Vue instance has been created and is being placed in the root element of #app. The render function is rendering our app within the #app div.

new Vue({
  render: h => h(App),
}).$mount('#app')

// Now the confusing bit. render: h => h(App). This is just shorthand for:
//
// new Vue({
//   render: function(createElement) {  //MODIFIED
//     return createElement(App);
//   }
// }).$mount('#app'


// You’ll notice we are also missing our DOMContentLoaded function. This is a little bit of framework magic where the $mount function is attaching our Vue instance to the DOM in the #app element.
