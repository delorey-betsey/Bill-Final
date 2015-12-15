/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.youGotNoCake.control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Betsey
 */
public class ListsControlTest {
    
    public ListsControlTest() {
    }

    /**
     * Test of countItemsFound method, of class ListsControl.
     */
    @Test
    public void testCountItemsFound() {
        /****************************
         * * Test case #1 CountItemsFound
         * **************************/
        System.out.println("countItemsFound");
        System.out.println("\tTest case #1");
        
        // input values for test case
        double numItemsFound = 0.0;
        
        // expected output return value
        double expResult = 0.0;
        
        //create instance of CountItemsFound class
        ListsControl instance = new ListsControl();
        
        // call function to run test
        double result = instance.countItemsFound(numItemsFound);
        
        // compare expected return value with actual value returned
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of returnListStatus method, of class ListsControl.
     */
    @Test
    public void testReturnListStatus() {
        System.out.println("returnListStatus");
        double numItemsFound = 0.0;
        ListsControl instance = new ListsControl();
        double expResult = 0.0;
        double result = instance.returnListStatus(numItemsFound);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of loadListWin method, of class ListsControl.
     */
    @Test
    public void testLoadListWin() {
        System.out.println("loadListWin");
        double locationID = 0.0;
        ListsControl instance = new ListsControl();
        double expResult = 0.0;
        double result = instance.loadListWin(locationID);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
