public class ArrayDemo{
	public static void main(String[] args) {
			 int[] arr1 = { 1, 2, 3, 4 };
			 int[] arr2 = { 4, 3, 2, 1 };
			 int[][] arr3 = { {1,2,3}, {4,5,6}, {7,8,9} };
			 int[][] arr4 = { {9,8,7}, {6,5,4}, {3,2,1} };
			 printArray(arr1);
			 printArray(arr2);
			 printArray(arr3);
			 printArray(arr4);
	 }
   public static void printArray(int[] ary){
		 System.out.print("{");
		 int i = 0;
		 for(; i <ary.length;i++){
			 if( i < ary.length - 1){
				 System.out.print(ary[i] + ",");
			 }
		 }System.out.print(ary[ary.length - 1] + "}");

	 }
	 public static void printArray(int[][]ary){
		 System.out.print("\n");
		 for(int i = 0; i <ary.length;i++){
			 System.out.print("{");
			 for(int j = 0; j <ary[i].length;j++){
				 if(j < ary[i].length - 1){
					 System.out.print(ary[i][j] + ",");
				 }
			 }
			 System.out.print(ary[i][ary[i].length - 1] +"}"+"\n");
	 }
 }
}
//public static void printArray(int[][]ary
