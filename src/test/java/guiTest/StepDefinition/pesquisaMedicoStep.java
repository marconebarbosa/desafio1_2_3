package guiTest.StepDefinition;

import cucumber.api.PendingException;
import guiTest.Pages.pageUnimed;
import cucumber.api.java.pt.*;
import org.openqa.selenium.WebElement;

import java.util.List;

public class pesquisaMedicoStep {

    @Dado("^que o usuário acessa o site \"([^\"]*)\"$")
    public void que_o_usuário_acessa_o_site(String url) throws InterruptedException {
       pageUnimed.AcessaUrl(url);
    }

    @Dado("^navega para \"([^\"]*)\"$")
    public void navega_para(String nomeMenu) throws Throwable {
       pageUnimed.AcessaItemMenuPrincipal(nomeMenu);
    }

    @Quando("^pesquisa por \"([^\"]*)\" no estado \"([^\"]*)\" cidade \"([^\"]*)\"$")
    public void pesquisa_por_no_estado_cidade(String tipoRcurso, String uf, String cidade) throws Throwable {
        pageUnimed.PesquisaPorTipoRecurso_Uf_Cidade(tipoRcurso,uf,cidade);
    }

    @Então("^o sistema exibe o médico \"([^\"]*)\"$")
    public void o_sistema_exibe_o_médico(String nomeMedico) throws Throwable {
        pageUnimed.PesquisaNomeNoResultado(nomeMedico);
        pageUnimed.validaQuantidadeDeResultado();
    }

    @Então("^mostra a espcialidade \"([^\"]*)\"$")
    public void mostra_a_espcialidade(String especialidade) throws Throwable {
        pageUnimed.PesquisaEspecialidadeNoResultado(especialidade);
    }



    @Então("^o sistema não pode exibir a cidade de \"([^\"]*)\" nas \"([^\"]*)\" primeiras páginas$")
    public void o_sistema_não_pode_exibir_a_cidade_de_nas_primeiras_páginas(String cidade, int qtdPagina) throws Throwable {
        pageUnimed.procuraCidadeResultado(cidade,qtdPagina);
    }

}
