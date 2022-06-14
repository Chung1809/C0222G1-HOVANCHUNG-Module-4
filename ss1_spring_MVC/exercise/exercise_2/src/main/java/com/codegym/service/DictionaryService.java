package com.codegym.service;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
@Service
public class DictionaryService implements IDictionaryService {
    private static Map<String,String> map = new HashMap<>();
    static {
        map.put("hello","xin chào");
        map.put("who I am","tôi là ai");
        map.put("sorry","xin lỗi");
        map.put("tear","nước mắt");
        map.put("bye","tạm biệt");
        map.put("see you again","hẹn gặp lại");
    }
    @Override
    public String translate(String word) {
        if(map.get(word) !=null){
           return  map.get(word);
        }else {
            return "Not Found!";
        }
    }
}
