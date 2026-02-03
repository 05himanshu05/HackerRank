package applePractice;

import java.util.*;
import java.util.stream.Collectors;

public class GECodePractice {
    static void main() {
        Employee employee = new Employee("",0.0);

        System.out.println(reverseString("himanshu"));

        System.out.println(firstNonRepeated("himanshu"));

        System.out.println(isPalandrom(121));

        System.out.println(isStringPalandrom("mam"));

        System.out.println(isStringPalandromBetterApproach("dam"));

        int[] a = {1,2,3,4,1,6,6,7,8,8};
        duplicatedInArray(a);

        HashMap<String,Integer> map = new HashMap<>();

        // sorted map by Value
        map.entrySet().stream().sorted(Map.Entry.comparingByValue()).collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,
                (e3,e4)->e3,LinkedHashMap::new));

        // sorted map by Key
        map.entrySet().stream().sorted(Map.Entry.comparingByKey()).collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(e3,e4)->e3,LinkedHashMap::new));

        // Second Highest Number
        List<Integer> numbers = Arrays.asList(10, 5, 20, 15, 20);
        Optional<Integer> first = numbers.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst();
        System.out.println(first.get());

        // Sorting of employee first by salary then by name
        /*List<Employee> sorted = employees.stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary)
                        .thenComparing(Employee::getName))
                .toList();*/

        List<Integer> numb = List.of(1, 2, 3, 4, 5, 6, 7, 8);

        Map<Boolean, List<Integer>> partition = numb.stream().filter(Objects::nonNull).collect(Collectors.partitioningBy((n -> n % 2 == 0)));

        List<Integer> even = partition.get(true);
        List<Integer> odd = partition.get(false);
        System.out.println("Even numbers are = " + even);
        System.out.println("Odd numbers are = " + odd);

        removeDuplicateCharFromString("hiimamm");

    }


    public static String reverseString(String s) {
        char[] charArray = s.toCharArray();
        int left = 0 ;
        int right = charArray.length-1;

        while (left<right) {
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;
            left++;
            right--;
        }

        return new String(charArray);
    }

    public static char firstNonRepeated(String s) {
        Character key = null;

        HashMap<Character,Integer> map = new HashMap<>();
        char[] words = s.toCharArray();

        for(char word:words) {

            map.put(word,map.getOrDefault(word,0)+1);
        }
        Set<Map.Entry<Character, Integer>> entries = map.entrySet();
        for (Map.Entry<Character, Integer> entry :entries) {
                if (entry.getValue()==1){
                    key = entry.getKey();
                    break;
                }
        }

        return key;
    }

    public static boolean isPalandrom(int num) {
        boolean flag = false;
        int reversed_n = 0;
        int temp = num;
        while (num>0) {
            int remainder = num % 10;
            reversed_n = (reversed_n * 10) + remainder;
            num = num / 10;
        }
        if(reversed_n == temp) {

            flag = true;
        }
        return  flag;
    }

    public static boolean isStringPalandrom(String s) {
        char[] charArray = s.toCharArray();
        int left = 0 ; int right = charArray.length-1;
        while (left < right) {
            char t = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = t;
            left++;
            right--;
        }

        String string = new String(charArray);
        return string.equals(s);
    }

    public static boolean isStringPalandromBetterApproach(String s) {
        int left = 0 ; int right = s.toCharArray().length-1;
        while (left< right) {
            if (s.charAt(left)!= s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void duplicatedInArray(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for (int i=0;i<arr.length;i++){

            if (set.contains(arr[i])){
                System.out.println("found duplicate num = " + arr[i]);
            }
            set.add(arr[i]);
        }
    }

    public static void removeDuplicateCharFromString(String s) {
    HashMap<Character,Integer> map = new HashMap<>();
    StringBuffer sb = new StringBuffer();
        for (char c : s.toCharArray()) {
            if (!map.containsKey(c)){
                map.put(c,1);
            }
        }

        for (Map.Entry entry:map.entrySet()) {

            Object value = entry.getKey();
            sb.append(value);
        }

        System.out.println(sb);
    }
}
