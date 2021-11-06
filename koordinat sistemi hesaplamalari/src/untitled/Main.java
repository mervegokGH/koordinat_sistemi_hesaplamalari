package untitled;
import java.util.Scanner;
import java.util.Random;

 class Main {
	 
	 
	 		   
	public static void main(String[] args) {
		System.out.println("Rastgele X ve Y Noktalarý Olusturuluyor:");
		Random r=new Random();
		int coordinate [] [] = new int [5] [5];
		int uzaklikx[][] = new int [10][10];
		int uzakliky[][] = new int [10][10];
		int sayac=0;
		
		for(int i=0;i<5;i++) {		
				int uretx=r.nextInt(10);
				int urety=r.nextInt(10);
				coordinate[i][0]=uretx;
				coordinate[i][1]=urety;
			}
		for(int i=0;i<5;i++) {
			System.out.printf("%d. Nokta: X:%d Y:%d\n", i+1,coordinate[i][0],coordinate[0][i]);	
			}
		
		
		
		for(int i=0;i<5;i++) {
			for(int j=i+1;j<5;j++) {
				
				
				
				int uzaklik= (coordinate[j][0]-coordinate[i][0])*(coordinate[j][0]-coordinate[i][0]);
				uzaklikx[j][i]=uzaklik;
				uzaklik=0;
				uzaklik= (coordinate[0][j]-coordinate[0][i])*(coordinate[0][j]-coordinate[0][i]);
				uzakliky[j][i]=uzaklik;
			}
		}
		
		
		sayac=0;
		double temp=1000;
		int kontrolsayac[][]=new int[2][2];
		double arauzaklik[][]= new double [10][10];
		for(int i=0;i<5;i++) {
			for(int j=i+1;j<5;j++) {
			sayac++;
			double hesapla=Math.sqrt(uzaklikx[j][i]+uzakliky[j][i]);
			arauzaklik[j][i]=hesapla;
			if(temp>hesapla) {
				temp=hesapla;
				kontrolsayac[0][0]=j;
				kontrolsayac[0][1]=i;

			}
			
			hesapla=0;	
			System.out.printf("%d.  %d. Indisteki X Noktasý ile  %d. Indisteki Y Noktasi Aradaki Uzaklik = %f\n",sayac,i,j,arauzaklik[j][i]);
	
			}
		}
		System.out.printf("%d. ve %d. Noktalar Birbirlerine En Yakin Iki Noktadir. Aralarindaki Uzaklik: %f",	kontrolsayac[0][1]+1,	kontrolsayac[0][0]+1,temp);
		
		
	

		}	
		
	}
 
	

	
	
