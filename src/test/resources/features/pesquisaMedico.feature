#language: pt

Funcionalidade: GuiaMedico
    O cliente realiza pesquisa de médicos por estado.

    Contexto:
        Dado que o usuário acessa o site "https://www.unimed.coop.br"
        E navega para "Guia Médico"

        Cenário: valida apresentação de especialidade e cidade
            Quando pesquisa médicos na cidade "Rio de Janeiro"
            Então o sistema exibe uma lista de medicos com "Especialidade"
            E exibe a "Cidade"

        Cenário: resultados não podem conter São Paulo
            Quando pesquisa médicos na cidade "Rio de Janeiro"
            Então o sistema não pode exibir a cidade de "São Paulo" nas "3" primeiras páginas


