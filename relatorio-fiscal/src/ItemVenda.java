
public class ItemVenda {
	private Produto produto;
	private int quantidade = 0;
	
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	public Produto getProduto() {
		return produto;
	}
	
	public int getQuantidade() {
		return quantidade;
	}
	
	public double subtotalItem() {
		double subtotal = 0;
		subtotal = this.quantidade * this.produto.getValorUnitario();
		return subtotal;
	}
	
}
