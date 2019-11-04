package qy.generator.demo.mapper;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import com.qy.code.generator.query.Query;
import com.qy.code.generator.util.QySqlUtils;
import qy.generator.demo.entity.CommentDemoEntity;
@Mapper
public interface CommentDemoMapper {
	
	/**
	* @author 七脉
	* 描述 Query查询
	* @param query
	* @return
	*/	@Select("<script>"		+"SELECT  id AS id, name AS name, age AS age, married AS married FROM comment_demo "		+QySqlUtils.SQL_QUERY_PART		+"</script>")	List<CommentDemoEntity> selectByQuery(@Param("query") Query query);
	
	/**
	* @author 七脉
	* 描述：主键查询
	* @param id
	* @return
	*/	@Select("SELECT id AS id, name AS name, age AS age, married AS married FROM comment_demo WHERE id = #{id}")	CommentDemoEntity selectById(@Param("id") Long id);
	
	/**
	* @author 七脉
	* 描述：主键查询
	* @param ids
	* @return
	*/	@Select("<script>"		+"SELECT id AS id, name AS name, age AS age, married AS married FROM comment_demo WHERE id IN "		+"<foreach collection='list' item='id' index='index' open='(' close=')' separator=','>"		+"#{id}"		+"</foreach>"		+"</script>")	List<CommentDemoEntity> selectByIds(@Param("list") List<Long>ids);
	
	/**
	* @author 七脉
	* 描述：查询
	* @param map
	* @return
	*/	@Select("<script>"		+"SELECT id AS id, name AS name, age AS age, married AS married FROM comment_demo"		+"<trim prefix='WHERE' prefixOverrides='and|or'>"		+"<if test='id != null'> AND id = #{id}</if>"		+"<if test='name != null'> AND name = #{name}</if>"		+"<if test='age != null'> AND age = #{age}</if>"		+"<if test='married != null'> AND married = #{married}</if>"		+"</trim>"		+"</script>")	List<CommentDemoEntity> selectByMap(Map<String,Object> map);
	
	/**
	* @author 七脉
	* 描述：插入
	* @param commentDemoEntity
	* @return
	*/	@Insert("INSERT INTO comment_demo ( ID, NAME, AGE, MARRIED) VALUES ( #{id}, #{name}, #{age}, #{married})")	boolean insert(CommentDemoEntity commentDemoEntity);
	
	/**
	* @author 七脉
	* 描述：批量插入
	* @param commentDemoEntitys
	* @return
	*/	@Insert("<script>"		+"INSERT INTO comment_demo"		+"( ID, NAME, AGE, MARRIED)"		+"VALUES "		+"<foreach collection='list' item='item' index='index' separator=','>"		+"( #{item.id}, #{item.name}, #{item.age}, #{item.married})"		+"</foreach>"		+"</script>")	boolean insertBatch(@Param("list") List<CommentDemoEntity> commentDemoEntitys);
	
	/**
	* @author 七脉
	* 描述：更新
	* @param commentDemoEntity
	* @return
	*/	@Update("<script>"		+"UPDATE comment_demo"		+"<trim prefix='set' suffixOverrides=',' suffix=' WHERE id=#{id}'>"		+" id=#{id},"		+" name=#{name},"		+" age=#{age},"		+" married=#{married},"		+"</trim>"		+"</script>")	boolean update(CommentDemoEntity commentDemoEntity);
	
	/**
	* @author 七脉
	* 描述：更新
	* @param commentDemoEntity
	* @param setNull
	* @return
	*/	@Update("<script>"		+"UPDATE comment_demo"		+"<trim prefix='set' suffixOverrides=',' suffix=' WHERE id=#{entity.id}'>"		+"<if test='setNull==true || entity.id!=null'>id=#{entity.id},</if>"		+"<if test='setNull==true || entity.name!=null'>name=#{entity.name},</if>"		+"<if test='setNull==true || entity.age!=null'>age=#{entity.age},</if>"		+"<if test='setNull==true || entity.married!=null'>married=#{entity.married},</if>"		+"</trim>"		+"</script>")	boolean updateSetNull(@Param("entity") CommentDemoEntity commentDemoEntity, @Param("setNull") boolean setNull);
	
	/**
	* @author 七脉
	* 描述：批量更新
	* @param commentDemoEntitys
	* @return
	*/	@Update("<script>"		+"<foreach collection='list' item='item' index='index' open='' close='' separator=';'>"		+"UPDATE comment_demo"		+"<trim prefix='set' suffixOverrides=',' suffix='WHERE id=#{item.id}'>"		+" id=#{item.id},"		+" name=#{item.name},"		+" age=#{item.age},"		+" married=#{item.married},"		+"</trim>"		+"</foreach>"		+"</script>")	boolean updateBatch(@Param("list") List<CommentDemoEntity> commentDemoEntitys);
	
	/**
	* @author 七脉
	* 描述：批量更新
	* @param commentDemoEntitys
	* @param setNull
	* @return
	*/	@Update("<script>"		+"<foreach collection='list' item='item' index='index' open='' close='' separator=';'>"		+"UPDATE comment_demo"		+"<trim prefix='set' suffixOverrides=',' suffix='WHERE id=#{item.id}'>"		+"<if test='setNull==true || item.id!=null'>id=#{item.id},</if>"		+"<if test='setNull==true || item.name!=null'>name=#{item.name},</if>"		+"<if test='setNull==true || item.age!=null'>age=#{item.age},</if>"		+"<if test='setNull==true || item.married!=null'>married=#{item.married},</if>"		+"</trim>"		+"</foreach>"		+"</script>")	boolean updateBatchSetNull(@Param("list") List<CommentDemoEntity> commentDemoEntitys, @Param("setNull") boolean setNull);
	
	/**
	* @author 七脉
	* 描述：主键删除
	* @param id
	* @return
	*/	@Delete("DELETE FROM comment_demo WHERE id = #{id}")	boolean deleteById(@Param("id") Long id);
	
	/**
	* @author 七脉
	* 描述：实体删除
	* @param commentDemoEntity
	* @return
	*/	@Delete("DELETE FROM comment_demo WHERE id = #{id}")	boolean deleteByEntity(CommentDemoEntity commentDemoEntity);
	
	/**
	* @author 七脉
	* 描述：主键批量删除
	* @param ids
	* @return
	*/	@Delete("<script>"		+"DELETE FROM comment_demo WHERE id IN "		+"<foreach collection='list' item='id' index='index' open='(' close=')' separator=','>"		+"#{id}"		+"</foreach>"		+"</script>")	boolean deleteByIds(@Param("list") List<Long> ids);
	
	/**
	* @author 七脉
	* 描述：批量删除
	* @param commentDemoEntitys
	* @return
	*/	@Delete("<script>"		+"DELETE FROM comment_demo WHERE id IN "		+"<foreach collection='list' item='item' index='index' open='(' close=')' separator=','>"		+"#{item.id}"		+"</foreach>"		+"</script>")	boolean deleteBatch(@Param("list") List<CommentDemoEntity> commentDemoEntitys);
}