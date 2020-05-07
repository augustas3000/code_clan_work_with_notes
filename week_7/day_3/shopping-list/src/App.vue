<!-- How do we pass data down from a parent component to a child component?

Via `props` - custom attributes that we can add to our components when we create them in our parent components' html, and register within the child components, allowing access to the data being passed down
 -->


<template lang="html">

  <div class="">
    <h1>My Shopping List</h1>
    <ul>
      <!-- use a v-for directive to render a list-item component for each item in our data object

       we have to give each element a key which we can bind to the item
       This is to ensure that whenever an element of the list is changed the document will only re-render this item and not the whole list
       Vue requires this attribute, and will throw a warning when it is not found

       Navigate to the browser and you should see three shopping-list-item components.

       we want each of these shopping-list-item components to correlate with each item: passing properties or props to the component.
       PROPS:
       Props are custom attributes you can register on a component. When a value is passed to a prop attribute, it becomes a property on that component instance.

       Let’s give each shopping-list-item a prop of item and bind that prop to the iteration of the item in the loop.
       We now have access to that item in our shopping-list-item component

      -->
      <shopping-list-item v-for="(product, index) in items" v-bind:key="index" v-bind:item="product" :coolIndex="index"></shopping-list-item>
    </ul>

  </div>


</template>

<script>
// How do we make a component accessible to a parent component?
// We import it within the parent component and then register it in the parent component's `components` object.
import ShoppinListItem from './components/ShoppingListItem.vue';

export default {
  name: 'app',
  data() {
    return {
      // data go here
      items: [{name: 'Soy Milk', isPurchased: false},{name: 'Tofu', isPurchased: true}, {name: 'Aubergine', isPurchased: false}]
    }
  },
  components: {
    'shopping-list-item': ShoppinListItem
  }
}
</script>

<style lang="css" scoped>
</style>


<!-- We’ve seen how to build our own Vue components, which will allow us to separate the concerns of our app’s functionality and make our code more maintainable. .vue files also allow us to have sight of a component’s HTML, CSS and JavaScript all in the same file, allowing for simpler organisation of our code. Best of all, the concept of components means that we have code that can be reusable. -->
