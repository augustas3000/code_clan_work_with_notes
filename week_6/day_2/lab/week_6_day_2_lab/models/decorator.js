const Decorator = function(){
  this.paint_stock = [];
  this.empty_cans = [];
};

Decorator.prototype.addPaint = function(paint_obj){
  this.paint_stock.push(paint_obj);
};
Decorator.prototype.totalPaint = function(){
  let total_paint = 0;
  for (let i = 0; i < this.paint_stock.length; i++){
    total_paint += this.paint_stock[i].remaining_volume
  };
  return total_paint;
};
Decorator.prototype.enoughForRoom = function(room_obj){
  if (room_obj.paintRequired() > this.totalPaint()){
    return false;
  } else {
    return true;
  };
};
Decorator.prototype.paintRoom = function(room_obj){
  if (this.enoughForRoom(room_obj) === true){
    let paint_requirement = room_obj.paintRequired();
    while (paint_requirement !== 0){
      let current_paint = this.paint_stock.pop[0];
      paint_requirement -= current_paint.volume;
      this.empty_cans.push(current_paint)
    }
  } else {
    return "Not enough paint"
  };
};

module.exports = Decorator;
