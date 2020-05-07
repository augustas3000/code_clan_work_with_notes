require( 'minitest/autorun' )
require('minitest/reporters')
Minitest::Reporters.use! Minitest::Reporters::SpecReporter.new

require_relative( '../friends' )


# Unit tests seem to fall into high-level groupings, called test cases,
# and lower level groupings, which are test methods themselves:
# within a test case you will probably want to organize your assertions into a
# number of test methods (where each method contains the assertions for one
# type of test(not done here - rather multiple test cases with an assertion
# each.

class TestFriends < MiniTest::Test

# Quite often you will find all the test methods within a test case start
# by setting up a particular scenario(def detup), each method then probes
# some aspect of that scenario.
  def setup

    @person1 = {
      name: "Shaggy",
      age: 12,
      monies: 1,
      friends: ["Velma","Fred","Daphne", "Scooby"],
      favourites: {
        tv_show: "Friends",
        snacks: ["charcuterie"]
      }
    }

    @person2 = {
      name: "Velma",
      age: 15,
      monies: 2,
      friends: ["Fred"],
      favourites: {
        tv_show: "Baywatch",
        snacks: ["soup","bread"]
      }
    }

    @person3 = {
      name: "Scooby",
      age: 18,
      monies: 20,
      friends: ["Shaggy", "Velma"],
      favourites: {
        tv_show: "Pokemon",
        snacks: ["Scooby snacks"]
      }
    }

    @person4 = {
      name: "Fred",
      age: 18,
      monies: 20,
      friends: ["Shaggy", "Velma", "Daphne"],
      favourites: {
        tv_show: "X-Files",
        snacks: ["spaghetti", "ratatouille"]
      }
    }

    @person5 = {
      name: "Daphne",
      age: 20,
      monies: 100,
      friends: [],
      favourites: {
        tv_show: "X-Files",
        snacks: ["spinach"]
      }
    }

    @people = [@person1, @person2, @person3, @person4, @person5]

  end



  # 1. For a given person, return their name
  def test_getting_name
    result = get_name(@person5)
    assert_equal("Daphne", result)
  end

  # 2. For a given person, return their favourite tv show
  # (e.g. the function favourite_tv_show(@person2) should return the string "Baywatch")
  def test_getting_tv_show
    expected_result="X-Files"
    actual_result=get_tv_show(@person5)
    assert_equal(expected_result, actual_result)
  end

  # 3. For a given person, check if they like a particular food
  # (e.g. the function likes_to_eat(@person2, "bread") should return true, likes_to_eat(@person3, "spinach") should return false)
  def test_getting_food
    expected_result=true
    actual_result=likes_food(@person5, "spinach")
    assert_equal(expected_result, actual_result)
  end
  # 4. For a given person, add a new name to their list of friends
  # (e.g. the function add_friend(@person2, "Scrappy-Doo") should add Scrappy-Doo to the friends.)
  # (hint: This function should not return anything. After the function call, check for the length of the friends array to test it!)

  def test_addfriend_to_person_5()
    expected_result = 1

    add_friend(@person5, "Scrappy")
    actual_result = @person5[:friends].length

    assert_equal(expected_result, actual_result)
  end

  # 5. For a given person, remove a specific name from their list of friends
  # (hint: Same as above, testing for the length of the array should be sufficient)

  def test_remove_friend_person4()
    expected_result = 2

    remove_friend(@person4, "Shaggy")

    actual_result = @person4[:friends].length
    assert_equal(expected_result, actual_result)

  end

  # 6. Find the total of everyone's money
  # (hint: use the @people array, remember how we checked the total number of eggs yesterday?)
  def test_total_money()
    expected_result = 143

    actual_result = count_total_money(@people)

    assert_equal(expected_result, actual_result)
  end

  # 7. For two given people, allow the first person to loan a given value of money to the other
  # (hint: our function will probably need 3 arguments passed to it... the lender, the lendee, and the amount for this function)
  # (hint2: You should test if both the lender's and the lendee's money have changed, maybe two assertions?)
  def test_loan_20_person5_to_person4
    expected_result1 = 80
    expected_result2 = 40
    loan_monies_between_friends(@person5, @person4, 20)
    actual_result1 = @person5[:monies]
    actual_result2 = @person4[:monies]
    assert_equal(expected_result1, actual_result1)
    assert_equal(expected_result2, actual_result2)
  end

  # 8. Find the set of everyone's favourite food joined together
  # (hint: concatenate the favourites/snack arrays together)
  def test_all_fav_food()
    expected_result = ["charcuterie", "soup", "bread", "Scooby snacks", "spaghetti", "ratatouille", "spinach"]
    actual_result = all_fav_food(@people)

    assert_equal(expected_result, actual_result)#
  end

  # 9. Find people with no friends
  # (hint: return an array, there might be more people in the future with no friends!)
  def test_find_people_with_no_friends()
    expected_result = [@person5]
    actual_result = find_people_with_no_friends(@people)
    assert_equal(expected_result, actual_result)
  end
end
