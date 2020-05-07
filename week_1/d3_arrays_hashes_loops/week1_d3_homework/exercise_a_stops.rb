stops = [ "Croy", "Cumbernauld", "Falkirk High", "Linlithgow", "Livingston", "Haymarket" ]

#1. Add "Edinburgh Waverley" to the end of the array
stops.push("Edinburgh Waverley")
p stops
# shovel also <<



#2. Add "Glasgow Queen St" to the start of the array
stops.unshift("Glasgow Queen St")
p stops


#3. Add "Polmont" at the appropriate point (between "Falkirk High" and "Linlithgow")
# insert(index,obj)
stops.insert(4,"Polmont")
p stops


#4. Print out the index position of "Linlithgow"
# also - find_index
p stops.index("Linlithgow")
p stops

# current array =
# ["Glasgow Queen St", "Croy", "Cumbernauld", "Falkirk High", "Polmont", "Linlithgow", "Livingston", "Haymarket", "Edinburgh Waverley"]


#5. Remove "Livingston" from the array using its name
stops.delete_at(stops.index("Livingston"))
stops.delete("Livingston")
p stops
# current array =
# ["Glasgow Queen St", "Croy", "Cumbernauld", "Falkirk High", "Polmont", "Linlithgow", "Haymarket", "Edinburgh Waverley"]

#6. Delete "Cumbernauld" from the array by index
stops.delete_at(stops.index("Cumbernauld"))
p stops

# current aray =
# ["Glasgow Queen St", "Croy", "Falkirk High", "Polmont", "Linlithgow", "Haymarket", "Edinburgh Waverley"]

#7. Print the number of stops there are in the array?
p stops.length
p stops.count

#8. Show as many ways as you can to return "Falkirk High" from the array?
# by tracing index manually:
p stops[2]
# String-index:
p stops[stops.index("Falkirk High")]


# For loop:
def find_stop(arr, stop)

# also include method..
  for st in arr
    if st == stop
      return st
    end
  end
end

p find_stop(stops, "Falkirk High")
puts
puts

#9. Reverse the positions of the stops in the array
stops_reversed = stops.reverse
p stops_reversed
puts
puts


#10 Print out all the stops using a for loop
for stp in stops_reversed
  p stp
end

puts
puts

stops_reversed.each do |stp|
  p stp
end
