package edu.javaweb;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet("/hello")
public class HelloWorldServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<body>");
        out.println("<h1>Hello, World!</h1>");
        out.println("<h1>Yes......</h1>");
        out.println("</body>");
        out.println("</html>");
        // var out = response.getWriter();
        // out.println("Hello World!");
        // out.close();
        // System.out.println("AAA");
    }
}