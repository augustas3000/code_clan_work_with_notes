# Demonstrate the use of an array in a program. Take screenshots of:
# *An array in a program
# *A function that uses the array
# *The result of the function running

# Augustas Juskevicius

# Example: Ask user to provide a string, and return a summary of
# all the unique first letters of each word of the given string,
# and corresponding number of words:

# A method to get words and numbers(excluding other characters except single qoutes)
# from a string and store them in an array:
def get_words_from_string(string)
  # iterate through string matching a pattern, and put matches in an array
  return string.downcase.scan(/[\w']+/)
end

p "Please write any sentence, avoid numbers."

user_input = gets.chomp

words = get_words_from_string(user_input)

p "Thank you, the array of words created from your input is : "
p words

first_letters = Hash.new(0)
# loop through words array and assign result to first_letters hash
for word in words
  first_letter = word[0]
  first_letters[first_letter] += 1
end
puts
p "In the string you provided, there were #{first_letters.keys.length} different first letters:"

for k,v in first_letters
  p "#{v} word#{"s" if v > 1} started with letter: #{k}"
end
