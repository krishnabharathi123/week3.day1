package week3.day1;

public class BankInfo extends AxisBank {

	public void saving() {
		System.out.println("savings is 50,000");
	}

	public int fixed() {
		System.out.println("Fixed amount is 10000");
		return 100;
	}

	@Override
	public int deposit() {
		System.out.println("deposit is 50000");
		return 5000;
	}

	public static void main(String[] args) {
		BankInfo bank = new BankInfo();
		bank.deposit();
		bank.fixed();
		bank.saving();
	}

}