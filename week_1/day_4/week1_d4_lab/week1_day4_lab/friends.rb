def get_name(person)
  return person[:name]
end


def get_tv_show(person)
  return person[:favourites][:tv_show]
end

def likes_food(person, food)
  if person[:favourites][:snacks][0] == food
    return true
  else
    return false
  end
end


def add_friend(person, friend)
  person[:friends].push(friend)
end

def remove_friend(person, friend)
  if not person[:friends].empty?
    person[:friends].delete(friend)
  end
end

def count_total_money(people)
  total = 0.00
  for person in people
    total += person[:monies]
  end
  return total
end

def loan_monies_between_friends(lender, lendee, amount)
  lender[:monies] = lender[:monies] - amount
  lendee[:monies] = lendee[:monies] + amount
end


def all_fav_food(people)
  all_foods = []
  for person in people
    all_foods += person[:favourites][:snacks]
  end
  return all_foods
end

def find_people_with_no_friends(people_array)
  no_frienders = []
  for person in people_array
    if person[:friends].length == 0
      no_frienders.push(person)
    end
  end
  return no_frienders
end
