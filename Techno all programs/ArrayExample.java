import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;







public class ArrayExample{
    public static void main(String[] args) {
        List <Integer> list = new ArrayList<>();
        list.add(30);
        list.add(40);
        list.add(33);
        list.add(12);
        list.add(39);
        for(Integer no : list){
            if(no%2==0){
                System.out.println(no);
            }
        }
        

    }
    
}
