const Taxi = function(manufacturer, model, driver_name) {
  this.manufacturer = manufacturer;
  this.model = model;
  this.driver = driver_name;
  this.passengers = [];
};

Taxi.prototype.numberOfPassengers = function() {
  return this.passengers.length;
}

Taxi.prototype.addPassenger = function(passenger_name) {
  this.passengers.push(passenger_name);
}

Taxi.prototype.removePassengerByName = function(passenger_name) {
  for (let i = 0; i < this.passengers.length; i++) {
    if (this.passengers[i] == passenger_name) {
      delete this.passengers[i];
    }
  }
};

Taxi.prototype.removeAllPassengers = function() {
  this.passengers = [];
};



module.exports = Taxi;
