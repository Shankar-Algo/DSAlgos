package com.basics.scjp.learn;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;



public class BookMain {

  private static final String BOOKSTORE_XML = "D:/GIT_REPOS/Sw_Portal_Auto_RFE_OCT_22/Z_Sample_Exercises/src/com/basics/scjp/learn/bookstore-jaxb.xml";

  public static void main(String[] args) throws JAXBException, IOException {

    ArrayList<Book> bookList = new ArrayList<Book>();

    // create books
    Book book1 = new Book();
    book1.setIsbn("978-0060554736");
    book1.setName("The Game");
    book1.setAuthor("Neil Strauss");
    book1.setPublisher("Harpercollins");
    bookList.add(book1);

    Book book2 = new Book();
    book2.setIsbn("978-3832180577");
    book2.setName("Feuchtgebiete");
    book2.setAuthor("Charlotte Roche");
    book2.setPublisher("Dumont Buchverlag");
    bookList.add(book2);

    // create bookstore, assigning book
    Bookstore bookstore = new Bookstore();
    bookstore.setName("Fraport Bookstore");
    bookstore.setLocation("Frankfurt Airport");
    bookstore.setBookList(bookList);

    // create JAXB context and instantiate marshaller
    JAXBContext context = JAXBContext.newInstance(Bookstore.class);
    Marshaller m = context.createMarshaller();
    m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

    // Write to System.out
    m.marshal(bookstore, System.out);

    // Write to File
    m.marshal(bookstore, new FileWriter(new File(BOOKSTORE_XML)));

    // get variables from our xml file, created before
    /*System.out.println();
    System.out.println("Output from our XML File: ");
    Unmarshaller um = context.createUnmarshaller();
    Bookstore bookstore2 = (Bookstore) um.unmarshal(new FileReader(BOOKSTORE_XML));
    ArrayList<Book> list = bookstore2.getBooksList();
    for (Book book : list) {
      System.out.println("Book: " + book.getName() + " from "
          + book.getAuthor());
    }*/
  }
} 