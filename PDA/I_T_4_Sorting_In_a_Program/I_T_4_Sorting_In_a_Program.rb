# I.T.4- Sorting In a Program
# Demonstrate sorting data in a program. Take screenshots of:
# *Function that sorts data
# *The result of the function running

# Augustas Juskevicius

# Sorting arrays:

brands = %w(nike adidas puma carhartt hummel converse Ellese Fatface)

# 1. Standardize capitalization and use sort method:
def caps_and_sort_asc(array)
downcased = array.map {|item|
  item.downcase
}
return downcased.sort
end

p "Ascending sort: "
p caps_and_sort_asc(brands)

# 2. Standardize capitalization and use sort method REVERSED-descending:

def caps_and_sort_dsc(array)
downcased = array.map {|item|
  item.downcase
}
return downcased.sort {|a,b| b <=> a}
end
p "Descending sort: "
p caps_and_sort_dsc(brands)

# 3. Sorting without standardizing capitalization - Ascending:
p "Ascending sort, with capitals: "
p brands.sort

# 4. Sorting without standardizing capitalization - Descending:
p "Descending sort, with capitals: "
p brands.sort {|a,b| b <=> a}

# 5. Sorting numbers.
nums_array = [2.00, 5, 16, 38.092, 54]
p "Sorting of numbers - ASC"
p nums_array.sort
p "Sorting of numbers - DSC"
p nums_array.sort {|x,y| y <=> x}
