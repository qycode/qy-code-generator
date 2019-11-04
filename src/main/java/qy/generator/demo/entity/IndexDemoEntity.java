package qy.generator.demo.entity;

import com.qy.code.generator.annotation.Column;
import com.qy.code.generator.annotation.Comment;
import com.qy.code.generator.annotation.Index;
import com.qy.code.generator.annotation.Table;
import com.qy.code.generator.enums.IndexType;

/**
 * 描述：@Index索引使用演示
 * @author 七脉
 */
@Comment("@Index索引使用演示")
@Table(value="index_demo")
public class IndexDemoEntity {
	
	@Column(id=true,comment="主键")
    private Long id;
    
	@Index(type=IndexType.UNIQUE)
	@Column(comment="唯一索引")
    private String uniqueIndex;
    
	@Column(comment="普通索引")
	@Index(type=IndexType.COMMON)
    private String commonIndex;
    
	@Column(comment="组合索引")//组合索引起相同索引名字
	@Index(type=IndexType.COMMON, name="t_index_1_2")
    private String commonIndex1;
	
	@Column(comment="组合索引")//组合索引起相同索引名字
	@Index(type=IndexType.COMMON, name="t_index_1_2" )
    private String commonIndex2;
	
}
