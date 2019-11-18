package report1;
public class Text extends Mail{
    private String S;
    public Text(String s){
        this.S=s;
    }
    public void open(){
        System.out.println(" ");
    }

    public void  strings(){
        System.out.println(S);
    }

    public void close(){
        System.out.println(" ");
    }
    
    
}