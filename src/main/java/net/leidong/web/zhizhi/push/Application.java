package net.leidong.web.zhizhi.push;

import net.leidong.web.zhizhi.push.provider.GsonProvider;
import net.leidong.web.zhizhi.push.service.AccountService;
import org.codehaus.jackson.jaxrs.JacksonJsonProvider;
import org.glassfish.jersey.server.ResourceConfig;

import java.util.logging.Logger;

/**
 * @program: ZhiZhiServer
 * @description: AppLocation
 * @author: Lei Dong
 * @create: 2018-08-05 10:47
 **/
public class Application extends ResourceConfig {
    public Application() {
        // 注册逻辑处理的包名
        packages(AccountService.class.getPackage().getName());

        // 注册Json解析器
//        register(JacksonJsonProvider.class.getPackage().getName());

        // 替换解析器为Gson
        register(GsonProvider.class);

        // 注册日志打印输出
        register(Logger.class.getPackage().getName());
    }

}
