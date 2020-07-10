#language: pt

Funcionalidade: Pesquisa e adicao de produtos no carrinho
    O usuario acessa o site para pesquisar produtos e adicionar no carrinho.

  Contexto: 
    Dado que o usuario acessa o site "https://www.magazineluiza.com.br"

  @TestGui
  Esquema do Cenario: Busca de produto
    Quando realiza a busca do produto <Pesquisa>
    Entao o sistema exibe o produto com nome <Resultado>

    Exemplos: 
      | Pesquisa   				| Resultado																															 |
      | "BRM44 HKANA" 		|"Geladeira/Refrigerador Brastemp Frost Free Duplex - 375L BRM44 HKBNA"  |
      | "PHT700BT"  			|"Home Theater PHT700BT 5.1 Canais"	                                  	 |

  @TestGui
  Cenario: Adicionar produto no carrinho
    Dado que realiza a pesquisa "Cartucho Epson Original T296120 Black XP-231"
    E adicina o produto na sacola
    Quando ele acessa a sacola
    Entao econtra o produto "Cartucho Epson Original T296120 Black XP-231" dentro da sacola
    
                
            