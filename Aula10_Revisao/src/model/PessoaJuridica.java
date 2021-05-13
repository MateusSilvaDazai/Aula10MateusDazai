package model;

public class PessoaJuridica extends Cliente {
	private double cnpj;
	private String inscricaoEstadual;
	
	
	public PessoaJuridica(long idCliente, String nome, String profissao, double cnpj, String inscricaoEstadual) {
		super(idCliente, nome, profissao);
		this.cnpj = cnpj;
		this.inscricaoEstadual = inscricaoEstadual;
	}
	
	
	public double getCnpj() {
		return cnpj;
	}
	public void setCnpj(double cnpj) {
		this.cnpj = cnpj;
	}
	public String getInscricaoEstadual() {
		return inscricaoEstadual;
	}
	public void setInscricaoEstadual(String inscricaoEstadual) {
		this.inscricaoEstadual = inscricaoEstadual;
	}
	
	public void imprimirDados(){
		  System.out.println("Cnpj: " + getCnpj());
		  System.out.println("Inscricao Estadual: " + getInscricaoEstadual());
		}


	@Override
	public double cadastrar() {
		// TODO Auto-generated method stub
		return cnpj;
	}
	
}
