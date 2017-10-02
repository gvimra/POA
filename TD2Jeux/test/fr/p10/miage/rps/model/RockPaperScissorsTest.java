package fr.p10.miage.rps.model;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class RockPaperScissorsTest {

    private RockPaperScissors rps;

    @BeforeClass
    public void initial(){
        rps = new RockPaperScissors();
    }

    @Test
    public void testPlay() throws Exception {

        assertEquals(rps.play(RPS.RPSEnum.ROCK, RPS.RPSEnum.SCISSORS), RPS.Result.LOST);


    }

}