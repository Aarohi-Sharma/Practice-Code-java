public class Main_14 {
    public static void main(String args[]) {
        String name="ShiVangi";
        System.out.println(name);
        int val=name.length();
        System.out.println(val);
        String lstr=name.toLowerCase();
        System.out.println(lstr);
        String ustr=name.toUpperCase();
        System.out.println(ustr);
        String ntname="   riya    ";
        System.out.println(ntname.trim());
        System.out.println(ntname.substring(2));
        System.out.println(ntname.substring(2, 5));
        System.out.println(name.replace('V', 'v'));
        System.out.println(name.replace("Shi", "SHI"));
        System.out.println(name.startsWith("ShI"));
        System.out.println(name.endsWith("gi"));
        
    }
}
