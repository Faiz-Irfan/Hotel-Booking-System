package Controller;

//import .*;
import DAO.UserDAO;
import DAO.UserDAOImpl;
import Model.User;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDate;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
 @WebServlet(urlPatterns = {"/register"})
public class register extends HttpServlet {  
protected void doGet(HttpServletRequest request, HttpServletResponse response)  
            throws ServletException, IOException {  
  
response.setContentType("text/html;charset=UTF-8");  
PrintWriter out = response.getWriter();  
          
//try{  
//    
//String driver= "com.mysql.jdbc.Driver";
//        String database= "owohotel";
//        String url= "jdbc:mysql://localhost:3306/owohotel";
//        String user= "root";
//        String password = "";
        
  
String p=request.getParameter("password");  
String n=request.getParameter("name");  
String e=request.getParameter("email");  
String pn=request.getParameter("phoneno");  
String l=request.getParameter("level");  
String add=request.getParameter("address");
double ewallet= 0.00;

        User nu = new User(e,n,p,pn,l,add);
        UserDAO dao = new UserDAOImpl();
        dao.register(nu);

        response.sendRedirect("login.jsp");
        
//Class.forName("com.mysql.jdbc.Driver");  
//Connection conn=DriverManager.getConnection( url, user, password);  
//
//String sqlinsert = "insert into user (password,name,email,phone,level,address,ewallet_balance)values"
//        + "('"   + p + "','"  + n + "','" + e + "','" + pn + "','"    + l + "','"   + add  + "','" + ewallet + "')";
//  
//log(sqlinsert);
//          
//Statement stmt = conn.createStatement();
//stmt.executeUpdate(sqlinsert);
//
//conn.close();
//response.sendRedirect("login.jsp");
//      
//          
//}
//        catch (Exception ex){
//            ex.printStackTrace(out);
//        }   
    }

         
    }