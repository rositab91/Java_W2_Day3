package Exercise1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {

	public static void main(String[] args) {

		Logger log = LoggerFactory.getLogger(Main.class);

		FirstThread t1 = new FirstThread();

//posso assegnare un nome a un thread
		t1.setName("Thread Alfa");

		SecondThread t2 = new SecondThread();
		t2.setName("Thread Beta");

		// non devo chiamare il metodo .run(), altrimenti saro' sul main thread
		// se chiamo .start() viene creato un nuovo thread che chiamera' il metodo run
		t1.start();
		t2.start();

	}

}
