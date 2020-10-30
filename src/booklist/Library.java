package booklist;

import java.util.ArrayList;
import java.util.Scanner;

public class Library {

    static Scanner sc = new Scanner(System.in);
    static ArrayList<Book> books = new ArrayList<>();
    
    public static void addBook(){
        
        System.out.println("Enter name of book: ");
        String nameOfBook = sc.nextLine();
        
        System.out.println("Enter name of author: ");
        String nameOfAuthor = sc.nextLine();
        
        Book book = new Book(nameOfBook, nameOfAuthor);
        books.add(book);
        System.out.println("Book is created");
    }
    
    public static void removeBookById() {
        System.out.println("Enter ID to remove book: ");
        int bookId = sc.nextInt();
        sc.nextLine();
        
        for (int i = books.size() -1; i >= 0; i--) {
            if(books.get(i).getId() == bookId) {
                books.remove(books.get(i));
                System.out.println("Book has been removed");
            }
        }
        
//        for (Book book : books) {
//            if (book.getId() == bookId) {
//                books.remove(book);
//                System.out.println("Book has been removed");
//                break;
//            } else {
//           System.out.println("Book is not found");
//         }     
//        }
    }
    
    public static void removeBookByName() {
        
        System.out.println("Enter name to remove book: ");
        String nameOfBook = sc.nextLine();
        
        for (int i = books.size() -1; i >= 0; i--) {
            if(books.get(i).getName().equals(nameOfBook)) {
                books.remove(books.get(i));
                System.out.println("Book has been removed");
            }
        }    
    }
    
    public static void showBookById() {
        System.out.println("Enter ID for Book:");
        int bookId = sc.nextInt();
        sc.nextLine();

        for (Book book : books) {
            if (book.getId() == bookId) {
                System.out.println(book);
            }
        }
    }
    
    public static void showAllBooks(){
        
        System.out.println(books);       
    }
    
    public static void updateBookName() {
        
        System.out.println("Enter id of book to change name: ");
        int idOfBook = sc.nextInt();
        sc.nextLine();
        
        for (Book book : books) {
            if (book.getId() == idOfBook) {
                
                System.out.println("Enter new name for book: ");
                String newName = sc.nextLine();
                
                book.setName(newName);
                System.out.println("Book name is updated to \"" + newName + "\"");
            }
        }
    }
    
    public static void numberOfBooks() {
        System.out.println(books.size());
    }
    
   
    
}
