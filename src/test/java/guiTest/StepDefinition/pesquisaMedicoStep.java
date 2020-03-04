package guiTest.StepDefinition;

import cucumber.api.PendingException;
import guiTest.Pages.pageUnimed;
import cucumber.api.java.pt.*;

public class pesquisaMedicoStep {

    @Dado("^que o usuário acessa o site \"([^\"]*)\"$")
    public void que_o_usuário_acessa_o_site(String url) throws InterruptedException {
       pageUnimed.AcessaUrl(url);
    }


    @Dado("^navega para \"([^\"]*)\"$")
    public void navega_para(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Quando("^pesquisa médicos na cidade \"([^\"]*)\"$")
    public void pesquisa_médicos_na_cidade(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Então("^o sistema exibe uma lista de medicos com \"([^\"]*)\"$")
    public void o_sistema_exibe_uma_lista_de_medicos_com(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Então("^exibe a \"([^\"]*)\"$")
    public void exibe_a(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Então("^o sistema não pode exibir a cidade de \"([^\"]*)\" nas \"([^\"]*)\" primeiras páginas$")
    public void o_sistema_não_pode_exibir_a_cidade_de_nas_primeiras_páginas(String arg1, String arg2) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
