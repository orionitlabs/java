package task4;

public class MyCar {

    public static void main(String[] args) {
        String engineNumber;
        BMW bmw = new BMW();
        bmw.setModel("IX1");
        bmw.setColor("Red");
        bmw.setMake("2009");
        engineNumber = bmw.engineNumber(bmw.getMake());
        System.out.println("BMW");
        System.out.println("Model : " + bmw.getModel() + ", Color : " + bmw.getColor() + ", Make : " + bmw.getMake() + ", EngineNumber : " + engineNumber);

    }
}

