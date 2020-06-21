package br.com.marcusmoreira.siscob.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.marcusmoreira.siscob.dao.DividaDao;
import br.com.marcusmoreira.siscob.model.Divida;
import java.sql.Date;

@WebServlet("/divida")
public class DividaServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private DividaDao dividaDao;

    public void init() {
        dividaDao = new DividaDao();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        String action = request.getServletPath();

        try {
            switch (action) {
                case "/new":
                    showNewForm(request, response);
                    break;
                case "/insert":
                    insertDebt(request, response);
                    break;
                case "/delete":
                    deleteDebt(request, response);
                    break;
                case "/edit":
                    showEditForm(request, response);
                    break;
                case "/update":
                    updateDebt(request, response);
                    break;                    
                default:
                    listDebt(request, response);
                    break;
            }
        } catch (SQLException ex) {
            throw new ServletException(ex);
        }
    }

    private void listDebt(HttpServletRequest request, HttpServletResponse response)
    throws SQLException, IOException, ServletException {
        List < Divida > listOfDebt = dividaDao.getAllDebt();
        request.setAttribute("listDebt", listOfDebt);
        RequestDispatcher dispatcher = request.getRequestDispatcher("lista-divida.jsp");
        dispatcher.forward(request, response);
    }

    private void showNewForm(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("divida.jsp");
        dispatcher.forward(request, response);
    }

    private void showEditForm(HttpServletRequest request, HttpServletResponse response)
    throws SQLException, ServletException, IOException {
        int idDivida = Integer.parseInt(request.getParameter("idDivida"));
        Divida existingDebt = dividaDao.getDebt(idDivida);
        RequestDispatcher dispatcher = request.getRequestDispatcher("divida.jsp");
        request.setAttribute("debt", existingDebt);
        dispatcher.forward(request, response);

    }

    private void insertDebt(HttpServletRequest request, HttpServletResponse response)
    throws SQLException, IOException {
        int idDivida = Integer.parseInt(request.getParameter("idDivida"));
        int idCredor = Integer.parseInt(request.getParameter("idCredor"));
        Date dataAtualizacao = Date.valueOf(request.getParameter("dataAtualicao"));
        float valorDivida = Float.parseFloat(request.getParameter("valorDivida"));
        int idDevedor = Integer.parseInt(request.getParameter("idDevedor"));
                
        Divida novaDivida = new Divida(idDivida, idCredor, dataAtualizacao, valorDivida, idDevedor);
        dividaDao.saveDebt(novaDivida);
        response.sendRedirect("list");
    }

    private void updateDebt(HttpServletRequest request, HttpServletResponse response)
    throws SQLException, IOException {
        int idDivida = Integer.parseInt(request.getParameter("idDivida"));
        int idCredor = Integer.parseInt(request.getParameter("idCredor"));
        Date dataAtualizacao = Date.valueOf(request.getParameter("dataAtualicao"));
        float valorDivida = Float.parseFloat(request.getParameter("valorDivida"));
        int idDevedor = Integer.parseInt(request.getParameter("idDevedor"));

        Divida novaDivida = new Divida(idDivida, idCredor, dataAtualizacao, valorDivida, idDevedor);
        dividaDao.updateDebt(novaDivida);
        response.sendRedirect("list");
    }

    private void deleteDebt(HttpServletRequest request, HttpServletResponse response)
    throws SQLException, IOException {
        int id_divida = Integer.parseInt(request.getParameter("id_divida"));
        dividaDao.deleteDebt(id_divida);
        response.sendRedirect("list");
    }
}