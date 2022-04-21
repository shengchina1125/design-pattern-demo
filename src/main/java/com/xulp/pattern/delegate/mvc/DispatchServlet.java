package com.xulp.pattern.delegate.mvc;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

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

    private List<Handler> handlerMapping = new ArrayList<>();

    @Override
    public void init() throws ServletException {
        Class<?> memberControllerClass = MemberController.class;
        try {
            handlerMapping.add(new Handler().setController(memberControllerClass.newInstance())
                    .setMethod(memberControllerClass.getMethod("getMemberById", String.class))
                    .setUri("/web/getMemberById.do"));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws IOException {

        // 完成调度
        doDispatch(req, resp);

    }


    private void doDispatch(HttpServletRequest req, HttpServletResponse resp) {
        String uri = req.getRequestURI();
        Handler handler = null;
        for (Handler h : handlerMapping) {
            if (uri.equals(h.getUri())) {
                handler = h;
                break;
            }
        }

        try {
            assert handler != null;
            Object obj = handler.getMethod().invoke(handler.controller, req.getParameter("uid"));
            try {
                resp.getWriter().write(obj.toString());
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    // private void doDispatch(HttpServletRequest req, HttpServletResponse resp) throws IOException {
    //     String uri = req.getRequestURI();
    //     String mid = req.getParameter("mid");
    //
    //     if ("getMemberById".equals(uri)) {
    //         new MemberController().getMemberById(mid);
    //     } else if ("getOrderById".equals(uri)) {
    //         new OrderController().getOrderById(mid);
    //     } else if ("logout".equals(uri)) {
    //         new SystemController().logout();
    //     } else {
    //         resp.getWriter().write("404 Not Found!!!");
    //     }
    // }

    static class Handler {
        private Object controller;
        private Method method;
        private String uri;

        public Object getController() {
            return controller;
        }

        public Handler setController(Object controller) {
            this.controller = controller;
            return this;
        }

        public Method getMethod() {
            return method;
        }

        public Handler setMethod(Method method) {
            this.method = method;
            return this;
        }

        public String getUri() {
            return uri;
        }

        public Handler setUri(String uri) {
            this.uri = uri;
            return this;
        }
    }
}
