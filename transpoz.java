
public class transpoz {

	public static void main(String[] args) {

			int list[][]= {{1,2,3},{4,5,6},{7,8,9}}; 
			
	for(int i=0;i<list.length;i++) {
		for(int j=0;j<list.length;j++) {
			System.out.print(list[i][j]);
		}
		System.out.println();
		
		
	}
	System.out.println("----");
	for(int i=0;i<list.length;i++) {
		for(int j=0;j<list.length;j++) {
			System.out.print(list[j][i]);
		}
		System.out.println();
	}
}
}