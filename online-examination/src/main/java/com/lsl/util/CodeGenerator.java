package com.lsl.util;



import com.baomidou.mybatisplus.core.toolkit.StringPool;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.InjectionConfig;
import com.baomidou.mybatisplus.generator.config.*;
import com.baomidou.mybatisplus.generator.config.po.TableInfo;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;


import java.util.ArrayList;
import java.util.List;


/**
 * @author lsl
 * @date 2021/1/23  ` 15:56
 */

public class CodeGenerator {

    public static void main(String[] args) {
        // 代码生成器
        AutoGenerator mpg = new AutoGenerator();

        // 全局配置
        GlobalConfig gc = new GlobalConfig();
        //String projectPath = System.getProperty("user.dir");

        gc.setOutputDir("F://Graduation_project/online-examination/src/main/java");
        gc.setAuthor("lsl");

        gc.setOpen(false);  //是否打开文件夹
        gc.setSwagger2(true); //实体属性 Swagger2 注解
        gc.setServiceName("%sService"); //去service前缀
        //gc.setIdType(IdType.AUTO);
        mpg.setGlobalConfig(gc);


        // 数据源配置
        DataSourceConfig dsc = new DataSourceConfig();
        dsc.setUrl("jdbc:mysql://120.25.151.236/online-examination?useUnicode=true&useSSL=false&characterEncoding=utf8");
        // dsc.setSchemaName("public");
        dsc.setDriverName("com.mysql.cj.jdbc.Driver");
        dsc.setUsername("root");
        dsc.setPassword("123456");
        //dsc.setDbType(DbType.MYSQL); //设置驱动
        mpg.setDataSource(dsc);


        // 包配置
        PackageConfig pc = new PackageConfig();
        //pc.setModuleName("");
        pc.setParent("com.lsl");
        pc.setEntity("entity");
        pc.setMapper("mapper");
        pc.setService("service");
        pc.setController("controller");

        mpg.setPackageInfo(pc);


        // 策略配置
        StrategyConfig strategy = new StrategyConfig();
        strategy.setNaming(NamingStrategy.underline_to_camel);
        strategy.setColumnNaming(NamingStrategy.underline_to_camel);
        strategy.setEntityLombokModel(true);
        strategy.setRestControllerStyle(true);

        strategy.setSuperEntityColumns("id");
        strategy.setInclude("oe_classz_student","oe_paper","oe_score","oe_subject","oe_student_subject","oe_menu");    //写表名称
        strategy.setTablePrefix("oe_","_"); //去表前缀
        strategy.setRestControllerStyle(true); //开启驼峰命名
        strategy.setControllerMappingHyphenStyle(true);


        mpg.setStrategy(strategy);
        //mpg.setTemplateEngine(new FreemarkerTemplateEngine());
        mpg.execute();
    }

}
