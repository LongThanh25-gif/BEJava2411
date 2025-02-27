package vn.edu.t3h.employeemanager.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "EmployeeServlet", value = "/employee")
public class EmployeeServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // config kiểu dữ liệu trả về trong response là html/text
        resp.setContentType("text/html");

        // Ghi dữ liêệu vào response
        PrintWriter out = resp.getWriter();
        out.println("<html><body>");
        out.println("<h1> Danh sách nhân viên </h1>");
        out.println("</body></html>");

    }
}
