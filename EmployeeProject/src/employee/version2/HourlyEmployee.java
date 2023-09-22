/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee.version2;

import java.util.Date;

/**
 *
 * @author User
 */
public class HourlyEmployee extends Employee {
    private float totalHoursWorked;
    private float ratePerHour;
    
    public HourlyEmployee() {
        
    }

    public HourlyEmployee(int empID, String empName, Date empDateHired, Date empBirthDate) {
        super(empID, empName, empDateHired, empBirthDate);
    }

    public HourlyEmployee(int empID, String empName, Date empDateHired, Date empBirthDate, float totalHoursWorked, float ratePerHour) {
        super(empID, empName, empDateHired, empBirthDate);
        this.totalHoursWorked = totalHoursWorked;
        this.ratePerHour = ratePerHour;
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
    
    public double computeSalary(){
        return this.computeSalary(this.totalHoursWorked, this.ratePerHour);
    }
    
    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.print(this.computeSalary() + "\n\n");
    }

    @Override
    public String toString() {
        return super.toString() + "\nTotal Hours: " + this.totalHoursWorked + "\nRate: " + this.ratePerHour;
    }
    
    
}
