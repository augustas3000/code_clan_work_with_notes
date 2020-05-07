require('minitest/autorun')
require('minitest/reporters')
Minitest::Reporters.use! Minitest::Reporters::SpecReporter.new

require_relative '../bank_account'


class TestBankAccount < Minitest::Test

  def setup
    # instance var - private to the class TestBankAccount, but
    # accessible within the clas and across methods.
    @bank_account = BankAccount.new("Niall", 300, "business")
  end

  # TESTING GETTERS

  def test_account_name
    assert_equal("Niall", @bank_account.holder_name)
  end

  def test_account_balance()
    assert_equal(300, @bank_account.balance)
  end

  def test_account_type()
    assert_equal("business", @bank_account.account_type)
  end

  # TESTING SETTERS

  def test_set_account_name
    # run testable function to change acc holder name:
    @bank_account.holder_name = "Augustas"
    # call existing instance method on object to assert
    # if the name changed.
    assert_equal("Augustas", @bank_account.holder_name)
  end


  def test_set_balance
    # call the setter method on object generated in setup:
    @bank_account.balance = 500
    # call getter method for actual arg of assertion below:
    assert_equal(500, @bank_account.balance)
  end

  def test_set_account_type
    # call the setter method on object generated in setup:
    @bank_account.account_type = "leisure"
    # call getter method for actual arg of assertion below:
    assert_equal("leisure", @bank_account.account_type)
  end

  def test_pay_into_account()
    @bank_account.pay_in(1000)
    assert_equal(1300, @bank_account.balance)
  end

  def test_pay_monthly_fee_business()
    @bank_account.pay_monthly_fee()
    assert_equal(250, @bank_account.balance)
  end

  def test_pay_monthly_fee_other()
    @bank_account.account_type = "leisure"
    @bank_account.pay_monthly_fee()
    assert_equal(290, @bank_account.balance)
  end

end
