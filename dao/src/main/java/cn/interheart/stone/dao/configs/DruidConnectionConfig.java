package cn.interheart.stone.dao.configs;

import cn.interheart.stone.common.interceptor.InterheartProperties;
import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@InterheartProperties(fileName = "datasourse",nodePath = "druid")
@Data
public class DruidConnectionConfig {
    private Integer initialSize;//初始化配置
    private Integer minIdle;//最小连接数
    private Integer maxActive;//最大连接数
    private Integer maxWait;//获取连接超时时间（单位：ms）
    private Integer timeBetweenEvictionRunsMillis;//连接有效性检测时间(单位:ms)
    private boolean testOnBorrow;//获取连接检测
    private boolean testOnReturn;//归还连接检测
    private Integer minEvictableIdleTimeMillis;//最大空闲时间(单位ms)----连接保持空闲而不被驱逐的最长时间
    private boolean testWhileIdle;//在获取连接后，确定是否要进行连接空间时间的检查
}
