// interface I1{
//     void add(int a,int b);
// }
// class Lambda{
//     public static void main(String[] args) {
//         I1 ref=(a,b)-> System.out.println(a+b);
//         ref.add(5,6);
//     }
// }


// interface I1{
//     void subtract(int a,int b);
// }
// class Lambda{
//     public static void main(String[] args) {
//         I1 ref=(a,b)-> System.out.println(a-b);
//         ref.subtract(5,6);
//     }
// }


// interface I1{
//     void mul(int a,int b);
// }
// class Lambda{
//     public static void main(String[] args) {
//         I1 ref=(a,b)-> System.out.println(a*b);
//         ref.mul(5,6);
//     }
// }




interface I1{
    void divide(int a,int b);
}
class Lambda{
    public static void main(String[] args) {
        I1 ref=(a,b)-> System.out.println(a/b);
        ref.divide(5,6);
    }
}



