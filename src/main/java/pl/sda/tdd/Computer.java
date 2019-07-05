package pl.sda.tdd;

import lombok.AllArgsConstructor;
import lombok.SneakyThrows;

import java.io.BufferedReader;
import java.io.InputStreamReader;

@AllArgsConstructor
public class Computer {

    private Keyboard keyboard;
    private Display display;

    void operate() {
        String text = keyboard.readInput();
        display.display(text);
    }

    public static void main(String[] args) {

        Keyboard keyboard = new Keyboard(new BufferedReader(new InputStreamReader(System.in)));
        Display display = new Display();

        Computer computer = new Computer(keyboard, display);

        while (true) {
            computer.operate();
        }
    }
}

@AllArgsConstructor
class Keyboard {

    private BufferedReader reader;

    @SneakyThrows
    String readInput() {
        return reader.readLine();
    }
}

class Display {

    void display(String text) {
        System.out.println(text);
    }
}