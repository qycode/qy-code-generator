package qy.generator.demo.entity;

import com.qy.code.generator.annotation.Column;
import com.qy.code.generator.annotation.Table;

/**
 * 描述：这是一个最简单demo
 * @author 七脉
 */
@Table
public class SimpleDemoEntity {
	
	@Column(id=true, comment="主键")
    private Long id;
    
	@Column(comment="名字")
    private String name;
    
	@Column(comment="年龄")
    private Integer age;
    
	@Column(comment="是否已婚")
    private boolean married;
	
}
