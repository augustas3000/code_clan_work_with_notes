// SCOPE!!!!!
//
// var name = 'Jill';
//
//
//
//
// var secret_function = function() {
//   var pin_code = [0,0,0,0];
//   console.log('pin is: ', pin_code);
//   console.log('nam inside of function: ', name);
// }
// //
// secret_function();
// // var is function scoped
// console.log('pin_code outside func: ', pin_code);


// var filter_by_first_letter = function(names, letter) {
//   var filtered_names = [];
//   for (let name of names){
//     if (name[0] === letter) {
//       filtered_names.push(name);
//     }
//   }
//   // console.log('name after for loop: ', name);
//   return filtered_names;
// };
//
// var students = ['John', 'Joseph', 'Kevin'];
//
// console.log(filter_by_first_letter(students, 'J'));

//
// let isItFive = function(number){
//   let result;
//   if (number === 5){
//     result = true;
//   } else {
//     result = false;
//   }
//   return result
// };
//
//
// console.log(isItFive(4));
// console.log(isItFive(5));

//
// let temperature = 30;
//
// if (temperature > 15) {
//   let jacket = false;
//   var happy = true;
// } else {
//   let jacket = true;
//   var happy = false;
// }
// // console.log('jacket after if-else blocks:', jacket);
// console.log('happy after if-else blocks:', happy);

//
// const calc_energy = function(mass) {
//   const speed_of_light = 299792458;
//   return mass * speed_of_light ** 2;
// };
//
// let energy_me = calc_energy(68);
// console.log('my energy is: ', energy_me);


// editing of const properties and values is fine, but re-assigning is not allowed for const.!!!!
// const song = {
//   title: 'whjqwdh',
//   artist: 'Prince'
// };
//
// console.log('before mut: ', song);
//
// song.title = "When Doves Cry";
// console.log('after mut: ', song);


// BAD PRACTICE to pollute global scope!
const hello_w = function() {
  result = "Hello World!";
};
hello_w();
console.log(result);








//
