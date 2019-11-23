
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
        for(int i = minValue; i <= maxValue ; i++ )
            if (octoberTemp.contains(minValue)){

            } else {
                missingTemp.add(minValue);

            }
        return missingTemp;
    }

}
