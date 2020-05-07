<template lang="html">

  <!-- If we refresh the browser we see nothing. And we now have an error message in the console saying cannot read property 'name' of undefined - we still need to give the component a list of props it accepts-->

  <!-- use the return value of this computed property - purchasedClass as the class of our li element - remember, as this is a dynamic Vue variable, we need to bind it, to avoid the value we use being parsed as a string by Vue. This syntax means that the presence of the .purchased or .not-purchased class depends on the truthiness of item.isPurchased -->
  <li v-bind:class="purchasedClass">{{ item.name }} is at position: {{coolIndex}}</li>
</template>

<script>
export default {
  name: 'shopping-list-item',

  // Props are custom attributes you can register on a component. When a value is passed to a prop attribute, it becomes a property on that component instance.

  // We’ve passed the prop down, but we still need to give the component a list of props it accepts. We can do this using the props key. Since we’re binding with :item in the component above, we need to use item here, and coolIndex in the case of :coolIndex prop. : is the same as v-bind:coolIndex
  props: ['item', 'coolIndex'],
  // Previously when we made a shopping list we bound the class to a ternary operator that gave us a class name - but now we know a better way of abstracting our logic out of our views to help make our html more readable: computed properties!

  // Use a computed property to provide the correct class for a purchased or unpurchased item(use our devTools to inspect each individual shopping-list-item and look and see what the value of purchasedClass):
  computed: {
    purchasedClass: function() {
      if (this.item.isPurchased) {
        return "purchased";
      } else {
        return "not-purchased";
      }
    }
  }
}
</script>

<!-- As it stands our shopping list doesn’t do too much. Let’s change that, by displaying items that have been purchased in a different manner than those that haven’t. One of the benefits of using .Vue files is that we can confine styling to our individual components, and see how a component is structured, how it behaves, and how it looks - all in the same file!

Let’s start by creating some styling for our purchased and unpurchased items: -->


<style lang="css" scoped>
.not-purchased {
  background-color: yellow;
}

.purchased {
  text-decoration: line-through;
  background-color: red;
}
</style>
