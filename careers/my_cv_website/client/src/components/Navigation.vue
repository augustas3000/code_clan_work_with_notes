<template>

  <!-- navigation element -->
  <!-- toggleable="lg" becomes toggleable at large or below -->
  <!-- hide -->
<!-- v-bind:class="{hide: handleScroll}" -->
<!-- v-on:scroll="handleScroll" -->
  <b-navbar toggleable="lg" type="dark"   class="bg-primary  fixed-top" id="sideNav">


    <b-navbar-brand to="#app">
      <!-- display block or display none at large or above -->
      <span class="d-block d-lg-none toogle-initials">{{ name.first }} {{ name.last }}</span>


      <!-- starts displaying at lg breakpoint or higher d-lg-block -->
      <!-- <span class="d-none d-lg-block">
        <img
          class="img-fluid img-profile rounded-circle mx-auto mb-2"
          src="images/profile.jpg"
          :alt="name.first + ' ' + name.last"
        />
      </span> -->

    </b-navbar-brand>

    <!-- navbar toggle button -->
    <b-navbar-toggle target="navbarSupportedContent"></b-navbar-toggle>
    <!-- id links the button and the collapsable menu -->
    <b-collapse id="navbarSupportedContent" is-nav>
      <b-navbar-nav  v-b-scrollspy>
        <b-nav-item
          v-for="(navigation, index) in navigationList"
          :key="index"
          class="js-scroll-trigger"
          :href="navigation.url"
        >{{ navigation.title }}</b-nav-item>
      </b-navbar-nav>
    </b-collapse>


  </b-navbar>

</template>

<script>
// AppNav.vue
// import WindowInstanceMap from '../WindowInstanceMap.js'




export default {
  name: "Navigation",
  props: {
    name: Array
  },
  data() {
    return {
      // scrolled: false,

      navigationList: [
        {
          title: "About",
          url: "#about"
        },
        {
          title: "Experience",
          url: "#experience"
        },
        {
          title: "Skills",
          url: "#skills"
        },
        {
          title: "Projects",
          url: "#projects"
        },
        {
          title: "Education",
          url: "#education"
        },
        {
          title: "Awards",
          url: "#awards"
        }
      ]
    };
  },

  methods: {
  //  handleScroll: function(evt, el) {
  //   if (window.scrollY > 730) {
  //     el.setAttribute("style", "opacity: 1; transform: translate3d(0, -10px, 0)")
  //   }
  //   return window.scrollY > 100;
  //   }
  // }

}
  ,
  mounted() {


  //
  //   checkY() {
  //   window.addEventListener('scroll', this.handleScroll);
  // }
  // }


  // destroyed () {
  //   window.removeEventListener('scroll', this.handleScroll);
  // }
}
};
</script>


<!--
data () {
  return {
    scrolled: false
  };
},
methods: {
  handleScroll () {
    this.scrolled = window.scrollY > 0;
  }
},
created () {
  window.addEventListener('scroll', this.handleScroll);
},
destroyed () {
  window.removeEventListener('scroll', this.handleScroll);
} -->
