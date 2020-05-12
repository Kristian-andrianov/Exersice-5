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
				            int userMenu = UserMenuOption();
				            switch (userMenu) {
				                case 1:
				                	ArrayinAscending(intArray);
				                    printArray(intArray);
				                    break;
				                    
				                case 2:
				                    ArrayinDescending(intArray);
				                    printArray(intArray); 
				                    break;  
				                    
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
				                    break
				                    ;
				                case 10:
				                	reverse(intArray);
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
				        int k = 0;
				        while (k < ARRAY_LENGTH) {
				            System.out.print(k + 1 + ": ");
				            array[k] = Scanner.nextInt();
				            if (array[k] > 0 && array[k] <= 100) k++;
				        }
				   }

				    public static void printArray(int[] array) {
				        for (int k = 0; k < ARRAY_LENGTH; k++) System.out.print(array[k] + " ");
				   }

				    public static void printMenuOptions() {
				        System.out.print("\n\n Menu :\n" +
				                "1. Sort numbers from lowest to biggest \n" +
				                "2. Sort the numbers from biggest to lowest \n" +
				                "3. Looking for the exact position of one number \n" +
				                "4. Randomizing the numbers \n" +
				                "5. Summing all the numbers \n" +
				                "6. Loking for the biggest number \n" +
				                "7. Looking for the smallest number \n" +
				                "8. Finding the media of the numbers \n" +
				                "9. Check the symmetry of the numbers \n" +
				                "10.Reverse the numbers \n" +
				                "11. Take a look of your input numbers \n" +
				                "12. Exit \n" +
				                " Choose a option:  ");
				   }

				   
				    public static int UserMenuOption() {
				        int userMenuOption = Scanner.nextInt();
				        if (userMenuOption > 0 && userMenuOption < 13) {
				            return userMenuOption;
				        }
				        System.out.print("\nError , try again :");
				        
				        return UserMenuOption();
				    }
				    

				   
				    public static boolean ContinueYN() {
				        System.out.print("\n Would you want to return to the main menu(Y/N) ");
				        String Answer = Scanner.next();
				        if (Answer.equals("n") || 
				        		Answer.equals("N")) return false;
				        if (Answer.equals("y") ||
				        		Answer.equals("Y")) return true;
				        System.out.print("\nInvalid input, try again: ");
				        return ContinueYN();
				    }
				    public static void ArrayinDescending(int[] array) {
				        for (int k = 0; k < ARRAY_LENGTH - 1; k++) {
				            for (int n = 0; n < ARRAY_LENGTH - k - 1; n++) {

				                if (array[n] < array[n + 1]) {
				                    int temp = array[n];
				                    array[n] = array[n + 1];
				                    array[n + 1] = temp;
				                }
				            }
				        }
				    }
				    
				    public static void ArrayinAscending(int[] array) {
				        {

				            for (int k = 0; k < ARRAY_LENGTH - 1; k++)
				                for (int n = 0; n < ARRAY_LENGTH - k - 1; n++)
				                    if (array[n] > array[n + 1]) {
				                        int temp = array[n];
				                        array[n] = array[n + 1];
				                        array[n + 1] = temp;
				            }
				        }
				    }

				  
				   
				  
				    public static void PositionofNumber(int[] array) {
				        System.out.print("Put in a number which position you would like to find :");
				        int Want = Scanner.nextInt();
				        for (int k = 0; k < ARRAY_LENGTH; k++) {
				            if (array[k] == Want) {
				                System.out.printf("\nNumber %d , is found on a %d", array[k], k + 1);
				            }
				        }
				    }   
				    

				    private static void RandomArray(int[] array) {
				        int index, temp;
				        Random random = new Random();
				        System.out.print("\nRandomized numbers: ");
				        for (int k = ARRAY_LENGTH - 1; k >= 0; k--) {
				            index = random.nextInt(k + 1);
				            temp = array[index];
				            array[index] = array[k];
				            array[k] = temp;
				            System.out.print(array[k] + " ");
				        }
				    }
				    

				    private static int SumaryofNumbersinArray(int[] array) {
				        int SUM = 0;
				        for (int k = 0; k < ARRAY_LENGTH; k++) {
				            SUM += array[k];
				        }
				        return SUM;
				    }
				    private static int BiggestNumOfArray(int[] array) {
				        int MAX = array[0];
				        for (int k = 0; k < ARRAY_LENGTH; k++) {
				            if (array[k] > MAX) MAX = array[k];
				        }
				        return MAX;
				    }
				    private static int SmallestNumOfArray(int[] array) {
				        int MIN = array[0];
				        for (int k = 0; k < ARRAY_LENGTH; k++) {
				            if (array[k] < MIN) MIN = array[k];
				        }
				        return MIN;
				    }

				    private static int averageNumberInArray(int[] array) {
				        int Aver = 0;
				        for (int k = 0; k < ARRAY_LENGTH; k++) {
				            Aver += array[k];
				        }
				        return Aver / ARRAY_LENGTH;
				    }
				    public static void reverse(int[] data) {
				    	for(int i=0; i < array.length/2; i++)
				    	{ int temp = array[i]; array[i] = array[array.length -i -1];
				    	array[array.length -i -1] = temp; }
				    	}
	
				    
				    private static boolean SymmetricArray(int[] array) {
				        for (int k = 0; k < ARRAY_LENGTH; k++) {
				        	if (!(array[k] == array[ARRAY_LENGTH - 1 - k] ) 
				            		&& k <= array[k] / 2) return false;
				        }
				        
				    return true;

				    }
				    
				    				   
				}
