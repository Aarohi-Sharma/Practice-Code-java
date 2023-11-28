public class Main_85 {
    public static int greet(){
        try{
            int a=5;
            int b=2;
            return a/b;
        }
        catch(Exception e){
            System.out.println(e);
        }
        finally {
            System.out.println("end of program");
        }
        return 0;
    }
    public static void main(String[] args) {
        int c=greet();
        System.out.println(c);
        int a=7;
        int b=9;
        while(true){
            try{
                System.out.println(a/b);
            }
            catch (Exception e) {
                System.out.println(e);
                break;
            }
            finally {
                System.out.println("final value for b= "+b);
            }
            b--;
        }
    }
}
