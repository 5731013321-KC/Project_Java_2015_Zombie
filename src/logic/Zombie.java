package logic;

public class Zombie implements ICharacter {
	protected int x, y, hp, atk, moveSpeed, moveDirection, reward;

	public Zombie(int x, int y, int hp, int atk, int moveSpeed, int moveDirection, int reward) {
		this.x = x;
		this.y = y;
		this.hp = hp;
		this.atk = atk;
		this.moveSpeed = moveSpeed;
		this.moveDirection = moveDirection;
		this.reward = reward;
	}

	@Override
	public void move() {

	}

	@Override
	public void decreaseHP() {

	}

	@Override
	public boolean isDead() {
		// TODO Auto-generated method stub
		return false;
	}

}
