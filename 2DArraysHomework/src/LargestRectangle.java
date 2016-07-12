import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class LargestRectangle {
    private static int largestRectangleArea = 0;
    private static int[] rectangleCoordinates = new int[4];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<List<String>> items = new ArrayList<>();

        while (true){
            String input = sc.nextLine();

            if(input.toLowerCase().equals("end")){
                break;
            }
            input = input.replaceFirst(",", "");
            items.add(Arrays.asList(input.split(",")));

        }


        int matrixHeight = items.size();
        int matrixWidth = items.get(0).size();
        String[][] matrix = new String[matrixHeight][matrixWidth];

        for (int row = 0; row < matrixHeight; row++) {
            for (int col = 0; col < matrixWidth; col++) {
                matrix[row][col] = items.get(row).get(col);
            }
        }
        search(matrixHeight, matrixWidth, matrix);
        print(matrixHeight,matrixWidth,matrix);

    }
    public static void search(int matrixHeight, int matrixWidth, String[][] matrix){
        for (int row = 0; row < matrixHeight; row++) {
            for (int col = 0; col < matrixWidth; col++) {
                for (int i = row; i < matrixHeight; i++) {
                    for (int j = col; j < matrixWidth; j++) {
                       if(rowVal(matrix, matrix[row][col],col,j,row)&&
                               colVal(matrix, matrix[row][col], row,i,j)&&
                               rowVal(matrix, matrix[row][col],col,j,i)&&
                               colVal(matrix, matrix[row][col], row, i, col)){
                           int widthSize = (j - col) + 1;
                           int heightSize = (i - row) + 1;
                           int rectangleArea = widthSize * heightSize;
                           if(rectangleArea>largestRectangleArea){
                               largestRectangleArea = rectangleArea;
                               rectangleCoordinates[0] = row;
                               rectangleCoordinates[1] = i;
                               rectangleCoordinates[2] = col;
                               rectangleCoordinates[3] = j;
                           }
                       }
                    }
                }
            }
        }
    }
    public static Boolean rowVal (String[][] matrix, String current, int start, int end, int row){
        for (int i = start; i <= end ; i++) {
            if(!matrix[row][i].equals(current)){
                return false;
            }
        }
        return true;
    }
    public static Boolean colVal(String[][] matrix, String current, int start, int end, int col){
        for (int i = start; i <= end ; i++) {
            if(!matrix[i][col].equals(current)){
                return false;
            }
        }
        return true;
    }
    public static void print(int matrixHeigt, int matrixWidth, String[][] matrix){
        int startRow = rectangleCoordinates[0];
        int endRow = rectangleCoordinates[1];
        int startCol = rectangleCoordinates[2];
        int endCol = rectangleCoordinates[3];
        for (int row = 0; row < matrixHeigt; row++) {
            for (int col = 0; col < matrixWidth; col++) {
                if((row==startRow && col>=startCol && col<=endCol) ||
                        (row == endRow && col>=startCol && col<=endCol) ||
                        (col==startCol && row>=startRow && row<=endRow) ||
                        (col==endCol && row>=startRow && row<=endRow)){
                    System.out.printf("%5s","["+matrix[row][col]+"]");
                }
                else{
                    System.out.printf("%5s", matrix[row][col]);
                }
            }
            System.out.println();
        }
    }
}
