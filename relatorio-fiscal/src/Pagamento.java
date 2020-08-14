
public class Pagamento {

	private String formaPagamento = "Crédito";
	private int parcelas = 1;
	private double valorPorParcela = 0;
	private double totalDaVenda = 0;
	
	public void setTotalDaVenda(double totalDaVenda) {
		this.totalDaVenda = totalDaVenda;
	}
	
	public void setParcelas(int parcelas) {
		this.parcelas = parcelas;
	}
	
	public void setMetodoPagamento(MetodoDePagamento metodo_pag) {
		
		switch (metodo_pag) {
		case CREDITO:
			formaPagamento = "Cartão de Crédito";
			break;
		case DEBITO:
			formaPagamento = "Cartão de Débito";
			break;
		case DINHEIRO:
			formaPagamento = "Dinheiro";
		default:
			break;
		}
	}
	
	private void calcularValorPorParcela() {
		this.valorPorParcela = this.totalDaVenda/this.parcelas;
	}

	public String relatorioPagamento()
	{
		calcularValorPorParcela();
		return  "Forma de Pagamento: "    + this.formaPagamento  + "\n" 			+
				"Número de Parcelas: "    + this.parcelas        + " parcelas\n" 	+
				"Valor por Parcela: R$ "  + this.valorPorParcela + "\n"; 
	}
}
