# Create an add function
# this will take two parameters
# call the first parameter first_number and the second second_number
# use the return keyword
# Invoke the function add( 2, 3 )
# Create a population_density function
# this will take two parameters
# call the first parameter population and the second area
# calculate the population density (e.g. population / area) and return it
# invoke the function using the population and area of Mauritius:
# population: 5373000
# area: 77933

def add(first_number, second_number)
  return first_number + second_number
end

puts add(2, 3)
puts

def population_density(population, area)
  return population/area
end

mauritius_density = population_density(5373000, 77933)
puts mauritius_density
puts population_density(5373000, 77933)
