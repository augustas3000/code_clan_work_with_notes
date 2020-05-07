const AnagramFinder = function (word) {
  this.word = word;
};

AnagramFinder.prototype.findAnagrams = function (otherWords) {
  let word = this.word;
  let other_words = otherWords;
  // /\w*/g
  // /[A-Za-z]/g
  //
  let reg_exp = /[A-Za-z]/g;
  let word_letters = word.toLowerCase();
  // let other_words_letters = {};
  let detected = [];
  word_letters = word.match(reg_exp);
  let word_to_test_letters;
  let word_to_test_letters_processed;


  // return word_letters;

  detected = otherWords.filter((word_to_test) => {
    // first word
    // if a string is not equal to word string
    if (word !== word_to_test) {
      // and if the length of two strings is the same
      if (word.length === word_to_test.length) {
          // the two strings have to have the same characters, thus same length, regardless the order or characters

          word_letters = word_letters.map((word) => {
            return word.toLowerCase();
          })

          word_to_test_letters = word_to_test.match(reg_exp);

          word_to_test_letters_processed =  word_to_test_letters.filter((letter) => {
            // if a letetr of given word is a valid index of main word letters array, then add to filtered array
            
            if (word_letters.indexOf(letter.toLowerCase()) === -1) {
              false
            } else {
                return letter;
            }
            // if after filtering lengths are the same, its an anagranm
          });

          if (word.length === word_to_test_letters_processed.length) {
            return word_to_test;
          }

        }

                        // if after filtering through letters of given word,
    }







    // now we have an array of letters to compare against,
    // if the two arrays are completely the same ==, then skip a word,
     // then if letters from main word(word) are the same, push to detected, if not, skip.


  });
  return detected;
};


module.exports = AnagramFinder;

// //
// const anagramFinder = new AnagramFinder('DeduCTionS');
//
// console.log(anagramFinder.findAnagrams(['DiscOUnteD']));


//
// An anagram is a word formed by rearranging the letters of another word. Listen is an anagram of silent, for example.
//
// Given a word and an array of other words you should be able to filter the array, leaving only the anagrams of the word in question in the array.
