class ConcreteObservable extends Observable{
State st;
public ConcreteObservable(State s)
{
	super(s);
	st=s;
}
public void notify()
{
this.st=notify();
}
   
}