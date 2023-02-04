package top.zhy.utils;

import java.util.Random;

/**
 * @Author zhu
 * @Date 2023/2/2
 * @Description 随即工具类
 **/
public class RandomUtil {
    /**
     * 产生（0,bound）之间的随机数
     *
     * @param bound 范围
     * @return 随机数
     **/

    public static int genRandomNumber(int bound) {
        Random random = new Random();
        return random.nextInt(bound);
    }
}

