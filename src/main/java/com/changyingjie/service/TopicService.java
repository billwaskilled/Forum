package com.changyingjie.service;

import com.changyingjie.domain.Topic;

import java.util.List;

public interface TopicService {


    /**
     * 获取全部主题
     */
    List<Topic> getAllTopics();

    /**
     * 获取全部主题及用户信息 用于渲染首页
     */
     List<Topic> listTopicsAndUsers();

    /**
     * 获取最多评论主题列表
     * @return
     */
    List<Topic> listMostCommentsTopics();

    /**
     * 获取全部主题及用户信息 用于渲染板块页面
     */
    List<Topic> listTopicsAndUsersOfTab(Integer tabId);

    /**
     * 获取全部精华主题及用户信息 用于渲染精华板块页面
     */
    List<Topic> listTopicsAndUsersOfCream();

    /**
     * 获取指定ID主题
     */
    Topic selectById(Integer id);

    /**
     * 新建主题
     */
    boolean addTopic(Topic topic);

    /**
     * 点击量加一
     */
    boolean clickAddOne(Integer id);

    /**
     * 获取主题总数
     */
    int getTopicsNum();

    /**
     * 获取该板块的话题总数
     */
    int getTabTopicsNum(Integer tabId);

    /**
     * 获取精华板块的话题总数
     */
    int getTabTopicsNum();

    /**
     * 判断是否为精华帖并进行操作
     */
    void judgeCream(Integer topicId,Integer value);


}
