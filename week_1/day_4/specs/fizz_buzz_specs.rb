require_relative '../fizz_buzz'
require 'minitest/autorun'
require 'minitest/rg'

# require('minitest/reporters')
# Minitest::Reporters.use! Minitest::Reporters::SpecReporter.new

class TestFile < MiniTest::Test
  def test_fizz_buzz_3_returns_fizz()
    # arrange
    # act
    expected_result = "Fizz"
    actual_result = fizz_buzz(3)
    # assert
    assert_equal(expected_result, actual_result)
  end

  def test_fizz_buzz_5_returns_buzz()
    # arrange
    # act
    expected_result = "Buzz"
    actual_result = fizz_buzz(5)
    # assert
    assert_equal(expected_result, actual_result)
  end

  def test_fizz_buzz_5_returns_fizzbuzz()
    # arrange
    # act
    expected_result = "FizzBuzz"
    actual_result = fizz_buzz(15)
    # assert
    assert_equal(expected_result, actual_result)
  end

  def test_fizz_buzz_other_returns_next_num()
    # arrange
    # prepare range of nums.. etc.
    # act
    expected_result = "2"
    actual_result = fizz_buzz(2)
    # assert
    assert_equal(expected_result, actual_result)
  end

end
