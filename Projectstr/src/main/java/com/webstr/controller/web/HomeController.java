package com.webstr.controller.web;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;


@WebServlet(urlPatterns = "/trang-chu")
public class HomeController extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public void doGet(HttpServletRequest req , HttpServletResponse res) throws ServletException, IOException {
		RequestDispatcher rd=getServletContext().getRequestDispatcher("/views/web/home.jsp");
		rd.forward(req, res);
	}
	
	public void doPost(HttpServletRequest req , HttpServletResponse res) throws ServletException, IOException {
		doGet(req,res);
	}
}
