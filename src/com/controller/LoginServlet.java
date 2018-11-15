package com.controller;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.Registrationjdbc;
import com.model.Registration;


public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public LoginServlet() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String s1 = request.getParameter("username");
        String s2 = request.getParameter("password1");
        
        Registration r= new Registration(); 
        r.setUsername(s1);
		r.setPassword1(s2);
		List<Registration>lst = new LinkedList<Registration>();
		lst.add(r);
		System.out.println("save 4");
		
		Registrationjdbc db= new Registrationjdbc();
		int i=db.saveData(lst);
		System.out.println("save 5");
		db.displayData();
	
	}

}
