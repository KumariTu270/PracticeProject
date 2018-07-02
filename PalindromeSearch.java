package AkshaySir;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PalindromeSearch {

    static int palindrome(String input){
        if(input.length()==1)
            return 1;
        else {
            int  countOdd=0;
            Map<Character, Integer> frequencies = new HashMap<>();
            for (char ch : input.toCharArray())
                frequencies.put(ch, frequencies.getOrDefault(ch, 0) + 1);

            if(frequencies.size()==1)
                return 1;
            else{
                int i =0;
                int arr[] = new int[input.length()];
                for (Map.Entry m : frequencies.entrySet()) {
                   arr[i]  = (int) m.getValue();
                    i++;
                }
                Arrays.sort(arr);

                for(i=0 ; i<arr.length ; i++){
                    if(arr[i] %2 !=0)
                    {
                        countOdd +=1;
                    }
                }
                if(countOdd==1){
                    return 1;
                }
                else
                {
                    return 0;
                }


            }
        }

    }

    public static void main(String []args)
    {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        int output = palindrome(s);
        if(output==1){
            System.out.println("Yes! Palindrome possible");
        }
        else{
            System.out.println("Not possible");
        }



    }
}