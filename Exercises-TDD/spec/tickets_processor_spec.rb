require_relative '../tickets_processor.rb'
require_relative '../invoice.rb'
require_relative '../payment.rb'

RSpec.describe TicketsProcessor do
  describe '#calculate' do
    context 'it receives the invoice and the tickets' do
      let(:service) { TicketsProcessor.new }
      let(:invoice) { Invoice.new(1500) }
      let(:tickets) { [500, 400, 600] }

      it 'returns invoice as paid and 3 payments of tickets created' do
        response = service.calculate(invoice: invoice, tickets: tickets)
        invoice = response[:invoice]
        payments = response[:payments].count

        expect(invoice.paid).to eq(true)
        expect(payments).to eq(3)
      end
    end
  end
end