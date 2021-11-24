package images;

public class RealImage implements Image{
    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFromDisk();
    }

    @Override
    public void display() {
        System.out.println("I am real image!");
    }

    public void loadFromDisk() {
        System.out.println("Loading...");
    }
}
