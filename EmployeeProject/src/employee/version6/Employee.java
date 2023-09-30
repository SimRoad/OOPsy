/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee.version6;

import java.util.Date;

/**
 *
 * @author User
 */
public abstract class Employee {
    private int empID;
    private Name empName = new Name();
    private Date empDateHired;
    private Date empBirthDate;

    public Employee() {
        this.empID = -1;
        Date defDate = new Date(1, 1, 1);
        this.empBirthDate = defDate;
        this.empDateHired = defDate;
    }

    public Employee(int empID, Name empName, Date empDateHired, Date empBirthDate) {
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

    public Name getEmpName() {
        return empName;
    }

    public void setEmpName(Name empName) {
        this.empName = empName;
    }

    public String getEmpDateHired() {
        return String.format("%td-%tm-20%ty", this.empDateHired, this.empDateHired, this.empDateHired);
    }

    public void setEmpDateHired(Date empDateHired) {
        this.empDateHired = empDateHired;
    }

    public String getEmpBirthDate() {
        return String.format("%td-%tm-20%ty", this.empDateHired, this.empDateHired, this.empDateHired);
    }

    public void setEmpBirthDate(Date empBirthDate) {
        this.empBirthDate = empBirthDate;
    }
    
    @Override
    public String toString() {
        return "Employee ID: " + empID + "\nName: " + empName.toString() + "\nDate Hired: " 
                + this.getEmpDateHired() + "\nBirthday: " + this.getEmpBirthDate();
    }
    
    public void displayInfo() {
        System.out.print(this.toString() + "\nSalary: ");
    }
    
    public abstract double computeSalary();
}
