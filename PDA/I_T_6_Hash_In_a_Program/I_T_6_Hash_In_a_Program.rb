# Demonstrate the use of a hash in a program. Take screenshots of:
# *A hash in a program
# *A function that uses the hash
# *The result of the function running

# Augustas Juskevicius


# Hash example: Rock Paper and Scissors Game

class Rps

  def self.compare(arg1, arg2)

    # possible outcomes of two players playing rock, paper, scissors game
    # abstracted into a hash:
    outcomes = {
      'rock'     => { 'rock' => 'tie',   'paper' => 'lose',  'scissors' => 'win'},
      'paper'    => { 'rock' => 'win',   'paper' => 'tie',   'scissors' => 'lose'},
      'scissors' => { 'rock' => 'lose',  'paper' => 'win',   'scissors' => 'tie' }
    }

    # check condition if rock , scissors or paper.
    if outcomes.has_key?(arg1) && outcomes.has_key?(arg2)

      if outcomes[arg1][arg2] == 'win'
        return "Player 1 wins by playing #{arg1.capitalize}!"
      elsif outcomes[arg1][arg2] == 'tie'
        return "It's a tie! Both players played #{arg1.capitalize}!"
      else
        return "Player 2 wins by playing #{arg2.capitalize}!"
      end

    else
      return "Wrong input! Please enter either rock, paper, or scissors."
    end

  end

end

signs = %w(rock paper scissors)

player1 = signs.sample
player2 = signs.sample
p "Player 1 plays .......... #{player1}"
p "Player 2 plays .......... #{player2}"
p Rps.compare(player1, player2)
puts
