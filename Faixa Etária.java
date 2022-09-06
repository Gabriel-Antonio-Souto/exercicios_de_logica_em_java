import java.util.Scanner;
public class Idade {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double idd, n1, n2, n3, n4, n5; n1=0; n2=0; n3=0; n4=0; n5=0;
		for(int i=1; i<=15 ; i++){
		System.out.println("Idade da pessoa " +i+ ": ");
		idd = ler.nextDouble();
		if(idd>=0&&idd<=15){
	        	n1= n1+1;	        	
        }if(idd>=16&&idd<=30){
        		n2= n2+1; 	        	   
        }if(idd>=31&&idd<=45){
        		n3= n3+1;
        }if(idd>=46&&idd<=60){
	        	n4= n4+1;
	    }if(idd>=61){
	        	n5= n5+1;
}
}	        	
		System.out.println("Porcentagem de pessoas de até 15 anos : " +(n1/100 *15));
	    System.out.println("Porcentagem de pessoas de 16 a 30 anos : " +(+n2/100 *15));
	    System.out.println("Porcentagem de pessoas de 31 a 45 anos : " +(+n3/100 *15));
	    System.out.println("Porcentagem de pessoas de 46 a 60 anos : " +(+n4/100 *15));
	    System.out.println("Porcentagem de pessoas acima de 61 anos : " +(n5/100 *15));
	  
	    System.out.println("Quantidades de pessoas de até 15 anos : " +n1);
	    System.out.println("Quantidades de pessoas de 16 a 30 anos : " +n2);
	    System.out.println("Quantidades de pessoas de 31 a 45 anos : " +n3);
	    System.out.println("Quantidades de pessoas de 46 a 60 anos : " +n4);
	    System.out.println("Quantidades de pessoas acima 61 de anos : " +n5);
	        	     
		ler.close();
}
}
      
