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
public class PieceWorkerEmployee {
    private int empID;
    private String empName;
    private Date empDateHired;
    private Date empBirthDate;
    private int totalPiecesFinished;
    private float ratePerPiece;

    public PieceWorkerEmployee() {
    }

    public PieceWorkerEmployee(int empID, String empName, Date empDateHired, Date empBirthDate) {
        this.empID = empID;
        this.empName = empName;
        this.empDateHired = empDateHired;
        this.empBirthDate = empBirthDate;
    }

    public PieceWorkerEmployee(int empID, String empName, Date empDateHired, Date empBirthDate, int totalPiecesFinished, float ratePerPiece) {
        this.empID = empID;
        this.empName = empName;
        this.empDateHired = empDateHired;
        this.empBirthDate = empBirthDate;
        this.totalPiecesFinished = totalPiecesFinished;
        this.ratePerPiece = ratePerPiece;
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

    public int getTotalPiecesFinished() {
        return totalPiecesFinished;
    }

    public void setTotalPiecesFinished(int totalPiecesFinished) {
        this.totalPiecesFinished = totalPiecesFinished;
    }

    public float getRatePerPiece() {
        return ratePerPiece;
    }

    public void setRatePerPiece(float ratePerPiece) {
        this.ratePerPiece = ratePerPiece;
    }
    
    public double computeSalary(int totalPieces, float rate){
        return (totalPieces * rate) + ((totalPieces / 100) * (rate * 10));
    }
    
    public double computeSalary(PieceWorkerEmployee emp){
        return this.computeSalary(emp.totalPiecesFinished, emp.ratePerPiece);
    }
    
    public double computeSalary(){
        return this.computeSalary(this.totalPiecesFinished, this.ratePerPiece);
    }
    
    public void displayInfo() {
        System.out.println(this.toString());
    }
    
    public void displayInfo(HourlyEmployee emp) {
        System.out.println(emp.toString());
    }

    @Override
    public String toString() {
        return String.format("ID: %d \nName: %s\nDate Hired: %s\nBirthday: %s\nFinished Pieces: %d\nPiece/Rate", this.empID, this.empName, this.getEmpDateHired(), this.getEmpBirthDate(), this.totalPiecesFinished, this.ratePerPiece);
    }
}
