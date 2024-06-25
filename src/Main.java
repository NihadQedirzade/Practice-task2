import java.util.*;
import java.util.stream.Collectors;

//1.Cümlədə fərqli sözlərin sayını tapan program yazın.
//2.Şəxslərin adlarını və yaşlarını saxlayan bir Map yaradın. Yaşlarına görə şəxsləri qruplaşdırın və nəticəni çap edin.
//3.Stream-dən istifadə edib tək ədədlərin kvadratlarını tapan program yazın
//4.Mətndə unikal hərflərin tapılması.
public class Main {
    public static void main(String[] args) {
//sual 1
//        String cumle = "bu gun hava gozeldi. hava gozeldi";
//
//        long ferqlisoz = Arrays.stream(cumle.split("\\s+"))
//                .map(word -> word.replaceAll("[^a-zA-ZöçşğıüÖÇŞĞİÜ]", ""))
//                .map(String::toLowerCase)
//                .distinct()
//                .count();
//
//        System.out.println("Fərqli sözlərin sayı: " + ferqlisoz);

        //sual2
        // Şəxslərin adlarını və yaşlarını saxlayan bir Map yaradın
//        Map<String, Integer> people = new HashMap<>();
//        people.put("nihat", 30);
//        people.put("eli", 25);
//        people.put("heseneli", 30);
//        people.put("sabir", 25);
//        people.put("gunduz", 35);
//
//        Map<Integer, List<String>> peopleByAge = people.entrySet()
//                .stream()
//                .collect(Collectors.groupingBy(
//                        Map.Entry::getValue,
//                        Collectors.mapping(Map.Entry::getKey, Collectors.toList())));
//
//        // Nəticəni çap edin
//        peopleByAge.forEach((age, names) -> {
//            System.out.println("Yaş " + age + ": " + names);
//        });

//        //sual 3
//        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

//        List<Integer> oddSquares = numbers.stream()
//                .filter(n -> n % 2 != 0)
//                .map(n -> n * n)
//                .toList();
//
//        System.out.println("Tək ədədlərin kvadratları: " + oddSquares);

        //sual 4;
        String text = "Bu mətndə unikal hərfləri tapın.";

        Set<Character> unikaldeyer = text.chars()
                .filter(Character::isLetter) // Yalnız hərfləri seçir
                .mapToObj(c -> (char) c) // İnt dəyərləri char dəyərlərə çevirir
                .collect(Collectors.toSet());

        System.out.println("Unikal hərflər: " + unikaldeyer);

    }
}