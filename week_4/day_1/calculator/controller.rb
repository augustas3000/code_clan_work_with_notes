require 'sinatra'
require 'sinatra/contrib/all'
require_relative 'models/calculator'
also_reload('/models/*')

# when the client(a laptop for example) inputs a url,which will be picked up by our application and handled by controller.
# it is responsible for deciding what to do when a given route is matched: route - a pairing of HTTP verb and a path like '/cats' followed by a code block
get '/add/:num1/:num2' do

  # the controlelr may create/fetch whichever model it needs to bundle up the data/logic, which is necessary for the page to be rendered.
  @calculation = "#{Calculator.add(params[:num1].to_i, params[:num2].to_i)}"

  # the model is then passed to a view, where the model is accessed to render the information to the page.
  erb(:result)
end

get '/subtract/:num1/:num2' do
  @calculation = "#{Calculator.subtract(params[:num1].to_i, params[:num2].to_i)}"
  erb(:result)
end

get '/multiply/:num1/:num2' do
  @calculation = "#{Calculator.multiply(params[:num1].to_i, params[:num2].to_i)}"
  erb(:result)
end

get '/divide/:num1/:num2' do
  @calculation = "#{Calculator.divide(params[:num1].to_f, params[:num2].to_i)}"
  erb(:result)
end

get '/' do
  erb(:home)
end

get '/about_us' do
  # direct to about us.
  erb(:about_us)
end

get '/new_link' do
  erb(:new_link)
end
