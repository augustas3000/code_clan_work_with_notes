chickens = [
  {name: "Margaret", age: 2, eggs: 0},
  {name: "Hetty", age: 1, eggs: 2},
  {name: "Hendrietta", age: 3, eggs: 1},
  {name: "Audrey", age: 2, eggs: 0},
  {name: "Deirdre", age: 18, eggs: 20}
]


def count_eggs(chickens_array)
  total_eggs = 0

  for animal in chickens_array
    total_eggs += animal[:eggs]
    animal[:eggs] = 0
  end

  return "A total of #{total_eggs.to_s} eggs were collected"

end

p count_eggs(chickens)
p chickens
puts
puts

def find_chicken_by_name(array_of_chickens, ch_name)
  for chick in array_of_chickens
    if chick[:name] == ch_name
      # using p/puts prevents testing
      # return "I found #{ch_name}"
      return chick #more likely in real life
    end
  end
end

p find_chicken_by_name(chickens, "Hetty")
p find_chicken_by_name(chickens, "Garry")
