import java.util.Arrays;
import java.util.Scanner;

public class ArrayBasics {
    public static void main(String[] args) {

        ArrayBasics arr = new ArrayBasics();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter The Number of Numbers you want to Enter");
        int numberOfDigitsInArray = scanner.nextInt();
        int[] userEnteredArray = new int[numberOfDigitsInArray];
        userEnteredArray = arr.getUserNumbers(userEnteredArray.length);
        int [] squarednumbers = arr.calcualteSquare(userEnteredArray);
        int [] incrementednumbers = arr.incrementNumbers(squarednumbers);
        int [] doublednumbers = arr.doubelnumbers(incrementednumbers);

        System.out.println("squaring"+ Arrays.toString(userEnteredArray));
        System.out.println("incrementing"+Arrays.toString(squarednumbers));
        System.out.println("doubling"+Arrays.toString(incrementednumbers));
        System.out.println("output of :"+Arrays.toString(userEnteredArray)+"------>"+Arrays.toString(doublednumbers));
    }

    public int[] getUserNumbers(int len) {

        Scanner scanner = new Scanner(System.in);
        int[] userEnteredArray = new int[len];
        for (int i = 0; i < userEnteredArray.length; i++) {
            System.out.println("Enter element "+(i+1));
            userEnteredArray[i] = scanner.nextInt();
        }
        return userEnteredArray;
    }
    public int[] calcualteSquare(int [] num) {

           int [] squaredNumbers = new int [num.length];
        for (int i = 0; i < num.length; i++) {
              squaredNumbers[i] = num[i]*num[i];
        }
        return squaredNumbers;
    }
    public int[] incrementNumbers(int [] num) {

        int [] squaredNumbers = new int [num.length];
        for (int i = 0; i < num.length; i++) {
            squaredNumbers[i] = num[i]+1;
        }
        return squaredNumbers;
    }
    public int[] doubelnumbers(int [] num) {

        int [] squaredNumbers = new int [num.length];
        for (int i = 0; i < num.length; i++) {
            squaredNumbers[i] = num[i]*2;
        }
        return squaredNumbers;
    }
}

