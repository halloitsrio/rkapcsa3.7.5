/*
 * Activity 3.7.5
 */
public class SimpleSearchRedo
{
  public static void main(String[] args)
  {
    int[] primeUnder50 = {3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47};
    int numToSearchFor = UserInput.getInt();
    
    /* your code goes here */

    int count = 0;
    while (count < primeUnder50.length) {
        if (primeUnder50[count] == numToSearchFor)
      {
        System.out.print(numToSearchFor + " was found at index " + count);
      }
      count++;
    }
  }
}