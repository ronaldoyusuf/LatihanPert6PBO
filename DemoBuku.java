class Buku {
	String judul;
	String pengarang;
	
	public void setJudul(String i) {
		judul=i;
	}
	public void setPengarang(String i){
		pengarang=i;
	}
}
public class DemoBuku
{
	public static void main(String args[])
	{ Buku a,b;
	a=new Buku();
	b=new Buku();
	
	a.pengarang="Felix Siauw";
	a.judul="Beyond The Inspiration";
	b.pengarang="Budi Raharjo";
	b.judul="Mudah Belajar Java";
  System.out.println("Judul: "+a.judul+" pengarang: "+ a.pengarang);
  System.out.println("Judul: "+b.judul+" pengarang: "+ b.pengarang);
	}
} 