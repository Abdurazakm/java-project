package inheritance.interfaces;

// Define two interfaces
interface Printable {
    void print();
}

interface Showable {
    void show();
}

// A class implementing multiple interfaces
class Document implements Printable, Showable {
    @Override
    public void print() {
        System.out.println("Document is printing...");
    }

    @Override
    public void show() {
        System.out.println("Document is showing...");
    }
}

public class MultiInterfaceDemo {
    public static void main(String[] args) {
        Document doc = new Document();
        doc.print();
        doc.show();
    }
}
