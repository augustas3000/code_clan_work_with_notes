const assert = require('assert');
const Decorator = require('../decorator.js');
const Paint = require('../paint.js');
const Room = require('../room.js');


describe('Decorator', function(){

  beforeEach(function(){
    decorator = new Decorator()
    can = new Paint(5);
    can1 = new Paint(5);
    can2 = new Paint(5);
    can3 = new Paint(5);
    can4 = new Paint(5);
    room = new Room(20);
  });

it('should be able to add a can to stock', function() {

  decorator.addPaint(can);
  decorator.addPaint(can1);
  decorator.addPaint(can2);
  decorator.addPaint(can3);
  decorator.addPaint(can4);
  const actual = decorator.paint_stock.length;
  const expected = 5;
  assert.strictEqual(actual, expected)
});

it('should be able to show total paint', function() {

  decorator.addPaint(can);
  decorator.addPaint(can1);
  decorator.addPaint(can2);
  decorator.addPaint(can3);
  decorator.addPaint(can4);
  const actual = decorator.totalPaint();
  const expected = 25;
  assert.strictEqual(actual, expected)
});

it('should be able to tell if he has enough paint for a given room', function() {

  decorator.addPaint(can);
  decorator.addPaint(can1);
  decorator.addPaint(can2);
  decorator.addPaint(can3);
  decorator.addPaint(can4);

  const actual = decorator.enoughForRoom(room);
  const expected = true;
  assert.strictEqual(actual, expected);
});

it('should be able to paint a room', function() {
  decorator.addPaint(can);
  decorator.addPaint(can1);
  decorator.addPaint(can2);
  decorator.addPaint(can3);
  decorator.addPaint(can4);

  const actual = decorator.paintRoom(room)



});


});
