class Book{
       
          String title; String author; int price; int pages; String publication; String edition;
          
          void showInfo()
          {
              System.out.println(title +" "+ edition + " edition");
              System.out.println("By "+author);
              System.out.println(pages + " pages");
              System.out.println("Price: "+price + " tk");
              System.out.println(publication);
          
          }     
       }

public class task_01{
    public static void main(String[] args)
    {
    	Book book1  = new Book();
        book1.title = "Java for Beginners ";
        book1.edition = "3rd";
        book1.author = "Prof.David";
        book1.pages = 537;
        book1.price = 299;
        book1.publication = "Easy Coding Publication";       
                   
        
        Book book2  = new Book();
        book2.title = "Omega Point ";
        book2.edition = "12th";
        book2.author = "Humayun Ahmed";
        book2.pages = 122;
        book2.price = 128;
        book2.publication = "Shomoy Prokashoni";        
            
        
        Book book3  = new Book();
        book3.title = "Digital Fortress ";
        book3.edition = "5th";
        book3.author = "Dan Brown";
        book3.pages = 356;
        book3.price = 520;
        book3.publication = "St. Marthin Press";        
        
        book1.showInfo();
        book2.showInfo(); 
        book3.showInfo();
    }
}