package com.codecool.shop.controller;

import com.codecool.shop.config.TemplateEngineUtil;
import com.codecool.shop.dao.CartDao;
import com.codecool.shop.dao.implementation.CartDaoMem;
import com.codecool.shop.model.Product;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.WebContext;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "remove_cart", urlPatterns = {"/remove-cart"})
public class RemoveCartController extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        CartDao cart = CartDaoMem.getInstance();
        String productId = request.getParameter("pid");
        int productIdInt = Integer.parseInt(productId);
        Product selectedProduct = cart.find(productIdInt);
        cart.removeFromCart(selectedProduct);
        TemplateEngine engine = TemplateEngineUtil.getTemplateEngine(request.getServletContext());
        WebContext context = new WebContext(request, response, request.getServletContext());
        context.setVariable("cart", cart.getAll());
        engine.process("product/edit-cart.html", context, response.getWriter());
    }
}
//FML