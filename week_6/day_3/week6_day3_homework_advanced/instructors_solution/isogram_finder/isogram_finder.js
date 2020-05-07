const IsogramFinder = function (word) {
  this.word = word.toLowerCase();
}

// The every() method tests whether all elements in the array pass the test implemented by the provided function. It returns a Boolean value
IsogramFinder.prototype.isIsogram = function () {
  return this.word.split('').every(letter => this.isUnique(letter));
}


// The lastIndexOf() method returns the last index at which a given element can be found in the array, or -1 if it is not present. The array is searched backwards, starting at fromIndex.
IsogramFinder.prototype.isUnique = function (letter) {
  return this.word.indexOf(letter) === this.word.lastIndexOf(letter);
}

module.exports = IsogramFinder;
