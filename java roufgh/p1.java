class demo{
	public static void main(String[]args){
		String name="i am sham : and   i am don 9";
		
		int count=0;
		for(int i=0;i<name.length();i++){
			if(65<=name.charAt(i) && name.charAt(i)<=97){
				System.out.print(i+" ");
			}
		}
				System.out.println(" ");
			System.out.println(name.length());
	}
}