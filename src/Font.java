import java.io.*;

/**
 * 判断文件编码
 * @author machao
 * @date 2019/8/1
 * @time 18:10
 * @description
 **/
public class Font {

    public static void main(String[] args) throws Exception {
        File file = new File("D:\\test.txt");
        String charset = getFileCharset(file);
        BufferedReader bf = new BufferedReader(new FileReader(file));
        while(bf.read() != -1){
            String str = bf.readLine();
            System.out.println(new String(bf.readLine().getBytes(charset),"utf-8"));
        }
        System.out.println(charset);
    }

    /**
     *  判断编码格式方法
     * @param sourceFile
     * @return
     */
    public static  String getFileCharset(File sourceFile) throws Exception{
        InputStream inputStream = new FileInputStream(sourceFile);
        byte[] head = new byte[3];
        inputStream.read(head);
        //或GBK
        String code = "gb2312";
        if (head[0] == -1 && head[1] == -2 )
            code = "UTF-16";
        else if (head[0] == -2 && head[1] == -1 )
            code = "Unicode";
        else if(head[0]==-17 && head[1]==-69 && head[2] ==-65)
            code = "UTF-8";

        inputStream.close();

        System.out.println(code);
        return code;

    }


}
