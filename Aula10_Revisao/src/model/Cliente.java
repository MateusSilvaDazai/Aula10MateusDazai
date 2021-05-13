package model;

public abstract class Cliente {
	private long idCliente;
	private String nome;
	private String profissao;
	
	public Cliente() {
		super();
	}
	
	public Cliente(long idCliente, String nome, String profissao) {
		super();
		this.idCliente = idCliente;
		this.nome = nome;
		this.profissao = profissao;
	}
	
	
	public long getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(long idCliente) {
		this.idCliente = idCliente;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getProfissao() {
		return profissao;
	}
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
	
	public void imprimirDados(){
		  System.out.println("Nome: " + getNome());
		  System.out.println("Id do Cleinte: " + getIdCliente());
		  System.out.println("Profissao: " + getProfissao());
		}
	
	 public abstract double cadastrar();
	
	 
}
