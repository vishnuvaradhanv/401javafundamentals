package linter;


import java.util.HashSet;

public class BinarySearch {

    public static int searchNumber(int[] arrayList, int findNumber){

        int length = arrayList.length;
        int minIndex = 0;
        int maxIndex = arrayList.length - 1;
        int pointerIndex = (int) (maxIndex-minIndex)/2;
        int indicator = 0;
        int index = -1;

        while(true){
            //System.out.println( minIndex + " " + maxIndex);
            //System.out.println("pointer Index is : " + pointerIndex + " Element is : " + arrayList[pointerIndex]);
            //4, 8, 15, 16, 23, 42,50

            if (minIndex > maxIndex){
                break;
            } else if(findNumber == arrayList[pointerIndex]){
                index = pointerIndex;
                minIndex = pointerIndex + 1;
                indicator = 1;
            }
            else if(findNumber > arrayList[pointerIndex]){
                minIndex = pointerIndex + 1;

            } else {
                maxIndex = pointerIndex - 1;
            }
            pointerIndex = minIndex + (int) ((maxIndex - minIndex)/2) ;
        }
        if (indicator == 0) {
            index = -1;
        }
        return index;
    }
}

