package qy.generator.demo.entity;

import com.qy.code.generator.annotation.Column;
import com.qy.code.generator.annotation.Comment;
import com.qy.code.generator.annotation.Table;

/**
 * 描述：@Comment注解使用演示
 * 数据库表会字段会有comment描述
 * @author 七脉
 */
@Comment("@Comment注解使用演示")
@Table("comment_demo")
public class CommentDemoEntity {
	
	@Comment("主键ID")
	@Column(id=true)
    private Long id;
    
	@Comment("姓名")
	@Column
    private String name;
    
	@Comment("主键年龄")
	@Column
    private Integer age;
    
	@Column(comment="是否已婚")//也可以这样子写
    private boolean married;
}
