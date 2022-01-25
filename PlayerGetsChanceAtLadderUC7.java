package com.bridgelab.snakeandladder;

public class PlayerGetsChanceAtLadderUC7 {
	static int PLAYER1_POINTS = 0;
	static int PLAYER2_POINTS = 0;
	static int COUNT = 0;
	static int LUCK=0;

	static int random_value(int maxi) {
		int roll = (int)(Math.floor(Math.random()*10) % (maxi)) + 1;

		return roll;
	}

	static int ladder(int die, int player) {
		System.out.println("You got Ladder, Game continuous " + die);
		int temp = player + die;
		if (temp <= 100)
			player = temp;
		return player;
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

	static int calculation(int player){
		System.out.println("current position of player = " + player);
		int die_number = random_value(6);
		System.out.println("dice number" + die_number);

		int option = random_value(2);
		System.out.println("option is" + option);

		if (option == 1) {
			int result = ladder(die_number, player);
			LUCK = 1;
			return result;
		}
		else {
			int result = snake(die_number, player);
			return result;
		}
	}
		

	public static void main(String[] args) {
		int play_again1 = 0;
		int play_again2 = 0;


		while (PLAYER1_POINTS < 100 && PLAYER2_POINTS < 100){



			while (play_again1 == 0){
				LUCK = 0;
				play_again1 = 1;
				System.out.println("player 1 executing");
				PLAYER1_POINTS= calculation(PLAYER1_POINTS);
				System.out.println("points of player 1 is " + PLAYER1_POINTS);

				if (LUCK == 1){
					System.out.println("player 1 can play again");
					play_again1 = 0;
					System.out.println("============================");
				}
				COUNT += 1;
			}

			while(play_again2 == 0){
				LUCK = 0;
				play_again2 = 1;
				System.out.println("player 2 executing");
				PLAYER2_POINTS= calculation(PLAYER2_POINTS);
				System.out.println("points of player 2 is " + PLAYER2_POINTS);

				if (LUCK == 1){
					System.out.println("player 2 can play again");
					play_again2 = 0;
					System.out.println("=============================");
				}
				COUNT += 1;
			}
			play_again1 = 0;
			play_again2 = 0;

		}

		if (PLAYER1_POINTS == 100){
			System.out.println("yeah,,, Player 1 won the game");
		}
		else{
			System.out.println("Yeah, Player 2 won the game");
		}

		System.out.println("total tossed= " + COUNT);

	}

}
