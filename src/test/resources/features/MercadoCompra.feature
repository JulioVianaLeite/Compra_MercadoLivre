
@MercadoLivre
Feature: Compra Mercado Livre
  
	Background: Abrir site
		Given o usuario acesse "https://www.mercadolivre.com.br/"

	@MercadoLivreCompra
	Scenario Outline: Acesse o site
		And confirme o acesso dos cookies
		And escolha a categoria e tipo de produto desejado
		When a pagina abre o usuario pode escolher a entrega FULL
		And escolhe qual console, valor e regiao do protudo que ele deseja
		And escolhendo a franquia e o jogo desejado
		Then o usuario pode visualizar a descricao do produto 
		And finalizando o pedido do produto
		
 