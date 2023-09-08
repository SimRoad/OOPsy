/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee.version1;

import java.util.Date;

/**
 *
 * @author User
 */
public class HourlyEmployee {
    private int empID;
    private String empName;
    private Date empDateHired;
    private Date empBirthDate;
    private float totalHoursWorked;
    private float ratePerHour;

    public HourlyEmployee() {
    }

    public HourlyEmployee(int empID, String empName, Date empDateHired, Date empBirthDate, float totalHoursWorked, float ratePerHour) {
        this.empID = empID;
        this.empName = empName;
        this.empDateHired = empDateHired;
        this.empBirthDate = empBirthDate;
        this.totalHoursWorked = totalHoursWorked;
        this.ratePerHour = ratePerHour;
    }

    public HourlyEmployee(int empID, String empName, Date empDateHired, Date empBirthDate) {
        this.empID = empID;
        this.empName = empName;
        this.empDateHired = empDateHired;
        this.empBirthDate = empBirthDate;
    }

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpDateHired() {
        return String.format("%td-%tm-20%ty", this.empDateHired, this.empDateHired, this.empDateHired);
    }

    public void setEmpDateHired(Date empDateHired) {
        this.empDateHired = empDateHired;
    }

    public String getEmpBirthDate() {
        return String.format("%td-%tm-20%ty", this.empBirthDate, this.empBirthDate, this.empBirthDate);
    }

    public void setEmpBirthDate(Date empBirthDate) {
        this.empBirthDate = empBirthDate;
    }

    public float getTotalHoursWorked() {
        return totalHoursWorked;
    }

    public void setTotalHoursWorked(float totalHoursWorked) {
        this.totalHoursWorked = totalHoursWorked;
    }

    public float getRatePerHour() {
        return ratePerHour;
    }

    public void setRatePerHour(float ratePerHour) {
        this.ratePerHour = ratePerHour;
    }
    
    public double computeSalary(float hoursWorked, float rate){
        double workHours = 8 * 5; //hours per day * days per week. In case the company needs to change their work hours
        double salary = 0.0;
        
        if(hoursWorked > workHours){
            double overtime = hoursWorked - workHours;
            hoursWorked -= overtime;
            salary += overtime * (rate * 1.5);
        }
        
        salary += hoursWorked * rate;
        return salary;
    }
    
    public double computeSalary(HourlyEmployee emp){
        return this.computeSalary(emp.totalHoursWorked, emp.ratePerHour);
    }
    
    public double computeSalary(){
        return this.computeSalary(this.totalHoursWorked, this.ratePerHour);
    }
    
    public void displayInfo() {
        System.out.println(this.toString());
    }
    
    public void displayInfo(HourlyEmployee emp) {
        System.out.println(emp.toString());
    }

    @Override
    public String toString() {
        return String.format("ID: %d \nName: %s\nDate Hired: %s\nBirthday: %s\nTotal hours worked: %.2f\nRate/Hour: %.2f", this.empID, this.empName, this.getEmpDateHired(), this.getEmpBirthDate(), this.totalHoursWorked, this.ratePerHour);
    }
    
        public static void main(String[] args){
            Date test = new Date();
            HourlyEmployee Emp = new HourlyEmployee(1, "Jane Doe", test, test, 40, 5550);
            
            Emp.displayInfo();
            //System.out.println(Emp.toString());
        }
}
