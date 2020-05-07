require 'sinatra'
require 'sinatra/contrib/all'
require_relative 'models/rock_paper_scissors'
also_reload('models/*')

get '/' do
  erb(:home)
end

# reg exp to limit this roiute to combinations of ock/paper/scissors?
get '/:hand1/:hand2' do
  # we bind the functionality of model Rsp, to the user's interaction with the views.
  # @game is a global variable which will be displayed in a view called erb(:result)
  hand1 = params[:hand1]
  hand2 = params[:hand2]
  @game = Rps.compare(hand1, hand2)
  erb(:result)
end

get '/rules' do
erb(:rules)
end
