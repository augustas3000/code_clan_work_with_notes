const assert = require('assert');
const Room = require('../room.js');


describe('Room', function() {
  beforeEach(function(){
    room = new Room(250)
  });
  it('have an area', function(){
    const actual = room.area;
    const expected = 250;
    assert.strictEqual(actual, expected)
  });
  it('should start not painted', function(){
    const actual = room.painting_progress;
    const expected = 0;
    assert.strictEqual(actual,expected)
    assert.strictEqual(room.complete, false)
  });
  it('should be able to tell ammount of paint required', function(){
    const actual = room.paintRequired();
    const expected = 250;
    assert.strictEqual(actual, expected)
  });
});
