qy-code-generator-1.0.jar是一款很强大代码生成工具

*两种生成方式
*1.根据database table 生成 java代码
*2.根据java实体 生成 java代码 和 database table结构

一、生成java文件
	1.Mapper
	
		支持单个和批量增删改查
		支持使用Query对象复杂查询
	
	2.Service
	
		接口类以及实现类
		
	3.entity
		
		实体类根据table生成并生成注释
	
二、数据库
	1.支持自动建表
		
		详见 Test.java
		
	2.支持自动删表
		
		详见 Test.java
		
	3.支持索引
		
		唯一索引、普通索引、组合索引（name相同）
		只需在实体类属性上加@Index注解
		
	4.支持逻辑逻辑与物理删除
		
		在实体类属性上加@LogicDelete注解
		或@Column(logicDelete=true)注解	
	
	5.支持联合主键
		
		支持联合主键，一般只有中间表用到
		只要在实体类属性上加@Column(compositeId=true)注解
		
	6.支持主键递增
		
		只要在实体类属性上加@Column(autoIncrement=true)注解
		
三、使用操作
	
	调用QyUtils类，参考其内部方法
	QyUtis.create...
	
	工具对实体类注解做了完善的校验与提醒，书写不正确时会有详细的提示信息。
	
四、配置
	在application.properties或qy.properties里添加如下配置信息
	###############################################################
	###将此处改为自己的mysql配置信息
	###############################################################
	spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
	spring.datasource.url=jdbc:mysql://127.0.0.1:3306/dbname
	spring.datasource.username=root
	spring.datasource.password=123456

	#qy代码生成工具秘钥
	qy.generator.key=001157285100317700211454
	