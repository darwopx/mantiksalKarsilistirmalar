package mantiksalKarsilistirmalar;

public class Main {

	public static void main(String[] args) {
		
		double product1=12.99;
		double product2=12.99;
		
		//eşit product1 eşit ise product2
		if (product1==product2) {
			System.out.println("eşit");
		}
			//product1 ucuz product1 küçük ise product2
		if (product1<product2) {
			System.out.println("1. ürün daha pahalı");
		}
			//product2 ucuz product2 küçük ise product1
		if(product2>product1) {
			System.out.println("2.ürün daha pahalı");	   
	}
		//yüz ifadeleri başlangıç
		String yuzIfadesi="mutlu";
	    if(yuzIfadesi=="mutlu"||yuzIfadesi=="Mutlu"||yuzIfadesi=="MUTLU") {
	    	System.out.println("(:");
	    }
	    if(yuzIfadesi=="üzgün"||yuzIfadesi=="Üzgün"||yuzIfadesi=="ÜZGÜN") {
	    	System.out.println("):");
	    }
		
		//yüz ifadeleri bitiş
}
		}

