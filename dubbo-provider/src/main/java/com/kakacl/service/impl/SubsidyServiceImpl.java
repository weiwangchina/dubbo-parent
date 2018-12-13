package com.kakacl.service.impl;

import com.kakacl.service.SubsidyService;

/**
 * @author wangwei<br/>
 * @Description: <br/>
 * @date 2018/12/13 13:58<br/>
 * ${TAGS}
 */
public class SubsidyServiceImpl implements SubsidyService {

    /**
     * 计算结束的时间
     * @param extCount 每次计算的条数
     */
    @Override
    public void endDateCalculate(Integer extCount) {
        System.out.println("计算时间开始 。。。");
        try {
            Thread.sleep(1000);
        } catch (Exception e) {

        }
        System.out.println("计算时间结束 。。。");
    }
}
