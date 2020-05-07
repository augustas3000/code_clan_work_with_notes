#data structures:
#lists
my_list = ["green", "ham", "bacon", 4]
print(my_list[2])
print(my_list[-1])
# print(my_list[10])

print(my_list[0:3])
# length: based on in-built function, also sum
print(len(my_list))
print(sum([2.4,2]))

stops = ["Croy", "Cumbernauld", "Falkirk High", "Linlithgow", "Livingston", "Haymarket"]

stops.append("Waverley");
print(stops)

stops.insert(0, "Glasgow Queen St")

stops.remove("Haymarket")

stops.clear()
print(stops)

#tuples
# construct data about a person, name, age, job title, vegetarian status:

# person = ["Craig", 30, "Instructor", False]
# better store in tuple...
person = ("Craig", 30, "Instructor", False)
print(person)
print(person[0])
# person[2] = "entre" "Entrepreneur #will give error - tuples are immutable" tuples have 2 methods:  ---- .count, .count(tuple item), .index.
#dictionaries
#key value pairs:
user = {
        "name": "Christine",
        "age": 40
        }

print(user["name"])


beatles = [
    {"name": "Paul",
     "instrument": "Bass"},
     {"name": "John",
      "instrument": "guitar"},
     {"name": "George",
      "instrument": "guitar"},
     {"name": "Ringo",
      "instrument": "drums"},
]

print(beatles[2]["name"])
