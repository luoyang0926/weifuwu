package com.xy.cloud.service;

import com.xy.cloud.pojo.Payment;
import org.apache.ibatis.annotations.Param;

public interface PaymentService {

        int create02(Payment payment);

        Payment queryById02(@Param("id") long id);

    }

