import java.util.*;
public class Task3_1 {
    public static void main(String[] args){
        List<Integer> sll= new LinkedList<>(List.of(1,2,3,4,5,6,7,8,9));
        System.out.println(sll);
        Collections.reverse(sll);
        System.out.println(sll);
    }
}

