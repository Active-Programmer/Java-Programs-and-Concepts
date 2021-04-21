public class LengthOfInts {

    public static int lengthOfInt(int num){

        String result = String.valueOf(num);
        int ans = result.length();
        return ans;
    }
    public static void main(String[] args){

        int[] arr1 = {1,2,3,4,5,6,10,20};
        int[] arr2 = {4,5,6,7,8,9};
        int[] newArray = new int[arr1.length+arr2.length];

        for(int i=0; i<arr1.length;i++){
            newArray[i] = arr1[i];
        }
        for(int j=0;j<arr2.length;j++){
            newArray[j+arr1.length] = arr2[j];
        }

        System.out.println("After Array Concatenation :");
        for(int a = 0; a<newArray.length; a++){
            System.out.print(newArray[a]+" ");
        }

    }
}
