///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package byui.cit260.youGotNoCake.control;
//
//import org.junit.Test;
//import static org.junit.Assert.*;
//
///**
// *
// * @author Betsey
// */
//public class LocationControlTest {
//    
//    public LocationControlTest() {
//    }
//
//    /**
//     * Test of receivePlayerChoice method, of class LocationControl.
//     */
//    @Test
//    public void testReceivePlayerChoice() {
//        /****************************
//         * * Test case #1 ReceivePlayerChoice
//        ****************************/
//        System.out.println("receivePlayerChoice");
//        System.out.println("\tTest case #1");
//        
//        // input values for test case 
//        double locationID = 0.0;
//        
//        // expected output return value
//        double expResult = -1;
//        
//        //create instance of CalcGallons class
//        LocationControl instance = new LocationControl();
//        
//        // call function to run test
//        double result = instance.receivePlayerChoice(locationID);
//        
//        // compare expected return value with actual value returned
//        assertEquals(expResult, result, 0.0);
//    }
//    /**
//     * Test of loadLocation method, of class LocationControl.
//     */
//    @Test
//    public void testLoadLocation() {
//        /****************************
//         * * Test case #1 LoadLocation
//         * **************************/
//        System.out.println("loadLocation");
//        System.out.println("\tTest case #1");
//        
//        // input values for test case 
//        double locationID = 0.0;
//        
//        // expected output return value
//        double expResult = -1;
//        
//        //create instance of LoadLocation class
//        LocationControl instance = new LocationControl();
//        
//        // call function to run test
//        double result = instance.loadLocation(locationID);
//        
//        // compare expected return value with actual value returned
//        
//        assertEquals(expResult, result, 0.0);
//        
//    }
//
//    /**
//     * Test of evalActionFlag method, of class LocationControl.
//     */
//    @Test
//    public void testEvalActionFlag() {
//        /****************************
//         * * Test case #1 evalActionFlag
//         * **************************/
//        System.out.println("evalActionFlag");
//        System.out.println("\tTest case #1");
//        
//        // input values for test case 
//        double locationID = 0.0;
//        
//        // expected output return value
//        double expResult = -1;
//        
//        //create instance of evalActionFlag class
//        LocationControl instance = new LocationControl();
//        
//        // call function to run test
//        double result = instance.evalActionFlag(locationID);
//        
//        // compare expected return value with actual value returned
//         
//    }
//
//    /**
//     * Test of storeItem method, of class LocationControl.
//     */
//    @Test
//    public void testStoreItem() {
//        /****************************
//         * * Test case #1 ContinueGame
//         * **************************/
//        System.out.println("storeItem");
//        System.out.println("\tTest case #1");
//        
//        // input values for test case 
//        double foundFlag = 0.0;
//        
//        // expected output return value
//        double expResult = -1;
//        
//        //create instance of ContinueGame class
//        LocationControl instance = new LocationControl();
//        
//        // call function to run test
//        double result = instance.storeItem(foundFlag);
//        
//        // compare expected return value with actual value returned
//        assertEquals(expResult, result, 0.0);
//    } 
//
//    /**
//     * Test of setVisitedFlag method, of class LocationControl.
//     */
//    @Test
//    public void testSetVisitedFlag() {
//        /****************************
//         * * Test case #1 setVisitedFlag
//         * **************************/
//        System.out.println("setVisitedFlag");
//        System.out.println("\tTest case #1");
//        
//        // input values for test case 
//        double locationID = 0.0;
//        double visitedFlag = 0.0;
//        
//        // expected output return value
//        double expResult = -1;
//        
//        //create instance of ContinueGame class
//        LocationControl instance = new LocationControl();
//        
//        // call function to run test
//        double result = instance.setVisitedFlag(locationID, visitedFlag);
//        
//        // compare expected return value with actual value returned
//        assertEquals(expResult, result, 0.0);        
//    }    
//}
