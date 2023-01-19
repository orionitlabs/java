
package class4.sri;
public class NewCar {
    public static void main(String[] args) {
        String engineNumber;
        Honda honda = new Honda();
        honda.setModel("Cvic");
        honda.setColor("Silver");
        honda.setMake("2008");
        engineNumber = honda.engineNumber(honda.getMake());
        System.out.println("HONDA");
        System.out.println("Model : "+honda.getModel()+", Color : "+honda.getColor()+", Make : "+honda.getMake()+", EngineNumber : "+engineNumber);

        Toyota toyota = new Toyota();
        toyota.setModel("Camry");
        toyota.setColor("Black");
        toyota.setMake("2012");
        engineNumber = toyota.engineNumber(toyota.getMake());
        System.out.println("TOYOTA");
        System.out.println("Model : "+toyota.getModel()+", Color : "+toyota.getColor()+", Make : "+toyota.getMake()+", EngineNumber : "+engineNumber);
    }
}
