package report1;
public abstract class Mail{
    public abstract void open();
    public abstract void strings();
    public abstract void close();
    public final void display(){
        open();
        strings();
        close();
    }
    
}