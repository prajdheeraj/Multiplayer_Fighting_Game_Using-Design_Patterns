public class Dead implements State {

   public void endgame(Context context) {
      System.out.println("Player Dead");
      //Player Died and Code to restart or Quit the game to Game menu
      context.setState(this);	
   }

   public String toString(){
      return "Dead";
   }
}
