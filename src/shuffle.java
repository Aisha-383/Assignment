import java.util.Arrays;
import java.util.Random;

public class shuffle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        int[] array = {1, 2, 3, 4, 5, 6, 7};
		        
		        shuffleArray(array);

		        // Print the shuffled array
		        for (int value : array) {
		            System.out.print(value + " ");
		        }
		    }

		    public static void shuffleArray(int[] array) {
		        Random rand = new Random();

		        for (int i = array.length - 1; i > 0; i--) {
		            int j = rand.nextInt(i + 1);

		            // Swap array[i] and array[j]
		            int temp = array[i];
		            array[i] = array[j];
		            array[j] = temp;
		        }

	}

}
