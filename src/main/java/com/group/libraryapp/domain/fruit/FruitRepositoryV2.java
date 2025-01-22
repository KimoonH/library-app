package com.group.libraryapp.domain.fruit;

import com.group.libraryapp.dto.fruit.response.FruitListResponse;
import com.group.libraryapp.dto.fruit.response.FruitStatResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface FruitRepositoryV2 extends JpaRepository<Fruit, Long> {
    List<Fruit> findAllByNameAndSalesYN(String name, int salesYN);

    int countByName(String name);

    Optional<List<FruitListResponse>> findAllByPriceGreaterThan(long price);

    Optional<List<FruitListResponse>> findAllByPriceLessThan(long price);
}
