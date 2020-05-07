def add_array_lengths(arr1, arr2)
  return arr1.length() + arr2.length()
end


def sum_array(arr)
  # also - array method - look up
  # return arr.sum()

  # for loop variant:
  arr_sum = 0
  for item in arr
    arr_sum += item
  end
  return arr_sum
end


def is_item_in_array(arr, item)
# also - array method - look up
# if arr.include?(item)
#   return true
# else
#  return false
# end

# for loop way
  for i in arr
    if i == item
      return true
    end
  end
  return false
end


def get_first_key(hsh)
  array_of_keys = hsh.keys
  first_key = array_of_keys[0]
  return first_key
end
