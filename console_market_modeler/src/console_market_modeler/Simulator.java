package console_market_modeler;

import java.util.ArrayList;
import java.util.List;

public class Simulator {
    private static List<Console> consoles = new ArrayList<Console>();

    public static void main(String[] args) {
        Integer total_consoles_released = 0;
        // Setup
        for (int i = 1; i <= 3; i++) {
            total_consoles_released++;
            Console new_console = new Console(Integer.toString(total_consoles_released), 5000);
            consoles.add(new_console);
        }

        for (int i = 1; i <= 10; i++) {
            applyConsoleEvents();
            if (i % 3 == 0) {
                total_consoles_released++;
                Console new_console = new Console(Integer.toString(total_consoles_released), 5000);
                consoles.add(new_console);
            }
            printConsoleMarket(i);
        }
    }

    public static void printConsoleMarket(int year) {
        Integer total_market_size = 0;
        Integer hash_marks = 0;
        Float percentage = (float) 0;
        String line;
        System.out.println("");
        System.out.println("---- Year " + Integer.toString(year) + " ----");
        for (Console console : consoles) {
            total_market_size += console.getUsers();
        }
        for (Console console : consoles) {
            line = console.getName();
            percentage = (console.getUsers().floatValue() / total_market_size.floatValue()) * 100;
            line += "|" + Float.toString(percentage) + "|";
            hash_marks = console.getUsers() / 1000;
            for (int i = 0; i < hash_marks; i++) {
                line += "#";
            }
            System.out.println(line);

        }

    }

    public static void applyConsoleEvents() {
        int eventstate = 1;

        for (Console console : consoles) {
            int console_users = console.getUsers() + (eventstate * 1000);
            console.setUsers(console_users);

            if (console.getUsers() < 1000) {
                consoles.remove(console);
            }

            if (eventstate <= -1) {
                eventstate = 1;
            } else {
                eventstate--;
            }

        }

    }

}
