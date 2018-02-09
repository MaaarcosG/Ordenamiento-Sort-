import static org.junit.jupiter.api.Assertions.*;
import java.util.Random;
import org.junit.jupiter.api.Test;
/**
 * @author Marcos Gutierrez 			17909
 * @author Raul Monzon					17014
 */
class JUnit {
	private Random random;
	
	public JUnit() {
		random = new Random();
	}
	
	@Test
	int generarNumero() {
		int i = random.nextInt(3000);
		
		assert i >= 0 && i <10: String.format("no esta entre los numero", i);
		return i;
	}
	public static void main(String[] args) {
		JUnit junit = new JUnit();
		System.out.println(junit.generarNumero());
	}
}
