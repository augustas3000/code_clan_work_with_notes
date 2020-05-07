
const PangramFinder = function (phrase) {
  this.phrase = phrase;
  this.alphabet = 'qwertyuiopasdfghjklzxcvbnm'.split('');
}


PangramFinder.prototype.isPangram = function () {
  let alphabet = this.alphabet;
  // /\w*/g
  // /[A-Za-z]/g
  let reg_exp = /[A-Za-z]/g;
  let phrase = this.phrase.toLowerCase();
  phrase = phrase.match(reg_exp);
  if (phrase != null) {
    let phrase_letters = alphabet.filter((letter) => {
      if (phrase.includes(letter)) {
        return letter
      }
    });

    if (phrase_letters.length === alphabet.length) {
      return true
    } else {
      return false;
    }
  } else {
    return false;
  }
};


// PangramFinder.prototype.isPangram = function () {
//   const string = this.phrase.toLowerCase().replace(/[^a-z]/g, '');
//   const unqiueString = String.prototype.concat(...new Set(string))
//   if (unqiueString.length === this.alphabet.length){
//     return true;
//   } else {
//     return false;
//   }
// }











module.exports = PangramFinder;
//
// const pangramFinder = new PangramFinder('this is not a pangram so the result should be false');
//
// console.log(pangramFinder.isPangram());

//
