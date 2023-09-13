package earlyBinding4;

public class TestLock {
	public static void main(String[] args) {
		Lock l1 = new Lock(100);
		l1.k1.check();
		l1.open();
	}
}
