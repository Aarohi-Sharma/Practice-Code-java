class Sb1 {
    public static void main(String args[]) {
        String s;
        int a = 42;
        StringBuffer sb = new StringBuffer(40);
        s = sb.append("a = ").append(a).append("!").toString();
        System.out.println(s);
        StringBuffer sb1 = new StringBuffer("I Java!");
        sb1.insert(2, "like ");
        System.out.println(sb1);
        StringBuffer sb2 = new StringBuffer("abcdef");
        System.out.println(sb2);
        sb2.reverse();
        System.out.println(sb2);
        StringBuffer sb3 = new StringBuffer("This is a test.");
        sb3.delete(4, 7);
        System.out.println("After delete: " + sb3);
        sb3.deleteCharAt(0);
        System.out.println("After deleteCharAt: " + sb3);

    }
}
