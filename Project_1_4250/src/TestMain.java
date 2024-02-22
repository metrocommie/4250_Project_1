import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TestMain {
    public static void main(String[] args) throws FileNotFoundException {
        LexAnalyzer obj1 = new LexAnalyzer();
        File file = new File("/Users/nick/IdeaProjects/Project_1_4250/TextFile");
        Scanner scan = new Scanner(file);

        if (scan.hasNextLine() == false){
            System.out.println("ERROR - cannot open file. \n");
        }
        else{
            obj1.getChar();
            do{
                obj1.lex();
            }while (obj1.nextToken != -1);
        }
    }
}
