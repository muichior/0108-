package pet_1111410053;

public class Puppy {
	
	private String PuppyName ;//(寵物姓名) 
	private String PuppyType ;//(寵物品種) 
	private String PuppyColor;// (寵物顏色) 
	private String PuppyGender;// (寵物性別)
	static final String[]Citmes={"洗澡","修指","理毛","大美容","中美容"}; 
	static final double[]Cprice={600,200,300,1000,750};
	Puppy() {}	
	Puppy(String PuppyName)
	{
		this.setPuppyName(PuppyName);
	}
    Puppy(String PuppyName,String PuppyType, String PuppyColor)
    {
    	this(PuppyName);
    	this.setPuppyType(PuppyType);
    	this.setPuppyColor(PuppyColor);
    }
    public double check(double...shopping) 
    {
    	double Rtn=0;
    	for(var Enchindax : shopping)
    	{
    		if(Enchindax >this.Citmes.length||Enchindax <0)
    		return -1;
    	}
    	for(var Enchindax : shopping)
    		Rtn+=Cprice[(int)Enchindax];
    	System.out.printf("%s消費明細%n",this.getPuppyName());
    	System.out.printf("*******************%n");
    	int sar =0;
    	for(var Enchindax : shopping)
    	{
    		sar++;
    		System.out.printf("%d %s %8.2f%n",sar,Citmes[(int)Enchindax],Cprice[(int)Enchindax]);
    	}
    	System.out.printf("*******************%n");
        return Rtn;	
    }
   
	
	
	public String getPuppyName() {
		return PuppyName;
	}
	public void setPuppyName(String puppyName) {
		PuppyName = puppyName;
	}
	public String getPuppyType() {
		return PuppyType;
	}
	public void setPuppyType(String puppyType) {
		PuppyType = puppyType;
	}
	public String getPuppyColor() {
		return PuppyColor;
	}
	public void setPuppyColor(String puppyColor) {
		PuppyColor = puppyColor;
	}
	public String getPuppyGender() {
		return PuppyGender;
	}
	public void setPuppyGender(String puppyGender) {
		PuppyGender = puppyGender;
	} 

}
