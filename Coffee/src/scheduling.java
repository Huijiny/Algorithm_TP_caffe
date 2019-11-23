


import java.util.Scanner;

import javax.swing.Icon;



public class scheduling {
	
	public static class value{
		public static String order_name[] = new String[10];
		public static int num[] = new int[10];
		public static int time[] = new int[10];
		public static int teskTime[] = new int[10];

	} 
	
	public static class product{
		public static String menu[] = {"Americano" , "Cafe Latte" , "Cafe Moca" , "Banila Latte" , "Caramel Macchiato" };
		public static int[] price = {4100 , 4500 , 4800 , 4800 , 5000};
	} 

	public static void main(String[] args) {
		
			String shop;
			
			shop = "coffee shop";
			//System.out.println(shop+"");
			//Show_menu();
			order();

	} 
	
	
	 
	private static int Menu(String select) {
		int count = 0 ;
		
		for(int i =0 ; i<5; i ++) {
			if(select.equals(product.menu[i])) {
				count++;
			}
			
		}
		return count;
		
	}
	  
	private static boolean equals(String select, String string) {
		// TODO Auto-generated method stub
		return false;
	}


	/*private static void Show_menu() {
		for(int i =0 ; i<5; i++) {
			System.out.print(product.menu[i]+"  ");
			
		}
		System.out.println();
		for(int i =0 ; i<5; i++) {
			System.out.print(product.price[i]+"        ");
		}
		
		System.out.println();
		System.out.println("----------------------------------------------------");
		
	}*/
	

	public static int order() {
		
		int count = 1;
		
		/*Scanner scan = new Scanner(System.in);
		System.out.print("Type menu : ");
		String select  = scan.nextLine();
		System.out.print("Type number : ");
		int num = scan.nextInt();
		scan.nextLine();*/
		String select = "Americano";
		int num = 1;
		
		int remainTime = 0;		
		
		while(!select.equals("Fin")) {
			int totalCostTime = 0;
			
			if(Menu(select)== 0) {
				System.out.println("there are no drinks");
				count--;
			}
			else if(Menu(select)==1){ 
			
				//System.out.println(num+" "+select+" is chosen");
				//int waiting_time = cost_time(select);
				
				//System.out.println("Your drink will be ready in "+waiting_time+" seconds");
				
				order_stack(select,num,count);
				
				//System.out.println("Ordered values");
				//System.out.println("-------------------------------");
				for(int i =0 ; i<=count%10; i++) {
					if(value.time[i] - value.teskTime[i]>0) {
					/*System.out.println(value.order_name[i]+" "+ value.num[i]+ " remain time : "
									+((value.time[i]*value.num[i])-value.teskTime[i])/60+"m "
									+((value.time[i]*value.num[i])-value.teskTime[i])%60+"s");*/
					
						totalCostTime += value.time[i]*value.num[i]-value.teskTime[i];
					}
					
				}
				remainTime = totalCostTime;
				/*System.out.println("total time for finish : " +remainTime);
				
				System.out.println("-----------------------------------------");*/
				count++;
				
			}
			for(int i =0 ; i<count%10 ; i ++) {
				value.teskTime[i]+=10;
			}
			checkRemainTime(count);
			/*System.out.print("Type menu : ");
			select  = scan.nextLine();
			System.out.print("Type number : ");
			num = scan.nextInt();
			scan.nextLine();*/
			
			
		}
		
		return remainTime;
	}
	
	private static int cost_time(String select) {
		int time = 0;
		int timer[] = {40 ,60 ,60 , 80, 90};
		
		for(int i =0 ; i<5; i ++) {
			if(select.equals(product.menu[i])) {
				time += timer[i];
			}
		}
		
		return time;
	} // 二쇰Ц�븳 �긽�뭹�씠 �젣議곕릺�뒗�뜲 嫄몃━�뒗 �떆媛꾩쓣 諛섑솚�빐二쇰뒗 �븿
	
	private static void checkRemainTime(int count) {
		for(int i =0 ; i<=count%10;i++) {
			if(value.time[i]<=0) {
				value.order_name[i] = null;
				value.num[i] = 0;
				value.time[i] = 0;
				value.teskTime[i] = 0;
				
			}
		}
	} // time�씠 0蹂대떎 �옉�븘吏�硫� stack媛� �젣嫄� 
	
	private static void order_stack(String select,int num,int count) {

		
		value.order_name[count%10] = select;
		value.num[count%10] = num;
		value.time[count%10] = cost_time(select);
		
		
	}// �엯�젰媛� stack�뿉 異붽�  
	
	
	
}