package controller;


import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.AlunosCRUD;

/**
 * Servlet implementation class manter_alunos
 */
@WebServlet("/manter_alunos")
public class manter_alunos extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public manter_alunos() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String pNome = request.getParameter("nome");
		int pCpf = Integer.parseInt(request.getParameter("cpf"));
		String pRg = request.getParameter("rg");
		String pEmail = request.getParameter("email");
		String pEnd = request.getParameter("endereco");
		int pTel = Integer.parseInt(request.getParameter("telefone"));
		String pAcao = request.getParameter("Cadastrar, Alterar, Consultar, Deletar");
				
		AlunosCRUD alunos = new AlunosCRUD(pNome, pRg, pEnd, pEmail, pCpf, pTel);
		if(pAcao.equals("Cadastrar")){
		alunos.cadastrar();
		
		}else if (pAcao.equals("Alterar")){
		alunos.alterar();
	    }else if (pAcao.equals("Deletar")){
	    alunos.deletar();
	    }
		PrintWriter out = response.getWriter();
		out.println("<html><head><title>Aluno Cadastrado");
		out.println("</title></head><body>");
		out.println("Nome"+alunos.getNome()+"<br>");
		out.println("Rg"+alunos.getRg()+"<br>");
		out.println("Cpf"+alunos.getCpf()+"<br>");
		out.println("Endereco"+alunos.getEnd()+"<br>");
		out.println("Email"+alunos.getEmail()+"<br>");
		out.println("Telefone"+alunos.getTel()+"<br>");
		out.println("</body></html>");

	}

}
