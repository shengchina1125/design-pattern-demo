package com.xulp.pattern.strategy.pay;

/**
 * @author xulp
 * @version v1.0.0
 * @Date 2022/4/21 16:44
 * @Description ---
 * MsgResult
 * Modification History:
 * Date Author Version Description
 * ---------------------------------------------------------------------------------*
 * 2022/4/21 16:44 xulp v1.0.0 Created
 */
public class MsgResult {
    private int code;
    private String message;
    private Object date;

    public MsgResult(int code, String message, Object date) {
        this.code = code;
        this.message = message;
        this.date = date;
    }


    @Override
    public String toString() {
        return "支付状态：[" + code + "]," + message +
                "，交易详情：" + date ;
    }
}
