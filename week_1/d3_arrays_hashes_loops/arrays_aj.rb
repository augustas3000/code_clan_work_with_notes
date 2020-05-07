# Arrays
fruit = ['apple', 'banana', 'grape', 'orange']
# second = Array.new(['koo','aaa'])

# add to array
fruit[2] = "mango"

# fruit[100] = 'peach' #adds allitems as nil up to 100th which will be peach.

p fruit

puts
puts

p fruit[0]
p fruit[1]
p fruit[2]
p fruit[-1]
p fruit[4] #empty so returns nil.


# array methods
puts
p fruit.first()
p fruit.first(2)
p fruit.last()
p fruit.last(2)

my_array = []
my_arr2 = Array.new

puts
puts

fruit.push('pineapple')
p fruit

fruit.pop()
p fruit

# remove from start of an array.
fruit.shift()
p fruit

fruit.unshift('coco')
p fruit
puts
puts
puts

 # ar2 = %w(1 2 3 4 5)
 # ar2.each_with_index {|item, index| puts "#{item} is at index #{index}"}
