class Invoice
  attr_reader :value, :paid

  def initialize(value)
    @value = value
    @paid = false
  end

  def change_paid_status
    @paid = true
  end
end