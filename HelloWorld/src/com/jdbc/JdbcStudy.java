package com.jdbc;

import com.map.Student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcStudy {
    public static void main(String[] args) {
        //事务
//        Connection conn = openConnection();
//        try{
//            //关闭自动提交
//            conn.setAutoCommit(false);
//            //指定多条sql语句
//            insert();update();delete();
//            //提交事务
//            conn.commit();
//        }catch(SQLException e){
//            //回滚事务
//            conn.rollback();
//        }finally{
//            conn.setAutoCommit(true);
//            conn.close();
//        }

        //jdbc 批量 batch
        //场景
//        INSERT INTO coupons (user_id, type, expires) VALUES (123, 'DISCOUNT', '2030-12-31');
//        INSERT INTO coupons (user_id, type, expires) VALUES (234, 'DISCOUNT', '2030-12-31');
//        INSERT INTO coupons (user_id, type, expires) VALUES (345, 'DISCOUNT', '2030-12-31');
//        INSERT INTO coupons (user_id, type, expires) VALUES (456, 'DISCOUNT', '2030-12-31');
//        //循环执行
//        for (var params:paramList){
//            PreparedStatement ps = conn.preparedStatement("INSERT INTO coupons (user_id, type, expires) VALUES (?,?,?)");
//            ps.setLong(params.get(0));
//            ps.setString(params.get(1));
//            ps.setString(params.get(2));
//            ps.executeUpdate();
//        }
//        //batch
//        try(PreparedStatement ps = conn.preparedStatement("INSERT INTO coupons (user_id, type, expires) VALUES (?,?,?)")){
//            for(Student s:students){
//                ps.setString(1,s.name);
//                ps.setBoolean(2,s.gender);
//                ps.setInt(3,s.grade);
//                ps.setInt(4,s.score);
//                ps.addBatch();//添加到batch
//                //batch需要对同一个preparedstatement反复设置参数并调用addbatch（）,相当于给一个sql加上多组参数，相当于多行sql
//                //bathc调用executeBatch()，设置了多组参数，返回多个int
//            }
//            int[]ns = ps.executeBatch();
//            for(int n:ns){
//                System.out.println(n + " inserted. ");//batch中每个sql的执行结果数量
//            }
//        }

    }
}
