class acaraTV {
	 String StasiunTV;
	 String Acara;
	
	public String getStasiunTV() {
		return StasiunTV;
	}
	
	public void setStasiunTV(String StasiunTV)
	{ this.StasiunTV=StasiunTV;
	}
	
	public String getAcara()  {
		return Acara; }
		
	public void setAcara(String Acara) {
		this.Acara=Acara;
	}
	
}

public class Stasiun {
	public static void main(String args[])
	{ acaraTV a=new acaraTV();
	
	a.StasiunTV=("TransTV");
	a.Acara=("Mozaik Islam");
   System.out.println("Acara "+a.getAcara()+"StasiunTV "+a.getStasiunTV());
	}
}