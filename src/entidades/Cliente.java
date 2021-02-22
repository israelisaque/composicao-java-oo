 package entidades;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Cliente {
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private String nome;
	private String email;
	private Date dataDeNasc;
	
	public Cliente() {
		
	}

	public Cliente(String nome, String email, Date dataDeNasc) {
		super();
		this.nome = nome;
		this.email = email;
		this.dataDeNasc = dataDeNasc;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getDataDeNasc() {
		return dataDeNasc;
	}

	public void setDataDeNasc(Date dataDeNasc) {
		this.dataDeNasc = dataDeNasc;
	}
	
	@Override
	public String toString() {
		return nome + " (" + sdf.format(dataDeNasc) + ") - " + email;
	}
}













