package com.wahid.learnspringaop.aopexample.data;

import org.springframework.stereotype.Repository;

@Repository
public class DataService1 {

    public int[]  retrieveData()
    {
        return new int[]{10,11,220,33,44,55};
    }
}
