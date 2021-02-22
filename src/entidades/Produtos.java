package entidades;

public class Produtos {
	
	private Integer quantidade;
	private Double preco;
	private Produto produto;
	
	public Produtos() {
		
	}

	public Produtos(Integer quantidade, Double preco, Produto produto) {
		super();
		this.quantidade = quantidade;
		this.preco = preco;
		this.produto = produto;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	
	public double subTotal() {
		return preco * quantidade;
	}
	
	@Override
	public String toString() {
		return getProduto().getNome()
				+ ", $"
				+ String.format("%.2f", preco) 
				+ ", Quantidade: "
				+ quantidade 
				+ ", Subtotal: $" 
				+ String.format("%.2f", subTotal());
	}
}























