package com.cbj.pojo;

import com.alibaba.fastjson.annotation.JSONField;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Set;

@Data
public class Customer implements Serializable {

    private Integer id;

    private String name;

//    @JsonIgnore
//    @JSONField(serialize = false)
    @JsonIgnoreProperties("customer")
    private Set<Orders> orders;
}
