package AkshaySir;

import java.util.*;

public class MapSort {

   static Map<Integer , String> mapSort(Map<Integer , String > map){


       String arr[] = new String[map.size()];
       int i=0;
       for(Map.Entry<Integer , String> m :map.entrySet()){
            arr[i] = m.getValue();
            i++;
        }

        Arrays.sort(arr);

       Map<Integer , String > map1 = new LinkedHashMap<>();

       for(String s : arr) {
           for(Map.Entry<Integer , String> m : map.entrySet()){
               if(s.equals(m.getValue())){
                    map1.put(m.getKey() , s);
               }
               else{;}
           }
       }


       return map1;
    }
    public static void main(String [] args){
        Map<Integer , String> map = new LinkedHashMap<>();
        System.out.println("Enter how many numbers you want to add");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        for(int i =0 ; i<number ; i++) {
            int key = scanner.nextInt();
            String value = scanner.next();
            map.put(key , value);
        }

        System.out.println("\n Printing before sorting ");
        for(Map.Entry  m : map.entrySet()){
            System.out.println(m.getKey()+" "+ m.getValue());

        }

        Map<Integer , String> map1 = mapSort(map);

        for(Map.Entry m : map1.entrySet()){
            System.out.println( m.getKey()+" "+m.getValue());

        }




    }
}
