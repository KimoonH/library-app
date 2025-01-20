package com.group.libraryapp.repository.fruit;

import com.group.libraryapp.dto.fruit.request.FruitCreateRequest;
import com.group.libraryapp.dto.fruit.request.FruitUpdateRequest;
import com.group.libraryapp.dto.fruit.response.FruitStatResponse;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Primary
@Repository
public class FruitMySqlRepository implements FruitRepository {

    private final JdbcTemplate jdbcTemplate;

    public FruitMySqlRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public void createFruit(FruitCreateRequest request) {
        String sql = "INSERT INTO fruit (name, warehousingDate, price) VALUES (?, ?, ?)";

        jdbcTemplate.update(sql, request.getName(), request.getWarehousingDate(), request.getPrice());
    }

    @Override
    public void updateFruit(FruitUpdateRequest request) {
        String sql = "update fruit set salesYN = 1 where id = ?";
        jdbcTemplate.update(sql, request.getId());
    }

    @Override
    public FruitStatResponse statFruit(String name) {
        long salesAmount = 0;
        long notSalesAmount = 0;

        String salesAmountSql = "select * from fruit where name = ? AND salesYN = 1";
        List<Long> salesPrices = jdbcTemplate.query(salesAmountSql, (rs, rowNum) -> rs.getLong("price"), name);
        String notSalesAmountSql = "select * from fruit where name = ? AND salesYN = 0";
        List<Long> notSalesPrices = jdbcTemplate.query(notSalesAmountSql, (rs, rowNum) -> rs.getLong("price"), name);

        for(Long price : salesPrices) {
            salesAmount += price;
        }

        for(Long price : notSalesPrices) {
            notSalesAmount += price;
        }

        return new FruitStatResponse(salesAmount, notSalesAmount);
    }
}
