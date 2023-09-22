/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee.version3;

import java.util.Date;

/**
 *
 * @author User
 */
public class CommissionEmployee extends Employee {
    private double totalSales;

    public CommissionEmployee() {
    }

    public CommissionEmployee(double totalSales) {
        this.totalSales = totalSales;
    }
    
    public CommissionEmployee(int empID, Name empName, Date empDateHired, Date empBirthDate) {
        super(empID, empName, empDateHired, empBirthDate);
    }

    public CommissionEmployee(int empID, Name empName, Date empDateHired, Date empBirthDate, double totalSales) {
        super(empID, empName, empDateHired, empBirthDate);
        this.totalSales = totalSales;
    }

    public double getTotalSales() {
        return totalSales;
    }

    public void setTotalSales(double totalSales) {
        this.totalSales = totalSales;
    }
    
    public double computeSalary(double totSales){
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
    
    public double computeSalary(){
        return this.computeSalary(this.totalSales);
    }
    
    @Override
    public String toString() {
        return super.toString() + "\nTotal Sales: " + this.totalSales + '\n';
    }
    
    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.print(this.computeSalary() + "\n\n");
    }
    
    
}
