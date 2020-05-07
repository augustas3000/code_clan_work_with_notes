require 'sinatra'

# get is in blue - come from sinatra.
# get will keep running. sinatra has a web-server that runs.

# only respond, when someone does a get on /hi route:
# essentially localhost:4567/hi
# thats us askign for stuff at /hi route.
# our code so far has not provided a response.

# sinatra allows us to build a controller
# a controller has one or more routes
# this our first route, which allows an HTTP GET on /hi
#

get '/hi' do
  return "Hello, G17!" #the response to the request will be the string "Hello World"
end


get '/dice' do
  return "#{rand(1..6)}"
end

# any code could be run in these routes

# anything that gets returned as a route in sinatra will come back as pust..
# Task: create a new route on /roll-die which returns a random number netween 1-6

# this get route should let me give a niunebr in the route andx get a friend(tv)  back.

# : is refering to a variable:
get '/friends/:number' do
  friends = ["Joey", "Phoebe", "Monica", "Chandler", "Rachel", "Ross"]
  index = params["number"].to_i - 1
  return friends[index]
end


# in sinatra the order does not matter, same with methods inside a classs

# the two below will be conflicting, varibale name does not make the route unique.

# get '/pet/:hello' do
#   "Hello, pet "
# end

get '/pet/:name' do
  "Hello #{params[:name]}"
end


# default route: / stands for default root route
# get '/' do
#   "Hello, world!"
# end
#
# get '/about' do
#   output = "<h2>Sinatra</h2>"
#   output << "<p>This is my first Sinatra app.</p>"
#   output
# end
