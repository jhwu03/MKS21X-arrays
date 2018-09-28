public class ArrayDemo{
	public static void main(String[] args) {
			 int[] arr1 = { 1, 2, 3, 4 };
			 int[] arr2 = { 4, 3, 2, 1 };
			 int[][] arr3 = { {1,2,3}, {4,5,6}, {7,8,9} };
			 int[][] arr4 = { {9,8,7}, {6,5,4}, {3,2,1} };
			 int[][] arr5 = { {0,1,2}, {0,1,2}, {0,0,0} };
			 int[][] arr6 = { {1,2,3}, {4,5,6}, {7,8,9} };
			 int[][] arr7 = new int[3][4];
			 int[][] arr8 = { {-1,-2,-3}, {1,2,3}, {-1,-2,-3} };
			 System.out.print("0a ");
			 System.out.print("---------");
			 System.out.print("\n");
			 printArray(arr1);
			 System.out.print("\n");
			 printArray(arr2);
			 System.out.print("\n");
			 System.out.print("0b");
			 System.out.print("--------");
			 printArray(arr3);
			 printArray(arr4);
			 System.out.print("#1");
			 System.out.print("--------");
			 System.out.print("\n");
			 System.out.print(countZeros2D(arr5));
			 System.out.print("\n");
			 System.out.print(countZeros2D(arr6));
			 System.out.print("\n");
			 System.out.print("2a");
			 System.out.print("--------");
			 fill2D(arr7);
			 printArray(arr7);
			 System.out.print("2b");
			 System.out.print("--------");
			 printArray(fill2DCopy(arr8));
	 }
   public static void printArray(int[] ary){
		 System.out.print("{");
		 int i = 0;
		 for(; i <ary.length;i++){
			 if( i < ary.length - 1){
				 System.out.print(ary[i] + ",");
			 }
		 }
		 System.out.print(ary[ary.length - 1] + "}");
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
 public static int countZeros2D(int[][] nums){
	 int ans = 0;
	 for(int i = 0; i <nums.length;i++){
		 for(int j = 0; j <nums[i].length;j++){
			 if(nums[i][j] == 0){
				 ans = ans + 1;
			 }
		 }
	 }
	 return ans;
 }
 public static void fill2D(int[][] vals){
	 for(int i = 0; i <vals.length;i++){
		 for(int j = 0; j <vals[i].length;j++){
			 if(i == j){
				 vals[i][j] = 3;
			 }
				else {
				 vals[i][j] = 1;
			 }
		 }
	 }
 }
 public static int[][] fill2DCopy(int[][] vals){
	 //assumed that the given is rectangular
	 int[][] vals2 = new int[vals.length][vals[0].length];
	 for(int i = 0; i <vals.length;i++){
		 for(int j = 0; j <vals[i].length;j++){
			 vals2[i][j] = vals[i][j];
		 }
	 }
	 for(int i = 0; i <vals.length;i++){
		 for(int j = 0; j <vals[i].length;j++){
			 if(vals2[i][j] < 0 ){
			 vals2[i][j] = 3;
		   }
		 }
	 }
	 return vals2;
 }
}
