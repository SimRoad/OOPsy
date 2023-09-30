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
public class TestMain {
    public static void main(String[] args){
        Date temp = new Date();
        Name test = new Name();
        EmployeeRosterList abcOrg = new EmployeeRosterList();
        
//        System.out.println("----------------------Hourly Employees:----------------------");
            Name testName = new Name("Rey");
            HourlyEmployee hourEmp1 = new HourlyEmployee(10001, testName, temp, temp);
            HourlyEmployee hourEmp2 = new HourlyEmployee(10002, testName, temp, temp, 41, 1);
            hourEmp1.setRatePerHour(1);
            hourEmp1.setTotalHoursWorked(40);
        
//        System.out.println("----------------------Piece Worker Employees:----------------------");
        Name pieceName = new Name("Joselito", "Misogynist");
            PieceWorkerEmployee pieceEmp1 = new PieceWorkerEmployee(20001, pieceName, temp, temp);
            PieceWorkerEmployee pieceEmp2 = new PieceWorkerEmployee(20002, pieceName, temp, temp, 100, 1);
            pieceEmp1.setTotalPiecesFinished(99);
            pieceEmp1.setRatePerPiece(1);
            
//        System.out.println("----------------------Commision Employees:----------------------");
        Name commName = new Name("Rei", "Go", "Montanez");
            CommissionEmployee commEmp1 = new CommissionEmployee(30001, commName, temp, temp);
            CommissionEmployee commEmp2 = new CommissionEmployee(30002, commName, temp, temp, 57000);
            CommissionEmployee commEmp3 = new CommissionEmployee(30003, commName, temp, temp, 690000);
            CommissionEmployee commEmp4 = new CommissionEmployee(30004, commName, temp, temp, 1000000);
            commEmp1.setTotalSales(36000);
            
//        System.out.println("----------------------Base Commision Employees:----------------------");
        Name baseName = new Name("Simone Mikaela", "Pates", "Montañez", "Lover of Women");
            BasePlusCommissionEmployee baseCommEmp1 = new BasePlusCommissionEmployee(40001, baseName, temp, temp);
            BasePlusCommissionEmployee baseCommEmp2 = new BasePlusCommissionEmployee(40002, baseName, temp, temp, 57000, 1000000);
            BasePlusCommissionEmployee baseCommEmp3 = new BasePlusCommissionEmployee(40003, baseName, temp, temp, 690000, 1000000);
            BasePlusCommissionEmployee baseCommEmp4 = new BasePlusCommissionEmployee(40004, baseName, temp, temp, 1000000, 100000);
            baseCommEmp1.setTotalSales(36000);
            baseCommEmp1.setBaseSalary(1);
            
        abcOrg.addEmp(hourEmp2, pieceEmp1, pieceEmp2, commEmp1, baseCommEmp1, baseCommEmp2, baseCommEmp3);
        abcOrg.displayAllEmployee();
        System.out.println(String.format("Number of Hourly Employees: %d", abcOrg.countEmpType("HourlyEmployee")));
        System.out.println(String.format("Number of Piece Worker Employee: %d", abcOrg.countEmpType("PieceWorkerEmployee")));
        System.out.println(String.format("Number of Commission Employee: %d", abcOrg.countEmpType("CommissionEmployee")));
        System.out.println(String.format("Number of Base Plus Commission Employee: %d\n\n", abcOrg.countEmpType("BasePlusCommissionEmployee")));
        
        Employee del = abcOrg.delEmp(40002);
        if(del != null){
            System.out.println("Deleted Emp 40002:");
            del.displayInfo();
        }
        del = abcOrg.delEmp(80002);
        if(del != null){
            System.out.println("Deleted Emp 80002:");
            del.displayInfo();
        }
        
        abcOrg.addEmp(commEmp2, commEmp3, commEmp4, baseCommEmp4);
        Name upd = new Name("Rain");
        abcOrg.updateEmp(30003, upd);
        abcOrg.displayAllEmployee();
        System.out.println(String.format("Number of Hourly Employees: %d", abcOrg.countEmpType("hourlyEmployee")));
        System.out.println(String.format("Number of Piece Worker Employee: %d", abcOrg.countEmpType("Piece WorkerEmployee")));
        System.out.println(String.format("Number of Commission Employee: %d", abcOrg.countEmpType("COMMISSIONemployee")));
        System.out.println(String.format("Number of Base Plus Commission Employee: %d\n\n", abcOrg.countEmpType("Base Plus Commission Employee")));
        
        abcOrg.searchEmp("S");
        abcOrg.searchEmp("lOVe");
        EmployeeRosterList search = abcOrg.searchEmp("re");
        search.displayAllEmployee();
        System.out.println("\n");
        abcOrg.displayEmpType("COMMISSIONemployee");
        abcOrg.displayEmpType("Freelance Employee");
    }
}
