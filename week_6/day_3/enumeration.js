const myNumbers = [1,2,3,4,5];
// of - arrays
// for (const number of myNumbers) {
//   console.log('This is my number: ', number);
// }


// curly braces enable multi-line code
// higher order function: forEach
// callback function: passed into forEach
// myNumbers.forEach((number) => {
//   console.log('This is my number:', number);
// });
//
//
// myNumbers.forEach((number, index) => {
//   console.log('This is my number:', number, 'At index: ', index);
// });
//
// // myNumber - initiall array provided to forEach
// myNumbers.forEach((number, index, myNumber) => {
//   console.log('This is my number:', number, 'At index: ', index);
// });

const multiplyByTwo = function(numbers) {
  const result = [];
  // return value of forEach is undefined. - same as we would not expect for loop to return something.
  numbers.forEach((number) => {
    // thats why we need to manage returns like this for example:
    const multiplied = number * 2;
    result.push(multiplied);
  });
  return result;
}
// MAP method also suitable
console.log(multiplyByTwo(myNumbers));



// --------------------------------------------------------------------

// Using the forEach enumeration method, complete the following tasks:

// Write a function called getEvens that takes an array of numbers as an argument and returns a new array that only contains the even numbers from the original array.

const getEvens = function(numbers) {
  let even_nums = [];

  numbers.forEach((number) => {
    if (number%2 == 0) {
      even_nums.push(number);
    }
  });
  return even_nums
};
// FILTER method also suitable;
console.log(getEvens(myNumbers));
// --------------------------------------------------------------------

// Write a function called sumElements that takes an array of numbers as an argument and returns the sum total of all the elements in the array.
// Hint: If you get stuck, start by writing the function using a for of loop, then refactor, replacing the for loop with the forEach.

const sumElements = function(numbers) {
  let sum_tot = 0;
  numbers.forEach((number) => {
    sum_tot += number
  });
  return sum_tot;
};
// REDUCE method also suitable
console.log(sumElements(myNumbers));

// --------------------------------------------------------------------
// refactored with map, reduce, filter:
// MAP:
const multiplyByTwo_MAP = function(numbers) {
  const result = numbers.map((number) => {
    // return is crucial otherwise we get an array of [undefined, undefined...]
    return number * 2;
  });

  // return value of forEach is undefined. - same as we would not expect for loop to return something.
  // numbers.forEach((number) => {
  //   // thats why we need to manage returns like this for example:
  //   const multiplied = number * 2;
  //   result.push(multiplied);

  return result;
};
console.log('multiplyByTwo_MAP:');
console.log(multiplyByTwo_MAP(myNumbers));


// ---------------------------------------------------------------------
// REDUCE method also suitable
const sumElements_REDUCE = function(numbers) {
  // current value is the second value of reduce callback
  let sum_tot = numbers.reduce((tot, current) => {
    return tot + current
  }, 0); //initial value is usually provided after the code block

  // if reduce is the high order function, then its callback is full:
  // (tot, current) => {
  //   return tot + current
  // }, 0);

  // numbers.forEach((number) => {
  //   sum_tot += number
  // });
  return sum_tot;
};
console.log('sumElements_REDUCE');
console.log(sumElements_REDUCE(myNumbers));

// ---------------------------------------------------------------------

// FILTER:

const getEvens_FILTER = function(numbers) {
  let even_nums = numbers.filter((number) => {
    return (number % 2 === 0);
  });

  // numbers.forEach((number) => {
  //   if (number%2 == 0) {
  //     even_nums.push(number);
  //   }
  // });
  return even_nums
};
// FILTER method also suitable;
console.log('getEvens_FILTER');
console.log(getEvens_FILTER(myNumbers));
// ---------------------------------------------------------------------

// if we wanted to create our own .forEach?

const ourForEach = function(array, callback) {
  for (const element of array) {
    callback(element);
  };
};

ourForEach(myNumbers, (number) => {
  console.log(`the number is ${number}`);
})




//
