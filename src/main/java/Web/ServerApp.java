package Web;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;

public class ServerApp {
    public static void main(String[] args) throws Exception {
        Server server = new Server(8080);
        ServletContextHandler handler = new ServletContextHandler();
        Calculator calculator = new Calculator();

        handler.addServlet(new ServletHolder(new CalcServlet(calculator)),"/calc/*");
        handler.addServlet(new ServletHolder(new CalcServletGet(calculator)),"/calc2/*");
        handler.addServlet(new ServletHolder(new CalcServletPOST(calculator)),"/docalc/*");
        handler.addServlet(new ServletHolder(new FileContentServlet()), "/file/*");

        server.setHandler(handler);
        server.start();
        server.join();

    }
}
