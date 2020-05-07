
# require 'minitest/autorun'

p "What animal are you?"

answer = gets.chomp.downcase

if answer == "chicken"
  p "This is my favorite animal."
elsif answer == "kitten"
  p "I love kittens."
else
  p "Sad, its not my favorite.."
end





# class FunctionTest < MiniTest::Test
#
#  def test_greet()
#    greeting = greet("Jay", "morning")
#    assert_equal( "Good morning Jay", greeting )
#  end
#
# end
