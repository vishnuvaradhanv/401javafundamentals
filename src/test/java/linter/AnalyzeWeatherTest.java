package linter;

import org.junit.Test;
import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class AnalyzeWeatherTest {
    // Daily average temperatures for Seattle, October 1-28 2017
    @Test
    public void getData(){
        int[][] weeklyMonthTemperatures = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };

        HashSet<Integer> uniqueTemp = new HashSet<>();
        uniqueTemp.addAll(AnalyzeWeather.getHash(weeklyMonthTemperatures));

        HashSet<Integer> missingTemp = new HashSet<>();
        uniqueTemp.addAll(AnalyzeWeather.getMissingTemp(uniqueTemp));


        int minValue = Collections.min(uniqueTemp);
        int maxValue = Collections.max(uniqueTemp);


        System.out.println("High: " + maxValue);
        System.out.println("Low: " + minValue);

        for(int temp: missingTemp){
            System.out.println("Never saw temperature: " + temp);
        }
    }

}
