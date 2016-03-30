package model;

import dao.AlunoDAO;
import to.AlunoTO;

public class Aluno {
	// private int idAluno;
	 private String nome;
	 private String telefone;
	 private String endereco;
	 private String email;
	 private String rg;
	 private int cpf;
	
	 
	 // Construtor com parametros
	 
	 public Aluno(String nome, String telefone, String email, String rg,String endereco,int cpf) {
		super();
		//this.idAluno = idAluno;
		this.nome = nome;
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
	
	public String getEndereco() {
		return endereco;
	}



	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

// Metodos CRUD 
// Cadastrar 
	
	public void cadastrar(){
		AlunoDAO dao = new AlunoDAO();
		AlunoTO to = new AlunoTO();
		//to.setId(idAluno);
		to.setNome(nome);
		to.setTelefone(telefone);
		to.setEndereco(endereco);
		to.setRg(rg);
		to.setCpf(cpf);
		dao.cadastrar(to);
	}
	
	// Consultar
	

	public void consultar() {
		AlunoDAO dao = new AlunoDAO();
		AlunoTO to = dao.consultar(cpf);
		
		nome = to.getNome();
		telefone = to.getTelefone();
		email = to.getEmail();
		rg= to.getRg();
		cpf = to.getCpf();
	}

	
	// Alterar 
	
	public void alterar() {
		AlunoDAO dao = new AlunoDAO();
		AlunoTO to = new AlunoTO();
		to.setNome(nome);
		to.setTelefone(telefone);
		to.setEndereco(endereco);
		to.setRg(rg);
		to.setCpf(cpf);
		dao.alterar(to);
		
		System.out.println("Dados Alterados");
	}
	
	
	// Deletar
	
	public void deletar(){
		AlunoDAO dao = new AlunoDAO();
		AlunoTO to = new AlunoTO();
		to.setCpf(cpf);
		dao.deletar(to);
	}

	


	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", telefone=" + telefone + ", endereco=" + endereco + ", email=" + email
				+ ", rg=" + rg + ", cpf=" + cpf + "]";
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		if (cpf != other.cpf)
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (endereco == null) {
			if (other.endereco != null)
				return false;
		} else if (!endereco.equals(other.endereco))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (rg == null) {
			if (other.rg != null)
				return false;
		} else if (!rg.equals(other.rg))
			return false;
		if (telefone == null) {
			if (other.telefone != null)
				return false;
		} else if (!telefone.equals(other.telefone))
			return false;
		return true;
	}



}