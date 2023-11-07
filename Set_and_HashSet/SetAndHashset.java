import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetAndHashset {
    public static void main(String[] args){
        Set<String> names = new HashSet<>();
        names.add("Bobby");
        names.add("Walter");
        names.add("Saul");
        names.add("Jesse");
        
        names.remove("Bobby");
        
        // System.out.println(names.size());
        // System.out.println(names.contains("Saul"));

        // for(String name: names){
        //      System.out.println(name);
        // }
        Iterator<String> namesIterator = names.iterator();
        while(namesIterator.hasNext()){
             System.out.println(namesIterator.next());
        }
        //names.forEach( System.out::println);
        // names.clear();
        // System.out.println(names);
    }
}
