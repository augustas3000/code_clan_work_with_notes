<template>
  <section id="experience" class="resume-section p-3 p-lg-5 d-flex align-items-center">
    <div class="w-100">
      <h2 class="mb-5">Experience</h2>
      <div
        class="resume-item d-flex flex-column flex-md-row justify-content-between mb-5"
        v-for="(experience, index) in experienceList"
        :key="index"
      >
        <div class="resume-content">
          <h3 class="mb-0">{{ experience.position }}</h3>
          <div class="subheading mb-3">{{ experience.company }}</div>
          <p class="mb-0">{{ experience.summary }}</p>
        </div>
        <div class="resume-date text-md-right">
          <span
            class="text-primary"
            v-for="(date, index) in experience.dates"
            :key="index"
          >{{ date.start }} - {{ date.end }}</span>
        </div>
      </div>
    </div>
  </section>
</template>

<script>
export default {
  name: "Experience",
  data() {
    return {
      experienceList: [
        {
          position: "Senior Web Developer",
          company: "Intelitec Solutions",
          summary:
            "Bring to the table win-win survival strategies to ensure proactive domination. At the end of the day, going forward, a new normal that has evolved from generation X is on the runway heading towards a streamlined cloud solution. User generated content in real-time will have multiple touchpoints for offshoring.",
          dates: [
            {
              start: "March 2013",
              end: "Present"
            }
          ]
        },
        {
          position: "Web Developer",
          company: "Intelitec Solutions",
          summary:
            "Capitalize on low hanging fruit to identify a ballpark value added activity to beta test. Override the digital divide with additional clickthroughs from DevOps. Nanotechnology immersion along the information highway will close the loop on focusing solely on the bottom line.",
          dates: [
            {
              start: "December 2011",
              end: "March 2013"
            }
          ]
        },
        {
          position: "Junior Web Designer",
          company: "Shout! Media Productions",
          summary:
            "Podcasting operational change management inside of workflows to establish a framework. Taking seamless key performance indicators offline to maximise the long tail. Keeping your eye on the ball while performing a deep dive on the start-up mentality to derive convergence on cross-platform integration.",
          dates: [
            {
              start: "July 2010",
              end: "December 2011"
            }
          ]
        },
        {
          position: "Web Design Intern",
          company: "Shout! Media Productions",
          summary:
            "Collaboratively administrate empowered markets via plug-and-play networks. Dynamically procrastinate B2C users after installed base benefits. Dramatically visualize customer directed convergence without revolutionary ROI.",
          dates: [
            {
              start: "September 2008",
              end: "June 2010"
            }
          ]
        }
      ]
    };
  }
};
</script>