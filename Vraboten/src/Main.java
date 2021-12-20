import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Vraboten> v = new ArrayList<Vraboten>();

        v.add(new Vraboten("Petar", "Petrovski", "14500"));
        v.add(new Vraboten("Mitre", "Mitrevski", "16800"));
        v.add(new Vraboten("Jove", "Jovevski", "35700"));

        XML xml = new XML();
        xml.createXMLFile("xml.xml", v);
    }
}