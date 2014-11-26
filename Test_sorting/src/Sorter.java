import java.util.Arrays;


public class Sorter {

	public static void main(String[] args) {
		int myArray[] ={70, 60, 26, 9};
		System.out.println("My initial array is: " + Arrays.toString(myArray));

		for (int i=0; i< myArray.length-1; i++)
		{
			for (int j=i+1; j< myArray.length; j++)
			{
				if (myArray[i] > myArray[j])
				{
					int tempValue = myArray[j];
					myArray[j] = myArray[i];
					myArray[i] = tempValue;
					System.out.println(" Swaping values " + myArray[i] + " for " + myArray[j] );
				}
					
			}
		}
		System.out.println("My sorted array is:" + Arrays.toString(myArray));
	}

}
