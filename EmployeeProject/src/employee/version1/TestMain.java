/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee.version1;

import java.util.Date;

/**
 *
 * @author user
 */
public class TestMain {
    public static void main(String[] args){
        Date tempDate = new Date();
        
        System.out.println("----------------------Hourly Employees:----------------------");
            HourlyEmployee hourEmp1 = new HourlyEmployee();
            HourlyEmployee hourEmp2 = new HourlyEmployee(1, "Jeshwin Laude", tempDate, tempDate);
            hourEmp2.setRatePerHour(50);
            hourEmp2.setTotalHoursWorked(41);
            HourlyEmployee hourEmp3 = new HourlyEmployee(2, "Honiria Lew", tempDate, tempDate, 40, 50);

            System.out.println(hourEmp1.toString());
            System.out.println(hourEmp2.toString() + "\nSalary: " + hourEmp2.computeSalary() + "\n");
            System.out.println(hourEmp3.toString() + "\nSalary: " + hourEmp3.computeSalary() + "\n");
        
        System.out.println("----------------------Commission----------------------");
            ComissionEmployee commEmp1 = new ComissionEmployee();
            commEmp1.setTotalSales(36000);
            ComissionEmployee commEmp2 = new ComissionEmployee(1, "Jeshwin Laude", tempDate, tempDate);
            commEmp2.setTotalSales(69000);
            ComissionEmployee commEmp3 = new ComissionEmployee(2, "Honiria Lew", tempDate, tempDate, 130000);
            ComissionEmployee commEmp4 = new ComissionEmployee(3, "Judith Senn", tempDate, tempDate, 530000);

            System.out.println(commEmp1.toString() + "\nSalary: " + commEmp1.computeSalary() + "\n");
            System.out.println(commEmp2.toString() + "\nSalary: " + commEmp2.computeSalary() + "\n");
            System.out.println(commEmp3.toString() + "\nSalary: " + commEmp3.computeSalary() + "\n");
            System.out.println(commEmp4.toString() + "\nSalary: " + commEmp4.computeSalary() + "\n");

        System.out.println("----------------------Commission----------------------");
            BasePlusComissionEmployee baseCommEmp1 = new BasePlusComissionEmployee();
            baseCommEmp1.setTotalSales(36000);
            BasePlusComissionEmployee baseCommEmp2 = new BasePlusComissionEmployee(1, "Jeshwin Laude", tempDate, tempDate);
            baseCommEmp2.setTotalSales(69000);
            baseCommEmp2.setBaseSalary(1000000);
            BasePlusComissionEmployee baseCommEmp3 = new BasePlusComissionEmployee(2, "Honiria Lew", tempDate, tempDate, 130000, 1000000);
            BasePlusComissionEmployee baseCommEmp4 = new BasePlusComissionEmployee(3, "Judith Senn", tempDate, tempDate, 530000, 1000000);

            System.out.println(baseCommEmp1.toString() + "\nSalary: " + baseCommEmp1.computeSalary() + "\n");
            System.out.println(baseCommEmp2.toString() + "\nSalary: " + baseCommEmp2.computeSalary() + "\n");
            System.out.println(baseCommEmp3.toString() + "\nSalary: " + baseCommEmp3.computeSalary() + "\n");
            System.out.println(baseCommEmp4.toString() + "\nSalary: " + baseCommEmp4.computeSalary() + "\n");          
        
    }
}
