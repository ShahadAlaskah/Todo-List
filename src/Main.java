import java.util.ArrayList;
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

        int choice=in.nextInt();
        ArrayList <String> todoList=new ArrayList<>();

        while (choice != -1){
            if(choice==1){
                System.out.println("Enter your todo name :");
                String todoName=in.next();
                addTodo(todoName,todoList);

            } else if (choice==2) {
                System.out.println("Enter your todo name :");
                String todoName=in.next();
                deleteTodo(todoName,todoList);

            } else if (choice==3) {
                System.out.println("Enter the todo index that you want to replace :");
                int todoIndex=in.nextInt();
                System.out.println("Enter your todo name :");
                String todoName=in.next();
                updateTodo(todoName,todoIndex,todoList);

            }else {
                printTodo(todoList);
            }

            System.out.println("choose another choice\n" +
                    "\n" +
                    "-------");
            choice=in.nextInt();
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
        System.out.println(todoList);
    }
    public static void updateTodo(String todoName,int todoIndex,ArrayList<String> todoList){
        todoList.set(todoIndex,todoName);
        System.out.print("Your todo saved .. ");
    }
    public static void printTodo(ArrayList<String> todoList){
        System.out.println(todoList);
    }
}