package com.baizhi.inventory.mapper;

import com.baizhi.inventory.entity.Product;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface ProductMapper {
    @Select("select * from t_product where id = #{id}")
    Product findProductById(Long id);

    @Update({"update t_product set name = #{name},",
            "price = #{price},",
            "stock = #{stock},",
            "description = #{description}",
            "where id = #{id}"
    })
    Integer updateProduct(Product product);
}