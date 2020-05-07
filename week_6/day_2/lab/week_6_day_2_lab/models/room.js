const Room = function(area){
  this.area = area;
  this.painting_progress = 0;
  this.complete = false;

  this.lPerMetre = 1;


};

Room.prototype.paintRequired = function (){
 return this.area * this.lPerMetre;
};

module.exports = Room;
