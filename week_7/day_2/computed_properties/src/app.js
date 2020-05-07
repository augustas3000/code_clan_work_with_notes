import Vue from 'vue';

document.addEventListener('DOMContentLoaded', () => {
  new Vue({
    el: "#app",
    data: {
      accounts: [
        { name: "Daniella Ellicombe", balance: 600 },
        { name: "Barbara Rabson", balance: 750 },
        { name: "James Schofield", balance: 200 },
        { name: "Irma Diloway", balance: 1200 }
      ],
      newAccount: {
        name: "",
        balance: 0
      },
      filterAmount:0
    },
    // functuons we want to run automatically live in computed property, - we will never want to call them explicitly.
    computed: {
      totalBalances: function() {
         return this.accounts.reducrunTot, current) => {
          return runTot + current.balance}, 0)},

          filteredAccounts: function() {
            return this.accounts.filter((acc) => {
              return acc.balance >= this.filterAmount;
            });
          }},

    methods: {
      saveAccount: function(){
        this.accounts.unshift(this.newAccount);

        this.newAccount = {
          name: "",
          balance: 0
        };
      }
    }
  });
});
