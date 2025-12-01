package edu.icet.service;

import edu.icet.model.entity.Item;
import edu.icet.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemService {

    @Autowired
    ItemRepository itemRepository;

    public void add(Item item) {
        itemRepository.save(item);
    }
}
