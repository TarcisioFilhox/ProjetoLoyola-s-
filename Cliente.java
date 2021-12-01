package Projeto;

public class Cliente {

	private String nome, cpf, email, telefone, endereco;
	
	public Cliente (String nome, String cpf, String email, String telefone, String endereco){
	
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
		this.telefone = telefone;
		this.endereco = endereco;

	}
	
	public void setNome(String nome){
		this.nome = nome;
	}
	public String getNome(){
		return this.nome;
	}
	
	public void setCpf(String cpf){
		this.cpf = cpf;
	}
	public String getCpf(){
		return this.cpf;
	}
	
	public void setEmail(String email){
		this.email= email;
	}
	public String getEmail(){
		return this.email; 
	}

	public void setTelefone(String telefone){
		this.telefone= telefone;
	}
	public String getTelefone(){
		return this.telefone; 
	}

	public void setEndereco(String endereco){
		this.endereco= endereco;
	}
	public String getEndereco(){
		return this.endereco; 
	}

	public void InfoCliente(){

		System.out.println("\n\nInformações do Cliente\n");
		System.out.println("Nome: "+ getNome());
		System.out.println("CPF: "+ getCpf());
		System.out.println("Email: "+ getEmail());
		System.out.println("Número de telefone: "+ getTelefone());
		System.out.println("Endereço: "+ getEndereco());
	}
}
