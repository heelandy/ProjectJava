package projetoyoutube;

public class Projetoyoutube{
public static void  main(String[] args) {
    
    Video v = new Video("Programar");
    Userlog u[] = new Userlog[2];
    
    u[0] = new Userlog("Olivier", 22, "m", "oliv");
    u[1] = new Userlog("Anderson", 28, "m","andre");
    
    System.out.println(u[0].toString());
//  System.out.println(v.toString());
   }

}