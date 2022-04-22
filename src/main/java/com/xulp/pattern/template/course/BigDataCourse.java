package com.xulp.pattern.template.course;

/**
 * @author xulp
 * @version v1.0.0
 * @Date 2022/4/22 10:51
 * @Description ---
 * BigDataCourse
 * Modification History:
 * Date Author Version Description
 * ---------------------------------------------------------------------------------*
 * 2022/4/22 10:51 xulp v1.0.0 Created
 */
public class BigDataCourse extends NetworkCourse {

    private boolean needHomeWorkFlag = false;

    @Override
    void checkHomeWork() {
        System.out.println("检查大数据的课件");
    }

    public BigDataCourse(boolean needHomeWorkFlag) {
        this.needHomeWorkFlag = needHomeWorkFlag;
    }

    @Override
    protected boolean needHomeWork() {
        return this.needHomeWorkFlag;
    }
}
