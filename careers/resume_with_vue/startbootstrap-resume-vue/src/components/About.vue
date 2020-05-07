<template>
  <section id="about" class="resume-section p-3 p-lg-5 d-flex align-items-center">
    <div class="w-100">
      <h1 class="mb-0">
        {{ name.first }}
        <span class="text-primary">{{ name.last }}</span>
      </h1>
      <div class="subheading mb-5">
        {{ address.street }} &middot; {{ address.town }}, {{ address.state }} {{ address.zip }} &middot; {{ telephone }} &middot;
        <a :href="'mailto:' + email">{{ email }}</a>
      </div>
      <p
        class="lead mb-5"
      >I am experienced in leveraging agile frameworks to provide a robust synopsis for high level overviews. Iterative approaches to corporate strategy foster collaborative thinking to further the overall value proposition.</p>
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
        street: "3542 Berry Street",
        town: "Cheyenne Wells",
        state: "CO",
        zip: "80810"
      },
      telephone: "(317) 585-8468",
      email: "name@email.com",
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
        },
        {
          name: "Twitter",
          url: "#",
          icon: "twitter"
        },
        {
          name: "Facebook",
          url: "#",
          icon: "facebook"
        }
      ]
    };
  }
};
</script>