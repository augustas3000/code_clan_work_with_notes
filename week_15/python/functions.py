#  functions are also objects just like in js!!!

def say_hello():
    return "Hello!!!"

# print(say_hello())

def set_alarm(day):
    if (day == "Saturday" or day == "Sunday"):
        return None
    else:
        return "07:00"

# print(set_alarm("Saturday"))

def add(a, b = 2):
    return a + b

# result = add(2)
# print(result)

def subtract(a, b):
    return a - b

result = subtract(b = 10, a = 4)
print(result)


resu = add(a = -2)
print(resu)


# star operator:
def add(a, b):
    return a+b

# my_list = [5,6]
# # unpack the variables:
# result = add(*my_list)

# my_dictionary = {"a": 4, "b": 10}
# result = add(**my_dictionary)
# print(result)

# my_list = [4]
# my_dictionary = {"b":2}
# result = add(*my_list, **my_dictionary)

# def my_function(*args, **kwargs):
#     print(args)
#     print(kwargs)
#
#
# my_function("spam", "ham", "eggs", foo="bar", baz="bam")


def add(*args):
    total = 0
    for arg in args:
        total += arg
    return total


print(add(3,4,5,6,7))
print(add(2,4))

# very versatile in a way it can handle function argumentas!
