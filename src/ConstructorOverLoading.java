class Bank{
    public void name(){
        System.out.println("Bank");
    }
}

class Sbi extends Bank{
    private int bal;
    public int getBal(){
        return bal;
    }
    Sbi(){
        bal = 0;
    }
    Sbi(int bal){
        this.bal = bal;
    }
}

class Hdfc extends Bank{
    String ifsc;
    Hdfc(){
        ifsc = "null";
    }
    Hdfc(String ifsc){
        this.ifsc = ifsc;
    }
}

public class ConstructorOverLoading {
    public static void main(String[] args) {
        Sbi s = new Sbi(1000);
        System.out.println(s.getBal());

        Hdfc h = new Hdfc("IDIb00124");
        System.out.println(h.ifsc);
    }
}
