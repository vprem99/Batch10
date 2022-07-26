package day7;

interface demoprem extends a, b {
	public void z();
}

interface a {
	public void x();
}

interface b {
	public void y();

}

public class InterfaceSecondExample implements a, b {
	public void y() {

	}

	public void x() {
	}
}

class human {
}

class basicActions {
}

class tiger extends human, basicActions{   // Not possible in Java
	
}