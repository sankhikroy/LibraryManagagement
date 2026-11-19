import java.sql.SQLOutput;
import java.util.ArrayList;

public class Library{
 private ArrayList <Book> books=new ArrayList<>();
 public void addbook(Book book){
     books.add(book);
     System.out.println("Book Added"+book.getName());
 }
    public void viewbook(){
     if (books.isEmpty()){
         System.out.println("Books are not avaliable currently");
         return;
     }
     else{
         for(Book b:books){
             System.out.println(b);
         }
    }
}
public void borrowbook(int id){
     for(Book b:books){
         if(b.getId()==id){
         if (b.isavalaible()) {
             b.setavalaible(false);
             System.out.println("You Borrowed "+b.getName());}
         else {
             System.out.println("Book is not avalaible");
         }
         return;
     }}
         System.out.println("Give correct ID");
 }
public void returnbook(int id){

     for (Book b:books){
         if(id==b.getId()){
         if(!b.isavalaible()){
             b.setavalaible(true);
         }
             System.out.printf("you returned %s book",b.getName());
         }
         else{
             System.out.println("BOOK is not borrowed");
         }
     }
    System.out.println("THIS ID DOESNOT EXIST");
 }
}
