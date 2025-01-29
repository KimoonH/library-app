package com.group.libraryapp.controller.fruit;

import com.group.libraryapp.domain.fruit.Fruit;
import com.group.libraryapp.repository.fruit.FruitMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.swing.*;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class TestController {

    private final FruitMapper fruitMapper;


    @GetMapping("/test/mybatis")
    public void testMybatis(){
        List<Fruit> fruits = fruitMapper.findAll();
        for(Fruit fruit : fruits){
            System.out.println(fruit.getName());
            System.out.println(fruit.getPrice());
        }
    }
}
