const Journey = require('./journey.js');

const Traveller = function(journeys) {
  this.journeys = journeys;
};

Traveller.prototype.getJourneyStartLocations = function() {
  let journeys = this.journeys;
  let start_locations = journeys.map((journey) => {
    return journey.startLocation;
  });
  return start_locations;
};

Traveller.prototype.getJourneyEndLocations = function () {
  let journeys = this.journeys;
  let end_locations = journeys.map((journey) => {
    return journey.endLocation;
  });
  return end_locations;
};

Traveller.prototype.getJourneysByTransport = function (transport) {
  let journeys = this.journeys;
  let filtered_journeys = journeys.filter((journey) => {
    return journey.transport === transport;
  });
  return filtered_journeys;
};

Traveller.prototype.getJourneysByMinDistance = function (minDistance) {
  let journeys = this.journeys;
  let filtered_journeys = journeys.filter((journey) => {
    return journey.distance > minDistance;
  });
  return filtered_journeys;
};

Traveller.prototype.calculateTotalDistanceTravelled = function () {
  let journeys = this.journeys;

  let total = journeys.reduce((tot, cur) => {
    return tot + cur.distance;
  }, 0);

  return total;
};

Traveller.prototype.getUniqueModesOfTransport = function () {
  let journeys = this.journeys;
  let journeys_str = journeys.map((journey) => {
    return journey.transport;
  });
  let unique = journeys_str.filter((item, index, original_array) => {
     return original_array.indexOf(item) === index;
  });
  return unique;
};


//
// journey1 = new Journey('linlithgow', 'stirling', 'train', 30);
// journey2 = new Journey('paris', 'frankfurt', 'train', 400);
// journey3 = new Journey('sydney', 'new york', 'aeroplane', 10000);
// journey4 = new Journey('london', 'rome', 'car', 1200);
// journey5 = new Journey('lancaster', 'isle of man', 'ferry', 80);
// journeys = [journey1, journey2, journey3, journey4, journey5];
// traveller = new Traveller(journeys);
//
//
// console.log(traveller.getUniqueModesOfTransport());


// You should write the code to make the Traveller tests pass, without modifying the spec files. You should use JavaScript’s built-in enumerator methods, only using forEach if you can’t find a way to use one of the other more appropriate methods.
//
// MVP
// Traveller:
//
// should have a collection of journeys
// should be able to get the journeys start locations
// should be able to get the journeys end locations
// should be able to get journeys by transport
// should be able to get journeys over a certain distance
// Extensions
// Traveller:
//
// should be able to calculate total distance travelled
// should be able to get a unique list of modes of transport
// Note: Remember to remove the x from xit() on the pending tests to run them.






module.exports = Traveller;
