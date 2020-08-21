package com.test.vo;

import com.test.pojo.Student;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @Author cbjun
 * @create 2020/8/21 11:23
 */
@Data
public class StudentVo extends Student{

    private Integer tId;

    private String tName;

    @Override
    public String toString() {
        return "StudentVo{" +
                "id=" + this.getId() +
                " ,name="+ this.getName()+
                " ,tId=" + tId +
                ", tName=" + tName +
                "}";
    }
}
