package Web;

import org.eclipse.jetty.servlet.Source;

import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.WebConnection;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;

public class CalcServletPOST extends HttpServlet {
    private Calculator calculator;

    public CalcServletPOST(Calculator calculator) {
        this.calculator=calculator;
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String x = req.getParameter("x");
        String y = req.getParameter("y");
        String op = req.getParameter("op");
        try(PrintWriter writer = resp.getWriter()){
            writer.write(calculator.doOperation(x,y,op));
        }
    }
}
