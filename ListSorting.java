package AkshaySir;


import java.util.*;

public class ListSorting {

    static<E> List<E> sort(E [] arr){
        Map<E, Integer> frequencies = new HashMap<>();
        for(E a : arr){
            frequencies.put(a , frequencies.getOrDefault(a , 0)+1);
        }
        List a = new ArrayList();
        List a1 = new ArrayList();

        for(Map.Entry m : frequencies.entrySet()){

            if((int)m.getValue() == 1) {
                a.add((Object) m.getKey());
            }
            else{
                a1.add((Object) m.getKey());

            }
        }

        Collections.sort(a);
        Collections.sort(a1);
        List<E> list = new ArrayList<>();
        list.addAll(a);
        list.addAll(a1);
        return list;
    }

    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements : ");
        int number = scanner.nextInt();
        System.out.println("Enter the numbers now : ");
        Integer arr[] = new Integer[number];
        for(int i =0 ; i<number ; i++){
            arr[i]=scanner.nextInt();
        }

        List<Integer> list = sort(arr);

        System.out.println(list);
    }

}
