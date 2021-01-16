public class Main {

    public static void main(String[] args) {
	Address Address1 = new Address();
	        Address1.setIndex(76570);
            Address1.setCountry("Ukraine");
	        Address1.setCity("Kiev");
	        Address1.setStreet("Vasilevska");
	        Address1.setHouse(834);
	        Address1.setApartment(12);
		    System.out.println( Address1.getIndex() + " " + Address1.getCountry() + " " + Address1.getCity() + " " + Address1.getStreet() + " " + Address1.getHouse()+""+Address1.getApartment());
    }

}
