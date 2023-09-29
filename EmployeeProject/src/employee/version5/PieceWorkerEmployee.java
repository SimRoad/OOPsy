/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee.version5;

import java.util.Date;

/**
 *
 * @author User
 */
public class PieceWorkerEmployee extends Employee {
    private int totalPiecesFinished;
    private float ratePerPiece;

    public PieceWorkerEmployee() {
    }

    public PieceWorkerEmployee(int totalPiecesFinished, float ratePerPiece) {
        this.totalPiecesFinished = totalPiecesFinished;
        this.ratePerPiece = ratePerPiece;
    }
    
    public PieceWorkerEmployee(int empID, Name empName, Date empDateHired, Date empBirthDate) {
        super(empID, empName, empDateHired, empBirthDate);
    }

    public PieceWorkerEmployee(int empID, Name empName, Date empDateHired, Date empBirthDate, int totalPiecesFinished, float ratePerPiece) {
        super(empID, empName, empDateHired, empBirthDate);
        this.totalPiecesFinished = totalPiecesFinished;
        this.ratePerPiece = ratePerPiece;
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
    
    public double computeSalary(){
        return this.computeSalary(this.totalPiecesFinished, this.ratePerPiece);
    }
    
    @Override
    public String toString() {
        return super.toString() + "\nTotal Pieces: " + this.totalPiecesFinished + "\nRate: " + this.ratePerPiece;
    }
    
    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.print(this.computeSalary() + "\n\n");
    }
    
}
