package model;

import dao.CursoDAO;
import to.CursoTO;

public class Curso {


		private String cod, nome,dataIni, dataTer, horario;
		private int vagas;
		private double valor;

		public Curso(String cod, String nome, String dataIni, String dataTer, String horario, int vagas, double valor) {
			this.cod = cod;
			this.nome = nome;
			this.dataIni = dataIni;
			this.dataTer = dataTer;
			this.horario = horario;
			this.vagas = vagas;
			this.valor = valor;
		}

		// GETS E SETS
		
		public String getCod() {
			return cod;
		}

		public void setCod(String cod) {
			this.cod = cod;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}


		public String getDataIni() {
			return dataIni;
		}

		public void setDataIni(String dataIni) {
			this.dataIni = dataIni;
		}

		public String getDataTer() {
			return dataTer;
		}

		public void setDataTer(String dataTer) {
			this.dataTer = dataTer;
		}

		public String getHorario() {
			return horario;
		}

		public void setHorario(String horario) {
			this.horario = horario;
		}

		public int getVagas() {
			return vagas;
		}

		public void setVagas(int vagas) {
			this.vagas = vagas;
		}

		public double getValor() {
			return valor;
		}

		public void setValor(double valor) {
			this.valor = valor;
		}
		// Metodos CRUD
		public CursoTO getTO() {
			CursoTO to = new CursoTO();
			to.setCod(cod);
			to.setNome(nome);
			to.setDataIni(dataIni);
			to.setDataTer(dataTer);
			to.setHorario(horario);
			to.setVagas(vagas);
			to.setValor(valor);
			return to;
		}
		// Cadastrar
		public void cadastrar() {
			CursoDAO dao = new CursoDAO();
			CursoTO to = getTO();
			dao.cadastrar(to);
		}
		//Consultar
		public void consultar() {
		CursoDAO dao = new CursoDAO();
		CursoTO to = dao.consultar(cod);
			nome = to.getNome();
			dataIni = to.getDataIni();
			dataTer = to.getDataTer();
			horario = to.getHorario();
			vagas = to.getVagas();
			valor = to.getValor();
		}
		// Alterar 
		public void alterar() {
			CursoDAO dao = new CursoDAO();
			CursoTO to = getTO();
			dao.alterar(to);
		}
		// Deletar
		public void deletar() {
			CursoDAO dao = new CursoDAO();
			CursoTO to = new CursoTO();
			to.setCod(cod);
			dao.deletar(to);
		}
		@Override
		public String toString() {
			return "Curso [cod=" + cod + ", nome=" + nome + ", dataIni=" + dataIni + ", dataTer=" + dataTer
					+ ", horario=" + horario + ", vagas=" + vagas + ", valor=" + valor + "]";
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Curso other = (Curso) obj;
			if (cod == null) {
				if (other.cod != null)
					return false;
			} else if (!cod.equals(other.cod))
				return false;
			if (dataIni == null) {
				if (other.dataIni != null)
					return false;
			} else if (!dataIni.equals(other.dataIni))
				return false;
			if (dataTer == null) {
				if (other.dataTer != null)
					return false;
			} else if (!dataTer.equals(other.dataTer))
				return false;
			if (horario == null) {
				if (other.horario != null)
					return false;
			} else if (!horario.equals(other.horario))
				return false;
			if (nome == null) {
				if (other.nome != null)
					return false;
			} else if (!nome.equals(other.nome))
				return false;
			if (vagas != other.vagas)
				return false;
			if (Double.doubleToLongBits(valor) != Double.doubleToLongBits(other.valor))
				return false;
			return true;
		}

		
}				

