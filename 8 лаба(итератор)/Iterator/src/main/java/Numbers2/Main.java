package Numbers2;

public class Main {

    public static void displayArray(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Numbers numbers = new Numbers();

        Iterator firstIterator = numbers.createFirstIterator();

        // пункт 1
        System.out.println("Результат первого итератора:");
        while (firstIterator.hasNext()) {
            Object buffer = firstIterator.next();
            System.out.println(buffer);
        }

        Iterator secondIterator = numbers.createSecondIterator();

        // пункт 2
        System.out.println("\nРезультат второго итератора");
        while (secondIterator.hasNext()) {
            Object buffer = secondIterator.next();
            if (buffer instanceof String) {
                String bufferArray = (String) buffer;
                displayArray(bufferArray);
            }
            else System.out.println(buffer);
        }
    }
}
