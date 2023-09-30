/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee.version6;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author user
 */
public class EmployeeRosterList {
    private ArrayList<Employee> roster;

    public EmployeeRosterList() {
        roster = new ArrayList<Employee>();
    }

    public EmployeeRosterList(ArrayList<Employee> roster) {
        this.roster = roster;
    }

    public ArrayList<Employee> getRoster() {
        return roster;
    }

    public void setRoster(ArrayList<Employee> roster) {
        this.roster = roster;
    }
    
    public void addEmp(Employee ...input){
        this.roster.addAll(Arrays.asList(input));
    }
    
    public Employee delEmp(int id){
        for (Employee emp : roster) {
            if (emp != null && emp.getEmpID() == id) {
                roster.remove(emp);
                return emp;
            }
        }
        
        return null;
    }
    
    public void displayAllEmployee(ArrayList<Employee> empList){
        String strFormat = "| %-5s | %-50s | %-30s | ";
        
        if(!empList.isEmpty()){
            System.out.println(String.format(strFormat + "%12s |", "ID", "Name", "Type", "Salary"));
            for(Employee emp : empList) {
                if (emp != null) {
                    System.out.println(String.format(strFormat + "%12.2f |", emp.getEmpID(), emp.getEmpName(), 
                        this.printEmpType(emp), emp.computeSalary()));
                }
            }
        } else {
            System.out.println("No Employees!");
        }
        
    }
    
    public void displayAllEmployee(){
        this.displayAllEmployee(roster);
    }
    
    public void displayEmpType(String type){
        String testType = type.toUpperCase();
        ArrayList<Employee> empTypeList = new ArrayList<>();
        
        for(Employee emp : roster){
            if(getInstance(emp).toUpperCase().equals(testType.replaceAll("\\s", ""))) {
                empTypeList.add(emp);
            }
        }
        
        this.displayAllEmployee(empTypeList);
    }
    
    public void updateEmp(int id, Name name){
        for(Employee emp : roster) {
            if (id == emp.getEmpID()) {
                emp.setEmpName(name);
            }
        }
    }
    
    public EmployeeRosterList searchEmp(String keyword){
        EmployeeRosterList empSearchList = new EmployeeRosterList();
        
        for(Employee emp : roster){
            if(emp.getEmpName().toString().toUpperCase().contains(keyword.toUpperCase())) {
                empSearchList.roster.add(emp);
            }
        }
        
        System.out.println("\nEmployees with the keyword: " + keyword);
        empSearchList.displayAllEmployee();
        
        return empSearchList;
    }
    
    public int countEmpType(String type){
        int countType = 0;
        String testType = type.toUpperCase();
        
        for(Employee emp : roster) {
            if(getInstance(emp).toUpperCase().equals(testType.replaceAll("\\s", ""))) {
                countType++;
            }
        }
        
        return countType;
    }
    
    //PRIVATE METHODS
    
    private String printEmpType(Employee emp){
        String type = "";
        if (emp instanceof HourlyEmployee) {
            type = "Hourly Employee";
        } else if (emp instanceof PieceWorkerEmployee) {
            type = "Piece Worker Employee";
        } else if (emp instanceof BasePlusCommissionEmployee) {
            type = "Base Plus Commission Employee";
        } else if(emp instanceof CommissionEmployee) {
            type = "Commission Employee";
        }
        
        return type;
    }
    
    private double getSalary(Employee emp) {
        double salary = 0;
        
        if (emp instanceof HourlyEmployee) {
            salary = ((HourlyEmployee) emp).computeSalary();
        } else if (emp instanceof PieceWorkerEmployee) {
            salary = ((PieceWorkerEmployee) emp).computeSalary();
        } else if (emp instanceof BasePlusCommissionEmployee) {
            salary = ((BasePlusCommissionEmployee) emp).computeSalary();
        } else if (emp instanceof CommissionEmployee) {
            salary = ((CommissionEmployee) emp).computeSalary();
        }

        return salary;
    }
    
    private double getEmpInfo(Employee emp) {
        double salary = 0;
        
        if (emp instanceof HourlyEmployee) {
            ((HourlyEmployee) emp).displayInfo();
        } else if (emp instanceof PieceWorkerEmployee) {
            ((PieceWorkerEmployee) emp).displayInfo();
        } else if (emp instanceof BasePlusCommissionEmployee) {
            ((BasePlusCommissionEmployee) emp).displayInfo();
        } else if (emp instanceof CommissionEmployee) {
            ((CommissionEmployee) emp).displayInfo();
        }

        return salary;
    }
    
    //Wanted to reuse printEmpType but it had spaces so >_>
    private String getInstance(Employee emp){
        String inst = this.printEmpType(emp).toUpperCase();
        return inst.replaceAll("\\s", "");
    }
}
