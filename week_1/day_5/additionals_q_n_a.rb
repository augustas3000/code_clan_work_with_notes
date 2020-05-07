chickens = %w(Babs Gary Rab Jim)

def getChickenNames(chickens_array)
  for chicken in chickens_array
    p chicken
  end
end

p chickens.is_a?(Array)
getChickenNames(chickens)
