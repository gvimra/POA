package fr.p10.miage.rps.model;

public class RockPaperScissors {

    public RPS.Result play(RPS.RPSEnum p1, RPS.RPSEnum p2) {

        if (p1.equals(p2)) {
            return RPS.Result.TIE;
        }
        else if ((p1.equals(RPS.RPSEnum.ROCK) && p2.equals(RPS.RPSEnum.SCISSORS)) ||
                (p1.equals(RPS.RPSEnum.SCISSORS) && p2.equals(RPS.RPSEnum.PAPER)) ||
                (p1.equals(RPS.RPSEnum.PAPER) && p2.equals(RPS.RPSEnum.ROCK))){
            return RPS.Result.WIN;
        }
        else
        return RPS.Result.LOST;
    }

}
