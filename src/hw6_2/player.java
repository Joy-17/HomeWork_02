package hw6_2;

public interface player {
	public default void move() {
		System.out.println("跑步");
	}
	
	
	public default void defend() {
		System.out.println("做防禦動作");
	}
}
