import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TaskController {
    ArrayList<String> ToDoList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    Database db = new Database();
    public static statuses status;

    public void addtask(){                              // Adding the entered task name to the ArrayList
        System.out.println("Enter name of task: ");
        String task = scanner.nextLine();
        System.out.println("Enter description of task: ");
        String description = scanner.nextLine();
        db.inserttodb(task, description);
        System.out.println("Your task has been added: " + task + "\n Your task description: " + description + "\n Your task status: " );

    }


    public void taskremove(){
        System.out.print("\nEnter number of task to remove: ");              // Request data from the user to remove the selected item from the list
        int index = scanner.nextInt();
        scanner.nextLine();                         // again clear clipboard

        if (index > 0 && index < ToDoList.size()){                              // check if the value of the index variable is in the valid index range for the ToDoList list.
            String removefromlist = ToDoList.remove(index);    // index is a user selected number
            System.out.println("Task " + removefromlist + "With number" + index + "Succesfully removed" );

        }else {
            System.out.println("Index must be between 1 and" + (ToDoList.size() - 1));
        }
    }

    public void exitfromtodo(){                                        // exiting from programm
        System.out.println("Exiting from TodoList..."); 
        scanner.close();
        System.exit(0);

    
    }

    public void changestatus(){

    }


    public List<String> getMyList() {
        
        return ToDoList;  
    }

}   



