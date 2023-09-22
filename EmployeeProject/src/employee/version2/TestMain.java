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
public class TestMain {
    public static void main(String[] args){
        Date temp = new Date();
        
        System.out.println("----------------------Hourly Employees:----------------------");
            HourlyEmployee hourEmp1 = new HourlyEmployee(1, "Hua Shui", temp, temp);
            HourlyEmployee hourEmp2 = new HourlyEmployee(2, "Cain Mk V", temp, temp, 42, 1);
            hourEmp1.setRatePerHour(1);
            hourEmp1.setTotalHoursWorked(40);

            hourEmp1.displayInfo();
            System.out.println(hourEmp2.toString() + "\nSalary: " + hourEmp2.computeSalary() + '\n');
        
        System.out.println("----------------------Piece Worker Employees:----------------------");
            PieceWorkerEmployee pieceEmp1 = new PieceWorkerEmployee(1, "Hua Shui", temp, temp);
            PieceWorkerEmployee pieceEmp2 = new PieceWorkerEmployee(2, "Cain Mk V", temp, temp, 100, 1);
            pieceEmp1.setTotalPiecesFinished(99);
            pieceEmp1.setRatePerPiece(1);
                    
            System.out.println(pieceEmp1.toString() + "\nSalary: " + pieceEmp1.computeSalary() + '\n');
            pieceEmp2.displayInfo();
    
        System.out.println("----------------------Commision Employees:----------------------");
            CommissionEmployee commEmp1 = new CommissionEmployee(1, "Hua Shui", temp, temp);
            CommissionEmployee commEmp2 = new CommissionEmployee(2, "Cain Mk V", temp, temp, 57000);
            CommissionEmployee commEmp3 = new CommissionEmployee(3, "Ori Verd", temp, temp, 690000);
            CommissionEmployee commEmp4 = new CommissionEmployee(4, "Maris Mischa", temp, temp, 1000000);
            commEmp1.setTotalSales(36000);

            System.out.println(commEmp1.toString() + "\nSalary: " + commEmp1.computeSalary() + '\n');
            commEmp2.displayInfo();
            commEmp3.displayInfo();
            commEmp4.displayInfo();

        System.out.println("----------------------Commision Employees:----------------------");
            BasePlusCommissionEmployee baseCommEmp1 = new BasePlusCommissionEmployee(1, "Hua Shui", temp, temp);
            BasePlusCommissionEmployee baseCommEmp2 = new BasePlusCommissionEmployee(2, "Cain Mk V", temp, temp, 57000, 42);
            BasePlusCommissionEmployee baseCommEmp3 = new BasePlusCommissionEmployee(3, "Ori Verd", temp, temp, 690000, 42);
            BasePlusCommissionEmployee baseCommEmp4 = new BasePlusCommissionEmployee(4, "Maris Mischa", temp, temp, 1000000, 42);
            baseCommEmp1.setTotalSales(36000);
            baseCommEmp1.setBaseSalary(45);

            System.out.println(baseCommEmp1.toString() + "Salary: " + baseCommEmp1.computeSalary() + '\n');
            baseCommEmp2.displayInfo();
            baseCommEmp3.displayInfo();
            baseCommEmp4.displayInfo();
    }
}