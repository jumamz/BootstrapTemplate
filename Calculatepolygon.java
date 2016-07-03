import java.util.Arrays;

public class Calculatepolygon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] x= new int[]{4,9,11,2};
		int[] y= new int[]{10,7,2,2};
		double sum=0;
		double area;
		int[] prodx= new int[x.length];
		int[] prody= new int[y.length];
		
		int[] sumxy= new int[x.length];
		for(int iteration=0; iteration< x.length; iteration++){
			
			if(iteration<x.length-1){
			prodx[iteration]= x[iteration]*y[iteration+1];
			prody[iteration]=y[iteration]*x[iteration+1];
			}
			
			if(iteration==x.length-1){
				prodx[iteration]=x[iteration]*y[0];
				prody[iteration]=y[iteration]*x[0];
				
			}	
			sumxy[iteration]=prodx[iteration]-prody[iteration];
			
		}
		
	
		for (int i : sumxy){
		    sum += i;
		
		}
		
		if(sum<0){
		sum*=-1;
		}
		else {
				sum*=1;
		}
		
		area=sum/2;
		System.out.println("x="+Arrays.toString(prodx));
		System.out.println("y="+Arrays.toString(prody));
		System.out.println("total x-y="+Arrays.toString(sumxy));
		System.out.println(sum);
		System.out.println(area);
		
		
	}

}
