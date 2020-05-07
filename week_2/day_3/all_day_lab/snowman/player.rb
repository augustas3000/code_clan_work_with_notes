# A Player will have a name and number of lives


class Player

  def initialize(name_str)
    @name = name_str
    @lives_left = 6
  end

  def lose_life
    @lives_left -= 1
  end
  

end
