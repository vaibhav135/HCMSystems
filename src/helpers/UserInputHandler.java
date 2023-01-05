package helpers;

import java.util.ArrayList;
import java.util.Scanner;

import HCM.Department;
import HCM.Employee;

public class UserInputHandler {
    private ArrayList<Department> department;
    private ArrayList<Employee> employee;

    public UserInputHandler() {
        System.out.println("welcome user!!! ");
    }

    private void createDepartment() {
        String departmentName = "";
        String departmentId = "";

        while (departmentName.length() <= 0 || departmentId.length() <= 0) {
            System.out.println("       Please add name for you department: ");
            System.out.println("Please add 5 digit id for your department: ");

        }
    }

    private void addEmployee() {

    }

    private void caseHandler(String userInput) {
        switch (userInput) {
            case "1":
                createDepartment();
            case "2":
            case "3":
            case "4":
            case "5":
            case "6":
            default:
                System.out.println("\nYou haven't selected any option, please select one!!!");

        }
    }

    public void getUserInput() {
        System.out.println("Please select one of the option.");

        while (true) {
            System.out.println("  \ti)    Press 1 to create a department.");
            System.out.println(" \tii)   Press 2 to get the list of all the departments.");

            System.out.println("\tiii)  Press 3 to add an employee.");
            System.out.println(" \tiv)   Press 4 to get the list of all the employees.");

            System.out.println("  \tv)    Press q to quit.");

            System.out.print("\nyour input: ");

            Scanner optionInput = new Scanner(System.in);
            String userInput = optionInput.next();
            optionInput.close();

            if (userInput.equals("q")) {
                return;
            }

            caseHandler(userInput);
        }
    }

    // private void assignDepartment(Department department) {
    // this.department.add(department);
    // }

    // private void assignEmployee(Employee employee) {
    // this.employee.add(employee);
    // }
}
