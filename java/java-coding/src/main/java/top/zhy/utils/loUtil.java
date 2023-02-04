package top.zhy.utils;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Arrays;


/**
 * @Author zhu
 * @Date 2023/2/2
 * @Description IO工具类
 **/
public class loUtil {
    /**
     * 将整形数组写入file
     *
     * @param file 文件
     * @param nums 整数数组
     */

    public static void fileWrite(File file, int[] nums) throws IOException {
        Writer writer = new FileWriter(file, true);
        writer.write(Arrays.toString(nums));
        writer.close();
    }
}