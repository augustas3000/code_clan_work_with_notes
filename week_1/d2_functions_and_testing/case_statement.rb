# case statement

p "Please input your score:..."
score = gets.chomp.to_i

# case score
#   when 10
#     p "genius"
#   when 9
#     p "merit"
#   when 8
#     p "pass"
#   else
#     p "fail"
# end

result = case score
  when 10
    "genius"
  when 8..9
    "merit"
  when 5..7
    "pass"
  when 4
    "resit"
  else
    "fail"
end

p result
