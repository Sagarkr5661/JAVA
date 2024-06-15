abstract class RBI{
    abstract int ROI();
}
class SBI extends RBI{
    int ROI(){
        return 8;
    }
}
class HDFC extends RBI{
    int ROI(){
        return 12;
    }
}
public class Abstractclass {
    public static void main(String[] args) {
        RBI ref=new SBI();
        System.out.println(ref.ROI());
        ref=new HDFC();
        System.out.println(ref.ROI());
    }
}




