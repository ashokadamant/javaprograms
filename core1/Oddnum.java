
public class Oddnum {

		public static void main(String[] args) {
			int[] arr= {1,1,2,3,3,6,7,5,5};
			boolean[] bool=new boolean[arr.length];
			for(int i=0;i<arr.length;i++) {
				int count=0;
				int occ=1;
				if(bool[i]!=true) {
				for(int j=i+1;j<arr.length;j++) {
					if(arr[i]==arr[j]) {
						count++;
						occ++;
						bool[j]=true;
					}
				}
				if(count>0) {
					System.out.println(arr[i] +" is occurs "+occ);
				}
				
				}
				
			}

		}

	}


