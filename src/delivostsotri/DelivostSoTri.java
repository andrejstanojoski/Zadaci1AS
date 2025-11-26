package delivostsotri;
import java.util.Scanner;
public class DelivostSoTri {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Da se ispecatat: clenovi na niza koi ne se delivi so 3");
		System.out.println("Vcitaj broj na clenovi vo niza");
		int n=input.nextInt();
		int niza[]=new int[n];
		System.out.println("Vcitaj clenovi vo niza");
		for(int i=0;i<niza.length;i++) {
			System.out.println(i+"-->");
			niza[i]=input.nextInt(); //Vcitaj niza[i]- i-ti clen na nizata
		}
		for(int i=0;i<niza.length;i++) {
			if(niza[i]%3!=0)
				System.out.println("niza["+i+"]="+niza[i]);
		}
	}
	

}
