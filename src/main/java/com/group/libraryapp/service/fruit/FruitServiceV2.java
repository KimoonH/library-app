package com.group.libraryapp.service.fruit;

import com.group.libraryapp.domain.fruit.Fruit;
import com.group.libraryapp.domain.fruit.FruitRepositoryV2;
import com.group.libraryapp.dto.fruit.request.FruitCreateRequest;
import com.group.libraryapp.dto.fruit.request.FruitUpdateRequest;
import com.group.libraryapp.dto.fruit.response.FruitCountResponse;
import com.group.libraryapp.dto.fruit.response.FruitListResponse;
import com.group.libraryapp.dto.fruit.response.FruitStatResponse;
import com.group.libraryapp.repository.fruit.FruitRepositoryV1;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FruitServiceV2 {

    private final FruitRepositoryV2 fruitRepositoryV2;

    public FruitServiceV2(FruitRepositoryV2 fruitRepositoryV2) {
        this.fruitRepositoryV2 = fruitRepositoryV2;
    }

    public void createFruit(FruitCreateRequest request) {
        fruitRepositoryV2.save(new Fruit(request.getName(), request.getPrice()));
    }

    public void updateFruit(FruitUpdateRequest request) {
        Fruit fruit = fruitRepositoryV2.findById(request.getId()).orElseThrow(IllegalArgumentException::new);
        fruit.setName(request.getName());

        fruitRepositoryV2.save(fruit);
    }

    public FruitStatResponse statFruit(String name) {
        List<Fruit> salesList = fruitRepositoryV2.findAllByNameAndSalesYN(name, 1);
        List<Fruit> notSalesList = fruitRepositoryV2.findAllByNameAndSalesYN(name, 0);

        long salesAmount = 0;
        long notSalesAmount = 0;

        for(Fruit fruit : salesList) {
            salesAmount += fruit.getPrice();
        }

        for(Fruit fruit : notSalesList) {
            notSalesAmount += fruit.getPrice();
        }

        return new FruitStatResponse(salesAmount, notSalesAmount);
    }

    public FruitCountResponse getCount(String name) {
        return new FruitCountResponse(fruitRepositoryV2.countByName(name));
    }

    public List<FruitListResponse> getList(String option, long price) {
        Optional<List<FruitListResponse>> list;

        if(option.equals("GTE")) {
            list = fruitRepositoryV2.findAllByPriceGreaterThan(price);
        } else {
            list = fruitRepositoryV2.findAllByPriceLessThan(price);
        }

        return list.orElseThrow(IllegalArgumentException::new);
    }
}
