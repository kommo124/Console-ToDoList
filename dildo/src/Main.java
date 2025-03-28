import java.util.Scanner;

public class Main {
    public static TaskController taskControl = new TaskController();
    public static Database database = new Database();
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Main.taskControl = new TaskController();
        Main.database = new Database();

        while (true) {

            System.out.println("\nTodoList Menu:");
            System.out.println("1. Add Task: ");
            System.out.println("2. Remove Task: ");
            System.out.println("3. All Tasks: ");
            System.out.println("4. Change status of task: ");
            System.out.println("5. Quit: ");
            System.out.println("Enter your choice 1/2/3/4: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Clear clipboard

            switch (choice) {                    // Handling user selection
                case 1:
                    Main.taskControl.addtask();
                    Main.database.database();
                break;

                case 2:
                    taskControl.taskremove();
                break;
                    
                case 3:
                    System.out.println("Your ToDoList: ");
                    database.getfromdb();
                    
                break;

                case 4:
                    taskControl.exitfromtodo();
                break;
                
                }
            
                
                
            }

            
        }
    }

