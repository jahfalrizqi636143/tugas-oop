class shinobi{
  private String No_registrasi,Nama,Peringkat;

  public void setNo_registrasi(String No_registrasi){
  this.No_registrasi = No_registrasi;
  }
  public String getNo_registrasi(){
  return No_registrasi;
  }

  public void setNama(String Nama){
  this.Nama = Nama;
  }
  public String getNama(){
  return Nama;
  }

  public void setPeringkat(String Peringkat){
  this.Peringkat = Peringkat;
  }
  public String getPeringkat(){
  return Peringkat;
}}

public class main{
  public static void main(String[]args){
  shinobi[] m = new shinobi[3];

  m[0]=new shinobi();
  m[0].setNo_registrasi("012606");
  m[0].setNama("Uchiha Sasuke");
  m[0].setPeringkat("Genin");

  m[1]=new shinobi();
  m[1].setNo_registrasi("012607");
  m[1].setNama("Uzumaki Naruto");
  m[1].setPeringkat("Genin");

  m[2]=new shinobi();
  m[2].setNo_registrasi("012601");
  m[2].setNama("Haruno Sakura");
  m[2].setPeringkat("chunin");

  System.out.println("Data Tim 7 Konohagakure   \n");
  for(shinobi x:m){

  System.out.println("No Registrasi :" + x.getNo_registrasi());
  System.out.println("Nama : " + x.getNama());
  System.out.println(" Peringkat : " + x.getPeringkat());
  System.out.println();

  }
}}
