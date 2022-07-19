package day7;

public interface Basic {
	public void in_call();
	public void in_sms();
	public void out_call();
	public void out_sms();
}

interface x{
	
}

class Eseries implements Basic,x {
	public void in_call() {
		System.out.println("In Call of Eseries");
	}
	public void in_sms() {
		System.out.println("In sms of Eseries");
	}
	public void out_call() {
		System.out.println("Out Call of Eseries");
	}
	public void out_sms() {
		System.out.println("Out sms of Eseries");
	}
	public void wifi() {
		System.out.println("Wifi of Eseries");
	}
}

class Jseries implements Basic{

	public void in_call() {
		System.out.println("In Call of Jseries");
	}

	public void in_sms() {
		System.out.println("In sms of Jseries");
	}

	public void out_call() {
		System.out.println("Out Call of Jseries");
	}
	public void out_sms() {
		System.out.println("Out sms of Jseries");
	}
}
