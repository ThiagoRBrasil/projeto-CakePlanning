/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cakeplanning.controller;

import br.com.cakeplanning.cadastro.componente.Forma;
import br.com.cakeplanning.cadastro.componente.Massa;
import br.com.cakeplanning.cadastro.componente.Recheio;
import br.com.cakeplanning.cadastro.componente.Tamanho;
import br.com.cakeplanning.cadastro.componente.dao.FormaDAO;
import br.com.cakeplanning.cadastro.componente.dao.MassaDAO;
import br.com.cakeplanning.cadastro.componente.dao.RecheioDAO;
import br.com.cakeplanning.cadastro.componente.dao.TamanhoDAO;
import java.io.IOException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Thiago Brasil
 */
@WebServlet(name = "ServletCadastroComponente", urlPatterns = {"/ServletCadastroComponente"})
public class ServletCadastroComponente extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    private void componenteSalvar(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        Forma forma = new Forma();
        FormaDAO formaDAO = new FormaDAO();

        Massa massa = new Massa();
        MassaDAO massaDAO = new MassaDAO();

        Recheio recheio = new Recheio();
        RecheioDAO recheioDAO = new RecheioDAO();

        Tamanho tamanho = new Tamanho();
        TamanhoDAO tamanhoDAO = new TamanhoDAO();

        String novaForma = request.getParameter("novaForma");
        String novaMassa = request.getParameter("novaMassa");
        String novoRecheio = request.getParameter("novoRecheio");
        String novoTamanho = request.getParameter("novoTamanho");

        if (novaForma != null && !novaForma.isEmpty()) {

            if (formaDAO.listar(novaForma).isEmpty()) {
                forma.setNome(novaForma);

                formaDAO.salvar(forma);
            }
        }

        if (novaMassa != null && !novaMassa.isEmpty()) {

            if (massaDAO.listar(novaMassa).isEmpty()) {
                massa.setNome(novaMassa);

                massaDAO.salvar(massa);
            }
        }

        if (novoRecheio != null && !novoRecheio.isEmpty()) {

            if (recheioDAO.listar(novoRecheio).isEmpty()) {
                recheio.setNome(novoRecheio);

                recheioDAO.salvar(recheio);
            }
        }

        if (novoTamanho != null && !novoTamanho.isEmpty()) {

            if (tamanhoDAO.listar(novoTamanho).isEmpty()) {
                tamanho.setNome(novoTamanho);

                tamanhoDAO.salvar(tamanho);
            }
        }

    }

    private void componenteAlterar(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        FormaDAO formaDAO = new FormaDAO();

        MassaDAO massaDAO = new MassaDAO();

        RecheioDAO recheioDAO = new RecheioDAO();

        TamanhoDAO tamanhoDAO = new TamanhoDAO();

        String novaForma = request.getParameter("novaForma");
        String novaMassa = request.getParameter("novaMassa");
        String novoRecheio = request.getParameter("novoRecheio");
        String novoTamanho = request.getParameter("novoTamanho");

        String selecaoForma = request.getParameter("cxSelecaoForma");
        String selecaoMassa = request.getParameter("cxSelecaoMassa");
        String selecaoRecheio = request.getParameter("cxSelecaoRecheio");
        String selecaoTamanho = request.getParameter("cxSelecaoTamanho");

        if (selecaoForma != null && !selecaoForma.isEmpty()
                && !selecaoForma.equals("Nenhum") && novaForma != null
                && !novaForma.isEmpty()) {

            if (formaDAO.listar(novaForma).isEmpty()) {
                List<Forma> ArrayForma = formaDAO.listar(selecaoForma);
                
                Forma forma = (Forma) ArrayForma.get(0);
                
                forma.setNome(novaForma);

                formaDAO.atualizar(forma);
            }
        }

        if (selecaoMassa != null && !selecaoMassa.isEmpty()
                && !selecaoMassa.equals("Nenhum") && novaMassa != null
                && !novaMassa.isEmpty()) {

            if (massaDAO.listar(novaMassa).isEmpty()) {
                List<Massa> ArrayMassa = massaDAO.listar(selecaoMassa);

                Massa massa = (Massa) ArrayMassa.get(0);

                massa.setNome(novaMassa);

                massaDAO.atualizar(massa);
            }
        }

        if (selecaoRecheio != null && !selecaoRecheio.isEmpty()
                && !selecaoRecheio.equals("Nenhum") && novoRecheio != null
                && !novoRecheio.isEmpty()) {

            if (recheioDAO.listar(novoRecheio).isEmpty()) {
                List<Recheio> ArrayRecheio = recheioDAO.listar(selecaoRecheio);

                Recheio recheio = ArrayRecheio.get(0);

                recheio.setNome(novoRecheio);

                recheioDAO.atualizar(recheio);
            }
        }

        if (selecaoTamanho != null && !selecaoTamanho.isEmpty()
                && !selecaoTamanho.equals("Nenhum") && novoTamanho != null
                && !novoTamanho.isEmpty()) {

            if (tamanhoDAO.listar(novoTamanho).isEmpty()) {
                List<Tamanho> ArrayTamanho = tamanhoDAO.listar(selecaoTamanho);

                Tamanho tamanho = ArrayTamanho.get(0);

                tamanho.setNome(novoTamanho);

                tamanhoDAO.atualizar(tamanho);
            }
        }

    }

    private void componenteDeletar(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        FormaDAO formaDAO = new FormaDAO();

        MassaDAO massaDAO = new MassaDAO();

        RecheioDAO recheioDAO = new RecheioDAO();

        TamanhoDAO tamanhoDAO = new TamanhoDAO();

        String selecaoForma = request.getParameter("cxSelecaoForma");
        String selecaoMassa = request.getParameter("cxSelecaoMassa");
        String selecaoRecheio = request.getParameter("cxSelecaoRecheio");
        String selecaoTamanho = request.getParameter("cxSelecaoTamanho");

        if (selecaoForma != null && !selecaoForma.isEmpty()
                && !selecaoForma.equals("Nenhum")) {

            List<Forma> ArrayForma = formaDAO.listar(selecaoForma);

            formaDAO.excluir(ArrayForma.get(0));
        }
        if (selecaoMassa != null && !selecaoMassa.isEmpty()
                && !selecaoMassa.equals("Nenhum")) {

            List<Massa> ArrayMassa = massaDAO.listar(selecaoMassa);

            massaDAO.excluir(ArrayMassa.get(0));
        }
        if (selecaoRecheio != null && !selecaoRecheio.isEmpty()
                && !selecaoRecheio.equals("Nenhum")) {

            List<Recheio> ArrayRecheio = recheioDAO.listar(selecaoRecheio);

            recheioDAO.excluir(ArrayRecheio.get(0));
        }
        if (selecaoTamanho != null && !selecaoTamanho.isEmpty()
                && !selecaoTamanho.equals("Nenhum")) {

            List<Tamanho> ArrayTamanho = tamanhoDAO.listar(selecaoTamanho);

            tamanhoDAO.excluir(ArrayTamanho.get(0));
        }

    }

    private void componente(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        if (request.getParameter("btSalvar") != null) {

            componenteSalvar(request, response);

        } else if (request.getParameter("btAlterar") != null) {

            componenteAlterar(request, response);

        } else if (request.getParameter("btDeletar") != null) {

            componenteDeletar(request, response);

        }
        
        RequestDispatcher rd = request.getRequestDispatcher("/cadastro-componente-JSP.jsp");
        rd.forward(request, response);
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        componente(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        componente(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
