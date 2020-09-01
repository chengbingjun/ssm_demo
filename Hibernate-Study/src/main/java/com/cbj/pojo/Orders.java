package com.cbj.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.io.Serializable;

@Data
public class Orders implements Serializable {

    private Integer id;

    private String name;

//    @JSONField(serialize = false)
//    @JsonIgnore
    @JsonIgnoreProperties("orders")
    private Customer customer;

}
