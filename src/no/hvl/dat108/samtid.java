package no.hvl.dat108;

public class samtid {

	public static void main(String[] args) {
		Buffer b = new Buffer();
		Consumer c1 = new Consumer(b);
		Producer p1 = new Producer(b);
		
		
		p1.run();
		c1.run();

		
	}
}
