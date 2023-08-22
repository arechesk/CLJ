public class Task2 {
    public static void swap(int a,int b){
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("a="+a+" b="+b);
    }
    public static void main(String[] args){
        int a=2;
        int b=7;
        swap(a,b);
    }
}
