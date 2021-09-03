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
// Jim Williams; created the original program
// 
//
/////////////////////////////// 80 COLUMNS WIDE ////////////////////////////////

/**
 * This file contains constants for the text Adventure project. Also at the bottom of this file
 * are READ ME Notes for the Grader.
 *
 * @author Jim Williams
 * @author TODO add your name here when you have made changes
 */
public class Config {

    /**
     * Indexes into coordinate arrays specifying a location in the map.
     */
    public static final int ROW = 0;
    public static final int COLUMN = 1;

    /**
     * Indexes into the fields/attributes array for each map location (3rd dimension of
     * the map array)
     */
    public static final int NAME = 0;
    public static final int ENTER_TEXT = 1;
    public static final int ENTER_RESULT = 2;
    public static final int NEARBY_TEXT = 3;
    //add additional indexes here for additional field information added to each configuration
    //line.

    /**
     * Values within the location fields/attributes that are used for game logic other than
     * simply printing out.
     */
    //In name field, designates the starting location of the player
    public static final String NAME_START = "start";

    //The result of the player entering the field.
    public static final String RESULT_RANDOM_MOVE = "randomMove";
    public static final String RESULT_WIN = "win";
    public static final String RESULT_LOSE = "lose";
    //add additional game logic fields here (not text fields that are simply printed).

    /**
     * Values used by the player to navigate through the map.
     */
    public static final String MOVE_UP = "w";
    public static final String MOVE_DOWN = "s";
    public static final String MOVE_LEFT = "a";
    public static final String MOVE_RIGHT = "d";
    public static final String NEARBY = "n";
    public static final String QUIT = "q";
    //add additional game control characters here, throwing, shooting, etc.

}

/*
Your READ ME notes to the Grader
Describe your enhancements to the program, map, etc. here.  You may include a link to a
YouTube video of a maximum of 2 minutes demonstrating your program.

0) Overview of your changes or a YouTube video link (max 2 minutes)

I made multiple changes to the configuration. I added multiple methods in order for the program to function.
I also created the writeMap method which prints out the initial of each object on the map.

1) Configuration Example: Contents of your own configuration (.advcfg) file

Coordinates/Name/Enter Text/Enter Result/Nearby Text/
8,6/size/This is the size of the map///
5,5/wumpus/You've been eaten by the Wumpus./lose/awful smell/
1,4/pit/You fell into a pit/lose/you feel a draft/
4,3/pit/You fell into a pit/lose/you feel a draft/
3,4/bat/A huge bat picked you up and dropped you somewhere.../randomMove/you hear a rustling/
2,3/child/You've found the child safe and happy to see you!/win/you hear a child softly crying/
0,4/start/Welcome to the Wumpus Adventure! Find the child without getting eaten by the wumpus. May you return safely!///
1,5/bat/A huge bat picked you up and dropped you somewhere.../randomMove/you hear a rustling/
3,2/bat/A huge bat picked you up and dropped you somewhere.../randomMove/you hear a rustling/
6,2/bat/A huge bat picked you up and dropped you somewhere.../randomMove/you hear a rustling/
4,5/bat/A huge bat picked you up and dropped you somewhere.../randomMove/you hear a rustling/
6,4/bat/A huge bat picked you up and dropped you somewhere.../randomMove/you hear a rustling/

2) Configuration Description: Describe unique elements in your configuration file

I decided to move around the coordinates of all of the objects within the file.
I made it so that there was an open area to move around and then an area to experiment with baddies.
I also changed the child's position. Otherwise I kept the names the same.

3) writeMap Output: Example output of the writeMap method for your configuration file.

    *s 
    pb
   c  
  b b 
   p b
     w
  b b 
      

4) Choose at least 1 of the following ways you extended the game and describe them:
  a) Tools: added your own tools/weapons and use of them in the game
  b) Audio: playing of audio files when sensing the neighbors, rather than simply text
  c) Test Cases: adding test cases to TestAdventure that thoroughly test the methods you wrote.
  I added test cases for the below:
  		testParseCoordinates();
        testParseFields();
        testDetermineLocation();
  d) Your Own: describe any other changes or additions we should consider for credit.
  Created my own layout for the game to run on within the text file.










 */
