package com.example.demoman;

import lombok.extern.log4j.Log4j2;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@Log4j2
@WebServlet("/web")
public class HelloServlet extends HttpServlet {

    private String message;

    public void init() {
        message = "changing";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        log.info("info info");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("</body></html>");
    }

    public void destroy() {
    }
}