# Create a single Ruby Model

# table from sql is basically and array of hashes,
# one hash is eq one record with keys as col names and
# correspondign values.


# means to speak wit hdatabase"
require 'pg'

# 1. Setup a PizzaOrder model

class PizzaOrder
  # 2. Create readers for our instances:
  # 	- first_name
  # 	- last_name
  # 	- topping
  # 	- quantity
  attr_accessor :first_name, :last_name, :quantity, :topping

  attr_reader :id

  # options - arg for array with hashes from tabe in db:
  # this will take in a hash(within an array?) with specified column names and values:
  def initialize(options)
    @first_name = options['first_name']
    @last_name = options['last_name']
    @quantity = options['quantity'].to_i
    @topping = options['topping']

    @id = options['id'].to_i if options['id']
  end

  # for sql:
  def save()
    #create a db connection object
    db = PG.connect({dbname: 'pizza_shop', host: 'localhost'})
    # sql to be run on a database:

    # which table insert into? pizza_order
    # specify colum names into which to insert
    # then values - string interpolation, notice how quantity is to_i hence no single quotes. Double qoutes on outer margins - always!!!!.
    # a prepared sql statement:
    # sql = "INSERT INTO pizza_orders
    #       (first_name, last_name, quantity, topping)
    #       VALUES ('#{@first_name}', '#{@last_name}', #{@quantity}, '#{@topping}')"


    # placeholder way: sanitizing input: sql does the magic after this:
    sql = "INSERT INTO pizza_orders
          (first_name, last_name, quantity, topping)
          VALUES ($1, $2, $3, $4)  RETURNING *"
 # RETURNING *
    values = [@first_name, @last_name, @quantity, @topping]

     # under hood values are checked for not being dangerous sql
     # commands.
     # required if using the sanitizing technique
     #prepare a sql statement, called "save"

    db.prepare("save", sql)

    # returns the array of sql querry hash, so we call it and use id key to pick up it's id. IT SAVES tye object and return OBJECT WE JUST SAVED!!!

    @id = db.exec_prepared("save", values)[0]["id"].to_i

    #close db connection object:
    db.close

  end
    # standard ending commands in sanitizing not required.
    # db.exec(sql)
    # #close db connection object:
    # db.close

    # order 1 should not have responsiblity to see all orders(it is only one instance - not instance responsiblity bu THE CLASSES!!!!)

    # or self instead of PizzaOrder
  def PizzaOrder.all()
    # connect
    db = PG.connect({dbname: 'pizza_shop', host: 'localhost'})

    sql = "SELECT * FROM pizza_orders"

    # prepare an sql statement, and call it "all:"
    db.prepare("all", sql)
    # save the result of executing prepared statement
    orders = db.exec_prepared("all")
    # close db:
    db.close

    return orders.map{ |order| PizzaOrder.new(order) }

  end

  def PizzaOrder.delete_all()

    db = PG.connect({dbname: 'pizza_shop', host: 'localhost'})

    sql = "DELETE FROM pizza_orders"
    db.prepare("delete_all", sql)
    db.exec_prepared("delete_all")
    db.close

  end

  def delete

    db = PG.connect({dbname: 'pizza_shop', host: 'localhost'})
    sql = "DELETE FROM pizza_orders WHERE id = $1"
    values = [@id]
    db.prepare("delete_one", sql)
    db.exec_prepared("delete_one", values)
    db.close

  end

  def update()
    db = PG.connect({dbname: 'pizza_shop', host: 'localhost'})
    sql = "UPDATE pizza_orders
           SET (first_name, last_name, quantity, topping) =
           ($1, $2, $3, $4)
           WHERE id = $5"
    values = [@first_name, @last_name, @quantity, @topping, @id]
    db.prepare("update", sql)
    db.exec_prepared("update", values)
    db.close
  end

end

# binding.pry
# nil
