package linter;

import org.junit.Test;

import java.lang.reflect.Array;

//4,8,15,16,23,42], 15


public class BinarySearchTest {
    @Test
    public void find() {
        int[] givenArray = {4, 8, 15, 16, 23, 42};
        int find = 15;
        System.out.println("Index is :" + BinarySearch.searchNumber(givenArray, find));
    }

}
