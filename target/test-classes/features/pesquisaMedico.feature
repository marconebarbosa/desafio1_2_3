Feature: Pesquisa Medico
    O cliente realiza pesquisa de médicos por estado.

    Background:
    Given que o usuário acessa o site "https://www.unimed.coop.br"
    And navega para "Guia Médico"

    Scenario: valida apresentação de especialidade e cidade
    When pesquisa médicos na cidade "Rio de Janeiro"
    Then o sistema exibe a especialidade e a cidade

    Scenario: resultados não podem conter a cidade de "São Paulo"
    When pesquisa médicos na cidade "Rio de Janeiro"
    Then o sistema não pode exibir a cidade de "São Paulo" nas "3" primeiras páginas


# NÃO SEI POR QUE NÃO RECONHECEU A FEATURE EM PT  :(
# TEVE QUE SER EM INGLES MESMO
#
## language: pt
#
#Funcionalidade: GuiaMedico
#    O cliente realiza pesquisa de médicos por estado.
#
#    Contexto:
#        Dado que o usuário acessou o site 'https://www.unimed.coop.br/'
#        E navega para 'Guia Médico'
#        E pesquisa médicos no 'Rio de Janeiro'
#
#        Cenário: valida apresentação de especialidade e cidade
#            Quando a pagina carrega com os resultados da pesquisa
#            Então o sistema exibe os resultados
#
#        Cenário: resultados não podem conter São Paulo
#            Quando a pagina carrega com os resultados da pesquisa
#            Então o sistema

