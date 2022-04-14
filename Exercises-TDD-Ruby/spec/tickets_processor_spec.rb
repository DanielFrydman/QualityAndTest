require_relative '../tickets_processor.rb'
require_relative '../invoice.rb'
require_relative '../payment.rb'

RSpec.describe TicketsProcessor do
  describe '#calculate' do
    let(:service) { TicketsProcessor.new }
  
    context 'it receives the invoice(1500) and the tickets(500, 400, 600)' do
      let(:invoice) { Invoice.new(1500) }
      let(:tickets) { [500, 400, 600] }

      it 'returns invoice as paid and 3 payments of tickets created' do
        response = service.calculate(invoice: invoice, tickets: tickets)
        invoice = response[:invoice]
        payments_counter = response[:payments].count

        expect(invoice.paid).to eq(true)
        expect(payments_counter).to eq(3)
      end
    end

    context 'it receives the invoice(1500) and the tickets(1000, 500, 250)' do
      let(:invoice) { Invoice.new(1500) }
      let(:tickets) { [1000, 500, 250] }

      it 'returns invoice as paid and 3 payments of tickets created' do
        response = service.calculate(invoice: invoice, tickets: tickets)
        invoice = response[:invoice]
        payments_counter = response[:payments].count

        expect(invoice.paid).to eq(true)
        expect(payments_counter).to eq(3)
      end
    end

    context 'it receives the invoice(2000) and the tickets(500, 500, 400)' do
      let(:invoice) { Invoice.new(2000) }
      let(:tickets) { [500, 500, 400] }

      it 'returns invoice as not paid and 3 payments of tickets created' do
        response = service.calculate(invoice: invoice, tickets: tickets)
        invoice = response[:invoice]
        payments_counter = response[:payments].count

        expect(invoice.paid).to eq(false)
        expect(payments_counter).to eq(3)
      end
    end
  end
end