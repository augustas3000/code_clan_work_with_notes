# enumeration methods!
chickens = %w[Jim John Paul Ringo George]


# standard for:
# for chik in chickens
#   p chik
# end
#
# puts
# puts
# enumeration method each: or do and end instead of curcly braces.
# chickens.each {|chik| print chik, "--"}
# puts
# puts
#
# name_lengths = []
#
# chickens.each do |chik|
#   name_lengths << chik.length
# end
#
# p name_lengths

# map - performs a code block on each element of an array and creates a new array with results.
# map takes a block of code as a parameter!!!!
# name_lengths = chickens.map { |chic|
#   chic.length
# }
#
# p name_lengths

# chickens.each_with_index {|c, i| p "#{c} is at #{i}"}
# # find ->
#
# p chickens.find {|c| c[0] == "G"}
# p chickens.find_all {|c| c[0] == "J"}
# p chickens.reduce {|list, chicken| list + ", " + chicken}
#
# nums = [1,23,4,52,5,23,7,8]
#
# p nums.reduce {|sum, num| sum.push(num)}


pets = [
{
    name: "Sir Percy",
    pet_type: :cat,
    breed: "British Shorthair",
    price: 500
},
{
    name: "King Bagdemagus",
    pet_type: :cat,
    breed: "British Shorthair",
    price: 500
},
{
    name: "Sir Lancelot",
    pet_type: :dog,
    breed: "Pomsky",
    price: 1000,
},
{
    name: "Arthur",
    pet_type: :dog,
    breed: "Husky",
    price: 900,
},
{
    name: "Tristan",
    pet_type: :dog,
    breed: "Basset Hound",
    price: 800,
},
{
    name: "Merlin",
    pet_type: :cat,
    breed: "Egyptian Mau",
    price: 1500,
}
]




p "Print out all of the names using a loop"
for pet in pets
  p pet[:name]
end
puts
puts

p "Print out all of the names using an enumerable"

pets.each {|i| p i[:name]}

puts
puts

p "Find a pet using a loop and if statement"
def find_pet(pets_array, pet_str)
  for pet in pets_array
    if pet[:name] == pet_str
      return pet
    end
  end
end
p find_pet(pets, "Tristan")



puts
puts
p "Find a pet using an enumerable"
arthur_found = pets.find {|p| p[:name] == "Arthur"}
p arthur_found


puts
puts


max_price = pets.map {|p| p[:price]}.max
p max_price
