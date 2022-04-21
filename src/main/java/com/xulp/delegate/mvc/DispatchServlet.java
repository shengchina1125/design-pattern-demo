package com.xulp.delegate.mvc;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author xulp
 * @version v1.0.0
 * @Date 2022/4/21 9:46
 * @Description ---
 * DispatchServlet
 * Modification History:
 * Date Author Version Description
 * ---------------------------------------------------------------------------------*
 * 2022/4/21 9:46 xulp v1.0.0 Created
 */
public class DispatchServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws IOException {

        // 完成调度
        doDispatch(req, resp);

    }

    private void doDispatch(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String uri = req.getRequestURI();
        String mid = req.getParameter("mid");

        if ("getMemberById".equals(uri)) {
            new MemberController().getMemberById(mid);
        } else if ("getOrderById".equals(uri)) {
            new OrderController().getOrderById(mid);
        } else if ("logout".equals(uri)) {
            new SystemController().logout();
        } else {
            resp.getWriter().write("404 Not Found!!!");
        }
    }


}
