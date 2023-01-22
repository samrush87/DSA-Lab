package DSA;

	public class Insertion {

		void sort(int arr[]) {		

			for(int i=1; i<arr.length;++i) {
				int key=arr[i];
				int j=i-1;
				
				while(j>=0 && arr[j]>key) {
					arr[j+1]=arr[j];
					j=j-1;
				}
				arr[j+1]=key;
			}	
		}
		void PrintArray(int arr[]) {
			for(int i=arr.length-1;i>=0;--i) {
				System.out.println(arr[i]);
			}
		}
	}

