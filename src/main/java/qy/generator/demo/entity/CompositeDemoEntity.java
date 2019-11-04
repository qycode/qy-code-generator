package qy.generator.demo.entity;

import com.qy.code.generator.annotation.Column;
import com.qy.code.generator.annotation.Comment;
import com.qy.code.generator.annotation.Table;

/**
 * 描述：复合主键使用演示
 * @author 七脉
 */
@Comment("复合主键使用演示")
@Table(value="composite_demo",isCompositeId = true)
public class CompositeDemoEntity {
	
	@Comment("用户主键")
	@Column(id = true)
	private Integer userId;
	
	@Comment("角色主键")
	@Column(id = true)
	private Integer roleId;
	
	
}
