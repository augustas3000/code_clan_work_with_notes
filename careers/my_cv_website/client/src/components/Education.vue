<template>
  <section id="education" class="resume-section p-3 p-lg-5 d-flex align-items-center">
    <div class="w-100">
      <h2 class="mb-5">Education</h2>
      <div
        class="resume-item d-flex flex-column flex-md-row justify-content-between mb-5"
        v-for="(education, index) in educationList"
        :key="index"
      >
        <div class="resume-content">
          <h3 class="mb-0">{{ education.school }}</h3>
          <div class="subheading mb-3">{{ education.degree }}</div>
          <div>{{ education.program }}</div>
          <p>GPA: {{ education.gpa }}</p>
        </div>
        <div class="resume-date text-md-right">
          <span
            class="text-primary"
            v-for="(date, index) in education.dates"
            :key="index"
          >{{ date.start }} - {{ date.end }}</span>
        </div>
      </div>
    </div>
  </section>
</template>

<script>
export default {
  name: "Education",
  data() {
    return {
      educationList: [
        {
          school: "University of Colorado Boulder",
          degree: "Bachelor of Science",
          program: "Computer Science - Web Development Track",
          dates: [
            {
              start: "August 2006",
              end: "May 2010"
            }
          ],
          gpa: "3.23"
        },
        {
          school: "James Buchanan High School",
          degree: "Technology Magnet Program",
          program: "",
          dates: [
            {
              start: "August 2002",
              end: "May 2006"
            }
          ],
          gpa: "3.56"
        }
      ]
    };
  }
};
</script>
