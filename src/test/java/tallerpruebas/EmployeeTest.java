/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package tallerpruebas;
import org.junit.Test;
import static org.junit.Assert.*;
import static tallerpruebas.EmployeeType.Manager;
import static tallerpruebas.EmployeeType.Supervisor;
import static tallerpruebas.EmployeeType.Worker;


public class EmployeeTest {

    
    Employee worker = new Employee(1500, "USD", 8, Worker);
    Employee supervisor = new Employee(2500, "USD", 9, Supervisor);
    Employee manag = new Employee(5000, "USD", 10, Manager);
    
    Employee europeanManager = new Employee(4500, "EUR", 15, Manager);

    /**
     * Test of cs method, of class Employee.
     */
    
    
    @Test
    public void testCsWorker() {
        System.out.println("cs");
        Employee instance = worker;
        float expResult = 1564.3F;
        float result = instance.cs();
        assertNotNull(result);
        assertEquals(expResult, result, 1);
        
    }
    
    @Test
    public void testCsSupervisor() {
        System.out.println("cs");
        Employee instance = supervisor;
        float expResult = 2567.5F;
        float result = instance.cs();
        assertNotNull(result);
        assertEquals(expResult, result, 1);
        
    }
    
    @Test
    public void testCsManager() {
        System.out.println("cs");
        Employee instance = manag;
        float expResult = 5071.3F;
        float result = instance.cs();
        assertNotNull(result);
        assertEquals(expResult, result, 1);
        
    }
    
    @Test
    public void testCsEuropean() {
        System.out.println("cs");
        Employee instance = europeanManager;
        float expResult = 4349.9F;
        float result = instance.cs();
        assertNotNull(result);
        assertEquals(expResult, result, 1);
        
    }
    
    @Test
    public void testCsFebruary() {
        System.out.println("cs");
        Employee instance = manag;
        float expResult = 5007F;
        float result = instance.cs();
        assertNotNull(result);
        assertEquals(expResult, result, 1);
        
    }

    /**
     * Test of CalculateYearBonus method, of class Employee.
     */
    
    @Test
    public void testCalculateYearBonusWorker() {
        System.out.println("CalculateYearBonus");
        Employee instance = worker;
        float expResult = 386.0F;
        float result = instance.CalculateYearBonus();
        assertEquals(expResult, result, 0);
        
    }
    
    
    @Test
    public void testCalculateYearBonusSupervisor() {
        System.out.println("CalculateYearBonus");
        Employee instance = supervisor;
        float expResult = 2693F;
        float result = instance.CalculateYearBonus();
        assertEquals(expResult, result, 0);
        
    }
    
    
    
    @Test
    public void testCalculateYearBonusManager() {
        System.out.println("CalculateYearBonus");
        Employee instance = manag;
        float expResult = 5386F;
        float result = instance.CalculateYearBonus();
        assertEquals(expResult, result, 0);
        
    }
    
    @Test
    public void testCalculateYearEuropean() {
        System.out.println("CalculateYearBonus");
        Employee instance = europeanManager;
        float expResult = 4661F;
        float result = instance.CalculateYearBonus();
        assertEquals(expResult, result, 0);
        
    }
    
}
