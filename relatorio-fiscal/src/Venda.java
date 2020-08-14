import java.util.ArrayList;

public class Venda {
	
	private Cliente cliente;
	private Pagamento formaDePagamento;
	private ArrayList<ItemVenda> listaDeItens = new ArrayList<>();
		

	public void cadastrarCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public void selecionarFormaDePagamento(Pagamento formaDePagamento) {
		this.formaDePagamento = formaDePagamento;
		
	}

	public void adicionarItem(ItemVenda item) {
		this.listaDeItens.add(item);
	}
	
	private double calcularValorTotalDaVenda() {
		double valorTotal = 0;
		for (ItemVenda itemVenda : listaDeItens) {
			valorTotal += itemVenda.subtotalItem();
		}
		return valorTotal;
	}
	
	public String relatorioDeVenda() {
		String output = "";
		output += "=================================================\n";
		output += "          Relatório de Vendas          \n\n";
		output += cliente.relatorioCliente();
		output += "\nNum | Descrição | Quantidade | Valor Unitário (R$) | Valor Total (R$)\n\n";
		
		for (int i = 0; i < listaDeItens.size(); i++) {
			output += i + 1 + " | " + listaDeItens.get(i).getProduto().getDescricao() + " | " + listaDeItens.get(i).getQuantidade() 
					+ " un | R$ " + listaDeItens.get(i).getProduto().getValorUnitario() + " | R$ " + listaDeItens.get(i).subtotalItem()
					+ "\n";
		}
		
		output += "\nValor Total da Venda: R$ " + this.calcularValorTotalDaVenda() + "\n\n";
		formaDePagamento.setTotalDaVenda(this.calcularValorTotalDaVenda());
		output += formaDePagamento.relatorioPagamento() + "\n";
		output += "=================================================\n";
		return output;
	}
	
}
