package com.baizhi.order.mapper;

import com.baizhi.order.entity.Order;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

public interface OrderMapper {

    @Select("select id,name,price,num,user_id userId,product_id productId from t_order where id = #{id}")
    Order findOrderById(Long id);

    @Insert({"insert into t_order(name,price,num,user_id,product_id)","values(#{name},#{price},#{num},#{userId},#{productId})"})
    int insertOrder(Order order);
}