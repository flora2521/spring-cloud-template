package org.yi.user;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Mao xiaolin
 * @version 1.0
 * @date 2021/6/15 15:00
 */
@MapperScan(basePackages = {"org.yi.user.mapper"})
@SpringBootApplication
public class UserApplication {

//    public static void send(Integer group, String mes) throws InterruptedException {
//        synchronized (("sub"+ group.toString()).intern()) {
//            System.out.println("加锁");
//            Thread.sleep(2000);
//            System.out.println("锁完");
//        }
//
//    }

    public static void main(String[] args)  {
        SpringApplication.run(UserApplication.class, args);
//        UserEntity userEntity = new UserEntity();
//        userEntity.setTime(LocalDateTime.now());
//        ObjectMapper objectMapper = new ObjectMapper();
//        objectMapper.findAndRegisterModules();
//        String json = objectMapper.writeValueAsString(userEntity);
//        System.out.printf(json);
//
//        JSONObject json1 = JSONUtil.parseObj(userEntity, false);
//        Console.log(json1.toStringPretty());
//        Thread thread1 = new Thread(()->{
//            try {
//                send(1,"1");
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        });
//
//
//
//        Thread thread2 = new Thread(()->{
//            try {
//                send(1,"1");
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        });
//        thread1.start();
//        thread2.start();
    }
}
