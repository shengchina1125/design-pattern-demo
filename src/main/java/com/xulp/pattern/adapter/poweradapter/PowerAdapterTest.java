package com.xulp.pattern.adapter.poweradapter;

/**
 * @author xulp
 * @version v1.0.0
 * @Date 2022/4/25 15:36
 * @Description ---
 * PowerAdapterTest
 * Modification History:
 * Date Author Version Description
 * ---------------------------------------------------------------------------------*
 * 2022/4/25 15:36 xulp v1.0.0 Created
 */
public class PowerAdapterTest {

    public static void main(String[] args) {
        DC5 dc5 = new PowerAdapter(new AC220());
        dc5.outputDC5();
    }
}
