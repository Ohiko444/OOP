package Singleton6;

import java.io.*;

public class Main {
    public static void main(String[] args) {

        Singleton first = Singleton.getInstance();
        System.out.println(first);
        Singleton second = Singleton.getInstance();
        System.out.println(second);

    }
}
