//LENS KING



import java.util.Scanner;
class lens_king
{
	
	void detail(String name,String add1,String add2,String phone,String state,String city,String pin)
	{
	 System.out.println("\n**DETAILS**");
   
   System.out.println("Your name--- " +name);
   System.out.println("Address 1--- "+add1);
   System.out.println("Address 2--- "+add2);
   System.out.println("Phone number--- "+phone);
   System.out.println("State--- "+state);
   System.out.println("City--- "+city);
   System.out.println("Pincode--- "+pin);
	}
   
   
   
   
   
 public static void main(String args[])
 {
  Scanner s=new Scanner(System.in);
  System.out.println("|||||Welcome to LENS KING|||||");
  int again;
  do{
  int a;
  do
  { 
  System.out.println("Enter 1 for positive and 2 for negative eye number");
  a=s.nextInt();
  }while(a>2);
  if(a==1)
  {
    System.out.println("Enter left eye number");
    double b=s.nextDouble();
	System.out.println("Enter right eye number");
    double c=s.nextDouble();
  }
  else if(a==2)
  {
    System.out.println("Enter left eye number");
    double b=s.nextDouble();

	System.out.println("Enter right eye number");
    double c=s.nextDouble();  
  }
  else
  {
  System.out.println("Invalid choice");  
  }
  
  

  int ch,ch2,ch3,ch4;
  do{
  System.out.println("\n\n\n***MENU***\n1.Male\n2.Female");
    System.out.println("Enter ur choice");
    ch=s.nextInt();
  }while(ch>2);
	switch(ch)
	{

    // male
	 case 1:	
	 do{
	 System.out.println("\n\n\nPRICE RANGE-\n 1.500-1000\n2.1000-3000\n3.3000-5000\n4.5000-8000\n5.8000above\nPLEASE CHOOSE FROM ABOVE CHOICES ONLY");
     ch2=s.nextInt();
	 }while(ch2>5);
	 
	 
     switch(ch2)
     {
     case 1:System.out.println("\n1.Ross\n2.Lance\n3.IDEE\n4.Bvlgari\nPLEASE CHOOSE FROM ABOVE CHOICES ONLY");       	 
	 ch3=s.nextInt();	 
     switch(ch3)
	 {	 
	  case 1:System.out.println("\nWhich type of Frame would you wear?\n1.Rectangle\n2.Square\n3.Oval\n4.Round\nPLEASE CHOOSE FROM ABOVE CHOICES ONLY");
      ch4=s.nextInt();      	  
	  switch(ch4)
	  {
	   case 1:System.out.println("Rectangle frame of ross costs Rs.655");	
	   break;
	   case 2:System.out.println("Square frame of ross costs Rs.999");	
	   break;
	   case 3:System.out.println("Oval frame of ross costs Rs.520");	
	   break;
       case 4:System.out.println("Round frame of ross costs Rs.715");			
	   break;
	   case 5:System.exit(0);	
	   default:System.out.println("invalid choice");		 
	  }		  
	   break;	  
	  case 2:System.out.println("\nWhich type of Frame would you wear?\n1.Rectangle\n2.Square\n3.Oval\n4.Round\nPLEASE CHOOSE FROM ABOVE CHOICES ONLY");
      ch4=s.nextInt();      		  
	  switch(ch4)
	  {
	   case 1:System.out.println("Rectangle frame of lance costs Rs.799");	
	   break;
	   case 2:System.out.println("Square frame of lance costs Rs.599");	
	   break;
	   case 3:System.out.println("Oval frame of lance costs Rs.650");	
	   break;
       case 4:System.out.println("Round frame of lance costs Rs.999");			
	   break;
	   case 5:System.exit(0);	
	   default:System.out.println("invalid choice");
	 }	 
	 break;
	
	 case 3:System.out.println("\nWhich type of Frame would you wear?\n1.Rectangle\n2.Square\n3.Oval\n4.Round\nPLEASE CHOOSE FROM ABOVE CHOICES ONLY");
      ch4=s.nextInt();
	 
      
	  switch(ch4)
	  {
	   case 1:System.out.println("Rectangle frame of IDEE costs Rs.1000");	
	   break;
	   case 2:System.out.println("Square frame of IDEE costs Rs.575");	
	   break;
	   case 3:System.out.println("Oval frame of IDEE costs Rs.699");	
	   break;
       case 4:System.out.println("Round frame of IDEE costs Rs.500");			
	   break;
	   case 5:System.exit(0);	
	   default:System.out.println("invalid choice");
	 }
	   
	 break;
	
	 case 4:System.out.println("\nWhich type of Frame would you wear?\n1.Rectangle\n2.Square\n3.Oval\n4.Round\nPLEASE CHOOSE FROM ABOVE CHOICES ONLY");
      ch4=s.nextInt();
	 
	  	  
	  switch(ch4)
	  {
	   case 1:System.out.println("Rectangle frame of bvlgari costs Rs.899");	
	   break;
	   case 2:System.out.println("Square frame of bvlgari costs Rs.950");	
	   break;
	   case 3:System.out.println("Oval frame of bvlgari costs Rs.750");	
	   break;
       case 4:System.out.println("Round frame of bvlgari costs Rs.830");			
	   break;
	   case 5:System.exit(0);	
	   default:System.out.println("invalid choice");
	 }	 	   
	 break;
	}		
    break;
	
	case 2:System.out.println("\n1.Prawa\n2.Flair\n3.Vintage\n4.Active\nPLEASE CHOOSE FROM ABOVE CHOICES ONLY");       
	 ch3=s.nextInt();	 
     switch(ch3)
	 {		
	  case 1:System.out.println("\nWhich type of Frame would you wear?\n1.Rectangle\n2.Square\n3.Oval\n4.Round\nPLEASE CHOOSE FROM ABOVE CHOICES ONLY");
      ch4=s.nextInt();	      	  
	  switch(ch4)
	  {
	   case 1:System.out.println("Rectangle frame of Prawa costs Rs.1000");	
	   break;
	   case 2:System.out.println("Square frame of Prawa costs Rs.1200");	
	   break;
	   case 3:System.out.println("Oval frame of Prawa costs Rs.2400");	
	   break;
       case 4:System.out.println("Round frame of Prawa costs Rs.2999");			
	   break;
	   case 5:System.exit(0);	
	   default:System.out.println("invalid choice");		 
	  }		  	  
	   break;
	   
	  case 2:System.out.println("\nWhich type of Frame would you wear?\n1.Rectangle\n2.Square\n3.Oval\n4.Round\nPLEASE CHOOSE FROM ABOVE CHOICES ONLY");
      ch4=s.nextInt();	       		   
	  switch(ch4)
	  {
	   case 1:System.out.println("Rectangle frame of Flair costs Rs.1850");	
	   break;
	   case 2:System.out.println("Square frame of Flair costs Rs.1500");	
	   break;
	   case 3:System.out.println("Oval frame of Flair costs Rs.1250");	
	   break;
       case 4:System.out.println("Round frame of Flair costs Rs.2000");			
	   break;
	   case 5:System.exit(0);	
	   default:System.out.println("invalid choice");
	 }	
	 
	 break;
	
	 case 3:System.out.println("\nWhich type of Frame would you wear?\n1.Rectangle\n2.Square\n3.Oval\n4.Round\nPLEASE CHOOSE FROM ABOVE CHOICES ONLY");
      ch4=s.nextInt();
	  
	  switch(ch4)
	  {
	   case 1:System.out.println("Rectangle frame of Vintage costs Rs.2700");	
	   break;
	   case 2:System.out.println("Square frame of Vintage costs Rs.2570");	
	   break;
	   case 3:System.out.println("Oval frame of Vintage costs Rs.2100");	
	   break;
       case 4:System.out.println("Round frame of Vintage costs Rs.1940");			
	   break;
	   case 5:System.exit(0);	
	   default:System.out.println("invalid choice");
	 }	 	  
	 break;
	
	 case 4:System.out.println("\nWhich type of Frame would you wear?\n1.Rectangle\n2.Square\n3.Oval\n4.Round\nPLEASE CHOOSE FROM ABOVE CHOICES ONLY");
      ch4=s.nextInt();	 	    
	  switch(ch4)
	  {
	   case 1:System.out.println("Rectangle frame of Active costs Rs.1750");	
	   break;
	   case 2:System.out.println("Square frame of Active costs Rs.2600");	
	   break;
	   case 3:System.out.println("Oval frame of Active costs Rs.2650");	
	   break;
       case 4:System.out.println("Round frame of Active costs Rs.1500");			
	   break;
	   case 5:System.exit(0);	
	   default:System.out.println("invalid choice");
	 }	 	   
	 break;
	}	
	break;
	
    case 3:System.out.println("\n1.Guess\n2.Scott\n3.Rodenstock\n4.Giorgio Armani\nPLEASE CHOOSE FROM ABOVE CHOICES ONLY");       
     ch3=s.nextInt();
	
     switch(ch3)
	 {
  	  case 1:System.out.println("\nWhich type of Frame would you wear?\n1.Rectangle\n2.Square\n3.Oval\n4.Round\nPLEASE CHOOSE FROM ABOVE CHOICES ONLY");
      ch4=s.nextInt();	  	  
	  switch(ch4)
	  {
	   case 1:System.out.println("Rectangle frame of Guess costs Rs.3999");	
	   break;
	   case 2:System.out.println("Square frame of Guess costs Rs.4015");	
	   break;
	   case 3:System.out.println("Oval frame of Guess costs Rs.4500");	
	   break;
       case 4:System.out.println("Round frame of Guess costs Rs.4999");			
	   break;
	   case 5:System.exit(0);	
	   default:System.out.println("invalid choice");		 
	  }	
	   break;
	   
	  case 2:System.out.println("\nWhich type of Frame would you wear?\n1.Rectangle\n2.Square\n3.Oval\n4.Round\nPLEASE CHOOSE FROM ABOVE CHOICES ONLY");
      ch4=s.nextInt();     	  
	  switch(ch4)
	  {
	   case 1:System.out.println("Rectangle frame of Scott costs Rs.3200");	
	   break;
	   case 2:System.out.println("Square frame of Scott costs Rs.4550");	
	   break;
	   case 3:System.out.println("Oval frame of Scott costs Rs.4800");	
	   break;
       case 4:System.out.println("Round frame of Scott costs Rs.3600");			
	   break;
	   case 5:System.exit(0);	
	   default:System.out.println("invalid choice");
	 }
	 break;
	 
	 case 3:System.out.println("\nWhich type of Frame would you wear?\n1.Rectangle\n2.Square\n3.Oval\n4.Round\nPLEASE CHOOSE FROM ABOVE CHOICES ONLY");
	 ch4=s.nextInt();	
	 	 
	  switch(ch4)
	  {
	   case 1:System.out.println("Rectangle frame of Rodenstock costs Rs.3400");	
	   break;
	   case 2:System.out.println("Square frame of Rodenstock costs Rs.5000");	
	   break;
	   case 3:System.out.println("Oval frame of Rodenstock costs Rs.4225");	
	   break;
       case 4:System.out.println("Round frame of Rodenstock costs Rs.3110");			
	   break;
	   case 5:System.exit(0);	
	   default:System.out.println("invalid choice");
	 }
	 break;
	
	 case 4:System.out.println("\nWhich type of Frame would you wear?\n1.Rectangle\n2.Square\n3.Oval\n4.Round\nPLEASE CHOOSE FROM ABOVE CHOICES ONLY");
      ch4=s.nextInt();	   
	  switch(ch4)
	  {
	   case 1:System.out.println("Rectangle frame of Giorgio Armani costs Rs.4999");	
	   break;
	   case 2:System.out.println("Square frame of Giorgio Armani costs Rs.3500");	
	   break;
	   case 3:System.out.println("Oval frame of Giorgio Armani costs Rs.4310");	
	   break;
       case 4:System.out.println("Round frame of Giorgio Armani costs Rs.3800");			
	   break;
	   case 5:System.exit(0);	
	   default:System.out.println("invalid choice");
	 }
	 break;
	}	    	  
    break;

	case 4:System.out.println("\n1.Tommy Hilfiger\n2.Porsche\n3.Calvin Klein\n4.Nike\nPLEASE CHOOSE FROM ABOVE CHOICES ONLY");       
    ch3=s.nextInt();	
     switch(ch3)
	 {		
	  case 1:System.out.println("\nWhich type of Frame would you wear?\n1.Rectangle\n2.Square\n3.Oval\n4.Round\nPLEASE CHOOSE FROM ABOVE CHOICES ONLY");
      ch4=s.nextInt();
		  
	  switch(ch4)
	  {
	   case 1:System.out.println("Rectangle frame of Tommy Hilfiger costs Rs.5200");	
	   break;
	   case 2:System.out.println("Square frame of Tommy Hilfiger costs Rs.7999");	
	   break;
	   case 3:System.out.println("Oval frame of Tommy Hilfiger costs Rs.7250");	
	   break;
       case 4:System.out.println("Round frame of Tommy Hilfiger costs Rs.6000");			
	   break;
	   case 5:System.exit(0);	
	   default:System.out.println("invalid choice");	
	   
	 
	  }	
	   break;
	  
	  case 2:System.out.println("\nWhich type of Frame would you wear?\n1.Rectangle\n2.Square\n3.Oval\n4.Round\nPLEASE CHOOSE FROM ABOVE CHOICES ONLY");
      ch4=s.nextInt();
  	  
	  switch(ch4)
	  {
	   case 1:System.out.println("Rectangle frame of Porsche costs Rs.5999");	
	   break;
	   case 2:System.out.println("Square frame of Porsche costs Rs.6500");	
	   break;
	   case 3:System.out.println("Oval frame of Porsche costs Rs.7500");	
	   break;
       case 4:System.out.println("Round frame of Porsche costs Rs.8000");			
	   break;
	   case 5:System.exit(0);	
	   default:System.out.println("invalid choice");
	 }
	 break;
	
	 case 3:System.out.println("\nWhich type of Frame would you wear?\n1.Rectangle\n2.Square\n3.Oval\n4.Round\nPLEASE CHOOSE FROM ABOVE CHOICES ONLY");
      ch4=s.nextInt();
     		  
	  switch(ch4)
	  {
	   case 1:System.out.println("Rectangle frame of Calvin Klein costs Rs.5555");	
	   break;
	   case 2:System.out.println("Square frame of Calvin Klein costs Rs.6520");	
	   break;
	   case 3:System.out.println("Oval frame of Calvin Klein costs Rs.7950");	
	   break;
       case 4:System.out.println("Round frame of Calvin Klein costs Rs.6200");			
	   break;
	   case 5:System.exit(0);	
	   default:System.out.println("invalid choice");
	 }
	 break;
	
	 case 4:System.out.println("\nWhich type of Frame would you wear?\n1.Rectangle\n2.Square\n3.Oval\n4.Round\nPLEASE CHOOSE FROM ABOVE CHOICES ONLY");
      ch4=s.nextInt();
       		  
	  switch(ch4)
	  {
	   case 1:System.out.println("Rectangle frame of Nike costs Rs.7850");	
	   break;
	   case 2:System.out.println("Square frame of Nike costs Rs.6550");	
	   break;
	   case 3:System.out.println("Oval frame of Nike costs Rs.5000");	
	   break;
       case 4:System.out.println("Round frame of Nike costs Rs.5600");			
	   break;
	   case 5:System.exit(0);	
	   default:System.out.println("invalid choice");
	 }
	 break;
	}	    	  
    break;
	
	case 5:System.out.println("\n1.Vogue\n2.Gucci\n3.Oakley\n4.Ray-ban");      	 
	 ch3=s.nextInt();

     switch(ch3)
	 {
	
	  case 1:System.out.println("\nWhich type of Frame would you wear?\n1.Rectangle\n2.Square\n3.Oval\n4.Round\nPLEASE CHOOSE FROM ABOVE CHOICES ONLY");
      ch4=s.nextInt();	
		  	  
	  switch(ch4)
	  {
	   case 1:System.out.println("Rectangle frame of Vogue costs Rs.15000");	
	   break;
	   case 2:System.out.println("Square frame of Vogue costs Rs.19000");	
	   break;
	   case 3:System.out.println("Oval frame of Vogue costs Rs.2000");	
	   break;
       case 4:System.out.println("Round frame of Vogue costs Rs.14000");			
	   break;
	   case 5:System.exit(0);	
	   default:System.out.println("invalid choice");	
	   
	 
	  }	
	   break;
	  
	  case 2:System.out.println("\nWhich type of Frame would you wear?\n1.Rectangle\n2.Square\n3.Oval\n4.Round\nPLEASE CHOOSE FROM ABOVE CHOICES ONLY");
      ch4=s.nextInt();
      		  
	  switch(ch4)
	  {
	   case 1:System.out.println("Rectangle frame of Gucci costs Rs.12500");	
	   break;
	   case 2:System.out.println("Square frame of Gucci costs Rs.11860");	
	   break;
	   case 3:System.out.println("Oval frame of Gucci costs Rs.10450");	
	   break;
       case 4:System.out.println("Round frame of Gucci costs Rs.8000");			
	   break;
	   case 5:System.exit(0);	
	   default:System.out.println("invalid choice");
	 }
	 break;
	
	 case 3:System.out.println("\nWhich type of Frame would you wear?\n1.Rectangle\n2.Square\n3.Oval\n4.Round\nPLEASE CHOOSE FROM ABOVE CHOICES ONLY");
      ch4=s.nextInt();	

	  switch(ch4)
	  {
	   case 1:System.out.println("Rectangle frame of Oakley costs Rs.17050");	
	   break;
	   case 2:System.out.println("Square frame of Oakley costs Rs.21000");	
	   break;
	   case 3:System.out.println("Oval frame of Oakley costs Rs.13550");	
	   break;
       case 4:System.out.println("Round frame of Oakley costs Rs.9000");			
	   break;
	   case 5:System.exit(0);	
	   default:System.out.println("invalid choice");
	 }
	 break;
	 
	 case 4:System.out.println("\nWhich type of Frame would you wear?\n1.Rectangle\n2.Square\n3.Oval\n4.Round\nPLEASE CHOOSE FROM ABOVE CHOICES ONLY");
      ch4=s.nextInt();
     		  
	  switch(ch4)
	  {
	   case 1:System.out.println("Rectangxle frame of Ray-ban costs Rs.12000");	
	   break;
	   case 2:System.out.println("Square frame of Ray-ban costs Rs.14750");	
	   break;
	   case 3:System.out.println("Oval frame of Ray-ban costs Rs.16000");	
	   break;
       case 4:System.out.println("Round frame of Ray-Ban costs Rs.8500");			
	   break;
	   case 5:System.exit(0);	
	   default:System.out.println("invalid choice");
	 }
	 break;
	}	    	  
    break;
	
	}
	 
	break;
	
	//female
	
	
	case 2:	
	do{
	 System.out.println("\n\n\nPRICE RANGE-\n 1.500-1000\n2.1000-3000\n3.3000-5000\n4.5000-8000\n5.8000above\nPLEASE CHOOSE FROM ABOVE CHOICES ONLY");
     ch2=s.nextInt();
	}while(ch2>5);
     switch(ch2)
     {
   
     case 1:System.out.println("\n1.Ross\n2.Lance\n3.IDEE\n4.Bvlgari\nPLEASE CHOOSE FROM ABOVE CHOICES ONLY");       
	 ch3=s.nextInt();
	
     switch(ch3)
	 {
		
	  case 1:System.out.println("\nWhich type of Frame would you wear?\n1.Rectangle\n2.Square\n3.Oval\n4.Round\nPLEASE CHOOSE FROM ABOVE CHOICES ONLY");
      ch4=s.nextInt();
      		  
	  switch(ch4)
	  {
	   case 1:System.out.println("Rectangle frame of ross costs Rs.960");	
	   break;
	   case 2:System.out.println("Square frame of ross costs Rs.975");	
	   break;
	   case 3:System.out.println("Oval frame of ross costs Rs.763");	
	   break;
       case 4:System.out.println("Round frame of ross costs Rs.700");			
	   break;
	   case 5:System.exit(0);	
	   default:System.out.println("invalid choice");	
	   
	 
	  }	
	   break;
	   
	  case 2:System.out.println("\nWhich type of Frame would you wear?\n1.Rectangle\n2.Square\n3.Oval\n4.Round\nPLEASE CHOOSE FROM ABOVE CHOICES ONLY");
      ch4=s.nextInt();
     		  
	  switch(ch4)
	  {
	   case 1:System.out.println("Rectangle frame of lance costs Rs.541");	
	   break;
	   case 2:System.out.println("Square frame of lance costs Rs.775");	
	   break;
	   case 3:System.out.println("Oval frame of lance costs Rs.938");	
	   break;
       case 4:System.out.println("Round frame of lance costs Rs.893");			
	   break;
	   case 5:System.exit(0);	
	   default:System.out.println("invalid choice");
	 }
	 break;
	 
	 case 3:System.out.println("\nWhich type of Frame would you wear?\n1.Rectangle\n2.Square\n3.Oval\n4.Round\nPLEASE CHOOSE FROM ABOVE CHOICES ONLY");
      ch4=s.nextInt();	
     	  	  
	  switch(ch4)
	  {
	   case 1:System.out.println("Rectangle frame of IDEE costs Rs.720");	
	   break;
	   case 2:System.out.println("Square frame of IDEE costs Rs.569");	
	   break;
	   case 3:System.out.println("Oval frame of IDEE costs Rs.656");	
	   break;
       case 4:System.out.println("Round frame of IDEE costs Rs.932");			
	   break;
	   case 5:System.exit(0);	
	   default:System.out.println("invalid choice");
	 }
	 break;
	 
	 case 4:System.out.println("\nWhich type of Frame would you wear?\n1.Rectangle\n2.Square\n3.Oval\n4.Round\nPLEASE CHOOSE FROM ABOVE CHOICES ONLY");
      ch4=s.nextInt();	 
       	 	  
	  switch(ch4)
	  {
	   case 1:System.out.println("Rectangle frame of bvlgari costs Rs.878");	
	   break;
	   case 2:System.out.println("Square frame of bvlgari costs Rs.951");	
	   break;
	   case 3:System.out.println("Oval frame of bvlgari costs Rs.546");	
	   break;
       case 4:System.out.println("Round frame of bvlgari costs Rs.731");			
	   break;
	   case 5:System.exit(0);	
	   default:System.out.println("invalid choice");
	 }
	 break;
	}	    	  
    break;
		
	case 2:System.out.println("\n1.Prawa\n2.Flair\n3.Vintage\n4.Active\nPLEASE CHOOSE FROM ABOVE CHOICES ONLY");       
     ch3=s.nextInt();
		
     switch(ch3)
	 {
		
	  case 1:System.out.println("\nWhich type of Frame would you wear?\n1.Rectangle\n2.Square\n3.Oval\n4.Round\nPLEASE CHOOSE FROM ABOVE CHOICES ONLY");
      ch4=s.nextInt();	
     	  	  
	  switch(ch4)
	  {
	   case 1:System.out.println("Rectangle frame of Prawa costs Rs.1245");	
	   break;
	   case 2:System.out.println("Square frame of Prawa costs Rs.2706");	
	   break;
	   case 3:System.out.println("Oval frame of Prawa costs Rs.2336");	
	   break;
       case 4:System.out.println("Round frame of Prawa costs Rs.2373");			
	   break;
	   case 5:System.exit(0);	
	   default:System.out.println("invalid choice");	
	   
	 
	  }	
	   break;
	   
	  case 2:System.out.println("\nWhich type of Frame would you wear?\n1.Rectangle\n2.Square\n3.Oval\n4.Round\nPLEASE CHOOSE FROM ABOVE CHOICES ONLY");
      ch4=s.nextInt();	
      	  	  
	  switch(ch4)
	  {
	   case 1:System.out.println("Rectangle frame of Flair costs Rs.1971");	
	   break;
	   case 2:System.out.println("Square frame of Flair costs Rs.1798");	
	   break;
	   case 3:System.out.println("Oval frame of Flair costs Rs.1308");	
	   break;
       case 4:System.out.println("Round frame of Flair costs Rs.1424");			
	   break;
	   case 5:System.exit(0);	
	   default:System.out.println("invalid choice");
	 }
	 break;
	 
	 case 3:System.out.println("\nWhich type of Frame would you wear?\n1.Rectangle\n2.Square\n3.Oval\n4.Round\nPLEASE CHOOSE FROM ABOVE CHOICES ONLY");
      ch4=s.nextInt();
   	  
	  switch(ch4)
	  {
	   case 1:System.out.println("Rectangle frame of Vintage costs Rs.1395");	
	   break;
	   case 2:System.out.println("Square frame of Vintage costs Rs.2440");	
	   break;
	   case 3:System.out.println("Oval frame of Vintage costs Rs.2977");	
	   break;
       case 4:System.out.println("Round frame of Vintage costs Rs.1898");			
	   break;
	   case 5:System.exit(0);	
	   default:System.out.println("invalid choice");
	 }
	 break;
	
	 case 4:System.out.println("\nWhich type of Frame would you wear?\n1.Rectangle\n2.Square\n3.Oval\n4.Round\nPLEASE CHOOSE FROM ABOVE CHOICES ONLY");
      ch4=s.nextInt();	
     	  	  
	  switch(ch4)
	  {
	   case 1:System.out.println("Rectangle frame of Active costs Rs.2580");	
	   break;
	   case 2:System.out.println("Square frame of Active costs Rs.2904");	
	   break;
	   case 3:System.out.println("Oval frame of Active costs Rs.1557");	
	   break;
       case 4:System.out.println("Round frame of Active costs Rs.2082");			
	   break;
	   case 5:System.exit(0);	
	   default:System.out.println("invalid choice");
	 }
	 break;
	}	    	  
    break;
	
	 case 3:System.out.println("\n1.Guess\n2.Scott\n3.Rodenstock\n4.Giorgio Armani\nPLEASE CHOOSE FROM ABOVE CHOICES ONLY");       
   	ch3=s.nextInt();
		
     switch(ch3)
	 {
	
	  case 1:System.out.println("\nWhich type of Frame would you wear?\n1.Rectangle\n2.Square\n3.Oval\n4.Round\nPLEASE CHOOSE FROM ABOVE CHOICES ONLY");
      ch4=s.nextInt();
  		  
	  switch(ch4)
	  {
	   case 1:System.out.println("Rectangle frame of Guess costs Rs.3293");	
	   break;
	   case 2:System.out.println("Square frame of Guess costs Rs.3837");	
	   break;
	   case 3:System.out.println("Oval frame of Guess costs Rs.4087");	
	   break;
       case 4:System.out.println("Round frame of Guess costs Rs.3538");			
	   break;
	   case 5:System.exit(0);	
	   default:System.out.println("invalid choice");	
	   
	 
	  }	
	   break;
	   
	  case 2:System.out.println("\nWhich type of Frame would you wear?\n1.Rectangle\n2.Square\n3.Oval\n4.Round\nPLEASE CHOOSE FROM ABOVE CHOICES ONLY");
      ch4=s.nextInt();
     		  
	  switch(ch4)
	  {
	   case 1:System.out.println("Rectangle frame of Scott costs Rs.3341");	
	   break;
	   case 2:System.out.println("Square frame of Scott costs Rs.3078");	
	   break;
	   case 3:System.out.println("Oval frame of Scott costs Rs.3017");	
	   break;
       case 4:System.out.println("Round frame of Scott costs Rs.3695");			
	   break;
	   case 5:System.exit(0);	
	   default:System.out.println("invalid choice");
	 }
	 break;
	 
	 case 3:System.out.println("\nWhich type of Frame would you wear?\n1.Rectangle\n2.Square\n3.Oval\n4.Round\nPLEASE CHOOSE FROM ABOVE CHOICES ONLY");
      ch4=s.nextInt();	
     	  	  
	  switch(ch4)
	  {
	   case 1:System.out.println("Rectangle frame of Rodenstock costs Rs.4404");	
	   break;
	   case 2:System.out.println("Square frame of Rodenstock costs Rs.4610");	
	   break;
	   case 3:System.out.println("Oval frame of Rodenstock costs Rs.5000");	
	   break;
       case 4:System.out.println("Round frame of Rodenstock costs Rs.3240");			
	   break;
	   case 5:System.exit(0);	
	   default:System.out.println("invalid choice");
	 }
	 break;
	
	 case 4:System.out.println("\nWhich type of Frame would you wear?\n1.Rectangle\n2.Square\n3.Oval\n4.Round\nPLEASE CHOOSE FROM ABOVE CHOICES ONLY");
      ch4=s.nextInt();
    		  
	  switch(ch4)
	  {
	   case 1:System.out.println("Rectangle frame of Giorgio Armani costs Rs.4530");	
	   break;
	   case 2:System.out.println("Square frame of Giorgio Armani costs Rs.3634");	
	   break;
	   case 3:System.out.println("Oval frame of Giorgio Armani costs Rs.3190");	
	   break;
       case 4:System.out.println("Round frame of Giorgio Armani costs Rs.4758");			
	   break;
	   case 5:System.exit(0);	
	   default:System.out.println("invalid choice");
	 }
	 break;
	}	    	  
    break;
	
	case 4:System.out.println("\n1.Tommy Hilfiger\n2.Porsche\n3.Calvin Klein\n4.Nike\nPLEASE CHOOSE FROM ABOVE CHOICES ONLY");       
    ch3=s.nextInt();
		
     switch(ch3)
	 {
		 
	  case 1:System.out.println("\nWhich type of Frame would you wear?\n1.Rectangle\n2.Square\n3.Oval\n4.Round\nPLEASE CHOOSE FROM ABOVE CHOICES ONLY");
      ch4=s.nextInt();	
       	  	  
	  switch(ch4)
	  {
	   case 1:System.out.println("Rectangle frame of Tommy Hilfiger costs Rs.7380");	
	   break;
	   case 2:System.out.println("Square frame of Tommy Hilfiger costs Rs.7786");	
	   break;
	   case 3:System.out.println("Oval frame of Tommy Hilfiger costs Rs.6248");	
	   break;
       case 4:System.out.println("Round frame of Tommy Hilfiger costs Rs.5862");			
	   break;
	   case 5:System.exit(0);	
	   default:System.out.println("invalid choice");	
	   
	 
	  }	
	   break;
	  
	  case 2:System.out.println("\nWhich type of Frame would you wear?\n1.Rectangle\n2.Square\n3.Oval\n4.Round\nPLEASE CHOOSE FROM ABOVE CHOICES ONLY");
      ch4=s.nextInt();	
          	  
	  switch(ch4)
	  {
	   case 1:System.out.println("Rectangle frame of Porsche costs Rs.6050");	
	   break;
	   case 2:System.out.println("Square frame of Porsche costs Rs.6078");	
	   break;
	   case 3:System.out.println("Oval frame of Porsche costs Rs.8000");	
	   break;
       case 4:System.out.println("Round frame of Porsche costs Rs.7225");			
	   break;
	   case 5:System.exit(0);	
	   default:System.out.println("invalid choice");
	 }
	 break;
	  
	 case 3:System.out.println("\nWhich type of Frame would you wear?\n1.Rectangle\n2.Square\n3.Oval\n4.Round\nPLEASE CHOOSE FROM ABOVE CHOICES ONLY");
      ch4=s.nextInt();	
      	  	  
	  switch(ch4)
	  {
	   case 1:System.out.println("Rectangle frame of Calvin Klein costs Rs.6075");	
	   break;
	   case 2:System.out.println("Square frame of Calvin Klein costs Rs.6035");	
	   break;
	   case 3:System.out.println("Oval frame of Calvin Klein costs Rs.6361");	
	   break;
       case 4:System.out.println("Round frame of Calvin Klein costs Rs.7250");			
	   break;
	   case 5:System.exit(0);	
	   default:System.out.println("invalid choice");
	 }
	 break;
	 
	 case 4:System.out.println("\nWhich type of Frame would you wear?\n1.Rectangle\n2.Square\n3.Oval\n4.Round\nPLEASE CHOOSE FROM ABOVE CHOICES ONLY");
      ch4=s.nextInt();
      		  
	  switch(ch4)
	  {
	   case 1:System.out.println("Rectangle frame of Nike costs Rs.6080");	
	   break;
	   case 2:System.out.println("Square frame of Nike costs Rs.7640");	
	   break;
	   case 3:System.out.println("Oval frame of Nike costs Rs.6070");	
	   break;
       case 4:System.out.println("Round frame of Nike costs Rs.7750");			
	   break;
	   case 5:System.exit(0);	
	   default:System.out.println("invalid choice");
	 }
	 break;
	}	    	  
    break;
	
	case 5:System.out.println("\n1.Vogue\n2.Gucci\n3.Oakley\n4.Ray-ban\nPLEASE CHOOSE FROM ABOVE CHOICES ONLY");       
     ch3=s.nextInt();
	 
     switch(ch3)
	 {
		 
	  case 1:System.out.println("\nWhich type of Frame would you wear?\n1.Rectangle\n2.Square\n3.Oval\n4.Round\nPLEASE CHOOSE FROM ABOVE CHOICES ONLY");
      ch4=s.nextInt();
       
	  switch(ch4)
	  {
	   case 1:System.out.println("Rectangle frame of Vogue costs Rs.19100");	
	   break;
	   case 2:System.out.println("Square frame of Vogue costs Rs.17350");	
	   break;
	   case 3:System.out.println("Oval frame of Vogue costs Rs.12150");	
	   break;
       case 4:System.out.println("Round frame of Vogue costs Rs.18000");			
	   break;
	   case 5:System.exit(0);	
	   default:System.out.println("invalid choice");	
	   
	 
	  }	
	   break;
	   
	  case 2:System.out.println("\nWhich type of Frame would you wear?\n1.Rectangle\n2.Square\n3.Oval\n4.Round\nPLEASE CHOOSE FROM ABOVE CHOICES ONLY");
      ch4=s.nextInt();
      	  
	  switch(ch4)
	  {
	   case 1:System.out.println("Rectangle frame of Gucci costs Rs.14800");	
	   break;
	   case 2:System.out.println("Square frame of Gucci costs Rs.21450");	
	   break;
	   case 3:System.out.println("Oval frame of Gucci costs Rs.16375");	
	   break;
       case 4:System.out.println("Round frame of Gucci costs Rs.22520");			
	   break;
	   case 5:System.exit(0);	
	   default:System.out.println("invalid choice");
	 }
	 break;
	
	 case 3:System.out.println("\nWhich type of Frame would you wear?\n1.Rectangle\n2.Square\n3.Oval\n4.Round\nPLEASE CHOOSE FROM ABOVE CHOICES ONLY");
      ch4=s.nextInt();	
      	  	  
	  switch(ch4)
	  {
	   case 1:System.out.println("Rectangle frame of Oakley costs Rs.10270");	
	   break;
	   case 2:System.out.println("Square frame of Oakley costs Rs.17645");	
	   break;
	   case 3:System.out.println("Oval frame of Oakley costs Rs.21910");	
	   break;
       case 4:System.out.println("Round frame of Oakley costs Rs.13850");			
	   break;
	   case 5:System.exit(0);	
	   default:System.out.println("invalid choice");
	 }
	 break;
	  
	 case 4:System.out.println("\nWhich type of Frame would you wear?\n1.Rectangle\n2.Square\n3.Oval\n4.Round\nPLEASE CHOOSE FROM ABOVE CHOICES ONLY");
      ch4=s.nextInt();	
     	  	  
	  switch(ch4)
	  {
	   case 1:System.out.println("Rectangxle frame of Ray-ban costs Rs.12000");	
	   break;
	   case 2:System.out.println("Square frame of Ray-ban costs Rs.14750");	
	   break;
	   case 3:System.out.println("Oval frame of Ray-ban costs Rs.16000");	
	   break;
       case 4:System.out.println("Round frame of Ray-Ban costs Rs.8500");			
	   break;
	   case 5:System.exit(0);	
	   default:System.out.println("invalid choice");
	 }
	 break;
	}	    	  
    break;
	    
	
	
   }
	} 

   
	  
  System.out.println("***DETAILS***");
       System.out.println("\nEnter name");
     String name_=s.next();
	 System.out.println("\nAddress 1");
	  String add1_=s.next();
	  System.out.println("\nAddress 2");
	   String add2_=s.next();
	   System.out.println("\nPhone");
	    String phone_=s.next();
		System.out.println("\nState");
		 String state_=s.next();
		 System.out.println("\nCity");
		  String city_=s.next();
		  System.out.println("\nPincode");
		   String pin_=s.next();
  
     
   
   lens_king ob=new lens_king();
   ob.detail(name_,add1_,add2_,phone_,state_,city_,pin_);
    
	System.out.println("***THANKS FOR VISTING***\nYour order has been placed and will reach at its destination as soon as possible");
      
  System.out.println("\nPress 1 to shop again\nPress any number to exit");
   again=s.nextInt();
  
  
 } while(again==1);  
	}
}