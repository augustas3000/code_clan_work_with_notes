import Vue from 'vue';

document.addEventListener('DOMContentLoaded', () => {

  new Vue({
    el: "#app",
    data: {
      items: [{name: "Soy Milk", isPurchased: false},
              {name: "Tofu", isPurchased: true},
              {name: "Aubergine", isPurchased: false}],
      newItem: ""
    },
    methods: {
      saveNewItem: function () {
        this.items.push({name: this.newItem, isPurchased: false});
        this.newItem = "";
      },
      buyItem: function(index) {
        this.items[index].isPurchased = true;
      }
    }
  });
});
