
// What the output or error will be and why.

// Episode 1
// All should work fine, constant variables/functions will
// change their value but will not be reassigned.
//
// const scenario = {
//   murderer: 'Miss Scarlet',
//   room: 'Library',
//   weapon: 'Rope'
// };
//
// const declareMurderer = function() {
//   return `The murderer is ${scenario.murderer}.`;
// };
//
// const verdict = declareMurderer();
// console.log(verdict);
// ---------------------------------------------------------------


// Episode 2
//
// const murderer = 'Professor Plum';
//
// const changeMurderer = function() {
//   // murdered was declared as constant so attempt to
//   // re-assign should fail.
//   murderer = 'Mrs. Peacock';
// }
//
// // const has its limitations. It only prevents us from reassigning to the constant variable. It won’t stop us modifying any mutable objects that are declared with const.
// // const still prevents us accidentally reassigning the variable to a totally new object, so we still want to use it for mutable objects as well as immutable values like numbers and strings:
// const declareMurderer = function() {
//   return `The murderer is ${murderer}.`;
// }
//
// // reassigning to const variable murderer will not work as explained above:
// changeMurderer();
//
// const verdict = declareMurderer();
// console.log(verdict);

// ---------------------------------------------------------------


// Episode 3

// Will work as variable murderer is declared using let, as
// block-scoped, and so is suitable for re-assignment
// let murderer = 'Professor Plum';
//
// const declareMurderer = function() {
//   // new var created within function
//   let murderer = 'Mrs. Peacock';
//   // Mrs. Peacok as still the same function
//   return `The murderer is ${murderer}.`;
// }
//
// // Mrs Peacok
// const firstVerdict = declareMurderer();
// console.log('First Verdict: ', firstVerdict);
// // outside function block, global variable murderer is Prof Plum:
// const secondVerdict = `The murderer is ${murderer}.`;
// console.log('Second Verdict: ', secondVerdict);

// ---------------------------------------------------------------


// Episode 4

// These, declard with let are block-scoped to outermost block,
// so will be available within function/loop bodies
// let suspectOne = 'Miss Scarlet';
// let suspectTwo = 'Professor Plum';
// let suspectThree = 'Mrs. Peacock';
//
// const declareAllSuspects = function() {
//   // using let, suspectThree is re-assigned to a different name,
//   // but this is only the case within the block of this function.
//   // to js - this is liek a new, different variable
//   let suspectThree = 'Colonel Mustard';
//   // still within same block so the updated value of suspecThree will be used:
//   return `The suspects are ${suspectOne}, ${suspectTwo}, ${suspectThree}.`;
// }
//
// // new suspectThree will be used as coded in function's block:
// const suspects = declareAllSuspects();
// console.log(suspects);
//
// // However, the suspecThree was re-defined/re-assigned within the function block, and being block-scoped variable, the change will be limited to that function block. Once, we are out of the function, the suspectThree variable is thus back to it's initiallly set value of Mrs. Peacock.
// console.log(`Suspect three is ${suspectThree}.`);

// ---------------------------------------------------------------


// Episode 5
//
// const scenario = {
//   murderer: 'Miss Scarlet',
//   room: 'Kitchen',
//   weapon: 'Candle Stick'
// };
//
// const changeWeapon = function(newWeapon) {
//   // scenario variable is available as we defined it outside this block, so it is available.
//   scenario.weapon = newWeapon;
// }
//
// const declareWeapon = function() {
//   return `The weapon is the ${scenario.weapon}.`;
// }
//
// changeWeapon('Revolver');
// // both will be changed:
// const verdict = declareWeapon();
// console.log(verdict);
// console.log(scenario.weapon);

// ---------------------------------------------------------------


// Episode 6:
//
// let murderer = 'Colonel Mustard'; //glob
//
// //glob
// const changeMurderer = function() {
//   // murderer variable was declared in global execution context,
//   // so willl be available within function level, and let allows reassignment so ok.
//   murderer = 'Mr. Green';
//
//   const plotTwist = function() {
//     // should be ok in nested function as was declared globally, ok to re-assign
//     murderer = 'Mrs. White';
//   }
//
//   plotTwist();
// };
//
// //glob
// const declareMurderer = function () {
//   return `The murderer is ${murderer}.`;
// }
//
// changeMurderer();
// const verdict = declareMurderer();
// console.log(verdict);
// console.log(murderer);

// ---------------------------------------------------------------


// Episode 7
//
// let murderer = 'Professor Plum'; //global execution context
//
// // glob
// const changeMurderer = function() {
//   // ok to re-assign
//   murderer = 'Mr. Green';
//
//   const plotTwist = function() {
//     // different scope so js thinks it is a new var
//     let murderer = 'Colonel Mustard';
//
//     const unexpectedOutcome = function() {
//       // declared as new within plotTwist() and re-assigned to 'Miss Scarlet'
//       // for js, this is a new variable, separate from the one defined initially.
//       // so the final murderer will be Mr. Green
//       murderer = 'Miss Scarlet';
//     }
//
//     unexpectedOutcome();
//   }
//
//   plotTwist();
// }
//
//
// const declareMurderer = function() {
//   return `The murderer is ${murderer}.`;
// }
//
// changeMurderer();
//
// const verdict = declareMurderer();
// console.log(verdict);

// ---------------------------------------------------------------


// Episode 8

// const scenario = {
//   murderer: 'Mrs. Peacock',
//   room: 'Conservatory',
//   weapon: 'Lead Pipe'
// };
//
// const changeScenario = function() {
//   // changing properties(variables) of a globally declared const obj - scenario.
//   scenario.murderer = 'Mrs. Peacock';
//   scenario.room = 'Dining Room';
//
//   const plotTwist = function(room) {
//     if (scenario.room === room) {
//       scenario.murderer = 'Colonel Mustard';
//     }
//
//     const unexpectedOutcome = function(murderer) {
//       if (scenario.murderer === murderer) {
//         scenario.weapon = 'Candle Stick';
//       }
//     }
//
//     unexpectedOutcome('Colonel Mustard');
//   }
//
//   plotTwist('Dining Room');
// }
//
//
// const declareWeapon = function() {
//   return `The weapon is ${scenario.weapon}.`
// }
// // candle stick and c mustard
// changeScenario();
// const verdict = declareWeapon();
// console.log(verdict);

// ---------------------------------------------------------------


// Episode 9:
//
// let murderer = 'Professor Plum';
//
// if (murderer === 'Professor Plum') {
//   // block scope - new var declared and assigned
//   let murderer = 'Mrs. Peacock';
// }
//
// const declareMurderer = function() {
//   return `The murderer is ${murderer}.`;
// }
//
// // Prof Plum
// const verdict = declareMurderer();
// console.log(verdict);










// However, const has its limitations. It only prevents us from reassigning to the constant variable. It won’t stop us modifying any mutable objects that are declared with const.
// const still prevents us accidentally reassigning the variable to a totally new object, so we still want to use it for mutable objects as well as immutable values like numbers and strings.
