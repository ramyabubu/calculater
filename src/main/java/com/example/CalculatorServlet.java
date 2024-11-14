package com.example;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/calculate")
public class CalculatorServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String num1Str = request.getParameter("num1");
        String num2Str = request.getParameter("num2");
        String operation = request.getParameter("operation");

        double result = 0;
        String error = null;

        try {
            double num1 = Double.parseDouble(num1Str);
            double num2 = Double.parseDouble(num2Str);

            switch (operation) {
                case "add":
                    result = num1 + num2;
                    break;
                case "subtract":
                    result = num1 - num2;
                    break;
                case "multiply":
                    result = num1 * num2;
                    break;
                case "divide":
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        error = "Division by zero is not allowed.";
                    }
                    break;
                default:
                    error = "Invalid operation.";
                    break;
            }
        } catch (NumberFormatException e) {
            error = "Invalid input. Please enter valid numbers.";
        }

        response.setContentType("text/html");
        response.getWriter().println("<html><body>");
        if (error != null) {
            response.getWriter().println("<h3>Error: " + error + "</h3>");
        } else {
            response.getWriter().println("<h3>Result: " + result + "</h3>");
        }
        response.getWriter().println("<a href='index.jsp'>Go Back</a>");
        response.getWriter().println("</body></html>");
    }
}
