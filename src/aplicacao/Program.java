package aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entidades.Cliente;
import entidades.Pedido;
import entidades.Produto;
import entidades.Produtos;
import entidades.enums.StatusPedido;

public class Program {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Entre com os dados do cliente:");
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.next();
		System.out.print("Data de nascimento (DD/MM/YYYY): ");
		Date dataDeNasc = sdf.parse(sc.next());

		Cliente cliente = new Cliente(nome, email, dataDeNasc);

		System.out.println();
		System.out.println("Entre com os dados do pedido:");
		System.out.print("Status: ");
		StatusPedido status = StatusPedido.valueOf(sc.next());

		Pedido pedido = new Pedido(new Date(), status, cliente);

		System.out.print("Quantos produtos terá este pedido? ");
		int N = sc.nextInt();
		for (int i = 1; i <= N; i++) {
			System.out.println("Digite os dados do #" + i + " produto:");
			System.out.print("Nome do produto: ");
			sc.nextLine();
			String nomeProduto = sc.nextLine();
			System.out.print("Preço do produto: ");
			double precoProduto = sc.nextDouble();
			System.out.print("Quantidade: ");
			int quantidade = sc.nextInt();

			Produto produto = new Produto(nomeProduto, precoProduto);

			Produtos it = new Produtos(quantidade, precoProduto, produto);

			pedido.adicionaItem(it);
		}
		
		System.out.println();
		System.out.println(pedido);

		sc.close();
	}
}
