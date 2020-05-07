require 'pry'
require_relative 'models/pizza_order.rb'

PizzaOrder.delete_all()

# generate an object with an argument of hash which lists columns as keys and values for thsi specific record. one order - one record.

order1 = PizzaOrder.new(
  {'first_name' => 'Luke',
   'last_name' => 'Skywalker',
   'quantity' => '1',
   'topping' => 'Spicy meat feast'}
)

order2 = PizzaOrder.new(
  {'first_name' => 'Darth',
   'last_name' => 'Vader',
   'quantity' => '1',
   'topping' => 'Blood of the innocent'}
)


# if we want to save information of teh attributes (inst variables)  from these objects int othe database -
# we call the save object method, that creates a a connection object using PG.connect and assigns it to a variable.

# then executes pre-defined sql command to insert values (which are in this case instance variables values) for columns specified.
# and then closes the PG.connect object with db.close

order1.save
order2.save

order2.quantity = 20
order2.update()

# p PizzaOrder.all

# binding.pry cant be the l;ast line of program hence nil.

# orders_returned = PizzaOrder.all
# p orders_returned

binding.pry
nil
