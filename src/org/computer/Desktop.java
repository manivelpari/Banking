package org.computer;

public class Desktop extends Computer {
public void desktopSize() {
	System.out.println("Desktop Size : 24 inch");
}
public static void main(String[] args) {
	Desktop d = new Desktop ();
	d.desktopSize();
	d.compputerModel();
}


}
