const assert = require('assert');
const Paint = require('../paint.js');

describe('Paint', function(){
  beforeEach(function(){
    can = new Paint(5);
    can1 = new Paint(5);
    can2 = new Paint(5);
    can3 = new Paint(5);
    can4 = new Paint(5);
  });
  it('should be able to return volume', function(){
    const actual = can.total_volume;
    const expected = 5;
    assert.strictEqual(actual, expected)
  });
  it('should be able to empty itself', function(){
    can.emptyItself();
    const actual = can.remaining_volume
    const expected = 0;
    assert.strictEqual(actual, expected)
  });
  it('should be able to return remaining volume', function(){
    const actual = can.remaining_volume;
    const expected = 5;
    assert.strictEqual(actual, expected)
  });
});
