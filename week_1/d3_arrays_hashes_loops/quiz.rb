# my_number = 5
#
# p "What number am I thinking of?"
# value = gets.chomp.to_i
#
#
# while value != my_number
#
#   if value > 5
#     p "Nope. You guessed to high"
#   else
#     p "Too low"
#   end
#
#   value = gets.chomp.to_i
# end
#
# p "Yeeee. You guessed it!"
#
# while true
#  p "Type something..."
#  line = gets.chomp
#  # this is technically a guard:.. standard if .
#  break if line.downcase == "q"
#
#  p "You type: #{line}"
# end


# FOR loops: do stuff on all collection items?
# numbers = [1, 2, 3, 4, 5]
#
# total = 0
#
# for num in numbers
#   total += num
# end
#
# p total
#

#
# chickens = %w(Margaret Hetty Henrietta Audrey Deidre)
# p chickens
#
# for chicken in chickens
#   p chicken
# end

# Loop through array of hashes: ARRAY OF HASHES!!!

 chickens = [
   {name: "Margaret", age: 2, eggs: 0},
   {name: "Hetty", age: 1, eggs: 2},
   {name: "Hendrietta", age: 3, eggs: 1},
   {name: "Audrey", age: 2, eggs: 0},
   {name: "Deirdre", age: 18, eggs: 20}
 ]

for chick in chickens
  if chick[:eggs] > 0
    p "woo eggs"
  end
end

total_eggs = 0

 for chick in chickens
   # p "#{chick[:name]} is #{chick[:age]}"
   p "#{chick[:eggs]} will be collected"
   total_eggs += chick[:eggs]

   chick[:eggs] = 0
 end




#
