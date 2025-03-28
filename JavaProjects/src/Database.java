import java.sql.*;
import java.util.jar.Attributes.Name;
public class Database {
    
    public void database() {
        
        String url = "jdbc:mysql://localhost:3306/shopdatabase";
        String user = "root";
        String password = "root";
        

        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM marvel_rivals");

            while (rs.next()) {
                System.out.println(rs.getInt(1) + " " + rs.getString(2));
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
        
    }

    public void inserttodb(String task, String description){
        String url = "jdbc:mysql://localhost:3306/shopdatabase";
        String user = "root";
        String password = "root";
        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            Statement stmt = conn.createStatement();
            stmt.execute("INSERT INTO todolist (Name, Description) VALUES('" + task +  "', '" + description +  "' )");
            

        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
        
    }

    public void getfromdb(){
        String url = "jdbc:mysql://localhost:3306/shopdatabase";
        String user = "root";
        String password = "root";
        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT Name, Description FROM todolist");
            while (rs.next()) {
                String first = rs.getString("Name");
                String second = rs.getString("Description");
                Main.taskControl.ToDoList.add(first);
                Main.taskControl.ToDoList.add(second);
                System.out.println(Main.taskControl.getMyList());
                
            }   
            
            

    }   catch (SQLException e) {
        System.out.println("Error: " + e.getMessage());
        
        }

    }}





