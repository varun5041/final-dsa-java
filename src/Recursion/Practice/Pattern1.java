package Recursion.Practice;

public class Pattern1 {
    static void main(String[] args) {
        PrintPattern(5,1);
    }

    public static void PrintPattern(int row , int col){
        if(col>row){
            return;
        }
        //print a particular row
        printRowStars(col,1);
        //go to next line
        System.out.println();

        PrintPattern(row,col+1);
    }

    private static void printRowStars(int col,int count) {
        if(count>col){
            return;
        }

        System.out.print("*");
        printRowStars(col,count+1);
    }
}
