public class AirPlane implements Transport {
	
    @Override
    public void carry(Cargo cargo) {
		System.out.println(cargo.getName() + " transported by airplane.");
    }
	
}
