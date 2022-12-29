import java.util.*;
import java.util.stream.Collectors;

public class SimpleStreamAPIExamples {
//    Count empty strings in the list
    static long example1(List<String> list){
        long count=list.stream()
                .filter(x->x.isEmpty())
                .count();
        return count;
    }
//   Count the number of strings with length greater than 3
    static long example2(List<String> list){
        long count=list.stream()
                .filter(x->x.length()>3)
                .count();

        return count;
    }
//    Count the number of strings with length greater than 3 and having a in them
    static long example3(List<String> list){
        long count=list.stream()
                .filter(x->x.length()>3)
                .filter(x->x.contains("a"))
                .count();
        return count;
    }

//    Count the number of strings with length greater than 3 and that starts with a
    static long example4(List<String> list){
        long count=list.stream()
                .filter(x->x.length()>3)
                .filter(x->x.startsWith("a"))
                .count();
        return count;
    }
//    Remove all the empty strings from the list
    static long example5(List<String> list){
        long count=list.stream()
                .filter(x->!x.isEmpty())
                .count();
        return count;
    }
//    Create a list of string with string greater than 2 characters
    static List<String> example6(List<String> list){
        List<String> temp=list.stream()
                .filter(x->(x.length()>2))
                .collect(Collectors.toList());
        return temp;
    }
//    Convert String to uppercase and join them with comma
    static String example7(List<String> list){
        String temp=list.stream()
                .map(x->x.toUpperCase())
                .collect(Collectors.joining(", "));
        return temp;
    }
//    Create a list of square of all distinct numbers
    static List<Integer> example8(List<Integer> list){
        List<Integer> temp=list.stream()
                .map(i->i*i)
                .distinct()
                .collect(Collectors.toList());
        return temp;
    }
//  Count min max sum and the average for numbers
    static IntSummaryStatistics example9(List<Integer> list){
        return list.stream()
                .mapToInt((x)->x)
                .summaryStatistics();
    }

    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("abhishek");
        list.add("handa");
        list.add("");
        list.add("");
        list.add("Concordia");
        list.add("University");
        System.out.println(example1(list));
        System.out.println(example2(list));
        System.out.println(example3(list));
        System.out.println(example4(list));
        System.out.println(example5(list));
        List<String> temp = example6(list);
//        for(String str:temp){
//            System.out.println(str);
//        }
        System.out.println(example7(list));
        System.out.println(example8(Arrays.asList(1,2,3,4,5,6,7,8,9)));
        System.out.println(example9(Arrays.asList(2,3,5,7,11,13,17)));
    }
}