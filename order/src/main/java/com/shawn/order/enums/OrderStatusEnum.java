package com.shawn.order.enums;

import lombok.Getter;

/**
 * @Description 订单状态枚举
 * @Author shawn
 * @create 2019/1/30 0030
 */
@Getter
public enum OrderStatusEnum {
    NEW(0, "新订单"),
    FINISHED(1, "完结"),
    CANCEL(2, "取消"),
    ;

    private Integer code;

    private String msg;

    OrderStatusEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
