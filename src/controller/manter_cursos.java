package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Curso;

/**
 * Servlet implementation class manter_cursos
 */
@WebServlet("/manter_cursos.do")
public class manter_cursos extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
  

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
		String pDataIni = request.getParameter("dataIni");
		String pDataTer = request.getParameter("dataTer");
		String pHorario = request.getParameter("horario");
		int pVagas = Integer.parseInt(request.getParameter("vagas"));
		double pValor = Double.parseDouble(request.getParameter("valor"));
		String pAcao = request.getParameter("acao");
				
		Curso curso = new Curso(pCod, pNome,pDataIni, pDataTer, pHorario, pVagas, pValor);
		if(pAcao.equals("Cadastrar")){
		curso.cadastrar();
		}
		if (pAcao.equals("Consultar")){
		    curso.consultar();
		}
		if (pAcao.equals("Alterar")){
		curso.alterar();
		}
		if (pAcao.equals("Deletar")){
	    curso.deletar();
	   }
	}
}
