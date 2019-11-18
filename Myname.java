package report1;
public class Myname extends Mail{
    private String S;
    public Myname(String s){
        this.S=s;
    }
    public void open(){
        printline();
    }

    public void  strings(){
        System.out.println(S);
    }

    public void close(){
    }

    public void printline(){
        for(int i=0; i<30; i++){
            System.out.print("*");
        }
        System.out.println("*");
    }
    
}