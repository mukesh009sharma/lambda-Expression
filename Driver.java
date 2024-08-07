@FunctionalInterface
interface _funcTinterface{
    void showdata();
  default void data(){
    System.out.println("DATA>..........");
  }      
}

public class Driver{
    public static void main(String[] args) {
   _funcTinterface imp=()->System.out.println("This is s chid");  
   imp.showdata();
   imp.data();
   System.out.println(imp);
}}