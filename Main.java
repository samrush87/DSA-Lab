package DSA;

public class Main {

		public static void main(String[] args) {
			
			int[] arr= {11,19,12,16,15,18,13,20,14,17};

			Insertion i= new Insertion();
			
			System.out.println("Sorted array using selection method :");
			i.sort(arr);
			i.PrintArray(arr);
		}
	}

