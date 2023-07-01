interface interfac11
{
  void add();
  void sub();


}
interface interfac011
{
    int a=10;
    int b=20;

}
class interfac0011 implements interfac11,interfac011
{
    @Override
    public void add() {
        System.out.println("enetr a add:"+(a+b));
    }

    @Override
    public void sub() {
        System.out.println("enetr a sub:"+(b-a));
    }

    public static void main(String[] args) {
        interfac0011 obj=new interfac0011();
        obj.add();
        obj.sub();
    }
}