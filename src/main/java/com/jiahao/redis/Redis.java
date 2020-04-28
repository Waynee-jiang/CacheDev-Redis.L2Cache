package com.jiahao.redis;

import redis.clients.jedis.Jedis;

public class Redis {

    public static void main(String[] args) {
        Jedis jedis = new Jedis("158.168.8.5",7100);
        System.out.println(jedis.ping());
    }
}
