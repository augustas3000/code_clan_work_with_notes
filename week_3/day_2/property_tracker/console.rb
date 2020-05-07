require_relative 'models/property_tracker.rb'
require 'pry'

Property.delete_all()

house1 = Property.new({
  'address' => '82 Barrland Street',
  'value' => 200000,
  'number_of_bedrooms' => 2,
  'year' => 1995,
  'buy_let_status' => 'let',
  'square_footage' => 120,
  'build' => 'flat'
})

house2 = Property.new({
  'address' => '120 Union Street',
  'value' => 280000,
  'number_of_bedrooms' => 3,
  'year' => 2000,
  'buy_let_status' => 'buy',
  'square_footage' => 200,
  'build' => 'house'
})

house3 = Property.new({
  'address' => '125 Union Street',
  'value' => 20000,
  'number_of_bedrooms' => 9,
  'year' => 2100,
  'buy_let_status' => 'buy',
  'square_footage' => 2200,
  'build' => 'flat'
})

house4 = Property.new({
  'address' => '125 Union Street',
  'value' => 200900,
  'number_of_bedrooms' => 13,
  'year' => 2200,
  'buy_let_status' => 'buy',
  'square_footage' => 22600,
  'build' => 'flat'
})


house1.save()
house2.save()
house3.save()
house4.save()

p Property.find_by_id(44)

binding.pry
nil
