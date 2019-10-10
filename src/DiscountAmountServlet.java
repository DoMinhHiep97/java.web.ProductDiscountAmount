import java.io.IOException;
import java.io.PrintWriter;

@javax.servlet.annotation.WebServlet(name = "DiscountAmountServlet",urlPatterns = "/discount")
public class DiscountAmountServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        float price         =Float.parseFloat(request.getParameter("price"));
        float discount      =Float.parseFloat(request.getParameter("discount"));

        float discountAmount= (float) (price*discount*0.1);
        float discountPrice = price-discountAmount;

        PrintWriter writer  =response.getWriter();
        writer.println("<html>");
        writer.println("<h1>Discount Amount: "+discountAmount+"</h1>");
        writer.println("<h1>Discount Price: "+discountPrice+"</h1>");
        writer.println("</html>");

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }
}
