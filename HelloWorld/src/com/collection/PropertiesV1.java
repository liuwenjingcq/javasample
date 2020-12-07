package com.collection;

//读取配置文件
/***
 * 配置文件 string-string，用map<string,string>
 * 配置文件很多，java提供给Properties表示一组配置；
 * Properties内部本质是hashtable
 * 用Properties读取配置文件非常简单。Java默认配置文件以.properties为扩展名，每行以key=value表示，以#课开头的是注释
 */

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * 配置文件的读取
 * 1、创建用Properties实例
 * 2、调用load()读取文件
 * 3、调用getProperty()获取配置；如果key不存在返回null；也可以提供一个默认值，key不存在，返回默认值
 */
//        String f="setting.properties";
//        Properties props=new Properties();
//        props.load(new java.io.FileInputStream(f));
//        String filepath=props.getProperty("last_open_file");
//        String interval=props.getProperty("auto_save");

/**
 * 或者也可以从classpath读取.properties文件。因为load（InputStream）方法接收一个Inputstream实例，表示一个字节流，不一定是一个文件流；也可以是从jar包花都区的资源流
 */
//        Properties props=new Properties();
//        props.load(getClass().getResourceAsStream("/common/setting.properties"));

//从内存读取一个字节流
public class PropertiesV1 {
    public static void main(String[] args) throws IOException {
        String settings = "# test" + "\n" + "course=Java" + "\n" + "last_open_date=2019-08-07T12:35:01";
        ByteArrayInputStream input = new ByteArrayInputStream(settings.getBytes("UTF-8"));
        Properties props = new Properties();
        props.load(input);
        System.out.println("course:" + props.getProperty("course"));
        System.out.println("last_open_date: " + props.getProperty("last_open_date"));
        System.out.println("last_open_file: " + props.getProperty("last_open_file"));
        System.out.println("auto_save: " + props.getProperty("auto_save", "60"));
    }
    //如果有多个.properties文件，可以反复调用load()读取，后读取的key-value会覆盖已读取的key-value；
//    Properties props = new Properties();
//    props.load(getClass().getResourceAsStream("/common/setting.properties"));
//    props.load(new FileInputStream("C:\\conf\\setting.properties"));
}

//写入配置文件；通过setProperty()修改了Properties实例；可以把配置写入文件，以便下次启动时获得最新配置。写入配置文件使用store()方法：
//Properties props = new Properties();
//props.setProperty("url","http://www.liaoxuefeng.com");
//props.setProperty("language","java");
//props.store(new FileOutputStream("C:\\conf\\setting.properties"), "这是写入的properties注释");


//由于load(InputStream)默认总是以ASCII编码读取字节流，所以会导致读到乱码。我们需要用另一个重载方法load(Reader)读取：
//InputStream和Reader的区别是一个是字节流，一个是字符流。字符流在内存中已经以char类型表示了，不涉及编码问题
//Properties props = new Properties();
//props.load(new FileReader("settings.properties", StandardCharsets.UTF_8));