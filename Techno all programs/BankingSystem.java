
import java.util.Scanner;

class RBI {
	float getROI() {
		return 4.5f;
	}
}

class SBI extends RBI {
	// Override
	float getROI() {
		return 8.5f;
	}
}

class HDFC extends RBI {

	float getROI() {
		return 8.65f;
	}
}

class ICICI extends RBI {

	float getROI() {
		return 9.25f;
	}
}

public class BankingSystem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter bank name");

		String bankName = sc.next();
		RBI r1 = null;

		if (bankName.equalsIgnoreCase("HDFC")) {
			r1 = new HDFC(); // upcasting
		} else if (bankName.equalsIgnoreCase("SBI")) {
			r1 = new SBI();
		} else if (bankName.equalsIgnoreCase("ICICI")) {
			r1 = new ICICI();
		}

		if (r1 != null) {
			System.out.println(r1.getROI());
		} else {
			System.out.println("no data available for given bank name");
		}

	}

}