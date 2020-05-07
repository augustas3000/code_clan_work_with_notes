require( 'sinatra' )
require( 'sinatra/contrib/all' )
require( 'pry' )
require_relative('models/pizza_order.rb')
also_reload('./models/*')

# How this helps?
# By following this pattern, you don’t have to reinvent the wheel every time you build a new CRUD app. The routes and method names have already been decided, so you can just focus on the app itself.
# Since all CRUD apps are capable of doing the same four basic actions, these routes can be used for all your projects.

# Route - index, url - /pizza_orders, HTTP Verb - GET
# Displays a list of all pizza_orders
get '/pizza-orders' do
  @orders = PizzaOrder.all
  erb(:index)
end
# this has to go before the '/pizza-orders/:id', otherwise app broken: this route should return html page that has a form to create new pizza orders.


# Route - New, url - /pizza_orders/new, HTTP Verb - GET
# Shows form to make new pizza order
get '/pizza-orders/new' do
  # providing a form
  erb(:new)
end

# Route - Create, url - /pizza_orders, HTTP Verb - POST
# Adds new pizza order to database then redirects:
post '/pizza-orders' do
  @new_order = PizzaOrder.new(params)
  @new_order.save
  erb(:create)
end

# Route - Show, url - /pizza_orders/:id, HTTP Verb - GET
# Shows info about one of the orders, based on id
get '/pizza-orders/:id' do
  # binding.pry
  id = params[:id]
  @order = PizzaOrder.find(id)
  erb(:show)
end

# Route - Edit, url - /pizza_orders/:id/edit, HTTP VERB GET
# Shows edit form for one of the pizza_orders
get '/pizza-orders/:id/edit' do
  # url params, if its get
  id = params[:id]
  @order_obj = PizzaOrder.find(id)
  erb( :edit )
end

# Route - Update, url - /pizza-orders/:id, HTTP Verb - PUT
# Update a particular pizza_order
post '/pizza-orders/:id' do
  # payload params - id plus form data in a hash.
  binding.pry
  @order_obj = PizzaOrder.new(params)
  @order_obj.update
  redirect to( "/pizza-orders/#{params[:id]}" )
end


#delete a pizza by id
post '/pizza-orders/:id/delete' do
  id = params[:id]
  @order_obj = PizzaOrder.find(id)
  @order_obj.delete

  redirect to('/pizza-orders')
end
