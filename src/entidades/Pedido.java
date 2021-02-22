package entidades;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entidades.enums.StatusPedido;

public class Pedido {
	
	private Date momentoAtual;
	private StatusPedido status;
	private Cliente cliente;
	
	private List<Produtos> items = new ArrayList<Produtos>();
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	public Pedido() {
		
	}

	public Pedido(Date momentoAtual, StatusPedido status, Cliente cliente) {
		super();
		this.momentoAtual = momentoAtual;
		this.status = status;
		this.cliente = cliente;
	}

	public Date getMomentoAtual() {
		return momentoAtual;
	}

	public void setMomentoAtual(Date momentoAtual) {
		this.momentoAtual = momentoAtual;
	}

	public StatusPedido getStatusPedido() {
		return status;
	}

	public void setStatusPedido(StatusPedido status) {
		this.status = status;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public void adicionaItem(Produtos item) {
		items.add(item);
	}
	
	public void removeItem(Produtos item) {
		items.remove(item);
	}
	
	public double total() {
		double soma = 0.0;
		for (Produtos it : items) {
			soma += it.subTotal();
		}
		return soma;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Momento do pedido: ");
		sb.append(sdf.format(momentoAtual) + "\n");
		sb.append("Status do Pedido: ");
		sb.append(status + "\n");
		sb.append("Cliente: ");
		sb.append(cliente + "\n");
		sb.append("Produtos:\n");
		for (Produtos item : items) {
			sb.append(item + "\n");
		}
		sb.append("Preço total: $");
		sb.append(String.format("%.2f", total()));
		return sb.toString();
	}
}















