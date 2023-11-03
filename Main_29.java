public class Main_29 {
    public static void main(String[] args) {
        float[] arr1={43.5f, 56.7f, 23.7f, 12.7f, 98.5f};
        float sum=0.0f;
        for (float i: arr1){
            sum=sum+i;
        }
        System.out.println("Sum of elements="+sum);
        int[] arr2={23, 67, 84, 39, 54};
        for (int i=0; i<arr2.length; i++){
            if (23==arr2[i]) {
                System.out.println("found at position " + (i + 1));
                break;
            }
        }
        float[] arr3={43f, 67f, 58f, 40f, 28f};
        float sum1=0;
        for (float i: arr3){
            sum1=sum1+i;
        }
        System.out.println("Average of marks is "+(sum1/arr3.length));
        int[][] arr4={{1, 2, 3}, {4, 5, 6}};
        int[][] arr5={{7, 8, 9}, {10, 11, 12}};
        int[][] arr6={{0,0,0}, {0,0,0}};
        for (int i=0; i<arr4.length; i++){
            for (int j=0; j<arr4[i].length; j++){
                arr6[i][j]=arr4[i][j]+arr5[i][j];
            }
        }
        System.out.println("sum array is:");
        for (int i=0; i<arr6.length; i++){
            for (int j=0; j<arr6[i].length; j++){
                System.out.print(arr6[i][j]);
                System.out.print("\t");
            }
            System.out.print("\n");
        }
        int temp;
        int n=Math.floorDiv(arr2.length,2);
        System.out.println("reverse array is:");
        for (int i=0; i<n; i++){
            temp=arr2[i];
            arr2[i]=arr2[arr2.length-i-1];
            arr2[arr2.length-i-1]=temp;
        }
        for(int i:arr2){
            System.out.print(i);
            System.out.print("\t");
        }
        System.out.print("\n");
        int max=arr2[0];
        int min=arr2[0];
        for(int i:arr2){
            if (i>max)
                max=i;
            if (i<min)
                min=i;
        }
        System.out.println("maximum element is "+max+" and minimum is "+min);
        boolean sort=true;
        for(int i=0; i<arr2.length; i++){
            if (arr2[i]>arr2[i+1]){
                sort=false;
                break;
            }
        }
        if (sort)
            System.out.println("Array is sorted");
        else
            System.out.println("Array is not sorted");
    }
}
