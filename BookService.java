package com.api.book.bootrestbook.services;

//import java.util.ArrayList;
import java.util.List;
//import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.api.book.bootrestbook.dao.BookRepository;
import com.api.book.bootrestbook.entities.Book;

@Component
public class BookService {
    
		@Autowired
		private BookRepository bookRepository;
		
//    private static List<Book> list = new ArrayList<>();
//
//    static{
//        list.add(new Book(1,"Java complete red","James Goslin"));
//        list.add(new Book(2,"C++ ","Bjare strustupe"));
//        list.add(new Book(3,"c","Dennis Retchie"));
//    }

    //get all book
    public List<Book> getAllBooks()
    {
        
    	List<Book> list = (List<Book>) this.bookRepository.findAll();
    	return list;
    }

    public Book getBookById(int id)
    {
        Book book = null;
        try {
        //book=list.stream().filter(e->e.getId()==id).findFirst().get();
        book = this.bookRepository.findById(id);
        } catch(Exception e)
        {
            e.printStackTrace();
        }
        return book;  
    }

    public Book addBook(Book b)
    {
        //list.add(b);
    	Book result = this.bookRepository.save(b);
        return result;
    }

    public void deleteBook(int bookId)
    {

        //list = list.stream().filter(book->book.getId()!=bookId).collect(Collectors.toList());
          this.bookRepository.deleteById(bookId);  
    }

    public void updateBook(Book book, int bookId)
    {
//        list = list.stream().map(b->{
//            if(b.getId()==bookId)
//            {
//                b.setTitle(book.getTitle());
//                b.setAuthor(book.getAuthor());
//            }
//            return b;
//        }).collect(Collectors.toList());
    	book.setId(bookId);
    	this.bookRepository.save(book);
    }
}