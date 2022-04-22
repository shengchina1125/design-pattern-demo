package com.xulp.pattern.template.course;

/**
 * @author xulp
 * @version v1.0.0
 * @Date 2022/4/22 11:29
 * @Description ---
 * NetWorkCourseTest
 * Modification History:
 * Date Author Version Description
 * ---------------------------------------------------------------------------------*
 * 2022/4/22 11:29 xulp v1.0.0 Created
 */
public class NetWorkCourseTest {

    public static void main(String[] args) {
        System.out.println("---Java架构师课程---");
        NetworkCourse JavaCourse = new JavaCoures();
        JavaCourse.createCourse();


        System.out.println("---大数据课程---");
        NetworkCourse bigDataCourse = new BigDataCourse(true);
        bigDataCourse.createCourse();
    }
}
