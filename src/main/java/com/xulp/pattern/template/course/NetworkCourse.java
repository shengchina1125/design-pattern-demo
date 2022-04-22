package com.xulp.pattern.template.course;

/**
 * @author xulp
 * @version v1.0.0
 * @Date 2022/4/22 10:39
 * @Description ---
 * NetworkCourse
 * Modification History:
 * Date Author Version Description
 * ---------------------------------------------------------------------------------*
 * 2022/4/22 10:39 xulp v1.0.0 Created
 */
public abstract class NetworkCourse {

    protected final void createCourse() {
        // 1.发布预习资料
        this.postPreResource();

        // 2.制作PPT课件
        this.createPPT();

        // 3.在线直播
        this.liveVideo();

        // 4.提交课件、课堂笔记
        this.postNote();

        // 5.提交源代码
        this.postSource();

        // 6.布置作业，有些课没有作业，有些课是有作业的
        // 如果有作业的话，检查作业，如果没有作业，完成了
        if (needHomeWork()) {
            checkHomeWork();
        }
    }

    abstract void checkHomeWork();

    // 钩子方法：实现流程的微调
    protected boolean needHomeWork() {
        return false;
    }

    final void postSource() {
        System.out.println("提交源代码");
    }

    final void postNote() {
        System.out.println("提交课件和笔记");
    }

    final void liveVideo() {
        System.out.println("直播授课");
    }

    final void createPPT() {
        System.out.println("创建备考PPT");
    }

    final void postPreResource() {
        System.out.println("分发预习资料");
    }
}
