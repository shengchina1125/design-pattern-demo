package com.xulp.pattern.adapter.poweradapter;

/**
 * @author xulp
 * @version v1.0.0
 * @Date 2022/4/25 15:33
 * @Description ---
 * PowerAdapter
 * Modification History:
 * Date Author Version Description
 * ---------------------------------------------------------------------------------*
 * 2022/4/25 15:33 xulp v1.0.0 Created
 */
public class PowerAdapter implements DC5 {

    private AC220 ac220;

    public PowerAdapter(AC220 ac220) {
        this.ac220 = ac220;
    }

    @Override
    public int outputDC5() {
        int adapterInput = ac220.outputAC220V();
        int adapterOutput = adapterInput / 44;
        System.out.println("使用PowerAdapter输入AC：" + adapterInput + "输出DC：" + adapterOutput);
        return adapterOutput;
    }
}
