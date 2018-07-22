#language: pt
#Author: Ronaldo silva
#Version: 1.0
#Encoding: UTF-8
Funcionalidade: - realizar compras loja virtual

  @chrome @CTRCON001
  Cenario: CT001 - realizar uma compra produto qualquer no loja virtual
    Dado que eu estiver no site da loja virtual
    E escolho um produto qualquer na loja e adiciono o produto ao carrinho
    Quando realize o cadastro do cliente preenchendo todos os campos obrigatorios dos formularios
    E aceito os termos de servico e clico em prosseguir
    E selecione um metodo de pagamento e clico em prosseguir
    Entao devo visualizar uma mensagem "your order on my store is complete"

    
    
    