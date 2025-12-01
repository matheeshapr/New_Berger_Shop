package edu.icet.repository;

import edu.icet.model.dto.ItemDTO;
import edu.icet.model.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends JpaRepository<Item,Integer> {

}
