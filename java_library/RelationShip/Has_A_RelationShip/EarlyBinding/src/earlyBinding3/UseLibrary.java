package earlyBinding3;
public class UseLibrary {
	public static void main(String[] args) {
		Library l1 = new Library(40);
		l1.b1.read();
		l1.use();
	}

}
