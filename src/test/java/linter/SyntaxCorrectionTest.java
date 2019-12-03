package linter;

import org.junit.Test;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class SyntaxCorrectionTest {

    @Test
    public  void displayError() {
        ArrayList<String> errorList = new ArrayList<>();
        String filePath = "/Users/vijayagv/Documents/project_document/amazon_training/Amazon-401/assignments/401javafundamentals/src/main/resources/gates.js";
        errorList = SyntaxCorrection.getSyntaxError(filePath);
        if (errorList.isEmpty()) {
            System.out.println("No issues found");
        }
        else { for (String error : errorList) {
            System.out.println(error + " Missing Semicolon");
        }
    }


    }



}
