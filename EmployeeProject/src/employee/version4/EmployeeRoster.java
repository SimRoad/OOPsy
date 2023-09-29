/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee.version4;

/**
 *
 * @author user
 */
public class EmployeeRoster {
    private Employee[] roster;
    private int count;
    private int MAX = 10;

    public EmployeeRoster() {
        roster = new Employee[MAX];
    }
    
    public EmployeeRoster(int MAX) {
        roster = new Employee[MAX];
        this.MAX = MAX;
    }

    public EmployeeRoster(Employee[] rosterSent) {
        this.roster = rosterSent;
    }

    public Employee[] getRoster() {
        return roster;
    }

    public void setRoster(Employee[] rosterSent) {
        this.roster = rosterSent;
    }

    public int getCount() {
        return count;
    }

    public int getMAX() {
        return MAX;
    }

    public void setMAX(int MAX) {
        this.MAX = MAX;
    }
    
    public void addEmp(Employee ...input){
        int x = count, y = 0;
        
        if((MAX - count) > input.length){
            for(; x < MAX && y < input.length; this.count++){
            roster[x++] = input[y++];
            }
        }
    }
    
    public Employee delEmp(int id){
        Employee retVal = new Employee();
        int x;
        
        for(x = 0; x < count && roster[x].getEmpID() != id; x++){}
        
        if(x < count){
            retVal = roster[x];
            for(;x < (count - 1); x++){
                roster[x] = roster[x + 1];
            }
            this.count--;
        }
        
        return retVal;
    }
    
    public void displayAllEmployee(Employee[] empList, int count){
        String strFormat = "| %-5s | %-50s | %-30s | ";
        
        if(count > 0){
            System.out.println(String.format("\n" + strFormat + "%12s |", "ID", "Name", "Type", "Salary"));
            for(int x = 0; x < count; x++){
                System.out.println(String.format(strFormat + "%12.2f |", empList[x].getEmpID(), empList[x].getEmpName(), 
                        this.printEmpType(empList[x]), this.getSalary(empList[x])));
            }
        } else {
            System.out.println("No Employees");
        }
        
    }
    
    public void displayAllEmployee(){
        this.displayAllEmployee(roster, count);
    }
    
    public void displayEmpType(String type){
        String testType = type.toUpperCase();
        int x, y = 0, MAX = this.countEmpType(type);
        Employee[] empTypeList = new Employee[MAX];
        
        for(x = 0; x < count; x++){
            if(getInstance(roster[x]).equals(testType.replaceAll("\\s", ""))) {
                empTypeList[y++] = roster[x];
            }
        }
        
        this.displayAllEmployee(empTypeList, MAX);
    }
    
    public void updateEmp(int id, Name name){
        int x;
        
        for(x = 0; x < count && roster[x].getEmpID() != id; x++){}
        
        if(x < count){
            roster[x].setEmpName(name);
        }
    }
    
    public Employee[] searchEmp(String keyword){
        int x, keyCount = 0;
        Employee[] keyList = new Employee[MAX];
        
        for(x = 0; x < count; x++){
            if(roster[x].getEmpName().toString().toUpperCase().contains(keyword.toUpperCase())){
                keyList[keyCount++] = roster[x];
            }
        }
        
        System.out.println("\nEmployees with the keyword: " + keyword);
        this.displayAllEmployee(keyList, keyCount);
        
        return keyList;
    }
    
    public int countEmpType(String type){
        int countType = 0;
        String testType = type.toUpperCase();
        for(int x = 0; x < count; x++){
            if(getInstance(roster[x]).equals(testType.replaceAll("\\s", ""))) {
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
