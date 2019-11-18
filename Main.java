package report1;
public class Main{
    public static void main(String[] args){
        Mail m1 = new Destination("山田太朗");
        Mail m2 = new Text("新しい発注項目が出来上がりましたので共有いたします。\nご確認のほうよろしくお願いいたします。");
        Mail m3 = new Myname("田中聡太朗");
        Mail m4 = new Mytel("080-7783-7548");
        m1.display();
        m2.display();
        m3.display();
        m4.display();  
    }
}