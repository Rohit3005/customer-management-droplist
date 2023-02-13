package com.csi.controller;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.csi.model.Customer;
import com.csi.service.CustomerService;
import com.csi.service.CustomerServiceImpl;

/**
 * Servlet implementation class CustomerController
 */
@WebServlet("/CustomerController")
public class CustomerController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	String SIGNUP_PAGE = "/signup.jsp";
	String SIGNIN_PAGE = "/signin.jsp";
	String SHOWDATA_PAGE = "/show.jsp";

	CustomerService customerServiceImpl = new CustomerServiceImpl();

	public CustomerController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.getWriter().append("Served at: ").append(request.getContextPath());

		String redirect = "";

		String action = request.getParameter("action");

		String custName = request.getParameter("custname");
		if (custName != null && action.equals("signup")) {

			String custAddress = request.getParameter("custaddress");

			String addState = request.getParameter("addstate");

			long custContactNumber = Long.valueOf(request.getParameter("custcontactnumber"));

			double custAccBalance = Double.valueOf(request.getParameter("custaccbalance"));

			int custAge = Integer.parseInt(request.getParameter("custage"));

			Date custDOB = null;

			SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
			try {
				custDOB = dateFormat.parse(request.getParameter("custdob"));
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			String custEmailId = request.getParameter("custemailid");

			String custPassword = request.getParameter("custpassword");

			Customer customer = new Customer(custName, custAddress, addState, custContactNumber, custAccBalance,
					custAge, custDOB, custEmailId, custPassword);

			customerServiceImpl.signUp(customer);

			redirect = SIGNIN_PAGE;

		} else if (action.equals("signin")) {

			String custEmailId = request.getParameter("custemailid");

			String custPassword = request.getParameter("custpassword");

			if (customerServiceImpl.signIn(custEmailId, custPassword)) {
				redirect = SHOWDATA_PAGE;

				request.setAttribute("customerlist", customerServiceImpl.getAllData());

			} else {
				request.setAttribute("message", "Invalid credentials please try again!!!");
				redirect = SIGNIN_PAGE;
			}

		}

		RequestDispatcher requestDispatcher = request.getRequestDispatcher(redirect);
		requestDispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
