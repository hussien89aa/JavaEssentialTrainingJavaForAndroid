package java8;

public class PlayGameClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Lambda experssion
		PlayGame myPlayGame= (x, y)-> {
			System.out.println("x:"+ x);
			System.out.println("y:"+ y);
			System.out.println(" game is on");
		};
		myPlayGame.play(3,7);
		 
		// without Lambda
		myplayGamClass myclassinstance = new myplayGamClass();
		myclassinstance.play();
	}
static class myplayGamClass implements PlayGame{
		public void play(){
			System.out.println(" game is on");
		}
	}

}
