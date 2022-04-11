describe TicketsProcessor do
  describe '#calculate' do
    context 'it receives the invoice and the tickets' do
      let(:service) { TicketsProcessor.new }
      let(:invoice) { Invoice.new(value = 1500) }
      let(:tickets) { [500, 400, 600] }

      it 'returns invoice as paid and 3 payments of tickets created' do
        response = service.calculate(invoice: invoice, tickets: tickets)
        invoice_paid = response[:invoice]
        payments = response[:payments].count
        
        expect(invoice_paid).to eq('paid')
        expect(payments).to eq(3)
      end
    end
  end
end