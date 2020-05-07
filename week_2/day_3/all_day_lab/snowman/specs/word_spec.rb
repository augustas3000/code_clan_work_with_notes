require('minitest/autorun')
require('minitest/reporters')
Minitest::Reporters.use! Minitest::Reporters::SpecReporter.new

require_relative('../word.rb')
require_relative('../game.rb')
require_relative('../player.rb')


class WordTest < Minitest::Test



end
