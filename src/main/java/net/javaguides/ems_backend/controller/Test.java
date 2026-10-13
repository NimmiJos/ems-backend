package net.javaguides.ems_backend.controller;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String args[], int i) {

        List<Integer> nums = List.of(1, 3, 4, 2, 3, 4, 6, 8, 4, 6, 43, 56);
        List<String> names = List.of("nimm", "fssfdf", "terwerwe");

        List<Integer> numb = new ArrayList<Integer>();

        for (int ii = 0; i < 100000; i++) {
            numb.add(i);
        }

       /* List<Person> person = new ArrayList<Person>(Arrays.asList(
                new Person("sdfsdf", 45),
                new Person("fsdfsdf", 42),
                new Person("dfgdfg", 43)
        ));

        List<Person> result = person.stream().sorted(Comparator.comparingInt(e -> -1 * e.getAge())).limit(2).toList();
        System.out.println(result);*/


       /* Optional<String> long1 = names.stream().max(Comparator.comparing(e -> e.length()));
        if(long1.isPresent())
            System.out.println("Long " + long1.get());
*/
       /* Map<Boolean, List<Integer>> elements = nums.stream()
                .collect(Collectors.partitioningBy(e -> e % 2 == 0));

        System.out.println("Elements : " + elements);*/

        // System.out.println(nums.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().get());

        //System.out.println(list);
        // List<Integer> list = nums.stream().distinct().sorted(Comparator.reverseOrder()).toList();

        /*List<Integer> list =  nums.stream().filter(m -> m%2 == 0)
                        .map(n -> n*n)
                                .toList();*/


    }
}

/*HashMap<String, Integer> map = new HashMap<>();
        map.put("Nimmi", 29);
        map.put("asdsf", 40);

           map.entrySet().stream()
                .filter(e -> e.getValue()>20)
        .forEach(e -> System.out.println(e.getKey() + " " + e.getValue()));

        for(Map.Entry<String, Integer> e: map.entrySet()){
        System.out.println(e.getKey());
        }

        for(var e: map.entrySet()){
        System.out.println(e.getValue());
        }*/
       /* List<Integer> numbers = List.of(2, 4, 3, 5, 1, 3, 2);

        Optional<Integer> num = (numbers.stream().reduce(Integer::sum));
        System.out.println(num.get());

        int[] arr = {1, 2, 4, 2, 4, 54};
        System.out.println(Arrays.stream(arr).max().getAsInt());*/


       /* String str = "Now is the winter";
        Map<String, Long> charFreq = Arrays.stream(str.split("")).collect(
                Collectors.groupingBy(
                        Function.identity(), // or x -> x
                        Collectors.counting()
                )
        );*/

       /* String str = "Now is the winter";
        Map<String, Long> charFreq = Arrays.stream(str.split("")).collect(
                Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()
                ));
        System.out.print("Char Count "+ charFreq);*/

//Fibonacci Series
//0,1,1,2,3,5,8
        /*int n = 10;
        int first = 0;
        int second = 1;
        int next;

        for (int i=0; i<n; i++){
            System.out.println("Fibonacci Series : " + first + " "); //i = 0
            next = first + second;
            first = second;
            second = next;

        }

        */


//List<String> words = List.of("hello", "world");
//List<String> uppercaseWords = words.stream().map(String::toUpperCase).toList();
//System.out.println("Uppercase Words: " + uppercaseWords);

//List<Integer> num = List.of(2, 1, 4, 6, 8);


    /*List<String> uppercaseWords = words.stream()
            .map(String::toUpperCase)
            .collect(Collectors.toList());*/
//System.out.println(uppercaseWords);
//System.out.println("Uppercase Words: " + uppercaseWords);





  /*  public boolean isPrime(int n){
        if (n < 1) return false;
    for (int i=2; i<n; i++){
        if (n%2 == 0) return true;
    }
        return false;
    }*/

    /*Map<String, Integer> map = new HashMap<>();
    map.put("Alice", 30);
    map.put("sdfsdf", 40);*/




