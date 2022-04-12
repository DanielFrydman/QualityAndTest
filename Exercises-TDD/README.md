Foi criada a classe Invoice para a Fatura, a classe Payment para o Pagamento e a classe TicketsProcessor para o Processador de Boletos.
Para cada classe foi criado um teste.

Como rodar:

1- Instalar o Ruby: https://www.ruby-lang.org/pt/documentation/installation/

2- Instalar as gems rspec(Para testes):
  a) gem install rspec
  b) gem install rspec-expectations
  
3- Rodar os testes com: rspec (caminho_do_arquivo)
![Captura de tela de 2022-04-11 20-50-20](https://user-images.githubusercontent.com/43658712/162852098-2fbb5c67-ae85-425c-b21b-9e15b31a4d33.png)
![2](https://user-images.githubusercontent.com/43658712/162852109-c03e53df-4a1c-4bd7-9e22-c8710aa4cc61.png)
![3](https://user-images.githubusercontent.com/43658712/162852133-690e43cc-e67e-48d6-b448-98d7c6a88df4.png)

**Exercício:**

Implemente um processador de boletos usando TDD. O objetivo desse processador é verificar todos os boletos e, caso o valor da soma de todos os boletos seja maior ou igual que o valor da fatura, então essa fatura deverá ser considerada como paga.

Uma fatura contém data, valor total e nome do cliente. Um boleto contém código do boleto, data, e valor pago.

O processador de boletos, ao receber uma lista de boletos, deve então, para cada boleto, criar um “pagamento" associado a essa fatura. Esse pagamento contém o valor pago, a data, e o tipo do pagamento efetuado (que nesse caso é “BOLETO").

Como dito anteriormente, caso a soma de todos os boletos iguale ou ultrapasse o valor da fatura, a mesma deve ser marcada como “PAGA".
Exemplos de processamento:

• Fatura de 1.500,00 com 3 boletos no valor de 500,00, 400,00 e 600,00: fatura marcada como PAGA, e três pagamentos do tipo BOLETO criados
• Fatura de 1.500,00 com 3 boletos no valor de 1000,00, 500,00 e 250,00: fatura marcada como PAGA, e três pagamento do tipo BOLETO criados
• Fatura de 2.000,00 com 2 boletos no valor de 500,00 e 400,00: fatura não marcada como PAGA, e dois pagamentos do tipo BOLETO criados

Obs: A implementação das classes Fatura e Boleto usando TDD é opcional (no entanto, elas devem ser implementadas).

IMPORTANTE: Use o GitHub para enviar ("commitar") cada nova iteração e envie o link do repositório. APENAS COM O COMMIT A CADA ITERAÇÃO É QUE SERÁ POSSÍVEL AVALIAR O USO DE TDD
