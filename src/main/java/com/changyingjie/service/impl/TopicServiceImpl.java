package com.changyingjie.service.impl;

import com.changyingjie.dao.TopicMapper;
import com.changyingjie.domain.Topic;
import com.changyingjie.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TopicServiceImpl implements TopicService {

    @Autowired
    public TopicMapper topicDao;

    //获取全部主题
    public List<Topic> getAllTopics() {
        return topicDao.getAllTopics();
    }

    //获取指定id主题
    public Topic selectById(Integer id) {
        Topic topic=topicDao.selectById(id);
        return topic;
    }

    public List<Topic> listMostCommentsTopics() {
        return topicDao.listMostCommentsTopics();
    }

    public boolean addTopic(Topic topic) {
        return topicDao.insert(topic)>0;
    }

    public boolean clickAddOne(Integer id) {
        return topicDao.clickAddOne(id)>0;
    }

    public int getTopicsNum() {
        return topicDao.getTopicsNum();
    }

    public int getTabTopicsNum(Integer tabId) {return topicDao.getTabTopicsNum(tabId);}

    public int getTabTopicsNum() {return topicDao.getTabTopicsNum();}

    public List<Topic> listTopicsAndUsers() {
        return topicDao.listTopicsAndUsers();
    }

    public List<Topic> listTopicsAndUsersOfTab(Integer tabId) {
        return topicDao.listTopicsAndUsersOfTab(tabId);
    }

    public List<Topic> listTopicsAndUsersOfCream() {return topicDao.listTopicsAndUsersOfCream();}

    public void judgeCream(Integer topicId,Integer value){topicDao.judgeCream(topicId,value);}
}
