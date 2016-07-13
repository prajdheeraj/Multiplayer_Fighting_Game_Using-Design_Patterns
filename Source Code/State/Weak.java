public class Weak implements State {

   public void weak(Context context) {
      System.out.println("Player is weak and ready to die");
      //code to defend or attack faster
      context.setState(this);	
   }

   public String toString(){
      return "Weak";
   }
}