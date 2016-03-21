package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.CursosCRUD;

/**
 * Servlet implementation class manter_cursos
 */
@WebServlet("/manter_cursos")
public class manter_cursos extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public manter_cursos() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String pCod = request.getParameter("codigo");
		String pNome = request.getParameter("nome");
		String pNumLab = request.getParameter("numLab");
		String pRegSoft = request.getParameter("regSoft");
		String pMaterial = request.getParameter("material");
		String pLivro = request.getParameter("livro");
		String pDataIni = request.getParameter("dataIni");
		String pDataTer = request.getParameter("dataTer");
		String pHorario = request.getParameter("horario");
		int pVagas = Integer.parseInt(request.getParameter("vagas"));
		double pValor = Double.parseDouble(request.getParameter("valor"));
		String pAcao = request.getParameter("Cadastrar, Alterar, Consultar, Deletar");
				
		CursosCRUD cursos = new CursosCRUD(pCod, pNome, pNumLab, pRegSoft, pMaterial, pLivro, pDataIni, pDataTer, pHorario, pVagas, pValor);
		if(pAcao.equals("Cadastrar")){
		cursos.cadastrar();
		
		}else if (pAcao.equals("Alterar")){
		cursos.alterar();
	    }else if (pAcao.equals("Deletar")){
	    cursos.deletar();
	    }
		PrintWriter out = response.getWriter();
		out.println("<html><head><title>Aluno Cadastrado");
		out.println("</title></head><body>");
		out.println("Codigo"+cursos.getCod()+"<br>");
		out.println("Nome"+cursos.getNome()+"<br>");
		out.println("Data Inicio"+cursos.getDataIni()+"<br>");
		out.println("Data Termino"+cursos.getDataTer()+"<br>");
		out.println("Horario"+cursos.getHorario()+"<br>");
		out.println("Livro"+cursos.getLivro()+"<br>");
		out.println("Material"+cursos.getMaterial()+"<br>");
		out.println("Numero Laboratorio"+cursos.getNumLab()+"<br>");
		out.println("Registro Software"+cursos.getRegSoft()+"<br>");
		out.println("Vagas"+cursos.getVagas()+"<br>");
		out.println("Valor"+cursos.getValor()+"<br>");
		out.println("</body></html>");
		
	}

}
