package linter;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class SyntaxCorrection {
    public static ArrayList<String> getSyntaxError(String path) {

        ArrayList<String> syntaxIssue = new ArrayList<>();
        int lineCount = 0;
        try {
            Scanner scanner = new Scanner(new File(path));
            while (scanner.hasNextLine()) {
                lineCount++;

                String line = scanner.nextLine();

                //System.out.println(line);
                //System.out.println("Line Number : " + lineCount);

                boolean semicolon = line.contains(";");  //scanner.findInLine(";");
                boolean newLine = line.equals(""); //scanner.findInLine("\n");
                boolean startBraces = line.contains("{"); //scanner.findInLine(".[{][}]");
                boolean endBraces = line.contains("}"); //scanner.findInLine(".[{][}]");
                boolean containsIf = line.contains("if");  //scanner.findInLine("if");
                boolean containsElse = line.contains("else");  //scanner.findInLine("else");

                //System.out.println("semicolon : " + semicolon);
                //System.out.println("newLine : " +newLine);
                //System.out.println("startBraces : " +startBraces);
                //System.out.println("endBraces : " +endBraces);
                //System.out.println("containsIf : " + containsIf);
                //System.out.println("containselse : " + containsElse);


                if(semicolon == true  || newLine == true || startBraces == true || endBraces ==  true || containsIf == true || containsElse == true ){
                    //System.out.println("IssueNotExists" );
                } else {
                    //System.out.println("Issue" );
                    syntaxIssue.add("Line no " + lineCount);
                }
                //System.out.println("--------------------------");
            }
        } catch (java.io.FileNotFoundException e) {
            System.out.println("File does not exist");
        }

        return syntaxIssue;
    }
}
