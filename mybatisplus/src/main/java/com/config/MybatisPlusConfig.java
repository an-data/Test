package com.config;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

/**
 * @Date 2022/3/12 16:07
 * @Created by yangmx
 */
@Component
class MyMetaObjectHandler implements MetaObjectHandler {


    @Override
    public void insertFill(MetaObject metaObject) {
        metaObject.setValue("nickName", "王某某");
    }

    @Override
    public void updateFill(MetaObject metaObject) {

    }
}
