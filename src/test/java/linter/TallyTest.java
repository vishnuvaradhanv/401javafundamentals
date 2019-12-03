package linter;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class TallyTest {

    @Test
    public void result() {
        ArrayList<String> votes = new ArrayList<>();

        votes.add("Bush");
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Shrub");
        votes.add("Hedge");
        votes.add("Shrub");
        votes.add("Bush");
        votes.add("Hedge");
        votes.add("Bush");
        votes.add("Hedge");
        votes.add("Hedge");
        votes.add("Shrub");

        System.out.println( " Max Vote count and Winner are "+ Tally.getWinner(votes));

    }
}
