# In pairs, plan and create an object oriented model of a Pub, with Drinks and Customers!
#
# MVP:
#
# A Pub should have a name, a till, and a collection of drinks
# A Drink should have a name, and a price
# A Customer should have a name, and a wallet


class Pub

  attr_reader :drinks, :food

  def initialize(name_str)
    @name = name_str

    @till = 20.00
    @drinks = []
    @food = []


    @stock = {}

  end

  def inspect_stock
    return @stock
  end

  def stock_up_drinks(array_of_drink_objects, qty_int)
    @drinks += array_of_drink_objects

    for drink_obj in array_of_drink_objects
      @stock[drink_obj.name] = qty_int
    end

  end

  def stock_up_food(array_of_food_objects)
    @food += array_of_food_objects
  end

  def count_drinks
    @drinks.length
  end

  def money_in(money_float)
    @till += money_float
  end

  def check_till
    return @till
  end

  def check_age(age)
    if age > 18
      return true
    else
      return false
    end
  end

  def too_drunk?(drunkness_level)
    if drunkness_level > 10
      return true
    else
      return false
    end
  end

  def stock_value
    total_value = 0

    for k, v in @stock
      for drink_obj in @drinks
        if drink_obj.name == k
          total_value += v * drink_obj.price
        end
      end
    end

    return total_value

  end

end


class Drink

  attr_reader :name, :price, :level

  def initialize(name_str, price_float, level_int)
    @name = name_str
    @price = price_float

    @level = level_int
  end

end



class Customer
  attr_reader :age

  def initialize(name_str, wallet_float, age_int)
    @name = name_str
    @wallet = wallet_float
    @age = age_int
    @drunkness = 0
  end



# A Customer should be able to buy a Drink from the Pub, reducing the money in its wallet and increasing the money in the Pub’s till

  def buy_drink(pub_obj, name_of_drink_str)
    # drink in stock?
    if pub_obj.inspect_stock[name_of_drink_str] > 0
    # is customer of right age?
      if pub_obj.check_age(@age) == true &&
         pub_obj.too_drunk?(@drunkness) == false
          for drink_obj in pub_obj.drinks
            if drink_obj.name == name_of_drink_str &&
              @wallet > drink_obj.price
              @wallet -= drink_obj.price
              pub_obj.money_in(drink_obj.price)
              pub_obj.inspect_stock[name_of_drink_str] -= 1
              drink(drink_obj)
            end
          end
      end
    end
  end


  def buy_food(pub_obj, name_of_food_str)

    # if self.check_wallet > food_obj.price
    for food_obj in pub_obj.food
      if food_obj.name == name_of_food_str && self.check_wallet > food_obj.price
        @wallet -= food_obj.price
        pub_obj.money_in(food_obj.price)
        self.eat(food_obj)
      end
    end

  end


  def check_wallet
    return @wallet
  end

  def drink(drink_obj)
    @drunkness += drink_obj.level
  end

  def eat(food_obj)
    if @drunkness == 0

    else
    @drunkness -= food_obj.rejuvenation_level
    end
  end

  def check_drunkeness
    return @drunkness
  end


end

# Create a Food class, that has a name, price and rejuvenation_level. Each time a Customer buys Food, their drunkenness should go down by the rejuvenation_level

class Food
  attr_reader :name, :price, :rejuvenation_level
  def initialize(name_str, price_float, rejuvenation_level_int)
    @name = name_str
    @price = price_float
    @rejuvenation_level = rejuvenation_level_int
  end

end
