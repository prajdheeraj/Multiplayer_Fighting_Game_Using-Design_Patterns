public class Healthy implements State {

   public void gameplay(Context context) {
      System.out.println("Player is Healthy and ready to Fight");
      context.setState(this);	
   }
   public String toString(){
      return "Healthy";
   }
}