import java.util.Scanner;
public class Idd {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double pma= 0, pno= 0, média= 0, idd50m= 0, H= 0, P= 0, idd, iddm= 0, iddn= 250, h, p;
		for(int n=1; n<=5; n++) {
		System.out.println("A idade da pessoa "+n+"");
		idd = ler.nextDouble();
		System.out.println("O peso da pessoa "+n+"");
		p = ler.nextDouble();
		System.out.println("A altura da pessoa "+n+" ");
		h = ler.nextDouble();
		if(idd>50) {
		idd50m=idd50m + 1;
		}if(idd >= 10 && idd <= 20){
		H++;
		média=h+média;
    	}if(idd<=40){
		P=p+1;
		}if (idd<=iddn ){
		pno= p;
		}if (idd>=iddm){
		pma= p;
}				
}
		System.out.println("Quantidade de pessoas com idade superior a 50 anos: " +idd50m);
		System.out.println("A média das alturas das pessoas com idade entre 10 a 20 anos: " + média/H);
		System.out.println("A percentagem de pessoas com peso inferior a 40 quilos: " + P*100 /25);
		System.out.println("O peso da pessoa mais nova: " +pno );
		System.out.println("O peso da pessoa mais velha: " +pma );
		ler.close();			
}
}




