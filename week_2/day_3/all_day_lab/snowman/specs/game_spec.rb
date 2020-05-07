require('minitest/autorun')
require('minitest/reporters')
Minitest::Reporters.use! Minitest::Reporters::SpecReporter.new

require_relative('../word.rb')
require_relative('../game.rb')
require_relative('../player.rb')


class GameTest < Minitest::Test

  def setup

    @player_obj = Player.new("Player 1")
    @word_obj = Word.new("elevator")
    @game_obj = Game.new(@player_obj, @word_obj)

  end



end
