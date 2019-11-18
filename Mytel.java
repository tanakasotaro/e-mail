package report1;
public class Mytel extends Mail{
    private String S;
    public Mytel(String s){
        this.S=s;
    }
    public void open(){
        System.out.println(" ");
    }

    public void  strings(){
        System.out.println("TEL : "+S);
    }

    public void close(){
        printline();
    }

    public void printline(){
        for(int i=0; i<30; i++){
            System.out.print("*");
        }
        System.out.println("*");
    }
    
}