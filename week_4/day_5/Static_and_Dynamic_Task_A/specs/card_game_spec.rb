require("minitest/autorun")
require('minitest/reporters')
Minitest::Reporters.use! Minitest::Reporters::SpecReporter.new

require_relative("../card_game.rb")
require_relative("../card.rb")


class TestCardGame < MiniTest::Test

  def setup

    cards_hash = {
      'spades' => 10,
      'hearts' => 2,
      'clubs' => 3,
      'diamonds' => 1
    }

    @cards = cards_hash.map {|k,v|
      Card.new(k,v)
    }

    @game = CardGame.new

  end


  def test_checkforAce_true
    expected = true
    actual = @game.checkforAce(@cards[3])
    assert_equal(expected, actual)
  end

  def test_checkforAce_false
    expected = false
    actual = @game.checkforAce(@cards[0])
    assert_equal(expected, actual)
  end


  def test_highest_card_no_aces
    expected = @cards[0]
    actual = @game.highest_card(@cards[0], @cards[1])
    assert_equal(expected, actual)
  end


  # logic becomes a bit odd when the strongest card is ace with value of 1, but I am not experienced with cards and not sure how this is supposed to work, su just assuming ace is 1, but still is the highest card. So to pass the below test, extra conditional will have to be added to #highest_card method.

  def test_highest_card_with_aces
    expected = @cards[3]
    actual = @game.highest_card(@cards[0], @cards[3])
    assert_equal(expected, actual)
  end

  def test_highest_card_equal_cards
    equal_card = Card.new('spades', 2)
    expected = "Cards are equal"
    actual = @game.highest_card(equal_card, @cards[1])
    assert_equal(expected, actual)
  end

  # logic becomes a bit odd when the strongest card is ace with value of 1, but I am not experienced with cards and not sure how this is supposed to work, su just assuming ace is 1.
  def test_cards_total
    expected = "You have a total of 16"
    actual = CardGame.cards_total(@cards)
    assert_equal(expected, actual)
  end


end
