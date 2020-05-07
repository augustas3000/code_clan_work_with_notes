# def get_account_name(account_hash)
#   account_hash[:holder_name]
# end


class BankAccount
  #this will automatically generate read/write(getter/setter) methods rather than using old syntax, when writting,
  # we no longer call a method with and argument, but call
  # writter method on an object then re-aisgn that value to
  # what we want. For example: @bank_account.type = "leisure"

  # attr_reader :holder_name, :balance, :account_type
  # attr_writer :holder_name, :balance, :account_type
  # attr_accessor to combine both.
  attr_accessor :holder_name, :balance, :account_type


  # whe .new -> initialize method is automatically called:
  # this creates state. Instance variables are private by default(PRIVATE to this specific class.).

  def initialize(input_holder_name, input_balance, input_type)
    @holder_name = input_holder_name
    @balance = input_balance
    @account_type = input_type
  end

# not a getter nor setter, just a mutator:
  def pay_in(money_to_pay_in)
    @balance += money_to_pay_in
  end

  # subtract montly fee based on the type of acc(business - by 50,
  # all other by 10)
  def pay_monthly_fee()
    if @account_type == "business"
      @balance -= 50
    else #all other-type accounts
      @balance -= 10
    end


    # hash way -> charges = {'business' => 50, 'personal' => 10}
    # and then @balance -= charges[@account_type]
  end

#  10 for a personal account, and 50 for a business



  # Old style way ...
  # # GETTERS:
  # def holder_name()
  #   return @holder_name
  # end
  #
  # def balance
  #   return @balance
  # end
  #
  # def account_type()
  #   return @type
  # end
  #
  # # SETTERS
  # def set_holder_name(nu_name)
  #   @holder_name = nu_name
  # end
  #
  # def set_balance(nu_balance)
  #   @balance = nu_balance
  # end
  #
  # def set_account_type(nu_type)
  #   @type = nu_type
  # end

end












#
