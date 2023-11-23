public class Main_79 {
    public static void main(String[] args) {
        for(int i=2; i<10; i++){
            int flag=0;
            for (int k=2; k<=i/2; k++){
                if (i%k==0) {
                    flag++;
                    break;
                }
            }
            if (flag==0)
                System.out.println(i);
        }
    }
}
