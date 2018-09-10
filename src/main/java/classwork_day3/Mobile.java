package classwork_day3;

public class Mobile {
     int bal=9;
	 String text="have a nice day";
	 public String display()
	 {
	 	//System.out.println(text);
	 return "have a nice day";	
	 }
	 String displayState()
	 {
	 	int val=0;
	 	if(val==0) {
	 		return "OFF";
	 //System.out.println("the mobile is in OFF state");
	 }
	 else
	 {
	 	return "ON";
	 }
	 }
	 public void sendSms(long mobileNumber)
	 {
		 String sms="gud morning!happy sunday";
	 	System.out.println("the message is "+mobileNumber +" "+sms);
	 	}
	 public void callContact(long mobileNumber)
	 {
		 System.out.println("the Ongoing call is "+mobileNumber);
	 }
	 			
		
public static void main(String args[])
{
	Mobile m =new Mobile();
	System.out.println(m.display());
	System.out.println(m.displayState());
	m.sendSms(900081234);
}
}


 


			
			
			
			

	
	



