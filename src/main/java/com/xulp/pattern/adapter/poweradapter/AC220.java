package com.xulp.pattern.adapter.poweradapter;

/**
 * @author xulp
 * @version v1.0.0
 * @Date 2022/4/25 13:42
 * @Description ---
 * AC220
 * Modification History:
 * Date Author Version Description
 * ---------------------------------------------------------------------------------*
 * 2022/4/25 13:42 xulp v1.0.0 Created
 */
public class AC220 {

    public int outputAC220V() {
        int output = 220;
        System.out.println("输出电流" + output + "V");
        return output;
    }
}
