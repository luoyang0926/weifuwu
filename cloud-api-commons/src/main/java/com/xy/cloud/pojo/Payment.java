package com.xy.cloud.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class Payment implements Serializable {
    private Long id;
    // 微服务 一个服务对应一个数据库，同一个信息可能存在不同的数据库
    private  String serial;
}
