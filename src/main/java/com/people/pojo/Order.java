package com.people.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {
    private int order_id;
    private String order_name;
    private String order_local;
    private String order_time;
}
