class Invoice
  attr_reader :value, :paid

  def initialize(value)
    @value = value
    @paid = false
  end

  def paid
    @paid = true
  end
end