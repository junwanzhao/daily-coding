package top.zhy.utils;

import java.io.File;
import java.io.IOException;

/**
 * @Author zhu
 * @Date 2023/2/2
 * @Description 文件工具类
 **/
public class FileUtil {
    public static File createFile(String path) throws IOException {
        return new File(path);
    }

    public static int getFile(File file) throws IOException {
        return (int) file.length();
    }
}
