# I.T.3- Search In a Program
# Demonstrate searching data in a program. Take screenshots of:
# *Function that searches data
# *The result of the function running

# Augustas Juskevicius


# 1. Searching in an array:

trees_array = %w(spruce pine oak willow alder cherry)
tree_to_search = "oak"

# for loop
# returns a string if match is unique or an array of strings, if the array
# contains duplicates:
def search_for_loop(trees_array, tree_to_search)
  trees_found = []
  for tree in trees_array
    if tree == tree_to_search
      trees_found.push(tree)
    end
  end

  if trees_found.length > 1
    return trees_found
  else
    return trees_found[0]
  end
end
p 'Searching an array with for loop, found: ' + search_for_loop(trees_array, tree_to_search)
# --------------------------------------------------------------
# array object methods:
# returns one of, if the array contains duplicates:
def search_find_index(trees_array, tree_to_search)
  return trees_array[trees_array.find_index(tree_to_search)]
end
p 'Searching an array with #find_index array method, found: ' + search_find_index(trees_array, tree_to_search)
# --------------------------------------------------------------
# returns an array of matching strings, if the array contains duplicates:
def search_select(trees_array, tree_to_search)
  selection = trees_array.select {|tree| tree == tree_to_search}
  if selection.length > 1
    return selection
  else
    return selection[0]
  end
end
p 'Searching an array with #select array method, found: ' + search_select(trees_array, tree_to_search)
# --------------------------------------------------------------
