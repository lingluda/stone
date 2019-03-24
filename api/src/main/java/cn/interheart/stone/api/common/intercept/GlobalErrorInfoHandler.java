package cn.interheart.stone.api.common.intercept;

import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class GlobalErrorInfoHandler {
    private static final org.slf4j.Logger logger = LoggerFactory.getLogger("error");

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Map errorHandlerOverJson(HttpServletRequest request,
                                    Exception e) {
        e.printStackTrace();
        Map res=new HashMap<String,Object>();
        res.put("code","500");
        res.put("msg","系统错误");
        res.put("data",e.getMessage());

        logger.error(e.getMessage() + "\n");
        String sOut = "";
        StackTraceElement[] trace = e.getStackTrace();
        for (StackTraceElement s : trace) {
            sOut += "\tat " + s + "\r\n";
        }
        logger.error(sOut);
        return res;
    }
}
