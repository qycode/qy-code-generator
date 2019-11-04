package qy.generator.demo.entity;

import com.qy.code.generator.annotation.Column;
import com.qy.code.generator.annotation.Comment;
import com.qy.code.generator.annotation.Table;
import com.qy.code.generator.enums.ColumnType;


@Comment("")
@Table(value="column_demo",isCompositeId=false)
public class ColumnDemoEntity {

	@Comment("主键")
	@Column(id=true, value="id", type=ColumnType.BIGINT, length=19, nullable=false)
	private Long id;
	@Comment("姓名")
	@Column(value="name", type=ColumnType.VARCHAR, length=4, nullable=true)
	private String name;
	@Comment("性别，0：女，1：男，其他：人妖")
	@Column(value="gender", type=ColumnType.CHAR, length=1, nullable=true)
	private String gender;
	@Comment("爱好")
	@Column(value="interest", type=ColumnType.VARCHAR, length=20, nullable=true)
	private String interest;
	@Comment("是否已婚")
	@Column(value="married", type=ColumnType.BIT, length=1, nullable=true)
	private Boolean married;


	public Long getId (){
		 return id;
	}

	public void setId (Long id){
		 this.id = id;
	}

	public String getName (){
		 return name;
	}

	public void setName (String name){
		 this.name = name;
	}

	public String getGender (){
		 return gender;
	}

	public void setGender (String gender){
		 this.gender = gender;
	}

	public String getInterest (){
		 return interest;
	}

	public void setInterest (String interest){
		 this.interest = interest;
	}

	public Boolean getMarried (){
		 return married;
	}

	public void setMarried (Boolean married){
		 this.married = married;
	}
}