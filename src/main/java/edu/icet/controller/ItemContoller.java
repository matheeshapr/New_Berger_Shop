package edu.icet.controller;

import edu.icet.model.entity.Item;
import edu.icet.service.ItemService;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("items")
public class ItemContoller {

    @Autowired
    ItemService itemService;

    @PostMapping("additem")
    public void addItem(@RequestBody Item item){
        itemService.add(item);
    }

//    @GetMapping("getAll")
//    public String getAll(){
//        return "Matheesha";
//    }

}
