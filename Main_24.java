public class Main_24 {
    public static void main(String[] args) {
        for (int i=0; i<5; i++){
            System.out.println(i);
            System.out.println("java");
            if (i==2){
                System.out.println("end loop");
                break;
            }
        }
        for (int i=0; i<5; i++){
            if (i==2){
                System.out.println("end loop");
                continue;
            }
            System.out.println(i);
            System.out.println("java");
        }
        int i=0;
        while(i<5) {
            System.out.println(i);
            System.out.println("c");
            i++;
            if (i == 2) {
                System.out.println("end loop");
                break;
            }
        }
        while(i<5) {
            i++;
            if (i == 2) {
                System.out.println("end loop");
                break;
            }
            System.out.println(i);
            System.out.println("c");
        }
        int j=0;
        do{
            System.out.println(j);
            System.out.println("c++");
            j++;
            if (j==2){
                System.out.println("end loop");
                break;
            }
        }
        while (j<5);
        do{
            j++;
            if (j==2){
                System.out.println("end loop");
                continue;
            }
            System.out.println(j);
            System.out.println("c++");
        }
        while (j<5);
    }
}
