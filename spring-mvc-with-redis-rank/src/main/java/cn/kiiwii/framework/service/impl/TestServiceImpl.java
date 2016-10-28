package cn.kiiwii.framework.service.impl;

import cn.kiiwii.framework.dao.IRedisDAO;
import cn.kiiwii.framework.model.User;
import cn.kiiwii.framework.service.ITestService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by zhong on 2016/9/19.
 */
@Service("userService")
public class TestServiceImpl implements ITestService {

    Logger  logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private IRedisDAO redisDAO;
    @Override
    public void set() {

    }

    @Override
    public void setObject() {
    }

    @Override
    public void setList() {

    }

    @Override
    public void setHash() {

    }
}
