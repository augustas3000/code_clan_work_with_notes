<template>
  <!-- p3 - padding , 3 is 1 rem -->
  <!-- p-lg-5   padding at breakpoint large is 5 or 3 rem -->
  <section id="about" class="resume-section p-3 p-lg-5 d-flex align-items-center">
    <!-- width -->
    <div class="w-100">
      <!-- mb - margin bottom -->
      <h1 class="mb-0">
        {{ name.first }}
        <span class="text-primary">{{ name.last }}</span>
      </h1>

      <div class="subheading mb-5">
        {{ address.street }} &middot; {{ address.town }}, {{ address.postCode }} &middot; {{ telephone }} &middot;
        <a :href="'mailto:' + email">{{ email }}</a>
      </div>
      <p
        class="lead mb-5"
      >Hello. My name is Augustas - a fresh programmer with aptitude and determination. I come from forestry and natural resource management background. My love for coding proliferated through the use of modern mapping and data management technologies to support my daily work as a forest manager.

      About two years ago I wrote my first VBA script to automate repetitive Excel tasks important to my role at a time. The rush I got from seeing the code doing almost-exactly what I instructed it to do, very soon made coding my favourite hobby. In my free time I studied VBA for Excel, and Python for mapping software (QGIS, ArcGIS), later became interested in web-GIS and web development technologies.

      A year ago, I took a strategic approach to becoming a solid developer. I signed up for a Professional Software Development Bootcamp with CodeClan-Glasgow, and created a home study plan for myself in preparation for the big course, which I have now completed.
      </p>
      <div class="social-icons">
        <a :href="social.url" v-for="(social, index) in socialList" :key="index">
          <font-awesome-icon :icon="['fab', social.icon]"></font-awesome-icon>
        </a>
      </div>
    </div>
  </section>
</template>

<script>
export default {
  name: "About",
  props: {
    name: Array
  },
  data() {
    return {
      address: {
        street: "3/4 82 Barrland Street",
        town: "Glasgow",
        postCode: "G41 1AJ"
      },
      telephone: "07426803506",
      email: "augusto.pasaulis@gmail.com",
      socialList: [
        {
          name: "LinkedIn",
          url: "#",
          icon: "linkedin"
        },
        {
          name: "GitHub",
          url: "#",
          icon: "github"
        }
      ]
    };
  }
};
</script>
