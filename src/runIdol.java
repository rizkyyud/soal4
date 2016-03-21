import java.util.ArrayList;
import java.util.Scanner;
public class runIdol {
        public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
       ArrayList<idolgroup>listIdol = new ArrayList<>();
       idolgroup member1 = new idolgroup();
       idolgroup member2 = new idolgroup();
       idolgroup member3 = new idolgroup();
       
         System.out.print("Nama       : ");
         member1.setNama(in.nextLine());
         System.out.print("Team       : ");
         member1.setTeam(in.next());
         System.out.print("Umur       : ");
         member1.setumur(in.nextInt());
         System.out.print("Penampilan : ");
         member1.setPenampilan(in.nextInt());
         System.out.print("Suara      : ");
         member1.setSuara(in.nextInt());
         System.out.print("Attitude   : ");
         member1.setAttitude(in.nextInt());
         System.out.println("========================="); 
         
         member2.setNama(in.nextLine());
         System.out.print("Nama       : ");
         member2.setNama(in.nextLine());
         System.out.print("Team       : ");
         member2.setTeam(in.nextLine());
         System.out.print("Umur       : ");
         member2.setumur(in.nextInt());
         System.out.print("Penampilan : ");
         member2.setPenampilan(in.nextInt());
         System.out.print("Suara      : ");
         member2.setSuara(in.nextInt());
         System.out.print("Attitude   : ");
         member2.setAttitude(in.nextInt());
         System.out.println("=========================");
            
         member3.setNama(in.nextLine());
         System.out.print("Nama       : ");
         member3.setNama(in.nextLine());
         System.out.print("Team       : ");
         member3.setTeam(in.nextLine());
         System.out.print("Umur       : ");
         member3.setumur(in.nextInt());
         System.out.print("Penampilan : ");
         member3.setPenampilan(in.nextInt());
         System.out.print("Suara      : ");
         member3.setSuara(in.nextInt());
         System.out.print("Attitude   : ");
         member3.setAttitude(in.nextInt());
         System.out.println();
         System.out.println("=========================");
         
         listIdol.add(member1);
         listIdol.add(member2);
         listIdol.add(member3);
         
         for (int i = 0; i < listIdol.size() ; i++) {
        listIdol.get(i).tampilan();
         }
         }  
}


