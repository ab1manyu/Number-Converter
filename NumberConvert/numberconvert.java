public class numberconvert{
	public static String hVal="0123456789ABCDEF";

		public String decToBin(String st){
			String temp = "";
			String zero = "0";
			int b = 2;
			int num = Integer.parseInt(st);
			if(num==0)
				return zero;
			int power=0;
			while(Math.pow(b,power)<=num)
				power++;
			if(Math.pow(b,power)>num)
				power--;
			for (int i=power;i>=0;i--){
				if((int)Math.pow(b,i)<=num){
					temp+="1";
					num-=Math.pow(b,i);
				}
				else
					temp+="0";
			}
			return temp;
		}
		/////////////////////////////////
		public int binToDec(String st){
			int d=0;
			int power=0;
			while(st.length()>0){
				int temp = Integer.parseInt(st.charAt((st.length())-1)+"");
				d+=temp*Math.pow(2, power++);
				st=st.substring(0,st.length()-1);
			}
			return d;
		}
		/////////////////////////////////
		public String decToHex(String st){
			int num = Integer.parseInt(st);
			String hex = "";
			while (num != 0){
				if (num % 16 < 10)
					hex = Integer.toString(num % 16) + hex;
				else
					hex = (char)((num % 16)+55) + hex;
				num = num / 16;
			}
   			return hex;
		}
		/////////////////////////////////
		public int hexToDec(String st){
		  	st = st.toUpperCase();
			int num = 0;
			for(int i=0;i<st.length();i++){
				char n = st.charAt(i);
				int val = hVal.indexOf(n);
				num = num*16+val;
			}
			return num;
		}
		/////////////////////////////////
		public String binToHex(String st){
			int num = binToDec(st);
			String str = Integer.toString(num);
			return decToHex(str);
		}
		/////////////////////////////////
		public String hexToBin(String st){
			int num = hexToDec(st);
			String str = Integer.toString(num);
			return decToBin(str);
		}
}