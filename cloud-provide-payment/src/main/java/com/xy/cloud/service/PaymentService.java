package com.xy.cloud.service;

import com.xy.cloud.pojo.Payment;
import org.apache.ibatis.annotations.Param;

public interface PaymentService {

        int create(Payment payment);

        Payment queryById(@Param("id") long id);

    }

