// let and const behave exactly the same way in terms of Lexical Environments.
//
// But var is a very different beast, that originates from very old times. It’s generally not used in modern scripts, but still lurks in the old ones.



// function sayHi() {
//   var phrase = "Hello"; //local variable "var" instead of "let"
//   console.log(phrase); //Hello
// }
//
// sayHi();
// console.log(phrase);


// Variables, declared with var, are either function-wide or global. They are visible through blocks:


// if (true) {
//   var test = true; //use 'var' instead of 'let'
// }
//
// console.log(test); //variable test after if block



// As var ignores code blocks, we’ve got a global variable test!!!!
// If we used let test instead of var test, then the variable would only be visible inside if:

// if (true) {
//   let test = true; //use 'let'
// }
// console.log(test);


// The same thing for loops: var cannot be block- or loop-local:
// for (var i = 0; i < 10; i++) {
//
// }
// console.log(i); //10, "i" is visible after loop, it's a global variable


// If a code block is inside a function, then var becomes a function-level variable:
// function sayHi(){
//   if (true) {
//     var phrase = "Hello";
//   }
//   console.log(phrase); //works
// }
// sayHi();
// console.log(phrase); error


// As we can see, var pierces through if, for or other code blocks. That’s because a long time ago in JavaScript blocks had no Lexical Environments. And var is a remnant of that.


// var declarations are processed when the function starts (or script starts for globals).
// In other words, var variables are defined from the beginning of the function, no matter where the definition is (assuming that the definition is not in the nested function).
// so the following three codes will be the same:

// function sayHi(){
//   phrase = "Hello";
//   console.log(phrase);
//   var phrase; //will be defined from the begginning of a function, no matter where the definition iss, assuming it is not in nested function.
// }
// sayHi();

// function sayHi() {
//   var phrase;
//   phrase = "Hello";
//   console.log(phrase);
// }
// sayHi();

// Or even as this (remember, code blocks are ignored):
//
// function sayHi() {
//   phrase = "Hello"; //(*)
//   if (false) {
//     var phrase;
//   }
//   console.log(phrase);
// }
// sayHi();


// People also call such behavior “hoisting” (raising), because all var are “hoisted” (raised) to the top of the function.
// So in the example above, if (false) branch never executes, but that doesn’t matter. The var inside it is processed in the beginning of the function, so at the moment of (*) the variable exists.


// Declarations are hoisted but assignments are not:
// 
// function sayHi(){
//   console.log(phrase);
//   var phrase = "Hello";
// }
//
// sayHi(); //gives undefined

// The line var phrase = "Hello" has two actions in it:
// Variable declaration var
// Variable assignment =.
// The declaration is processed at the start of function execution (“hoisted”), but the assignment always works at the place where it appears. So the code works essentially like this:

// function sayH(){
//   var phrase; //declaration works at the start...
//   console.log(phrase); //undefined
//   phrase = "Hello"; //assignment happens when execution reaches it.
// }
// sayHi();

// Because all var declarations are processed at the function start, we can reference them at any place. But variables are undefined until the assignments.

// In both examples above alert runs without an error, because the variable phrase exists. But its value is not yet assigned, so it shows undefined.


// ALL in all:
// There are two main differences of var compared to let/const:
//
// var variables have no block scope, they are visible minimum at the function level.
// var declarations are processed at function start (script start for globals).
// There’s one more very minor difference related to the global object, that we’ll cover in the next chapter.
//
// These differences make var worse than let most of the time. Block-level variables is such a great thing. That’s why let was introduced in the standard long ago, and is now a major way (along with const) to declare a variable.
