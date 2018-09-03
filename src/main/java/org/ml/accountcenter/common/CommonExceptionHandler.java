package org.ml.accountcenter.common;


import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * 接口统一异常处理
 * @author RLY
 */
@ControllerAdvice
public class CommonExceptionHandler {

    /**
     * 拦截Exception类的异常
     *  {@link ResponseBody} //返回json数据类型
     * @param e
     * @return
     */
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public Map<String, Object> exceptionHandler(Exception e) {
        Map<String, Object> result = new HashMap<String, Object>();
        result.put("respCode", "444");
        result.put("respMsg", e.getMessage());
        result.put("respS","操作异常！！");
        return result;
    }


}