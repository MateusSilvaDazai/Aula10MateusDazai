package model;

public class PessoaFisica extends Cliente{
	private double cpf;
	private String estadoCivil;
	
	
	public PessoaFisica(long idCliente, String nome, String profissao, double cpf, String estadoCivil) {
		super(idCliente, nome, profissao);
		this.cpf = cpf;
		this.estadoCivil = estadoCivil;
	}
	
	
	public double getCpf() {
		return cpf;
	}
	public void setCpf(double cpf) {
		this.cpf = cpf;
	}
	public String getEstadoCivil() {
		return estadoCivil;
	}
	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
	
	public void imprimirDados(){
		  System.out.println("Cpf: " + getCpf());
		  System.out.println("Estado Civil: " + getEstadoCivil());
		}


	@Override
	public double cadastrar() {
		// TODO Auto-generated method stub
		return cpf;
	}

	
	

}
