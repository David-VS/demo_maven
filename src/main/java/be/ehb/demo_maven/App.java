package be.ehb.demo_maven;


import org.apache.commons.lang3.tuple.Pair;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Pair<String, String> pair = Pair.of("Left", "Right");
        System.out.println(pair);

    }
}
