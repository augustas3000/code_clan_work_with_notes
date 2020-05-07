craig_hungry = true
craig_tired = true

p "craig is hangry" if craig_hungry && craig_tired

craig_tired = false

p "Craig is Grumpy" if craig_hungry || craig_tired
