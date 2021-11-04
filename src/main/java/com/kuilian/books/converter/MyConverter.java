package com.kuilian.books.converter;
import com.kuilian.books.pojo.User;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class MyConverter implements Converter<String,User> {

    @Override
    public User convert(String source) {
        User user=new User();
        if(source!=null){
            String[] split = source.split(",");
            user.setUsername(split[0]);
            user.setPassword(split[1]);
            return user;
        }
        return null;
    }
}
