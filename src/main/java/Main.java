public class Main {

    public static void main(String[] args) {
        String carryMethod = "land";
        Transport transport = null;
        if(carryMethod.equals("land")) {
            transport = new Truck();
        }
        else if (carryMethod.equals("water")){
            transport = new Ship();
        }
        else if(carryMethod.equals("air")) {
            transport = new AirPlane();
        }
        Cargo cargo = new Cargo("Sugar");
        transport.carry(cargo);

    }

}
