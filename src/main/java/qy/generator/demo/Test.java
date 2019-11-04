package qy.generator.demo;

import com.qy.code.generator.util.QyUtils;

import qy.generator.demo.entity.ColumnDemoEntity;
import qy.generator.demo.entity.CommentDemoEntity;
import qy.generator.demo.entity.CompositeDemoEntity;
import qy.generator.demo.entity.IndexDemoEntity;
import qy.generator.demo.entity.LogicDeleteDemoEntity;
import qy.generator.demo.entity.SimpleDemoEntity;

/**
 * 描述：一切从这里演示开始
 * @author 七脉
 */
public class Test {
	
	public static void main(String[] args) {
		//表结构创建代码
		createByDbTable();
		
		//实体对象创建java代码和表结构
		QyUtils.createJavaFileAndTable(ColumnDemoEntity.class);
	}
	
	/**
	 * 通过表结构创建java代码
	 */
	public static void createByDbTable() {
		String tableName = "column_demo";
		String shortClassName = "ColumnDemo";
		String packageName = "qy.generator.demo";
		QyUtils.createJavaFile(tableName, shortClassName, packageName);
	}
	
	/**
	 * 通过实体对象创建java代码和表结构
	 */
	public static void createByEntityClass() {
		//执行结束后，刷新entity上级目录或项目，即可看到生成的代码，必要时 maven -> update project。
		//最简单的示例
		QyUtils.createJavaFileAndTable(SimpleDemoEntity.class);
		
		//字段描述使用示例
		QyUtils.createJavaFileAndTable(CommentDemoEntity.class);
		
		//列演示使用示例
		QyUtils.createJavaFileAndTable(ColumnDemoEntity.class);
		
		//逻辑删除示例
		QyUtils.createJavaFileAndTable(LogicDeleteDemoEntity.class);
		
		//符合主键示例
		QyUtils.createJavaFileAndTable(CompositeDemoEntity.class);
		
		//索引使用示例
		QyUtils.createJavaFileAndTable(IndexDemoEntity.class);
		//执行结束后，刷新entity上级目录或项目，即可看到生成的代码，必要时 maven -> update project。
	}
}
