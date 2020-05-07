const PangramFinder = function (phrase) {
  this.phrase = phrase.toLowerCase();
  this.alphabet = 'qwertyuiopasdfghjklzxcvbnm'.split('');
}

// The every() method tests whether all elements in the array pass the test implemented by the provided function. It returns a Boolean value.
PangramFinder.prototype.isPangram = function () {
  return this.alphabet.every(letter => this.phrase.includes(letter));
}

module.exports = PangramFinder;
