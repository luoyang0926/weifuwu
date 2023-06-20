package com.xy.cloud.dao;


import com.xy.cloud.pojo.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface PaymentDao02 {
    int create02(Payment payment);
    Payment queryById02(@Param("id")long id);

}
