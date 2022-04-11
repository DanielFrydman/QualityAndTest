class TicketsProcessor
  def calculate(invoice:, tickets:)
    sum = 0
    payments = []
    tickets.each do |ticket|
      sum += ticket
      payments << Payment.new(value: ticket, type: 'Boleto')
    end

    invoice.change_paid_status if invoice.value == sum
  end
end