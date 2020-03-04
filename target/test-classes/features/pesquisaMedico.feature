#language: pt

Funcionalidade: GuiaMedico
    O usuário acessa o site para buscar médicos por especialidade em sua cidade .

    Contexto:
        Dado que o usuário acessa o site "https://www.unimed.coop.br"
        E navega para "Guia Médico"

        Cenário: valida apresentação de especialidade e cidade
            Quando pesquisa por "Médico" no estado "Rio de Janeiro" cidade "Rio de Janeiro"
            Então o sistema exibe o médico "ABDALLA DIB CHACUR (CRM 549612)"
            E mostra a espcialidade "Especialidade(s):"

        Cenário: resultados não podem conter a cidade de São Paulo
           Quando pesquisa por "Médicos" no estado "Rio de Janeiro" cidade "Rio de Janeiro"
           Então o sistema não pode exibir a cidade de "São Paulo" nas "3" primeiras páginas


