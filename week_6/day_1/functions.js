// named declarations

//
// function say_hello(greeting = "Hello", name = "World!") {
//   return `${greeting}, ${name}!`;
// }
//
// var greet = say_hello();
// console.log(greet);
//
// console.log(say_hello('Niall'));
//
//
// // anonimous functions
//
// var add = function(firstNumber, secondNumber){
//   return firstNumber + secondNumber;
// }
//
// console.log(add(2,3));

// TAsk:
//
// Task: 20 minutes
// Declare a named function that takes an array of numbers, and returns the sum, or total, of all of the numbers in the array.
// var array_1 = [2,4,3,1,3,5];
//
// function total_nums(array) {
//   var total = 0;
//
//   for (var item = 0; item < array.length; item++) {
//     total += array[item];
//   }
//   return total;
// }
//
// console.log(total_nums(array_1));
//

// Define an anonymous function expression that takes two arguments:
// an object, for example, { name: 'Wojtek', age: 30 }
// a string, for exmaple, 'name'
// Object.keys(obj) - is best to check if key exists.
// var obj_1 = { name: 'Wojtek', age: 30 };
// var str_1 = 'age';
//
// var my_function = function(obj, str) {
//   if (obj[str] === undefined) {
//     return false;
//   } else {
//     return true;
//   }
// };
//
// console.log(my_function(obj_1, str_1));
//


// Your function should return true if the given string is a key on the given object and false if the object does not have a key that matches the string. Store this function in an appropriately named variable to invoke it.



// arrow functions:

// var multiply = (first_num, second_num) => {
//   return first_num * second_num;
// }
// console.log(multiply(2,4));
