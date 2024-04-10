package com.tyut.po;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @program: dormitorySystem
 * @description: 维修登记
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DormRepair {
    private int r_id;
    private int d_id;
    private String d_dormbuilding;
    private String r_name;
    private String reason;
    private int money;

    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date create_time;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date update_time;

}

