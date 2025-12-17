package edu.icet.repository;

import edu.icet.model.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Integer> {

    //@Query ("SELECT * FROM Customer WHERE name = :name")
    Customer findByName(@Param("name") String name);

}
