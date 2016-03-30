package to;


public class AlunoTO {

	//private int id;
	private String nome;
	private String telefone;
	private String endereco;
	private String email;
	private String rg;
	private int cpf;
	
	

	public AlunoTO(){
		
	}
	public AlunoTO(String nome, String telefone,String endereco, String email, String rg,int cpf) {
		super();
		//this.id = idAluno;
		this.nome = nome;
		this.telefone = telefone;
		this.telefone = telefone;
		this.email = email;
		this.rg = rg;
		this.cpf = cpf;
		
		
	}

	
	// GETS E SETS
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	//Cliente TO - Refactor - Extratc method
	
}
