public class Truck implements Transport {

    @Override
    public void carry(Cargo cargo) {
		System.out.println(cargo.getName() + " transported by truck.");
    }

}
