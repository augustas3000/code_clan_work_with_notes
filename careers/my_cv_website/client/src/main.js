import Vue from "vue";
import App from "./App.vue";
import WindowInstanceMap from './WindowInstanceMap.js'

export const eventBus = new Vue();

// Bootstrap Vue.
// Note - After installing bootstrap-vue package, register BootstrapVue in you app entry point:
import BootstrapVue from "bootstrap-vue";
Vue.use(BootstrapVue);

// Font Awesome Vue:

// Why use the concept of a library?
// Explicitly selecting icons offer the advantage of only bundling the icons that you use in your final bundled file. This allows us to subset Font Awesome's thousands of icons to just the small number that are normally used:
import { library } from '@fortawesome/fontawesome-svg-core'





// also need ruby, postgres, qgis, mongo, spring, arcgis, excel, vba
// leaflet


// faJava, faPython, faVuejs, faFileExcel
// faJava, faPython, faVuejs,
import { faLinkedin, faGithub, faTwitter, faFacebook, faCss3Alt, faJsSquare, faHtml5, faReact, faNodeJs, faAngular, faLess, faSass, faWordpress, faGulp, faGrunt, faNpm } from '@fortawesome/free-brands-svg-icons'
import { faTrophy, faCheck } from '@fortawesome/free-solid-svg-icons'
import { FontAwesomeIcon } from '@fortawesome/vue-fontawesome'


import { dom } from '@fortawesome/fontawesome-svg-core'
// Calls dom.i2svg() for you and watches the DOM for any additional icons being added or modified.
// Different default configs
// DOM watching is on by default when Font Awesome is loaded from @fortawesome/fontawesome-free or @fortawesome/fontawesome-pro but it's disabled for the @fortawesome/fontawesome-svg-core.
// This method is useful when you’re loading @fortawesome/fontawesome-svg-core, but would still like to leverage automatic DOM watching.

dom.watch()

// Pre-registering icon definitions so that do not have to explicitly pass them to render an icon:
library.add(faLinkedin, faGithub, faTwitter, faFacebook, faCss3Alt, faJsSquare, faHtml5, faReact, faNodeJs, faAngular, faLess, faSass, faWordpress, faGulp, faGrunt, faNpm, faTrophy, faCheck)

Vue.component('font-awesome-icon', FontAwesomeIcon)

// Main SCSS File
// Make sure to import the main scss file in your app entry point:
import '@/assets/scss/resume.scss'


// Vue.directive('scroll', {
//   inserted: function(el, binding) {
//     let f = function(evt) {
//       if (binding.value(evt, el)) {
//         window.removeEventListener('scroll', f);
//       }
//     };
//     window.addEventListener('scroll', f);
//   },
// });



Vue.config.productionTip = false;

new Vue({
  render: h => h(App)
}).$mount("#app");
