require('minitest/autorun')
require('minitest/reporters')
Minitest::Reporters.use! Minitest::Reporters::SpecReporter.new

require_relative('../pub.rb')


class PubTest < Minitest::Test

  def setup
    @pub_obj = Pub.new("Molly Malones")

    @customer_obj = Customer.new("Gus", 50.00, 28)

    @drink_obj_guiness = Drink.new("Guiness", 3.50, 1)
    @drink_obj_brewdog = Drink.new("Brew Dog", 4.50, 1)
    @drink_obj_wine = Drink.new("Sangria", 4.00, 2)
    @drink_obj_cider = Drink.new("Strongbow", 3.00, 2)
    @drink_obj_vodka = Drink.new("Grey Goose", 5.00, 3)
    @drink_obj_moonshine = Drink.new("Special", 1.55, 3)

    @all_drinks_array = [@drink_obj_guiness, @drink_obj_brewdog, @drink_obj_wine, @drink_obj_cider, @drink_obj_vodka, @drink_obj_moonshine]

    @pub_obj.stock_up_drinks(@all_drinks_array, 20)


  end

  def test_check_age
      assert_equal(true, @pub_obj.check_age(@customer_obj.age))
  end

  def test_inspect_stock_hash

        expected_hash = {
          "Guiness" => 20,
          "Brew Dog" => 20,
          "Sangria" => 20,
          "Strongbow" => 20,
          "Grey Goose" => 20,
          "Special" => 20
        }


    assert_equal(expected_hash, @pub_obj.inspect_stock )
  end

  def test_stock_value
    assert_equal(431 ,@pub_obj.stock_value)
  end


  def test_stock_value_update
    @customer_obj.buy_drink(@pub_obj, "Grey Goose")
    @customer_obj.buy_drink(@pub_obj, "Grey Goose")
    @customer_obj.buy_drink(@pub_obj, "Grey Goose")


    assert_equal(416 ,@pub_obj.stock_value)
  end

end


class CustomerTest < Minitest::Test

  def setup
    @pub_obj = Pub.new("Molly Malones")

    @customer_obj = Customer.new("Gus", 50.00, 28)
    @customer_obj_under = Customer.new("Ian", 5.00, 16)

    @drink_obj_guiness = Drink.new("Guiness", 3.50, 1)
    @drink_obj_brewdog = Drink.new("Brew Dog", 4.50, 1)
    @drink_obj_wine = Drink.new("Sangria", 4.00, 2)
    @drink_obj_cider = Drink.new("Strongbow", 3.00, 2)
    @drink_obj_vodka = Drink.new("Grey Goose", 5.00, 3)
    @drink_obj_moonshine = Drink.new("Special", 1.55, 3)

    @all_drinks_array = [@drink_obj_guiness, @drink_obj_brewdog, @drink_obj_wine, @drink_obj_cider, @drink_obj_vodka, @drink_obj_moonshine]

    @pub_obj.stock_up_drinks(@all_drinks_array, 20)

    @food_obj_chips = Food.new("Chips", 1.00, 1)
    @food_obj_burger = Food.new("Burger", 2.00, 3)
    @all_food_array = [@food_obj_chips, @food_obj_burger]

    @pub_obj.stock_up_food(@all_food_array)
  end

  def test_stock_up_drinks()
    expected = 6
    assert_equal(expected, @pub_obj.count_drinks)
  end

  def test_buy_drink_age_ok_money_ok
    @customer_obj.buy_drink(@pub_obj, "Guiness")
    # customer looses 3.50
    assert_equal(46.5, @customer_obj.check_wallet)
    # pub earns 3.50
    assert_equal(23.50, @pub_obj.check_till)
  end


  def test_buy_drink_age_no_ok_money_ok
    @customer_obj_under.buy_drink(@pub_obj, "Guiness")
    # customer looses 3.50
    assert_equal(5.00, @customer_obj_under.check_wallet)
    # pub earns 3.50
    assert_equal(20.00, @pub_obj.check_till)
  end

  def test_buy_drink_not_drunk
    @customer_obj.buy_drink(@pub_obj, "Grey Goose")
    @customer_obj.buy_drink(@pub_obj, "Grey Goose")
    # level 6 drunk after two grey goose, so the next one should get sold, and we assert the customer will be level 9 drunk.
    @customer_obj.buy_drink(@pub_obj, "Grey Goose")
    assert_equal(9, @customer_obj.check_drunkeness)
  end

  def test_buy_drink_drunk
    @customer_obj.buy_drink(@pub_obj, "Grey Goose")
    @customer_obj.buy_drink(@pub_obj, "Grey Goose")
    @customer_obj.buy_drink(@pub_obj, "Grey Goose")
    @customer_obj.buy_drink(@pub_obj, "Grey Goose")
    # level 12 drunk after four grey goose, so the next one should  NOT get sold, and we assert the customer will be level 12 drunk.
    assert_equal(12, @customer_obj.check_drunkeness)
  end

  def test_buy_drink_stock_update
    @customer_obj.buy_drink(@pub_obj, "Grey Goose")
    assert_equal(19, @pub_obj.inspect_stock["Grey Goose"])
  end

  def test_drunkeness
    @customer_obj.buy_drink(@pub_obj, "Guiness")
    @customer_obj.buy_drink(@pub_obj, "Sangria")
    @customer_obj.buy_drink(@pub_obj, "Grey Goose")

    assert_equal(6, @customer_obj.check_drunkeness)
  end

  def test_buy_food
    @customer_obj.buy_drink(@pub_obj, "Grey Goose")
    @customer_obj.buy_food(@pub_obj, "Burger")
    # check drunkness
    assert_equal(0, @customer_obj.check_drunkeness)
    # check money
    assert_equal(43, @customer_obj.check_wallet)
    assert_equal(27, @pub_obj.check_till)
  end



end


class FoodTest < Minitest::Test

  def setup
    @pub_obj = Pub.new("Molly Malones")

    @customer_obj = Customer.new("Gus", 50.00, 28)
    @customer_obj_under = Customer.new("Ian", 5.00, 16)

    @drink_obj_guiness = Drink.new("Guiness", 3.50, 1)
    @drink_obj_brewdog = Drink.new("Brew Dog", 4.50, 1)
    @drink_obj_wine = Drink.new("Sangria", 4.00, 2)
    @drink_obj_cider = Drink.new("Strongbow", 3.00, 2)
    @drink_obj_vodka = Drink.new("Grey Goose", 5.00, 3)
    @drink_obj_moonshine = Drink.new("Special", 1.55, 3)

    @all_drinks_array = [@drink_obj_guiness, @drink_obj_brewdog, @drink_obj_wine, @drink_obj_cider, @drink_obj_vodka, @drink_obj_moonshine]

    @pub_obj.stock_up_drinks(@all_drinks_array, 20)
  end

end
