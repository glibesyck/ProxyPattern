package images;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;


class RealImageTest {
    RealImage realImage = new RealImage("someone.png");
    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }


    @Test
    void display() {
        realImage.display();
        assertEquals(outputStreamCaptor.toString().trim(), "I am real image!");
    }

    @Test
    void loadFromDisk() {
        realImage.loadFromDisk();
        assertEquals(outputStreamCaptor.toString().trim(), "Loading...");

    }
}