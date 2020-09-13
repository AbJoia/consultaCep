package Entity;

public class Endereco {
	
	private String cep;
	private String logradouro;
	private String complemento;
	private String bairro;
	private String localidade;
	private String uf;	
	
	public Endereco(String cep, String logradouro, String complemento, String bairro, String localidade, String uf) {
		super();
		this.cep = cep;
		this.logradouro = logradouro;
		this.complemento = complemento;
		this.bairro = bairro;
		this.localidade = localidade;
		this.uf = uf;
	}	

	@Override
	public String toString() {
		return "\nEndereco retornado:\n"
				+ "cep: " + cep + "\n"
				+ "logradouro: " + logradouro + "\n"
				+ "complemento: " + complemento + "\n"
				+ "bairro: " + bairro + "\n"
				+ "localidade: " + localidade + "\n"
				+ "uf: " + uf;
	}	
	
}
