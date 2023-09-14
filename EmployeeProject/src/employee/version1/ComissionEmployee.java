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
public class ComissionEmployee {
    private int empID;
    private String empName;
    private Date empDateHired;
    private Date empBirthDate;
    private double totalSales;

    public ComissionEmployee() {
    }

    public ComissionEmployee(int empID, String empName, Date empDateHired, Date empBirthDate) {
        this.empID = empID;
        this.empName = empName;
        this.empDateHired = empDateHired;
        this.empBirthDate = empBirthDate;
    }

    public ComissionEmployee(int empID, String empName, Date empDateHired, Date empBirthDate, double totalSales) {
        this.empID = empID;
        this.empName = empName;
        this.empDateHired = empDateHired;
        this.empBirthDate = empBirthDate;
        this.totalSales = totalSales;
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

    public double getTotalSales() {
        return totalSales;
    }

    public void setTotalSales(double totalSales) {
        this.totalSales = totalSales;
    }
    
    public double computeSalary(){
        double totSales = this.totalSales;
        double percentage = 0.0;
        
        if(totSales > 0){
            if(totSales < 50000){
                percentage = 0.05;
            } else if(totSales < 100000) {
                percentage = 0.2;            
            } else if(totSales < 500000) {
                percentage = 0.3;            
            } else {
                percentage = 0.5;            
            }
        }
        
        return totSales * percentage;
    }
    
        public void displayInfo() {
        System.out.println(this.toString());
    }
    
    public void displayInfo(HourlyEmployee emp) {
        System.out.println(emp.toString());
    }

    @Override
    public String toString() {
        return "Employee ID: " + empID + "\nName: " + empName + "\nDate Hired: " + this.getEmpDateHired()
                + "\nBirthday: " + this.getEmpBirthDate() + "\nTotal Sales: " + totalSales + "\n";
    }

    
}
