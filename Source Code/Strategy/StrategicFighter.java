public class StrategicFighter implements Strategy {
  public String strategy;

   public StrategicFighter(String fighter){
      this.strategy = fighter;
   }
   public Fighter findOpponent(){
      if(strategy.equalsIgnoreCase("Batman"))
      {
      	return CreateJoker.getInstance();
      }
      else if(strategy.equalsIgnoreCase("joker"))
      {
      	return CreateBatman.getInstance();
      }
      else if(strategy.equalsIgnoreCase("Flash"))
      {
      	return CreateZoom.getInstance();
      }
      else if(strategy.equalsIgnoreCase("Zoom"))
      {
      	return CreateFlash.getInstance();
      }
      else if(strategy.equalsIgnoreCase("Scorpion"))
      {
      	return CreateSubZero.getInstance();
      }
      else if(strategy.equalsIgnoreCase("SubZero"))
      {
      	return CreateScorpion.getInstance();
      }
   }
}