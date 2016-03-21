import java.util.ArrayList;

public class idolgroup {
    private String nama,team;
    private int umur;
    private double penampilan,suara,attitud;
   
    idolgroup(){
        nama ="";
        team ="";
        umur =0;
        penampilan =0;
        suara =0;
        attitud =0;
        
    }
    public void setNama(String x){
        nama =x;
    }
    public void setTeam(String x){
        team =x;
    }
    public void setumur(int x){
        umur =x;
    }
    public void setPenampilan(double x){
        penampilan =x;
    }
    public void setSuara(double x){
        suara =x;
    }
    public void setAttitude(double x){
        attitud =x;
    }
    
    public String getNama(){
        return nama;
    }
    public String getTeam(){
        return team;
    }
    public int getUmur(){
        return umur;
    }
    public double getPenampilan(){
        return penampilan;
    }
    public double getSuara(){
        return suara;
    }
    public double getAtt(){
        return attitud;
    }
    public double rata(){
        return (getPenampilan()+getSuara()+getAtt())/3;
    }
   
    
    
    public void tampilan(){
        System.out.println("================================");
        System.out.println("Nama Lengkap        : "+getNama().toUpperCase());
        System.out.println("Team                : "+getTeam().toUpperCase());
        System.out.println("Umur                : "+getUmur());
        System.out.println("Nilai Penampilan    : "+getPenampilan());
        System.out.println("Nilai Suara         : "+getSuara());
        System.out.println("Nilai Attitud       : "+getAtt());
        System.out.println("Nilai Rata-Rata     : "+rata());
        System.out.println("================================");
    }
}
