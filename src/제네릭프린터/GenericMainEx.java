package 제네릭프린터;

public class GenericMainEx {
    public static void main(String[] args) {
        //
        GenericPrinter<Powder> powderPrinter = new GenericPrinter<>();
        powderPrinter.setMaterial(new Powder());
        Powder powder = powderPrinter.getMaterial();
        powderPrinter.printing();

        GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<>();
        plasticPrinter.setMaterial(new Plastic());
        Plastic plastic = plasticPrinter.getMaterial();
        System.out.println(plastic.toString());
        plasticPrinter.printing();

        GenericPrinter<Nylon> nylonPrinter = new GenericPrinter<>();
        nylonPrinter.setMaterial(new Nylon());
        nylonPrinter.printing();

    }
}
