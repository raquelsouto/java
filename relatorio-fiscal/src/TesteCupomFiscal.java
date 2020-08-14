
public class TesteCupomFiscal {

	public static void main(String[] args) {
		
		//======================================
		// Criação do Cliente
		//======================================
		
		Cliente cliente = new Cliente();
		cliente.setNome("Bruno Winkeler");
		cliente.setEndereco("Rua João do Pé de feijão, 123, Campina Grande - PB");
		cliente.setTelefone("32323-1122");
		cliente.setCpf("098.001.006-44");
		
		//======================================
		// Criação dos Produtos
		//======================================

		Produto produto1 = new Produto();
		produto1.setDescricao("Iphone");
		produto1.setValorUnitario(9990.00);
		
		Produto produto2 = new Produto();
		produto2.setDescricao("Galaxy S20");
		produto2.setValorUnitario(9586.56);
		
		Produto produto3 = new Produto();
		produto3.setDescricao("MacBook Pro");
		produto3.setValorUnitario(59990.00);
		
		//======================================
		// Criação dos Itens da venda
		//======================================
		
		ItemVenda item1 = new ItemVenda();
		item1.setProduto(produto1);
		item1.setQuantidade(4);
		
		ItemVenda item2 = new ItemVenda();
		item2.setProduto(produto2);
		item2.setQuantidade(2);
		
		ItemVenda item3 = new ItemVenda();
		item3.setProduto(produto3);
		item3.setQuantidade(1);
	
		//======================================
		// Criação do Meio de Pagamento
		//======================================
		
		Pagamento meioPagamento = new Pagamento();
		meioPagamento.setMetodoPagamento(MetodoDePagamento.CREDITO);
		meioPagamento.setParcelas(3);
				
		//======================================
		// Realizando a Venda
		//======================================
		
		Venda venda1 = new Venda();
		venda1.cadastrarCliente(cliente);
		venda1.adicionarItem(item1);
		venda1.adicionarItem(item2);
		venda1.adicionarItem(item3);
		venda1.selecionarFormaDePagamento(meioPagamento);
		
		//======================================
		// Gerando Relatório da Venda
		//======================================
		
		System.out.print(venda1.relatorioDeVenda());

		
		
	}
}
