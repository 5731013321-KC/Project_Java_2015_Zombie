package logic;

public class Player {
	
	private String name;
	private int coin = 0;
	
	public Player(){
	
	}
	
	public synchronized void increaseCoin(int coin){
		this.coin += coin;
	}
	
}
