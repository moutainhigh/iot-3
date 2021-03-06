package com.honeywell.fireiot.water.schedule.bean;

import lombok.Data;

/**
 * @author: xiaomingCao
 * @date: 2018/12/28
 */
@Data
public class LoraApiCmdRequest {

    private boolean confirmed = true;

    private int fport = 220;

    private String deveui;

    private String data;
}
