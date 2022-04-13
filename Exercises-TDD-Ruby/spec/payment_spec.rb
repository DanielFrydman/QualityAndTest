require_relative '../payment.rb'

RSpec.describe Payment do
  context '.new' do
    let(:payment) { Payment.new(value: 100, type: 'Boleto') }

    it 'creates a new instance' do
      expect(payment).to have_attributes(
        value: 100,
        type: 'Boleto'
      )
    end
  end
end