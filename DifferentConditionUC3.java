package com.bridgelab.snakeandladder;

public class DifferentConditionUC3 {
	static int PLAYER_POINTS = 0;

	static int random_value(int maxi) {
		int roll = (int)(Math.floor(Math.random()*10) % (maxi)) + 1;
		return roll;
	}
	
	static int snake(int die, int player) {
		System.out.println("Oops, snake is here. you have to go down at position " + die);
		int temp = player - die;
		if (temp <= 0)
			player = player - 0;
		else
			player = temp;
		return player;
	}
	
	static int ladder(int die, int player) {
		System.out.println("You got Ladder, Game continuous " + die);
		int temp = player + die;
		if (temp <= 100)
			player = temp;
		return player;
	}
	
	static int calculation(int player) {
		System.out.println("current position of player " + player);
		int die_number = random_value(6);
		System.out.println("Die Number " +die_number);

		int option = random_value(3);
		System.out.println("Option is " +option);

		if (option == 1) {
			int result = ladder(die_number, player);
			return result;
		}
		else if(option == 2) {
			int result = snake (die_number, player);
			return result;
		}
		else {
			System.out.println("No Play = 0");
			return player;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PLAYER_POINTS = calculation(PLAYER_POINTS);
		System.out.println("Points of player is " + PLAYER_POINTS);
	}

}
