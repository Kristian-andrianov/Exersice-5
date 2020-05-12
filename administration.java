package exercise5;
import java.util.Random;
import java.util.Scanner;

public class administration {
	                
				    final public static Scanner Scanner = new Scanner(System.in);
				    final public static int ARRAY_LENGTH = arrayLength();

				    public static void main(String[] args) {
				        int[] intArray = new int[ARRAY_LENGTH];
				        System.out.print("The numbers must be from 1-100! \n");
				        fillArray(intArray);
				        printArray(intArray);

				        do {
				            printMenuOptions();
				            int userMenu = takeInputUserMenuOption();
				            switch (userMenu) {
				                case 1:
				                	ArrayinAscending(intArray);
				                    printArray(intArray);
				                    break;
				                case 2:
				                    ArrayinDescending(intArray);
				                    printArray(intArray); 
				                    break;           //Bubble Sort
				                case 3:
				                    PositionofNumber(intArray);
				                    break;
				                case 4:
				                    RandomArray(intArray);
				                    break;
				                case 5:
				                    System.out.print("The sum of the numbers is :   " + SumaryofNumbersinArray(intArray));
				                    break;
				                case 6:
				                    System.out.print("The biggest number is : " + BiggestNumOfArray(intArray));
				                    break;
				                case 7:
				                    System.out.print("The samllest number is : " + SmallestNumOfArray(intArray));
				                    break;
				                case 8:
				                    System.out.print("the arithmetic mean of the numbers is  : " + averageNumberInArray(intArray));
				                    break;
				                case 9:
				                    if (SymmetricArray(intArray)) System.out.print("Numbers are even");
				                    else System.out.print("Numbers are odd");
				                    break;
				                case 10:
				                    Reverse(intArray);
				                    break;
				                case 11:
				                    System.out.println("Input numbers:");
				                    printArray(intArray);
				                    break;
				                case 12: break ;
				            }

				        } while (ContinueYN());
				       

				        System.out.print("Thank you for using our program!");
				    }
				    public static int arrayLength() {
				        System.out.print("Put in as many numbers as you wish: ");
				        return Scanner.nextInt();
				    }
			      

				   
				    public static void fillArray(int[] array) {
				        int i = 0;
				        while (i < ARRAY_LENGTH) {
				            System.out.print(i + 1 + ": ");
				            array[i] = Scanner.nextInt();
				            if (array[i] > 0 && array[i] <= 100) i++;
				        }
				    }

				    public static void printArray(int[] array) {
				        for (int i = 0; i < ARRAY_LENGTH; i++) System.out.print(array[i] + " ");
				    }

				    public static void printMenuOptions() {
				        System.out.print("\n\n Menu :\n" +
				                "1. Sort numbers from biggest to lowest \n" +
				                "2. Sort the numbers from lowest to biggest \n" +
				                "3. Looking for the exact position of one number \n" +
				                "4. Randomizing the numbers \n" +
				                "5. Summing all the numbers \n" +
				                "6. Loking for the biggest number \n" +
				                "7. Looking for the smallest number \n" +
				                "8. Finding the media of the numbers \n" +
				                "9. Proverka na simiti`nosta na numbers \n" +
				                "10. Changing numbers to array \n" +
				                "11. Take a look of your input numbers \n" +
				                "12. Exit \n" +
				                " Choose a option:  ");
				    }

				   
				    public static int takeInputUserMenuOption() {
				        int userMenuOption = Scanner.nextInt();
				        if (userMenuOption > 0 && userMenuOption < 13) {
				            return userMenuOption;
				        }
				        System.out.print("\nError , try again :");
				        
				        return takeInputUserMenuOption();
				    }
				    

				   
				    public static boolean ContinueYN() {
				        System.out.print("\n Would you want to return to the main menu(Y/N) ");
				        String Answer = Scanner.next();
				        if (Answer.equals("n") || Answer.equals("N")) return false;
				        if (Answer.equals("y") || Answer.equals("Y")) return true;
				        System.out.print("\nInvalid input, try again: ");
				        return ContinueYN();
				    }

				    
				    public static void ArrayinAscending(int[] array) {
				        {

				            for (int i = 0; i < ARRAY_LENGTH - 1; i++)
				                for (int j = 0; j < ARRAY_LENGTH - i - 1; j++)
				                    if (array[j] > array[j + 1]) {
				                        int temp = array[j];
				                        array[j] = array[j + 1];
				                        array[j + 1] = temp;
				                    }
				        }
				    }

				  
				    public static void ArrayinDescending(int[] array) {
				        for (int i = 0; i < ARRAY_LENGTH - 1; i++) {
				            for (int j = 0; j < ARRAY_LENGTH - i - 1; j++) {

				                if (array[j] < array[j + 1]) {
				                    int temp = array[j];
				                    array[j] = array[j + 1];
				                    array[j + 1] = temp;
				                }
				            }
				        }
				    }
				  
				    public static void PositionofNumber(int[] array) {
				        System.out.print("Put in a number which position you would like to find :");
				        int Want = Scanner.nextInt();
				        for (int i = 0; i < ARRAY_LENGTH; i++) {
				            if (array[i] == Want) {
				                System.out.printf("\nNumber %d , is found on a %d", array[i], i + 1);
				            }
				        }
				    }   
				    

				    private static void RandomArray(int[] array) {
				        int index, temp;
				        Random rand = new Random();
				        System.out.print("\nRandomized numbers: ");
				        for (int i = ARRAY_LENGTH - 1; i >= 0; i--) {
				            index = rand.nextInt(i + 1);
				            temp = array[index];
				            array[index] = array[i];
				            array[i] = temp;
				            System.out.print(array[i] + " ");
				        }
				    }
				    

				    private static int SumaryofNumbersinArray(int[] array) {
				        int SUM = 0;
				        for (int i = 0; i < ARRAY_LENGTH; i++) {
				            SUM += array[i];
				        }
				        return SUM;
				    }
				    private static int BiggestNumOfArray(int[] array) {
				        int MAX = array[0];
				        for (int i = 0; i < ARRAY_LENGTH; i++) {
				            if (array[i] > MAX) MAX = array[i];
				        }
				        return MAX;
				    }
				    private static int SmallestNumOfArray(int[] array) {
				        int MIN = array[0];
				        for (int i = 0; i < ARRAY_LENGTH; i++) {
				            if (array[i] < MIN) MIN = array[i];
				        }
				        return MIN;
				    }

				    private static int averageNumberInArray(int[] array) {
				        int AVERAGE = 0;
				        for (int i = 0; i < ARRAY_LENGTH; i++) {
				            AVERAGE += array[i];
				        }
				        return AVERAGE / ARRAY_LENGTH;
				    }
				    private static void Reverse(int[] array) {
				        for (int i = ARRAY_LENGTH - 1; i >= 0; i--) {
				            System.out.print(array[i] + " ");
				        }
				    }
				    
				    
				    private static boolean SymmetricArray(int[] array) {
				        for (int i = 0; i < ARRAY_LENGTH; i++) {

				            if (!(array[i] == array[ARRAY_LENGTH - 1 - i] ) && i <= array[i] / 2) return false;
				        }
				        
				    return true;

				    }
				    
				    				   
				}
