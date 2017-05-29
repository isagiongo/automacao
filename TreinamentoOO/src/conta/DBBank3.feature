# language: pt
# encoding: iso-8859-1

Funcionalidade: Deve descrever a cria��o de contas do DBBank
	Para que meus clientes possam ter acesso aos servi�os oferecidos pelo DBBank
	Como um CEO do BDBank
	Eu quero que sejam disponibilizados dois meios de atendimentos (auto-atendimento, caixa)
		
Cen�rio: Deve efetuar a consulta de saldo de uma conta no caixa
	Dado que quero saber o saldo atual da conta
	E possuo o saldo de R$ 45,00
	Quando solicitar o saldo
	Entao devo receber a mensagem "Seu saldo atual � de R$ 45,00"
	
Cen�rio: Deve efetuar a consulta de saldo de uma conta no auto-atendimento
	Dado que quero saber o saldo atual da conta
	E possuo o saldo de R$ 45,00
	Quando solicitar o saldo
	Entao devo receber a mensagem "Seu saldo atual � de R$ 45,00"
	E o comprovante deve ser impresso

Cen�rio: Deve efetuar o saque de uma conta
	Dado que sou um cliente e efetuo um saque
	Quando efetuar o saque
	Entao devo receber o dinheiro solicitado
	
Cen�rio: Deve efetuar dep�sito na conta de um cliente no caixa
	Dado que sou cliente com saldo de R$ 30,00 e efetuo um dep�sito no valor de R$ 70,00 
	Quando efetuar o dep�sito
	Entao devo ter na conta o saldo no valor de R$ 100,00
	E a mensagem "Opera��o efetuada com sucesso."

Cen�rio: Deve efetuar dep�sito na conta de um cliente no auto-atendimento
	Dado que sou cliente com saldo de R$ 30,00 e efetuo um dep�sito no valor de R$ 70,00 
	Quando efetuar o dep�sito
	Entao devo receber a mensagem "Opera��o efetuada com sucesso."
	E a mensagem "O valor entrar� na conta em at� 24 Hrs."