package com.example.julyexam;

import com.example.julyexam.models.Product;
import com.example.julyexam.models.Sales;
import jakarta.ejb.EJB;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;


@WebServlet("/products")
public class ProductServlet extends HttpServlet {
    @EJB
    private ProductBean productBean;

    @EJB
    private SalesBean salesBean;

    public ProductServlet(ProductBean productBean, SalesBean salesBean) {
        this.productBean = productBean;
        this.salesBean = salesBean;
    }

    public ProductServlet() {
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Product> products = productBean.getAllProducts();
        System.out.println(products);
        List<Sales> sales = salesBean.getAllSales();
        request.setAttribute("products", products);
        request.setAttribute("sales", sales);
        request.getRequestDispatcher("/products.jsp").forward(request,response);
    }
}
