import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class LexAnalyzer {
    File file = new File("/Users/nick/IdeaProjects/Project_1_4250/TextFile");
    Scanner scan = new Scanner(file);
    public static final int LETTER = 0;
    public static final int DIGIT = 1;
    public static final int UNKNOWN = 99;
    public static final int INT_LIT = 10;
    public static final int IDENT = 11;
    public static final int ASSIGN_OP = 20;
    public static final int ADD_OP = 21;
    public static final int SUB_OP = 22;
    public static final int MULT_OP = 23;
    public static final int DIV_OP = 24;
    public static final int LEFT_PAREN = 25;
    public static final int RIGHT_PAREN = 26;
    int charClass;
    char[] lexeme = new char[100];
    char nextChar;
    int lexLen;
    int token;
    int nextToken;
    public int lookup(char ch){
        switch(ch){
            case '(':{
                addChar();
                nextToken = LEFT_PAREN;
                break;
            }
            case ')':{
                addChar();
                nextToken = RIGHT_PAREN;
                break;
            }
            case '+':{
                addChar();
                nextToken = ADD_OP;
                break;
            }
            case '-':{
                addChar();
                nextToken = SUB_OP;
                break;
            }
            case '*':{
                addChar();
                nextToken = MULT_OP;
                break;
            }
            case '/':{
                addChar();
                nextToken = DIV_OP;
                break;
            }
            default:{
                addChar();
                nextToken = -1;
                break;
            }
        }
        return nextToken;
    }
    public void addChar(){
        if (lexLen <= 98){
            lexeme[lexLen++] = nextChar;
            lexeme[lexLen] = 0;
        }
        else{
            System.out.println("Error - lexeme is too long \n");
        }
    }
    public void getChar(){
        if (scan.hasNextLine() == false){
            if(Character.isAlphabetic(nextChar)){
                charClass = LETTER;
            }
            else if(Character.isDigit(nextChar)){
                charClass = DIGIT;
            }
            else charClass = UNKNOWN;
        }
        else charClass = -1;
    }
    public void getNonBlank(){
        while (Character.isSpaceChar(nextChar))
            getChar();
    }
    public int lex(){
        lexLen = 0;
        getNonBlank();

        switch (charClass){
            case LETTER
        }
    }
}
