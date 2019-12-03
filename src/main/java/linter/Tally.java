package linter;
import java.util.*;

public class Tally {
    public static HashMap<Integer,HashSet<String>> getWinner(ArrayList<String> contestantList) {

        HashMap<String, Integer> contestantCount = new HashMap<>();
        int cnt = 0;
        HashSet<String> winnerList = new HashSet<>();
        int maxCnt = 0;
        int indicator;
        //winnerList.add("No Election");

        HashMap<Integer,HashSet<String>> winner = new HashMap<>();
        winner.put(0,winnerList);


        for (String contestant : contestantList) {
            indicator = 0;
            //System.out.println (contestant);
            try {
                cnt = contestantCount.get(contestant);
            } catch(java.lang.NullPointerException e){
                cnt = 0;
            }
            contestantCount.put(contestant, cnt + 1);

            if (maxCnt < cnt + 1) {
                maxCnt = cnt + 1;
                indicator = 1;
            }

            //System.out.println("display maxCnt is : "+ maxCnt);
            //System.out.println("contains key :" + winner.containsKey(cnt + 1));


            if (winner.containsKey(cnt+1)){
                winnerList.add(contestant);
                winner.clear();
                winner.put(maxCnt,winnerList);
            } else if(indicator == 1){
                winnerList.clear();
                winner.clear();
                winnerList.add(contestant);
                winner.put(maxCnt,winnerList);
            }

            //System.out.println(contestant);
            //System.out.println("Contestant list is "+contestantCount);
            //System.out.println("winner is:" + winner);
            //System.out.println("--------------------");

        }

        return winner;
    }
}


