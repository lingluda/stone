package cn.interheart.stone.dao.configs;

import cn.interheart.stone.common.interceptor.InterheartProperties;
import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@InterheartProperties(fileName = "datasourse",nodePath = "business")
@Data
public class BusinessDataSourse {
    private String url;
    private String username;
    private String password;
    private  String driverClassName;
}
