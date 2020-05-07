import Vue from 'vue';


document.addEventListener('DOMContentLoaded', () => {
  new Vue({
    el: "#to_do_app",
    data: {
      items: [{name: "Buy shopping", priority: 'high'}, {name: "Clean Bathroom", priority: 'low'}, {name: "Car's MOT", priority: 'high'} ],
      newItem: "",
      priority: ""
    },
    methods: {
      saveNewItem: function() {
        this.items.push({name: this.newItem, priority: this.priority});
        this.newItem = "";
      },
      changePriority: function(index) {
        if (this.items[index].priority === 'low') {
          this.items[index].priority = 'high';
        } else {
          this.items[index].priority = 'low';
        }
      }
    }
  })







});
