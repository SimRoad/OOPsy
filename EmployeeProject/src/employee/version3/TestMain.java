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
public class TestMain {
    public static void main(String[] args){
        Date temp = new Date();
        Name test = new Name();
        
        
        System.out.println("----------------------Hourly Employees:----------------------");
            Name testName = new Name("Rey");
            HourlyEmployee hourEmp1 = new HourlyEmployee(1, testName, temp, temp);
            HourlyEmployee hourEmp2 = new HourlyEmployee(2, testName, temp, temp, 41, 1);
            hourEmp1.displayInfo();
            hourEmp1.setRatePerHour(1);
            hourEmp1.setTotalHoursWorked(40);

            hourEmp1.displayInfo();
            System.out.println(hourEmp2.toString() + "\nSalary: " + hourEmp2.computeSalary() + '\n');
        
        System.out.println("----------------------Piece Worker Employees:----------------------");
        Name pieceName = new Name("Joselito", "Misogynist");
            PieceWorkerEmployee pieceEmp1 = new PieceWorkerEmployee(1, pieceName, temp, temp);
            PieceWorkerEmployee pieceEmp2 = new PieceWorkerEmployee(2, pieceName, temp, temp, 100, 1);
            pieceEmp1.displayInfo();
            pieceEmp1.setTotalPiecesFinished(99);
            pieceEmp1.setRatePerPiece(1);

            System.out.println(pieceEmp1.toString() + "\nSalary: " + pieceEmp1.computeSalary() + '\n');
            pieceEmp2.displayInfo();
            
        System.out.println("----------------------Commision Employees:----------------------");
        Name commName = new Name("Rei", "Go", "Montanez");
            CommissionEmployee commEmp1 = new CommissionEmployee(1, commName, temp, temp);
            CommissionEmployee commEmp2 = new CommissionEmployee(2, commName, temp, temp, 57000);
            CommissionEmployee commEmp3 = new CommissionEmployee(3, commName, temp, temp, 690000);
            CommissionEmployee commEmp4 = new CommissionEmployee(4, commName, temp, temp, 1000000);
            commEmp1.setTotalSales(36000);

            System.out.println(commEmp1.toString() + "\nSalary: " + commEmp1.computeSalary() + '\n');
            commEmp2.displayInfo();
            commEmp3.displayInfo();
            commEmp4.displayInfo();
            
        System.out.println("----------------------Base Commision Employees:----------------------");
        Name baseName = new Name("Simone Mikaela", "Pates", "Montañez", "Lover of Women", "and Men too ig");
            BasePlusCommissionEmployee baseCommEmp1 = new BasePlusCommissionEmployee(1, baseName, temp, temp);
            BasePlusCommissionEmployee baseCommEmp2 = new BasePlusCommissionEmployee(2, baseName, temp, temp, 57000, 1000000);
            BasePlusCommissionEmployee baseCommEmp3 = new BasePlusCommissionEmployee(3, baseName, temp, temp, 690000, 1000000);
            BasePlusCommissionEmployee baseCommEmp4 = new BasePlusCommissionEmployee(4, baseName, temp, temp, 1000000, 100000);
            baseCommEmp1.setTotalSales(36000);
            baseCommEmp1.setBaseSalary(100000000);

            System.out.println(baseCommEmp1.toString() + "Salary: " + baseCommEmp1.computeSalary() + '\n');
            baseCommEmp2.displayInfo();
            baseCommEmp3.displayInfo();
            baseCommEmp4.displayInfo();
    }
}