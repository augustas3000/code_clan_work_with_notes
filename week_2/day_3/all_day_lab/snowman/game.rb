# In pairs, plan out, build and test an object oriented implementation of the word guessing game Snowman.
#
# A player has 6 chances to guess a hidden word.
# Each incorrect guess will melt part of the snowman. A player wins when they guess the word and lose when they run out of lives and the snowman melts.


# A Game will have properties for a Player object, a HiddenWord object, and an array of guessed_letters
# A Player will have a name and number of lives
# A HiddenWord will be initialised with a word string, but will only display letters which have been correctly guessed, replacing the rest with the * character
# The HiddenWord should also be able to report true or false if a letter appears in the word



class Game

  def initialize(player_obj, hidden_word_obj)
    @player = player_obj
    @word = hidden_word_obj
    @guessed_letters = []
  end


  # The Game should be able to pass a single letter to a HiddenWord as a guess
# It should store these single letters in its guessed_letters array
# It should be able to subtract a life from a Player if the guess is incorrect
# It should be able to tell whether the game is_won? or is_lost?



  def guess(letter_str)
    

  end




end
