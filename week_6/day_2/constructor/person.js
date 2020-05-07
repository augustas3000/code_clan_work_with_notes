// classes - constructors

// constructor
// Assign a pet property in the Person constructor via a parameter
// to construct a person opbject, we will need his name as a string, and his pet as an object!!!!!
const Person = function(name, pet_obj) {
  this.name = name;
  this.pet = pet_obj;
};

Person.prototype.greet = function() {
  console.log(`hello, my name is ${this.name}`);
}


// Add a feedPet method to Person.prototype which:
// Accepts a food parameter
// Outputs a string containing the person and pet's names and the food. For example: 'Shaggy Rogers fed Scooby Doo a Scooby Snack'
// Invokes the pet's eat method and passes the food to it
Person.prototype.feedPet = function(food) {
  console.log(`Person's name is ${this.name}, his pet is ${this.pet.name}, which he fed ${food}`);
  this.pet.eat(food);
};

module.exports = Person;










// object
// const niall = new Person('Niall Morris');
// // object
// const gus = new Person('Augustas');
//
// niall.greet();
// gus.greet();
//
// console.log(gus);
// console.log(niall);
// console.log('prototype: ', Object.getPrototypeOf(niall));

// do not return anything from constructor obj

// prototypes:
