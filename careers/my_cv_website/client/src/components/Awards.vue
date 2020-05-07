<template>
  <section id="awards" class="resume-section p-3 p-lg-5 d-flex align-items-center">
    <div class="w-100">
      <h2 class="mb-5">Awards &amp; Certifications</h2>
      <ul class="fa-ul mb-0">
        <li v-for="(award, index) in awardsList" :key="index" class="d-flex align-items-center">
          <font-awesome-icon :icon="['fas', 'trophy']" class="fa-li text-warning"></font-awesome-icon>
          {{ award }}
        </li>
      </ul>
    </div>
  </section>
</template>

<script>
export default {
  name: "Awards",
  data() {
    return {
      awardsList: [
        "Google Analytics Certified Developer",
        "Mobile Web Specialist - Google Certification",
        "1st Place - University of Colorado Boulder - Emerging Tech Competition 2009",
        "1st Place - University of Colorado Boulder - Adobe Creative Jam 2008 (UI Design Category)",
        "2nd Place - University of Colorado Boulder - Emerging Tech Competition 2008",
        "1st Place - James Buchanan High School - Hackathon 2006",
        "3rd Place - James Buchanan High School - Hackathon 2005"
      ]
    };
  }
};
</script>
