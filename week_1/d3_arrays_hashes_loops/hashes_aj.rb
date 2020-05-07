# still arrays.. hard to track..
# meals = %w(youghurt soup risotto)
# p meals[0]

# hashes - {KEY,VALUE}
# my_first_hash = Hash.new
# my_second_hash = {}

#
# meals = {"breakfast" => "yoghurt", "lunch" => "soup", "dinner" => "risotto"}
# p meals
#
# meals["supper"] = "pancakes"
# p meals["supper"]
#
# # keys and values can be any types ?
#
# silly_things = {1 => "2", 2 => "3", 4 => false}
# p silly_things
# puts
# puts
# p silly_things[4]
# silly_things["supper"] = "pacakez"
# p silly_things["supper"]
#
# [TASK:] Make a hash with a key of a persons name and the value as their pocket money. Try updating and deleting items from it.
# persons = Hash.new(0.0)
#
# persons["Mark"] = 2.87
# persons["Jane"] = 1.23

# p persons



# methods : keys - array of all keys,
# values - array of all values.
#SYMVOLS
# p :my_symbol
# p :hello
#
#
#
#
# meals = {:breakfast => "yoghurt",
#          :lunch => "soup"}
#
# p meals
# p meals.keys
#
#
# meals3 = { breakfast: "youghurt",
#            lunch: "soup",
#            supper: "pancakes"}
# p meals[:breakfast]

# Nested Hashes:

# countries = {
#   uk: {
#     capital: "London",
#     population: 64
#   },
#   germany: {
#     capital: "Berlin",
#     population: 100
#   }
# }
#
# p countries[:germany][:population]


#
# Make a hash to store the superhero avengers. It should contain keys for Iron Man and Hulk.
# Each avenger is represented by another hash, and has a name (Tony Stark and Bruce Banner respectively) and another hash containing their attacks.
# Each attack should have an integer value of the attack's power. Iron man can punch (10) and kick (100) and Hulk can smash (1000) and roll (500).
# Once you have created the hash retrieve and print out the attack power of Hulks smash move.


avengers = {
  Iron_man:{
    name: "Tony Stark",
    attacks: {
      punch: 10,
      kick: 100
    }
  },
  Hulk:{
    name: "Tony Stark",
    attacks: {
      smash: 1000,
      roll: 500
    }
  }
}

p avengers[:Iron_man][:attacks][:kick]
p avengers[:Hulk][:attacks][:smash]













#
