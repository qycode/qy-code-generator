package qy.generator.demo.entity;

import com.qy.code.generator.annotation.Column;
import com.qy.code.generator.annotation.LogicDelete;
import com.qy.code.generator.annotation.Table;

/**
 * 描述：@LogicDelete逻辑删除使用演示
 * @author 七脉
 */
@Table("logic_delete_demo")
public class LogicDeleteDemoEntity {
	
	@Column(id=true,comment="主键")
    private Long id;
	
	@Column(value="name",comment="姓名")
    private String name;
    
	@LogicDelete
	@Column(comment="逻辑删除字段")
	private boolean deleteFlag;
	
	//或者如下操作
	/*@Column(comment="逻辑删除字段", logicDelete=true)
	private boolean deleteFlag;*/
	
}
