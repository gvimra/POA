package fr.p10.miage.rps.model;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class RockPaperScissorsTest {

    private RockPaperScissors rps;

    @BeforeClass
    public void setUP(){

        rps = new RockPaperScissors();
    }

    public void tearDown(){
        rps = null;
    }

    @Parameters({"paper", "rock"})
    @Test
    public void testWinPlay(String p1, String p2) throws Exception {

        assertEquals(rps.play(RPS.RPSEnum.valueOf(p1), RPS.RPSEnum.valueOf(p2)), RPS.Result.WIN);
    }

    @Parameters({"paper", "paper"})
    @Test
    public void testTiePlay(String p1, String p2) throws Exception {

        assertEquals(rps.play(RPS.RPSEnum.valueOf(p1), RPS.RPSEnum.valueOf(p2)), RPS.Result.TIE);
    }

    @Parameters({"rock", "paper"})
    @Test
    public void testLostPlay(String p1, String p2) throws Exception {

        assertEquals(rps.play(RPS.RPSEnum.valueOf(p1), RPS.RPSEnum.valueOf(p2)), RPS.Result.LOST);
    }


    @DataProvider (name = "winData")
        public Object[][] createWinData(){
         return new Object[][]{
                 {RPS.RPSEnum.ROCK , RPS.RPSEnum.SCISSORS},
                 {RPS.RPSEnum.SCISSORS , RPS.RPSEnum.PAPER},
                 {RPS.RPSEnum.PAPER , RPS.RPSEnum.ROCK},
         };
    }

    @Test (dataProvider = "winData")
    void testWinPlay (RPS.RPSEnum p1 , RPS.RPSEnum p2){
        assertEquals(rps.play(p1, p2), RPS.Result.WIN);
    }

    @DataProvider (name = "tieData")
    public Object[][] createTieData(){
        return new Object[][]{
                {RPS.RPSEnum.SCISSORS , RPS.RPSEnum.SCISSORS},
                {RPS.RPSEnum.PAPER , RPS.RPSEnum.PAPER},
                {RPS.RPSEnum.ROCK , RPS.RPSEnum.ROCK},
        };
    }

    @Test (dataProvider = "tieData")
    void testTiePlay (RPS.RPSEnum p1 , RPS.RPSEnum p2){
        assertEquals(rps.play(p1, p2), RPS.Result.TIE);
    }

    @DataProvider (name = "lostData")
    public Object[][] createLostData(){
        return new Object[][]{
                {RPS.RPSEnum.ROCK , RPS.RPSEnum.PAPER},
                {RPS.RPSEnum.SCISSORS , RPS.RPSEnum.ROCK},
                {RPS.RPSEnum.PAPER , RPS.RPSEnum.SCISSORS},
        };
    }

    @Test (dataProvider = "lostData")
    void testLostPlay (RPS.RPSEnum p1 , RPS.RPSEnum p2){
        assertEquals(rps.play(p1, p2), RPS.Result.LOST);
    }



}