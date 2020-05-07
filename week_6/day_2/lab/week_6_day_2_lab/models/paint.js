const Paint = function(volume){
  this.total_volume = volume;
  this.remaining_volume = volume;
};

Paint.prototype.empty = function(){
  if (this.remaining_volume === 0){
    return true
  };
};
Paint.prototype.emptyItself = function(){
  this.remaining_volume = 0;
  };

module.exports = Paint;
