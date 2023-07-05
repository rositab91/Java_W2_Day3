package Exercise1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SecondThread extends Thread {
	private Logger log = LoggerFactory.getLogger(SecondThread.class);

	public SecondThread() {
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			try {
				log.info("#");
				Thread.sleep(1000);
			} catch (Exception e) {
				log.error(e.getMessage());
				e.printStackTrace();
			}
		}
	}
}