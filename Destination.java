package report1;
public class Destination extends Mail{
    private String S;
    public Destination(String s){
        this.S=s;
    }
    public void open(){
    }

    public void  strings(){
        System.out.print(S);
    }

    public void close(){
        System.out.println(" 様");
    }

}