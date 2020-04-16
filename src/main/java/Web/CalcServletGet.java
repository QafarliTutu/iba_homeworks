package Web;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.stream.Collectors;

public class CalcServletGet extends HttpServlet {
      private Calculator calculator;
      public  CalcServletGet(Calculator calculator){this.calculator=calculator;}

      @Override
      protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            String content = new BufferedReader(new FileReader(new File("Content/2.html"))).lines().collect(Collectors.joining("\n"));

            try(PrintWriter writer = resp.getWriter()){
                  writer.write(content);
            }
      }
}
