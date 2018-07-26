package com.my.springbootjersey.rest;

import com.my.springbootjersey.model.User;
import com.my.springbootjersey.service.UserService;
import com.my.springbootjersey.util.IRedisService;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/**
 * TODO UserResource
 *
 * @author ChenWei
 * @date 2018/7/13 14:16
 */
@Component
@Path("/user")
public class UserResource {

    @Resource
    private UserService userService;
    @Resource
    private IRedisService redisService;


    /**
     * 根据id 查询 用户
     * @param id
     * @return
     */
    @Path("/id")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public User queryUserById(@QueryParam("id") int id){
        return userService.queryUserById(id);
    }


    /**
     * 存 redis
     * @param key
     * @param user  key对应的value
     */
    @Path("/redis")
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public void testRedis(
            @FormParam("key") String key,
            @BeanParam User user){
        redisService.setRedisKey("TEST-REDIS");
        redisService.put(key, user, -1L);
    }


    /**
     * 根据 key 从 redis 中获取 数据
     * @param key
     * @return
     */
    @Path("/redis")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public User testRedis(
            @QueryParam("key") String key){
        redisService.setRedisKey("TEST-REDIS");
        return (User) redisService.get(key);
    }


    /**
     * 返回长度为11位的错误代码 （每次都是唯一的,可用250年不重复，最小生成时间间隔为 1/10 秒 ）
     * @return  错误代码 例如：15317093636
     */
    @Path("/error")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getErrorCode(){

        Long l = System.currentTimeMillis();
        String str = l.toString();
        if(str.length() > 11){
            str = str.substring(0, 11);
        }
        return str;
    }


}
