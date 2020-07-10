package guiTest.StepDefinition;

import org.junit.Assert;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import guiTest.Pages.pageMagaLu;

public class PesquisaEAddSacolaStep {

	@Dado("^que o usuario esta no site \"([^\"]*)\"$")
	public void que_o_usuario_esta_no_site(String url) throws Throwable {
		pageMagaLu.AcessaUrl(url);
	}

	@Dado("^que realiza a pesquisa \"([^\"]*)\"$")
	public void que_realiza_a_pesquisa(String descricao) throws Throwable {
		pageMagaLu.Realiza_pesquisa(descricao);
	}

	@Dado("^adicina o produto na sacola$")
	public void adicina_o_produto_na_sacola() throws Throwable {
		pageMagaLu.AdicionaNaSacola();
	}

	@Quando("^ele acessa a sacola$")
	public void ele_acessa_a_sacola() throws Throwable {
		pageMagaLu.AcessaSacola();
	}

	@Entao("^econtra o produto \"([^\"]*)\" dentro da sacola$")
	public void econtra_o_produto_dentro_da_sacola(String produto) throws Throwable {

		String sacola = pageMagaLu.RetornaItemSacola();	
		Assert.assertTrue(sacola.contains(produto));

	}

	@Quando("^realiza a busca do produto \"([^\"]*)\"$")
	public void realiza_a_busca_do_produto(String produto) throws Throwable {
		pageMagaLu.Realiza_pesquisa(produto);
	}

	@Entao("^o sistema exibe o produto com nome \"([^\"]*)\"$")
	public void o_sistema_exibe_o_produto_com_nome(String produto) throws Throwable{

		String pesquisa = pageMagaLu.RetornaPesquisa();
		Assert.assertTrue(pesquisa.contains(produto));

	}
	



}
