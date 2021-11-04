package com.kuilian.books.controller;


import org.springframework.web.bind.annotation.*;


import javax.servlet.ServletInputStream;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;


@RestController
public class TestController {
//    @Autowired
//    private User user;
//    @PostMapping(value = "/login")
//    public List<User> loginone(@RequestParam("name")String name, @RequestParam("passwprd")String password) throws Exception {
//        user.setUsername(name);
//        user.setPassword(password);
//        if("jjj".equals(user.getUsername())){
//            throw new MyException("用户名不能等于jjj");
//        }
//        if("123".equals(user.getPassword())){
//            throw new MyException("密码不能等于123");
//        }
//
//        List<User> l=new ArrayList<>();
//        l.add(user);
//        return l;
//    }
    @RequestMapping("/h")
    public void  testkk(HttpServletRequest req) {


//        ServletInputStream inputStream = null;
//        StringBuilder stringBuilder = null;
//        try {
//            inputStream = req.getInputStream();
//            stringBuilder = new StringBuilder();
//            byte[] a=new byte[1024];
//            int  len;
//            while((len = inputStream.read(a))>0) {
//
//                stringBuilder.append(new String(a, 0, len));
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }finally {
//            if(inputStream!=null) {
//                try {
//                    inputStream.close();
//                } catch (IOException e) {
//
//                    e.printStackTrace();
//                }
//            }
//        }
//
//
//        String s = stringBuilder.toString();
//        System.out.println(s);
//    }

        int contentLength = req.getContentLength();
        ServletInputStream inputStream=null;
        StringBuilder stringBuilder=null;
        try {
            inputStream = req.getInputStream();
             stringBuilder= new StringBuilder();
            byte[] bytes = new byte[contentLength];
            inputStream.read(bytes);
            stringBuilder.append(new String(bytes));
        } catch (IOException e) {
            e.printStackTrace();
        }
        String s = stringBuilder.toString();
        System.out.println(s);
        String protocol = req.getProtocol();//获取HTTP协议
        String header = req.getHeader("Accept-Language");
        System.out.println(header);
        String queryString = req.getQueryString();
        System.out.println(queryString);
    }

    @RequestMapping("/test")
    public void uuu(@RequestBody() String s){
        System.out.println(s);
    }

}
