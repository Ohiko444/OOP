package Numbers;


public class Main {

    public static void displayArray(int[] array) {
        for (int element: array) {
            System.out.print(element + " ");
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
            if (buffer instanceof int[]) {
                int[] bufferArray = (int[]) buffer;
                displayArray(bufferArray);
            }
            else System.out.println(buffer);
        }

        Iterator secondIterator = numbers.createSecondIterator();

        // пункт 2
        System.out.println("\nРезультат второго итератора");
        while (secondIterator.hasNext()) {
            Object buffer = secondIterator.next();
            if (buffer instanceof int[]) {
                int[] bufferArray = (int[]) buffer;
                displayArray(bufferArray);
            }
            else System.out.println(buffer);
        }
        

        // пункт 3
        Iterator iterator3 = numbers.createThirdIterator();

        System.out.println("\nРезультат третьего итератора");
        while (iterator3.hasNext()) {
            Object buffer = iterator3.next();
            System.out.println(buffer);
        }

    }
}
