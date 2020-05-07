# Why do i require minitest/autorun instead of test/unit for generating unit test?


# testing - think automation .. hence testing frameworks.
# we want to assert the output of a function! ASSERT
# test can pass or fail an assertion

require 'minitest/autorun'

# readup on this - basically improves presentation of output, tabulated and colored.
require 'minitest/reporters'

MiniTest::Reporters.use! MiniTest::Reporters::SpecReporter.new

require_relative '../my_functions.rb'

# FunctionTest? can in be name AnythingTest? Yes

# Arrange, Act, Assert workflow.

class FunctionsTest < MiniTest::Test

  # testing greet function from ../my_functions.rb
  def test_greet()
    # arrange

    # act
    result = greet("Niall", "afternoon")
    # assert

    # first parameter for expectation, second for actual result.
    #
    assert_equal("Good afternoon, Niall", result)
  end

  def test_add()
    # arrange

    # act
      result = add(2, 2)
    # assert
    assert_equal(4, result)
  end

  def test_add__negative()
    # arrange

    # act
    result = add(-2, 5)
    # assert
    assert_equal(3, result)
  end

end
