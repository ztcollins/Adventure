///////////////////////// TOP OF FILE COMMENT BLOCK ////////////////////////////
//
// Title:           A text based adventure program.
// Course:          CS200 Fall 2020
//
// Author:          Zachary Collins
// Email:           ztcollins@wisc.edu
// Lecturer's Name: Jim Williams
//
///////////////////////////////// CITATIONS ////////////////////////////////////
//
// Source or Recipient; Description
// Examples:
// Jim Williams; created the program to write on
// 
//
/////////////////////////////// 80 COLUMNS WIDE ////////////////////////////////

import java.util.Arrays;

/**
 * This contains testing methods for the Adventure program.
 */
public class TestAdventure {

    /**
     * Uncomment testing methods to have them run.
     * @param args unused
     */
    public static void main(String[] args) {
        testParseCoordinates();
        testParseFields();
        testDetermineLocation();
        //testEnter();

        //TODO add tests and testing methods
    }

    /**
     * Tests for the parseCoordinates method.
     */
    private static void testParseCoordinates() {
        boolean error = false;

        {   //example test:
            String coordinateString = "8,6";
            int [] expected = new int[]{8,6};
            int [] actual = Adventure.parseCoordinates(coordinateString);
            if ( !Arrays.equals(expected,actual)) {
                System.out.println("testParseCoordinates 1) Expected: " + Arrays.toString( expected)
                        + " Actual: " + Arrays.toString( actual));
                error = true;
            }
        }

        {   //test 2:
            String coordinateString = "12, 9";
            int [] expected = new int[]{12,9};
            int [] actual = Adventure.parseCoordinates(coordinateString);
            if ( !Arrays.equals(expected,actual)) {
                System.out.println("testParseCoordinates 2) Expected: " + Arrays.toString( expected)
                        + " Actual: " + Arrays.toString( actual));
                error = true;
            }
        }
        
        {   //test 3:
            String coordinateString = "";
            int [] expected = null;
            int [] actual = Adventure.parseCoordinates(coordinateString);
            if ( !Arrays.equals(expected,actual)) {
                System.out.println("testParseCoordinates 3) Expected: " + Arrays.toString( expected)
                        + " Actual: " + Arrays.toString( actual));
                error = true;
            }
        }
        
        {   //test 4:
            String coordinateString = "public class...";
            int [] expected = null;
            int [] actual = Adventure.parseCoordinates(coordinateString);
            if ( !Arrays.equals(expected,actual)) {
                System.out.println("testParseCoordinates 4) Expected: " + Arrays.toString( expected)
                        + " Actual: " + Arrays.toString( actual));
                error = true;
            }
        }
        //Additional tests for testParseCoordinates


        if ( error) {
            System.out.println("Error in testParseCoordinates.");
        } else {
            System.out.println("All tests in testParseCoordinates passed.");
        }
    }
    
    private static void testParseFields() {
        boolean error = false;

        {   //test 1:
            String fieldString = "size/This is the size of the map//";
            String [] expected = new String[]{"size","This is the size of the map","",""};
            String [] actual = Adventure.parseFields(fieldString);
            if ( !Arrays.equals(expected,actual)) {
                System.out.println("testParseFields 1) Expected: " + Arrays.toString( expected)
                        + " Actual: " + Arrays.toString( actual));
                error = true;
            }
        }
        
        {   //test 2:
            String fieldString = " //  /";
            String [] expected = new String[]{"","","",""};
            String [] actual = Adventure.parseFields(fieldString);
            if ( !Arrays.equals(expected,actual)) {
                System.out.println("testParseFields 2) Expected: " + Arrays.toString( expected)
                        + " Actual: " + Arrays.toString( actual));
                error = true;
            }
        }
        
        {   //test 3:
            String fieldString = "*";
            String [] expected = new String[]{"*"};
            String [] actual = Adventure.parseFields(fieldString);
            if ( !Arrays.equals(expected,actual)) {
                System.out.println("testParseFields 3) Expected: " + Arrays.toString( expected)
                        + " Actual: " + Arrays.toString( actual));
                error = true;
            }
        }



        if ( error) {
            System.out.println("Error in testParseFields.");
        } else {
            System.out.println("All tests in testParseFields passed.");
        }
    }
    
    private static void testDetermineLocation() {
        boolean error = false;

        {   //test 1:
            String direction = Config.MOVE_LEFT;
            int [] current = new int[] {3, 3};
            int [] expected = new int[]{3, 2};
            int [] actual = Adventure.determineLocation(new String [7][4][], current, direction);
            if ( !Arrays.equals(expected,actual)) {
                System.out.println("testDetermineLocation 1) Expected: " + Arrays.toString( expected)
                        + " Actual: " + Arrays.toString( actual));
                error = true;
            }
        }
        
        {   //test 2:
            String direction = Config.MOVE_RIGHT;
            int [] current = new int[] {3, 3};
            int [] expected = new int[]{3, 4};
            int [] actual = Adventure.determineLocation(new String [7][4][], current, direction);
            if ( !Arrays.equals(expected,actual)) {
                System.out.println("testDetermineLocation 2) Expected: " + Arrays.toString( expected)
                        + " Actual: " + Arrays.toString( actual));
                error = true;
            }
        }
        
        {   //test 3:
            String direction = Config.MOVE_UP;
            int [] current = new int[] {3, 3};
            int [] expected = new int[]{2, 3};
            int [] actual = Adventure.determineLocation(new String [7][4][], current, direction);
            if ( !Arrays.equals(expected,actual)) {
                System.out.println("testDetermineLocation 3) Expected: " + Arrays.toString( expected)
                        + " Actual: " + Arrays.toString( actual));
                error = true;
            }
        }
        {   //test 4:
            String direction = Config.MOVE_DOWN;
            int [] current = new int[] {3, 3};
            int [] expected = new int[]{4, 3};
            int [] actual = Adventure.determineLocation(new String [7][4][], current, direction);
            if ( !Arrays.equals(expected,actual)) {
                System.out.println("testDetermineLocation 4) Expected: " + Arrays.toString( expected)
                        + " Actual: " + Arrays.toString( actual));
                error = true;
            }
        }
        
        {   //test 5:
            String direction = Config.MOVE_LEFT;
            int [] current = new int[] {0, 0};
            int [] expected = new int[]{0, 4};
            int [] actual = Adventure.determineLocation(new String [7][4][], current, direction);
            if ( !Arrays.equals(expected,actual)) {
                System.out.println("testDetermineLocation 5) Expected: " + Arrays.toString( expected)
                        + " Actual: " + Arrays.toString( actual));
                error = true;
            }
        }
        
        {   //test 6:
            String direction = Config.MOVE_RIGHT;
            int [] current = new int[] {0, 4};
            int [] expected = new int[]{0, 0};
            int [] actual = Adventure.determineLocation(new String [7][4][], current, direction);
            if ( !Arrays.equals(expected,actual)) {
                System.out.println("testDetermineLocation 6) Expected: " + Arrays.toString( expected)
                        + " Actual: " + Arrays.toString( actual));
                error = true;
            }
        }
        
        {   //test 7:
            String direction = Config.MOVE_UP;
            int [] current = new int[] {0, 0};
            int [] expected = new int[]{7, 0};
            int [] actual = Adventure.determineLocation(new String [7][4][], current, direction);
            if ( !Arrays.equals(expected,actual)) {
                System.out.println("testDetermineLocation 7) Expected: " + Arrays.toString( expected)
                        + " Actual: " + Arrays.toString( actual));
                error = true;
            }
        }
        
        {   //test 8:
            String direction = Config.MOVE_DOWN;
            int [] current = new int[] {7, 0};
            int [] expected = new int[]{0, 0};
            int [] actual = Adventure.determineLocation(new String [7][4][], current, direction);
            if ( !Arrays.equals(expected,actual)) {
                System.out.println("testDetermineLocation 8) Expected: " + Arrays.toString( expected)
                        + " Actual: " + Arrays.toString( actual));
                error = true;
            }
        }
       

        if ( error) {
            System.out.println("Error in testDetermineLocation.");
        } else {
            System.out.println("All tests in testDetermineLocation passed.");
        }
    }
}
