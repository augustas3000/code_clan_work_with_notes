# require 'Math'

def return_10()
  return 10
end

def add(x, y)
  return x + y
end

def subtract(x, y)
  return x - y
end

# convert to floats any of the arguments.
def multiply(x, y)
  return x.to_f * y
end

def divide(x, y)
  return x.to_f / y
end

def length_of_string(string)
  return string.length
end

def join_string(string1, string2)
  return string1 + string2
end

def add_string_as_number(num1, num2)
  return num1.to_i + num2.to_i
end




def number_to_full_month_name(month_number)

  case month_number
    when 1
      return "January"
    when 2
      return "February"
    when 3
      return "March"
    when 4
      return "April"
    when 5
      return "May"
    when 6
      return "June"
    when 7
      return "July"
    when 8
      return "August"
    when 9
      return "September"
    when 10
      return "October"
    when 11
      return "November"
    when 12
      return "December"
    else
      return "Not a month"
  end
end

def number_to_short_month_name(month_number)

  full_month_name = number_to_full_month_name(month_number)
  short_name = full_month_name.slice(0, 3)
  return short_name
    # case month_number
    #   when 1
    #     return "Jan"
    #   when 2
    #     return "Feb"
    #   when 3
    #     return "Mar"
    #   when 4
    #     return "Apr"
    #   when 5
    #     return "May"
    #   when 6
    #     return "Jun"
    #   when 7
    #     return "Jul"
    #   when 8
    #     return "Aug"
    #   when 9
    #     return "Sep"
    #   when 10
    #     return "Oct"
    #   when 12
    #     return "Dec"
    #   else
    #     return "Not a month"
    # end
end

def volume_of_cube(a)
  return a**3
end


def volume_of_sphere(r)
  return (4/3*Math::PI*r**3).round(2)
end

def fahrenheit_to_celsius(f)
  c = (f - 32) * 5.00/9 #specify a float otherwise 5/9 = 0
  return c.round
end

puts fahrenheit_to_celsius(67)


# (°F − 32) × 5/9 = °C
