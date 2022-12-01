package net.wenzuo.codes.tools.batchremovecopyright;

import cn.hutool.core.io.FileUtil;

import java.io.File;
import java.nio.charset.StandardCharsets;
import java.util.List;

/**
 * @author Catch
 * @since 2022-12-01
 */
public class BatchRemoveCopyrightMain {

    public static void main(String[] args) {
        String path = "/Users/zhanghao/Projects/IdeaProjects/codes/design-pattern/src";
        batchRemove(path);
    }

    private static void batchRemove(String path) {
        List<File> files = FileUtil.loopFiles(path);
        for (File file : files) {
            List<String> lines = FileUtil.readLines(file, StandardCharsets.UTF_8);
            for (int i = 0; i < lines.size(); i++) {
                if (lines.get(i).startsWith("package ")) {
                    List<String> codeLines = lines.subList(i, lines.size());
                    String content = String.join("\n", codeLines);
                    FileUtil.writeUtf8String(content, file);
                    break;
                }
            }
        }
    }

}
