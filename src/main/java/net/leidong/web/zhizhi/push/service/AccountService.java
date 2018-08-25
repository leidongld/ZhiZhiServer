package net.leidong.web.zhizhi.push.service;

import net.leidong.web.zhizhi.push.bean.db.User;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/**
 * @program: ZhiZhiServer
 * @description: AccountService
 * @author: Lei Dong
 * @create: 2018-08-05 10:55
 **/
@Path("/account")
public class AccountService {
    @GET
    @Path("/login")
    public String get() {
        return "You get the login.";
    }

    @POST
    @Path("/login")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public User post() {
        User user = new User();
        user.setId("123456");
        user.setName("雷棟");
        user.setSex(0);
        return user;
    }
}
