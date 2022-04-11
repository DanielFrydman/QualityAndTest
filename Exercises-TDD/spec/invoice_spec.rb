require_relative '../invoice.rb'

RSpec.describe Invoice do
  context '.new' do
    let(:invoice) { Invoice.new(100) }

    it 'creates a new instance' do
      expect(invoice).to have_attributes(
        value: 100,
        paid: false
      )
    end
  end

  context '#change_paid_status' do
    let(:invoice) { Invoice.new(100) }

    context 'initial status' do
      it 'returns false' do
        expect(invoice.paid).to eq(false)
      end
    end

    context 'changed status' do
      before do
        invoice.change_paid_status
      end

      it 'returns true' do
        expect(invoice.paid).to eq(true)
      end
    end
  end
end