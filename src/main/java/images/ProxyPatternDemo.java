package images;

public class ProxyPatternDemo {
    public static void main(String[] args) {
        ProxyImage prox = new ProxyImage("smth.png");
        prox.display();
    }
}
