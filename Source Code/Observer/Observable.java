public class Observable{

     Context c=new Context();
     State s=c.getState();
     public Observable(State s)
     {
      if(s!=(null))
      {
            this.s=s;
      }
     }
     public void notify()
     {
          state=c.setState(new Healthy());
          //Code to notify all fighters
     }
}
 