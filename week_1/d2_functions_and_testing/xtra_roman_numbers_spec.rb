require_relative 'xtra_roman_numbers_bug'
require 'test/unit'


# or require( 'minitest/autorun' ), require('minitest/reporters')
# Most of the assertions in MiniTest:Test mirror those in Test::Unit::Case
# Differences: (In Test::Unit you'd say assert_not_nil(x), and assert_not(x),
# in MiniTest  you would say refute_nil(x), refute(x).
# VARIANT 1
# class TestRoman < Test::Unit::TestCase
#
#   def test_simple
#     # arrange
#     # act
#     result_1 = Roman.new(1).to_s
#     result_2 = Roman.new(9).to_s
#     # assert
#     assert_equal("i", result_1)
#     assert_equal("ix", result_2)
#   end
# end
#
# # Variant 2:
#
# class TestRoman < Test::Unit::TestCase
#   def test_simple_1()
#     # arrange
#     # act
#     result_1 = Roman.new(1).to_s
#     # assert
#     assert_equal("i", result_1)
#   end
#
#   def test_simple_2()
#     # arrange
#     # act
#     result_2 = Roman.new(9).to_s
#     # assert
#     assert_equal("ix", result_2)
#   end
# end



require( 'minitest/autorun' )
require('minitest/reporters')
Minitest::Reporters.use! Minitest::Reporters::SpecReporter.new


# class MyTest < MiniTest::Test
  # def test_simple_1()
  #   # arrange
  #   # act
  #   result_1 = Roman.new(1).to_s
  #   # assert
  #   assert_equal("i", result_1)
  # end
  #
  # def test_simple_2()
  #   # arrange
  #   # act
  #   result_2 = Roman.new(9).to_s
  #   # assert
  #   assert_equal("ix", result_2)
  # end

#   def test_simple_multiple_assertions()
#     # arrange
#     # act
#     res_1 = Roman.new(1).to_s
#     res_2 = Roman.new(2).to_s #fail on second assertion - test stops..
#     res_3 = Roman.new(3).to_s
#     res_4 = Roman.new(4).to_s
#     res_9 = Roman.new(9).to_s
#
#     # assert
#     assert_equal("i", res_1)
#     assert_equal("ii", res_2)
#     assert_equal("iii", res_3)
#     assert_equal("iv", res_4)
#     assert_equal("ix", res_9)
#   end
#
# end

# avoid duplication..:

# class MyTest < MiniTest::Test
#  # We can implement datatypes and looping to make testing more efficient.
#   NUMBERS = {
#     1 => "i",
#     2 => "ii",
#     3 => "iii",
#     4 => "iv",
#     5 => "v",
#     9 => "ix"
#   }
#
#   def test_with_hash()
#     NUMBERS.each do |arabic, roman|
#       r = Roman.new(arabic)
#       assert_equal(roman, r.to_s)
#     end
#   end
#
#
#   # The constructor checks that the number we pass in can be represented as
#   # a Roman number, throwing an exception if it can't. Lets test the exception:
#
#   def test_range()
#     # no exception for these two: (this is not required but still a good practice)
#     Roman.new(1)
#     Roman.new(4999)
#     # but an exception for these
#     assert_raises(RuntimeError) {Roman.new(0) }
#     assert_raises(RuntimeError) {Roman.new(5000) }
#   end
#
# end


class User
  def initialize(value)
    @value = value
  end
end

user = User.new(1)

class ATestThatFails < MiniTest::Test
  def test_user_created
    user = User.find(1)
    refute_nil(user, "User with ID=1 should exist")
  end
end
