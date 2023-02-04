package top.zhy.io;

import top.zhy.utils.FileUtil;
import top.zhy.utils.FormatUtil;
import top.zhy.utils.RandomUtil;
import top.zhy.utils.loUtil;

import java.io.File;
import java.io.IOException;

import static top.zhy.common.Const.MAX;
import static top.zhy.common.Const.TARGET_PATH;

/**
 * @Author zhu
 * @Date 2023/2/2
 * @Description 字符输出流练习
 **/
public class WriterDemo {
    public static void main(String[] args) {
        int[] nums = new int[MAX];
//        1.生成随机数
        for (int i = 0; i < MAX; i++) {
            nums[i] = RandomUtil.genRandomNumber(100);
        }
//        2.控制台格式化输出
        FormatUtil.printArray(nums, 10);
//        3.创建文件，将数组通过字符输出流写入文件
        try {
            File file = FileUtil.createFile(TARGET_PATH + "/result.txt");
            loUtil.fileWrite(file, nums);
        } catch (IOException e) {
            System.out.println("出现IO异常");
        }
    }
}
