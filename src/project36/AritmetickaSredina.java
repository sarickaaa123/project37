package project36;

class AritmetickaSredina {
int a;
int b;
int c;
AritmetickaSredina(int a, int b,int c){
	this.a=a;
	this.b=b;
	this.c=c;
}
 void culculateAS() {
	 System.out.println((a+b+c)/3);
 }
	public static void main(String args[]) {
		AritmetickaSredina firstN=new AritmetickaSredina(3,5,7);
		AritmetickaSredina secondN=new AritmetickaSredina (13,25,29);
		
		firstN.culculateAS();
		secondN.culculateAS();
	}

}
