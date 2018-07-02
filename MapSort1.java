package AkshaySir;

import java.util.*;


public class MapSort1 {
    static<E , T> Map<E , T> mapSort1(Map<E  , T> map){


        Object arr[] = new Object[map.size()];
        int i=0;
        for(Map.Entry<E, T> m :map.entrySet()){
            arr[i] = m.getValue();
            i++;
        }

        Arrays.sort(arr);

       Map<E , T > map1 = new LinkedHashMap<>();

        for(Object s : arr) {
            for(Map.Entry<E , T> m : map.entrySet()){
                if(s.equals(m.getValue())){
                    map1.put(m.getKey() , (T) s);
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

        System.out.println("\n Printing After sorting ");

        Map<Integer , String> map1 = mapSort1(map);

        for(Map.Entry m : map1.entrySet()){
            System.out.println( m.getKey()+" "+m.getValue());

        }




    }
}
