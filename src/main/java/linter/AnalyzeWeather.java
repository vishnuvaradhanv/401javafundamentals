
package linter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class AnalyzeWeather {
    public static HashSet<Integer> getHash(int[][] givenArray){
        //int minValue = 0;
        //int maxValue = 0;
        HashSet<Integer> allTemp = new HashSet<>();
        for(int[] tempArray: givenArray){
            for(int temp:tempArray){
                allTemp.add(temp);
            }
        }
        return allTemp;
    }

    public static List<Integer> getMissingTemp(HashSet<Integer> octoberTemp){
        List<Integer> missingTemp = new ArrayList<>();
        int minValue = Collections.min(octoberTemp);
        int maxValue = Collections.max(octoberTemp);
        //System.out.println(minValue + " " + maxValue);
        //System.out.println(octoberTemp);
        for(int i = minValue; i <= maxValue ; i++ ){
           // System.out.println(octoberTemp.contains(i));
            if (octoberTemp.contains(i)) {

            } else {
                missingTemp.add(i);

            }
        }
        //System.out.println(missingTemp);
        return missingTemp;
    }

}
