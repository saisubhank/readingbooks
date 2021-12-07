package io.reading.springboot.reading.repository;

import org.springframework.data.jpa.repository.JpaRepository;

//import  io.reading.springboot.reading.order.Order;
import io.reading.springboot.reading.books.Books;
//import  io.reading.springboot.reading.customer.customer;


public interface Repository extends JpaRepository<Books,Long> {

}
