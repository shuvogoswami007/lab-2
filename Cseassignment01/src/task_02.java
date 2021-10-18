class Books{
       
          String title;
          String author;
          int price;
          int pages;
          String publication;
          String edition;
          void showInfo()
          {
              System.out.println(title +" "+ edition + " edition");
              System.out.println("By "+author);
              System.out.println(pages + " pages");
              System.out.println("Price: "+price + " tk");
              System.out.println(publication);
          
          }
          String GetAddress()
          {
        	  return this.toString();
          }
          
       }

public class task_02 {
    public static void main(String[] args)
    {
    	
        Books book1  = new Books();
        book1.title = "Java for Beginners ";
        book1.edition = "3rd";
        book1.author = "Prof.David";
        book1.pages = 537;
        book1.price = 299;
        book1.publication = "Easy Coding Publication";       
        book1.showInfo();
        
        System.out.print("\n");
        
        Books book2  = new Books();
        book2.title = "Omega Point ";
        book2.edition = "12th";
        book2.author = "Humayun Ahmed";
        book2.pages = 122;
        book2.price = 128;
        book2.publication = "Shomoy Prokashoni";        
        book2.showInfo();
        
        System.out.print("\n");
        
        Books book3  = new Books();
        book3.title = "Digital Fortress ";
        book3.edition = "5th";
        book3.author = "Dan Brown";
        book3.pages = 356;
        book3.price = 520;
        book3.publication = "St. Marthin Press";        
        book3.showInfo();
        
       String str1 = book1.GetAddress();
       String str2 = book2.GetAddress();
       String str3 = book3.GetAddress();
         
       String[] array1 = str1.split("@");
       String[] array2 = str1.split("@");
       String[] array3 = str1.split("@");
       
        System.out.println("Memory Address  Book1:- " +array1[1]);
        System.out.println("Memory Address  Book2:- " +array2[1]);
        System.out.println("Memory Address  Book3:- " +array3[1]);
        
       System.out.println();
       
       System.out.println("After....");
        book1 = book3;
        book1.edition = "1st";
        book3.showInfo();
        
        String cstr1 = book1.GetAddress();
        String cstr3 = book3.GetAddress();
        
        String[] charray1 = cstr1.split("@");
        String[] charray3 = cstr3.split("@");
        
        System.out.println("Memory Address  Book1:- " +charray1[1]);
        System.out.println("Memory Address  Book2:- " +array2[1]);
        System.out.println("Memory Address  Book3:- " +charray3[1]);
        
    }
}