### Testing task 1:

# Carry out static testing on the code below.
# Comment on any errors that you see below.
```ruby

class CardGame


  def checkforAce(card)

    #1. Assumption: Card values: 2,3,4,5,6,7,8,9, 10, then J - 11, Q - 12, K - 13, and A - 1.
    #2. assignment operator = used instead of comparison ==

    if card.value = 1
      return true
    else
      return false
    end
  end


  #3. incorrect spelling of def, no comma to separate parameters
  #4. This method as it is will work on all cards but the aces, which have value of 1 and would be
  # classed as the lowest card, need to add another conditional utilising the checkforAce method to account for this.
  #5. method also does not cater for the outcome when both cards are equal.
  dif highest_card(card1 card2)
  if card1.value > card2.value
    #6. parameter named incorrectly - should be card1
    return card
  else
    return card2
  end
end

#7. this end has to be at the very end of code, to close the class CardGame definition
end




#8. variable total needs assigned an initial value or ruby will treat it as undefined variable
# 9. Since the other two methods are instance methods, meaning a CardGame object will need created to run these methods from it, cards_total can also be instance method, or in this case, it will have to be called from the class itself - CardGame.cards_total(cards). Or vise-versa, all methods could be class methods and run from class.
def self.cards_total(cards)
  total
  for card in cards
    total += card.value
    #10. convert total to string before concatenation
    #11. move return outside the scope of for loop, otherwise the function will keep returning on every iteration:
    return "You have a total of" + total
  end
end
```
