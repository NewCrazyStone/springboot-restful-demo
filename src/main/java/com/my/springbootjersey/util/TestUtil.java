package com.my.springbootjersey.util;

import java.time.Instant;

/**
 * TODO TestUtil
 *
 * @author ChenWei
 * @date 2018/7/16 16:54
 */

public class TestUtil {

    public static void main(String[] args) {

        Long l = Instant.now().getEpochSecond();
        System.out.println("5----" + l);

    }
}
