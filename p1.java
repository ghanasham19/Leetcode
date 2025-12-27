class demo{
	public static void main(String []args){
		int[]arr={7,6,4,3,1};
		int min=arr[0];
		
			for(int i=1;i<arr.length-1;i++){
				if(min>arr[i]){
					min=i;
				}
			}
		int di=0;
			for(int i=min+1;i<arr.length;i++){
				int dis=arr[i]-arr[min];
				if(di<dis){
					di=dis;
				}
			}
		System.out.println(di);
	}	
}