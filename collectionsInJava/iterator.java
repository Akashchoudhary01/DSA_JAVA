// Iterator and list iterator
import java.util.*;
public class iterator {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add(100);
        al.add("Akash");
        al.add(69);
       System.out.println(al);

    /*
    
    //    fetching the data of the element using for loop
    for(int i=0; i<al.size();i++){
    // object o = al.get(i)
    // System.out.println(o);

        System.out.println(al.get(i));
    }
    // Usinh for each loop
    for(Object o:al){
        System.out.println(o);
    }
    // fetching the data using loop when the data is in collection is not recomended
    
    // So there was a concept called iterator which we use
    */   

    Iterator itr = al.iterator();
    while (itr.hasNext()){
        System.out.println(itr.next());
    }

   ListIterator litr=  al.listIterator(al.size());
   while (litr.hasPrevious()){
    System.out.println(litr.previous());
}



}
    
}
