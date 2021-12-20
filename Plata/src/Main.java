public class Main {

    public static void main(String[] args) {
        Vraboten vraboten = new Vraboten();
        vraboten.setIme("Ana");
        vraboten.setPrezime("Anevska");
        vraboten.setPlata("50500");

        XML xml = new XML();
        xml.createXMLFile("xml.xml", vraboten);
    }
}
