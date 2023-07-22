package com.example.julyexam;

import com.example.julyexam.models.Sales;
import jakarta.ejb.EJB;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

@WebServlet("/sales")
public class SalesServlet extends HttpServlet {
    @EJB
    private SalesBean salesBean;

    public SalesServlet(SalesBean salesBean) {
        this.salesBean = salesBean;
    }

    public SalesServlet() {
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Sales> sales = salesBean.getAllSales();
        request.setAttribute("sales", sales);
        request.getRequestDispatcher("/sales.jsp").forward(request,response);
    }
}
