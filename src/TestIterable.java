import java.util.ArrayList;
import java.util.Iterator;

public class TestIterable {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("hsvf");
        list.add("hsvf");
        list.add("hsvf");
        list.add("hsvf");
        for (String e1 : list){
            System.out.print(e1+" ");
        }
        System.out.print("\n");
        Iterator<String> i = list.iterator();
        while (i.hasNext()){
            System.out.print(i.next()+" ");
        }
        System.out.print("\n");
        for (Iterator<String> it = list.iterator(); it.hasNext();){
            System.out.print(it.next()+" ");
        }
    }
}
