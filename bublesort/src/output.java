
public class output {

	public static void main(String[] args) {
		int bubble[]= {20,25,45,85,95,2,3};
		BubbleSort.bubbleSort(bubble);
		
		for(int i=0;i<bubble.length;i++) {
			System.out.print(bubble[i]+"  ");
		}

	}

}
