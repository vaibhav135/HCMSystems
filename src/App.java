import java.util.ArrayList;
import java.util.Scanner;

import HCM.Department;
import HCM.Employee;
import helpers.UserInputHandler;

public class App {

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        UserInputHandler newUserInput = new UserInputHandler();

        // newUserInput.department = new ArrayList<Department>();
        // newUserInput.employee = new ArrayList<Employee>();

        newUserInput.getUserInput();
    }
}
