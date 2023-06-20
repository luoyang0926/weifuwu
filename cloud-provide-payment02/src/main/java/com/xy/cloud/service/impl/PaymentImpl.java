package com.xy.cloud.service.impl;

import com.xy.cloud.dao.PaymentDao02;
import com.xy.cloud.pojo.Payment;
import com.xy.cloud.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentImpl  implements PaymentService {

    @Autowired
    PaymentDao02 paymentDao;

    @Override
    public int create02(Payment payment) {
        return paymentDao.create02(payment);
    }

    @Override
    public Payment queryById02(long id) {
        return paymentDao.queryById02(id);

    }
}
