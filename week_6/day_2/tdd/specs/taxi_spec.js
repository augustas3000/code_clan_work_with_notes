const assert = require('assert');
const Taxi = require('../taxi.js');

describe('Taxi', function(){

  // arrange - equivalent to def setup in ruby minitest
  beforeEach(function() {
    taxi = new Taxi('Skoda', 'Rapid', 'Jane');
  });

  // names for test
  it('should have a manufacturer', function(){
    // Arrange
    // const taxi = new Taxi('Skoda', 'Rapid');
    // Act
    const actual = taxi.manufacturer;
    const expected = 'Skoda';
    // Assert
    assert.strictEqual(actual, expected);
  });

// xit to make a test pending(not run it)
  it('should have a model', function(){
    // Arrange
    // const taxi = new Taxi('Skoda', 'Rapid');
    // Act
    const actual = taxi.model;
    const expected = 'Rapid';
    // Assert
    assert.strictEqual(actual, expected);
  });

  it('should have a driver', function() {
    // arrange
    // act
    const actual = taxi.driver
    const expected = 'Jane'
    // assert
    assert.strictEqual(actual, expected);
  });

  // do some stuff about passengers
  // or xdescribe to not run for some time.
  describe('passengers', function() {
    it('should start with no passengers', function() {
      const actual = taxi.passengers;
      assert.deepStrictEqual(actual, []);
    });
    it('should show a number of passengers', function() {
      const actual = taxi.numberOfPassengers();
      const expected = 0;
      assert.strictEqual(actual, expected);
    });

    it('should be able to add a passenger', function() {
      taxi.addPassenger('Dan')
      const actual = taxi.numberOfPassengers();
      const expected = 1;
      assert.strictEqual(actual, expected);
    })
    it('should be able to remove passenger by name', function() {
      taxi.removePassengerByName('Dan');
      const actual = taxi.numberOfPassengers();
      const expected = 0;
      assert.strictEqual(actual, expected);
    });
    it('should be able to remove all passengers', function() {
      taxi.addPassenger('Mary');
      taxi.addPassenger('Jack');
      taxi.addPassenger('Brat');
      taxi.removeAllPassengers();
      const actual = taxi.numberOfPassengers();
      const expected = 0;
      assert.strictEqual(actual, expected);
    })
  });
});


// Employing TDD, add the following methods to your taxi:
// numberOfPassengers
// addPassenger
// removePassengerByName
// removeAllPassengers
// A passenger should be represented as a String containing the passenger's name.
