package br.com.dbserver.steps;

import static org.junit.Assert.assertEquals;

import br.com.dbserver.functionality.RealizarCompraOnlineFuncionalidade;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

/**
 * 
 * @author Ronaldo Silva
 *
 */
public class RealizarCompraLojaVirtualSteps {
	
	private RealizarCompraOnlineFuncionalidade realizarCompraOnlineFuncionalidade;
	private String orderConfirmation;
	
	public RealizarCompraLojaVirtualSteps() {
		this.realizarCompraOnlineFuncionalidade = new RealizarCompraOnlineFuncionalidade();
	}
	
	@Dado("^que eu estiver no site da loja virtual$")
	public void queEuEstiverNoSiteDaLojaVirtual() throws Throwable {
	  
		this.realizarCompraOnlineFuncionalidade.navigateToStore();
		
	}

	@Dado("^escolho um produto qualquer na loja e adiciono o produto ao carrinho$")
	public void escolhoUmProdutoQualquerNaLojaEAdicionoOProdutoAoCarrinho() throws Throwable {
	    
		this.realizarCompraOnlineFuncionalidade.chooseProduct();
		
	}

	@Quando("^realize o cadastro do cliente preenchendo todos os campos obrigatorios dos formularios$")
	public void realizeOCadastroDoClientePreenchendoTodosOsCamposObrigatoriosDosFormularios() throws Throwable {
	    
		this.realizarCompraOnlineFuncionalidade.registerClient();
	}

	@Quando("^aceito os termos de servico e clico em prosseguir$")
	public void aceitoOsTermosDeServicoEClicoEmProsseguir() throws Throwable {
		
	    this.realizarCompraOnlineFuncionalidade.acceptTerms();
	    
	}

	@Quando("^selecione um metodo de pagamento e clico em prosseguir$")
	public void selecioneUmMetodoDePagamentoEClicoEmProsseguir() throws Throwable {
		
		orderConfirmation =this.realizarCompraOnlineFuncionalidade.choosePaymentMethod();
		
	}

	@Entao("^devo visualizar uma mensagem \"([^\"]*)\"$")
	public void devoVisualizarUmaMensagem(String msgOrdeComplete) throws Throwable {
	    
		assertEquals(msgOrdeComplete.toLowerCase(), orderConfirmation.toLowerCase().replace(".", ""));
	}

}
