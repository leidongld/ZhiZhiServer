package net.leidong.web.zhizhi.push.service;

import net.leidong.web.zhizhi.push.bean.api.account.RegisterModel;
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
    @POST
    @Path("/register")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public RegisterModel register(RegisterModel model) {
        return model;
//        User user = new User();
//        user.setName(model.getName());
//        user.setSex(2);
//        return user;
    }
}
