package apidemo.stringdemo.exam;

import java.util.Random;

// 打乱字符串
public class Disarrange {
    public static void main(String[] args) {
        // 键盘输入任意字符串
        String str = "asknviuav5413";
        // 转换成字符数组
        char[] strArr = str.toCharArray();
        // 打乱
        Random r = new Random();
        for (int i = 0; i < strArr.length; i++) {
            int index = r.nextInt(strArr.length);
            char temp = strArr[i];
            strArr[i] = strArr[index];
            strArr[index] = temp;
        }
        // 打乱后的字符串
        String newStr = new String(strArr);

        System.out.println(newStr);

        System.out.println(checkStr("y56ho"));
    }

    // 判断字符串是否合法(长度为5，只能由大小写字母和数字组成，数字只能由一位)
    public static boolean checkStr(String str) {
        // 长度不为5，返回false
        if (str.length() != 5) return false;

        char[] strArr = str.toCharArray();
        // 记录数字个数
        int count = 0;
        for (int i = 0; i < strArr.length; i++) {
            char c = strArr[i];
            // 不是由大小写字母和数字组成，返回false
            if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z') && (c < '0' || c > '9')) {
                return false;
            } else if (c > '0' && c < '9') {
                count++;
            }
        }
        // 数字不是一位，返回false
        if (count != 1) return false;

        return true;
    }

}
