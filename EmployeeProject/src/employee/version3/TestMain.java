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
            HourlyEmployee hourEmp1 = new HourlyEmployee(1, "Hua Shui", temp, temp);
            HourlyEmployee hourEmp2 = new HourlyEmployee(2, "Cain Mk V", temp, temp, 42, 1);
            hourEmp1.displayInfo();
            hourEmp1.setRatePerHour(1);
            hourEmp1.setTotalHoursWorked(40);

            hourEmp1.displayInfo();
            System.out.println("Salary: " + hourEmp1.computeSalary() + '\n');
            System.out.println(hourEmp2.toString() + "\nSalary: " + hourEmp2.computeSalary() + '\n');
        
        /*System.out.println("----------------------Piece Worker Employees:----------------------");
            PieceWorkerEmployee pieceEmp1 = new PieceWorkerEmployee(1, "Hua Shui", temp, temp);
            PieceWorkerEmployee pieceEmp2 = new PieceWorkerEmployee(2, "Cain Mk V", temp, temp, 100, 1);
            pieceEmp1.displayInfo();
            pieceEmp1.setTotalPiecesFinished(99);
            pieceEmp1.setRatePerPiece(1);

            pieceEmp1.displayInfo();
            System.out.println("Salary: " + pieceEmp1.computeSalary() + '\n');
            System.out.println(pieceEmp2.toString() + "\nSalary: " + pieceEmp2.computeSalary() + '\n');
    
        System.out.println("----------------------Commision Employees:----------------------");
            CommissionEmployee commEmp1 = new CommissionEmployee(1, "Hua Shui", temp, temp);
            CommissionEmployee commEmp2 = new CommissionEmployee(2, "Cain Mk V", temp, temp, 57000);
            CommissionEmployee commEmp3 = new CommissionEmployee(3, "Ori Verd", temp, temp, 690000);
            CommissionEmployee commEmp4 = new CommissionEmployee(4, "Maris Mischa", temp, temp, 1000000);

            commEmp1.displayInfo();
            commEmp1.setTotalSales(36000);

            commEmp1.displayInfo();
            System.out.println("Salary: " + commEmp1.computeSalary() + '\n');
            System.out.println(commEmp2.toString() + "\nSalary: " + commEmp2.computeSalary() + '\n');
            System.out.println(commEmp3.toString() + "\nSalary: " + commEmp3.computeSalary() + '\n');
            System.out.println(commEmp4.toString() + "\nSalary: " + commEmp4.computeSalary() + '\n');

        System.out.println("----------------------Commision Employees:----------------------");
            BasePlusCommissionEmployee baseCommEmp1 = new BasePlusCommissionEmployee(1, "Hua Shui", temp, temp);
            BasePlusCommissionEmployee baseCommEmp2 = new BasePlusCommissionEmployee(2, "Cain Mk V", temp, temp, 57000, 42);
            BasePlusCommissionEmployee baseCommEmp3 = new BasePlusCommissionEmployee(3, "Ori Verd", temp, temp, 690000, 42);
            BasePlusCommissionEmployee baseCommEmp4 = new BasePlusCommissionEmployee(4, "Maris Mischa", temp, temp, 1000000, 42);
            baseCommEmp1.displayInfo();
            baseCommEmp1.setTotalSales(36000);
            baseCommEmp1.setBaseSalary(45);

            baseCommEmp1.displayInfo();
            System.out.println("Salary: " + baseCommEmp1.computeSalary() + '\n');
            System.out.println(baseCommEmp2.toString() + "\nSalary: " + baseCommEmp2.computeSalary() + '\n');
            System.out.println(baseCommEmp3.toString() + "\nSalary: " + baseCommEmp3.computeSalary() + '\n');
            System.out.println(baseCommEmp4.toString() + "\nSalary: " + baseCommEmp4.computeSalary() + '\n');*/
    }
}