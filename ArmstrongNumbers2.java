
public class ArmstrongNumbers {

    public static int cubeOf(int base){

        int result = 1;
        for(int i=0; i<3;i++){
            result *= base;
        }
        return result;
    }

    public static void main(String[] args) {
        int ans = 0;
        for(int i=100; i<=500;i++){
            int k = i;
            for(int j=1; j<=1; j++){
//                System.out.println();
                ans += cubeOf(k%10);
                k = k/10;
                ans += cubeOf(k%10);
                k = k/10;
                ans += cubeOf(k%10);
            }
            System.out.print(i+" ");
            System.out.print(ans+" ");
            if(ans == i){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
            ans = 0;
        }

    }
}
