package com.group.libraryapp.controller.fruit;

import com.group.libraryapp.dto.fruit.request.FruitCreateRequest;
import com.group.libraryapp.dto.fruit.request.FruitUpdateRequest;
import com.group.libraryapp.dto.fruit.response.FruitCountResponse;
import com.group.libraryapp.dto.fruit.response.FruitListResponse;
import com.group.libraryapp.dto.fruit.response.FruitStatResponse;
import com.group.libraryapp.service.fruit.FruitServiceV1;
import com.group.libraryapp.service.fruit.FruitServiceV2;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FruitController {


    private final FruitServiceV2 fruitServiceV2;

    public FruitController(FruitServiceV2 fruitServiceV2) {
        this.fruitServiceV2 = fruitServiceV2;
    }

    @PostMapping("/api/v1/fruit")
    public void createFruit(@RequestBody FruitCreateRequest request) {
        fruitServiceV2.createFruit(request);
    }

    @PutMapping("/api/v1/fruit")
    public void updateFruit(@RequestBody FruitUpdateRequest request) {
        fruitServiceV2.updateFruit(request);
    }

    @GetMapping("/api/v1/fruit/stat")
    public FruitStatResponse statFruit(@RequestParam("name") String name) {
        return fruitServiceV2.statFruit(name);
    }

    @GetMapping("/api/v1/fruit/count")
    public FruitCountResponse countFruit(@RequestParam("name") String name) {
        return fruitServiceV2.getCount(name);
    }

    @GetMapping("/api/v1/fruit/list")
    public List<FruitListResponse> getListFruit(@RequestParam("option") String option, @RequestParam("price") long price) {
        return fruitServiceV2.getList(option, price);
    }
}
