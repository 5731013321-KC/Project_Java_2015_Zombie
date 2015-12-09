package logic;

public class Player {
	
	private String name;
	private int coin = 0;
	
	public Player(){
		System.out.println("Kuy alll");
	}
	
	public synchronized void increaseCoin(int coin){
		this.coin += coin;
	}
	
}
