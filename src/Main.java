import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("==== Todo List ====\n" +
                "Enter Your choice or choose -1 to exit \n" +
                "1- To add to the todo list \n" +
                "2- To delete from the todo list \n" +
                "3- To update from the todo list \n" +
                "4- To print all the todos ");


        ArrayList <String> todoList=new ArrayList<>();
        int  choice=0;
        while (choice != -1){
           try {
               choice=in.nextInt();
                if (choice == 1) {
                    System.out.println("Enter your todo name :");
                    String todoName = in.next();
                    addTodo(todoName, todoList);

                } else if (choice == 2) {
                    if (todoList.size() != 0) {
                    System.out.println("Enter your todo name :");
                    String todoName = in.next();
                    deleteTodo(todoName, todoList);
                    }else {
                        System.out.println("Add to todo list first");
                    }

                } else if (choice == 3) {
                    if (todoList.size() != 0) {
                    System.out.println("Enter the todo index that you want to replace :");
                    try {
                        int todoIndex = in.nextInt();
                        System.out.println("Enter your todo name :");
                        String todoName = in.next();
                        updateTodo(todoName, todoIndex, todoList);
                    }catch (InputMismatchException e){
                        System.out.println("Please enter a valid number");
                        in.nextLine();
                    }
                    }else {
                        System.out.println("Add to todo list first");
                    }

                } else if (choice == 4){
                    printTodo(todoList);
                }else {
                    System.out.println("Please enter a valid number");
                }
           }catch (InputMismatchException e){
               System.out.println("Please enter a valid number"+choice);
               in.nextLine();
           }
            System.out.println("choose another choice\n" +
                    "\n" +
                    "-------");
        }
        System.out.println("program terminated , based on user input");
    }
    public static void addTodo(String todoName,ArrayList<String> todoList){
        todoList.add(todoName);
        System.out.print("Your todo saved .. ");
    }
    public static void deleteTodo(String todoName,ArrayList<String> todoList){
            todoList.remove(todoName);
            System.out.print("Your todo saved .. ");
    }
    public static void updateTodo(String todoName,int todoIndex,ArrayList<String> todoList){
        try {
        todoList.set(todoIndex,todoName);
        System.out.print("Your todo saved .. ");
        }catch (IndexOutOfBoundsException e){
                System.out.println("The todo index does not exist");
        }
    }
    public static void printTodo(ArrayList<String> todoList){
        System.out.println(todoList);
    }
}