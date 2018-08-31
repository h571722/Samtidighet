/**
 * 
 */
package no.hvl.dat108;

/**
 * @author jocef
 *
 */
public class klient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Buffer buff = new Buffer();
		Producer p = new Producer(buff);
		Consumer c = new Consumer(buff);
		Thread t1 = new Thread(p);
		Thread t2 = new Thread(c);
		t1.start();
		t2.start();

	}

}
