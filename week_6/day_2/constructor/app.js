const Pet = require('./pet.js');
const Person = require('./person.js');


const zora = new Pet('Zora', 'Cat');
// zora.eat('sheeba');

const niall = new Person('Niall', zora);
// niall.greet();

niall.feedPet('Snickers');
