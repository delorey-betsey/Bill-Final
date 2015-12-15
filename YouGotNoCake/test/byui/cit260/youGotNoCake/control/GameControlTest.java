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
//public class GameControlTest {
//    
//    public GameControlTest() {
//    }
//
//    /**
//     * Test of startGame method, of class ProgramControl.
//     */
//    @Test
//    public void testStartGame() {
//        /****************************
//         * * Test case #1 StartGame
//         * **************************/
//        System.out.println("startGame"); 
//        System.out.println("\tTest case #1");
//        
//        // input values for test case 
//        double gameID = 0.0;
//        
//        // expected output return value
//        double expResult = -1;
//        
//        //create instance of CalcGallons class
//        ProgramControl instance = new ProgramControl();
//        
//        // call function to run test
//        double result = instance.createNewGame(gameID);
//        
//        // compare expected return value with actual value returned
//        assertEquals(expResult, result, 0.0);
//    }
//        /**
//     * Test of restartGame method, of class ProgramControl.
//     */
//    @Test
//    public void testRestartGame() {
//    /****************************
//     * * Test case #1 RestartGame
//     * **************************/
//    System.out.println("restartGame"); 
//    System.out.println("\tTest case #1");
//
//    // input values for test case 
//    double gameID = 0.0;
//
//    // expected output return value
//    double expResult = -1;
//
//    //create instance of CalcGallons class
//    ProgramControl instance = new ProgramControl();
//
//    // call function to run test
//    double result = instance.createNewGame(gameID);
//
//    // compare expected return value with actual value returned
//    assertEquals(expResult, result, 0.0);
//}
//        /**
//     * Test of saveGame method, of class ProgramControl.
//     */
//    @Test
//    public void testSaveGame() {
//    /****************************
//     * * Test case #1 SaveGame
//     * **************************/
//    System.out.println("saveGame"); 
//    System.out.println("\tTest case #1");
//
//    // input values for test case 
//    double gameID = 0.0;
//
//    // expected output return value
//    double expResult = -1;
//
//    //create instance of CalcGallons class
//    ProgramControl instance = new ProgramControl();
//
//    // call function to run test
//    double result = instance.createNewGame(gameID);
//
//    // compare expected return value with actual value returned
//    assertEquals(expResult, result, 0.0);
//    }
//        /**
//     * Test of continueGame method, of class ProgramControl.
//     */
//    @Test
//    public void testContinueGame() {
//        /****************************
//         * * Test case #1 ContinueGame
//         * **************************/
//        System.out.println("continueGame"); 
//        System.out.println("\tTest case #1");
//        
//        // input values for test case 
//        double locationID = 0.0;
//        
//        // expected output return value
//        double expResult = -1;
//        
//        //create instance of ContinueGame class
//        ProgramControl instance = new ProgramControl();
//        
//        // call function to run test
//        double result = instance.createNewGame(locationID);
//        
//        // compare expected return value with actual value returned
//        assertEquals(expResult, result, 0.0);
//    }
//    /**
//     * Test of quitGame method, of class ProgramControl.
//     */
//    @Test
//    public void testQuitGame() {
//            /****************************
//         * * Test case #1 QuitGame
//         * **************************/
//        System.out.println("quitGame"); 
//        System.out.println("\tTest case #1");
//        
//        // input values for test case 
//        double gameStatus = 0.0;
//        
//        // expected output return value
//        double expResult = -1;
//        
//        //create instance of ContinueGame class
//        ProgramControl instance = new ProgramControl();
//        
//        // call function to run test
//        double result = instance.createNewGame(gameStatus);
//        
//        // compare expected return value with actual value returned
//        assertEquals(expResult, result, 0.0);
//    }
//}