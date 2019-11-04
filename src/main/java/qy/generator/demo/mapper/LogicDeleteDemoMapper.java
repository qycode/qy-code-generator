package qy.generator.demo.mapper;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import com.qy.code.generator.query.Query;
import com.qy.code.generator.util.QySqlUtils;
import qy.generator.demo.entity.LogicDeleteDemoEntity;
@Mapper
public interface LogicDeleteDemoMapper {
	
	/**
	* @author 七脉
	* 描述 Query查询
	* @param query
	* @return
	*/	@Select("<script>"		+"SELECT  id AS id, name AS name, delete_flag AS deleteFlag FROM logic_delete_demo "		+QySqlUtils.SQL_QUERY_PART		+"</script>")	List<LogicDeleteDemoEntity> selectByQuery(@Param("query") Query query);
	
	/**
	* @author 七脉
	* 描述：主键查询
	* @param id
	* @return
	*/	@Select("SELECT id AS id, name AS name, delete_flag AS deleteFlag FROM logic_delete_demo WHERE id = #{id}")	LogicDeleteDemoEntity selectById(@Param("id") Long id);
	
	/**
	* @author 七脉
	* 描述：主键查询
	* @param ids
	* @return
	*/	@Select("<script>"		+"SELECT id AS id, name AS name, delete_flag AS deleteFlag FROM logic_delete_demo WHERE id IN "		+"<foreach collection='list' item='id' index='index' open='(' close=')' separator=','>"		+"#{id}"		+"</foreach>"		+"</script>")	List<LogicDeleteDemoEntity> selectByIds(@Param("list") List<Long>ids);
	
	/**
	* @author 七脉
	* 描述：查询
	* @param map
	* @return
	*/	@Select("<script>"		+"SELECT id AS id, name AS name, delete_flag AS deleteFlag FROM logic_delete_demo"		+"<trim prefix='WHERE' prefixOverrides='and|or'>"		+"<if test='id != null'> AND id = #{id}</if>"		+"<if test='name != null'> AND name = #{name}</if>"		+"<if test='deleteFlag != null'> AND delete_flag = #{deleteFlag}</if>"		+"</trim>"		+"</script>")	List<LogicDeleteDemoEntity> selectByMap(Map<String,Object> map);
	
	/**
	* @author 七脉
	* 描述：插入
	* @param logicDeleteDemoEntity
	* @return
	*/	@Insert("INSERT INTO logic_delete_demo ( ID, NAME, DELETE_FLAG) VALUES ( #{id}, #{name}, #{deleteFlag})")	boolean insert(LogicDeleteDemoEntity logicDeleteDemoEntity);
	
	/**
	* @author 七脉
	* 描述：批量插入
	* @param logicDeleteDemoEntitys
	* @return
	*/	@Insert("<script>"		+"INSERT INTO logic_delete_demo"		+"( ID, NAME, DELETE_FLAG)"		+"VALUES "		+"<foreach collection='list' item='item' index='index' separator=','>"		+"( #{item.id}, #{item.name}, #{item.deleteFlag})"		+"</foreach>"		+"</script>")	boolean insertBatch(@Param("list") List<LogicDeleteDemoEntity> logicDeleteDemoEntitys);
	
	/**
	* @author 七脉
	* 描述：更新
	* @param logicDeleteDemoEntity
	* @return
	*/	@Update("<script>"		+"UPDATE logic_delete_demo"		+"<trim prefix='set' suffixOverrides=',' suffix=' WHERE id=#{id}'>"		+" id=#{id},"		+" name=#{name},"		+" delete_flag=#{deleteFlag},"		+"</trim>"		+"</script>")	boolean update(LogicDeleteDemoEntity logicDeleteDemoEntity);
	
	/**
	* @author 七脉
	* 描述：更新
	* @param logicDeleteDemoEntity
	* @param setNull
	* @return
	*/	@Update("<script>"		+"UPDATE logic_delete_demo"		+"<trim prefix='set' suffixOverrides=',' suffix=' WHERE id=#{entity.id}'>"		+"<if test='setNull==true || entity.id!=null'>id=#{entity.id},</if>"		+"<if test='setNull==true || entity.name!=null'>name=#{entity.name},</if>"		+"<if test='setNull==true || entity.deleteFlag!=null'>delete_flag=#{entity.deleteFlag},</if>"		+"</trim>"		+"</script>")	boolean updateSetNull(@Param("entity") LogicDeleteDemoEntity logicDeleteDemoEntity, @Param("setNull") boolean setNull);
	
	/**
	* @author 七脉
	* 描述：批量更新
	* @param logicDeleteDemoEntitys
	* @return
	*/	@Update("<script>"		+"<foreach collection='list' item='item' index='index' open='' close='' separator=';'>"		+"UPDATE logic_delete_demo"		+"<trim prefix='set' suffixOverrides=',' suffix='WHERE id=#{item.id}'>"		+" id=#{item.id},"		+" name=#{item.name},"		+" delete_flag=#{item.deleteFlag},"		+"</trim>"		+"</foreach>"		+"</script>")	boolean updateBatch(@Param("list") List<LogicDeleteDemoEntity> logicDeleteDemoEntitys);
	
	/**
	* @author 七脉
	* 描述：批量更新
	* @param logicDeleteDemoEntitys
	* @param setNull
	* @return
	*/	@Update("<script>"		+"<foreach collection='list' item='item' index='index' open='' close='' separator=';'>"		+"UPDATE logic_delete_demo"		+"<trim prefix='set' suffixOverrides=',' suffix='WHERE id=#{item.id}'>"		+"<if test='setNull==true || item.id!=null'>id=#{item.id},</if>"		+"<if test='setNull==true || item.name!=null'>name=#{item.name},</if>"		+"<if test='setNull==true || item.deleteFlag!=null'>delete_flag=#{item.deleteFlag},</if>"		+"</trim>"		+"</foreach>"		+"</script>")	boolean updateBatchSetNull(@Param("list") List<LogicDeleteDemoEntity> logicDeleteDemoEntitys, @Param("setNull") boolean setNull);
	
	/**
	* @author 七脉
	* 描述：主键删除
	* @param id
	* @return
	*/	@Update("UPDATE logic_delete_demo SET delete_flag = true WHERE id = #{id}")	boolean deleteById(@Param("id") Long id);
	
	/**
	* @author 七脉
	* 描述：实体删除
	* @param logicDeleteDemoEntity
	* @return
	*/	@Update("UPDATE logic_delete_demo SET delete_flag = true WHERE id = #{id}")	boolean deleteByEntity(LogicDeleteDemoEntity logicDeleteDemoEntity);
	
	/**
	* @author 七脉
	* 描述：主键批量删除
	* @param ids
	* @return
	*/	@Update("<script>"		+"UPDATE logic_delete_demo SET delete_flag = true WHERE id IN "		+"<foreach collection='list' item='id' index='index' open='(' close=')' separator=','>"		+"#{id}"		+"</foreach>"		+"</script>")	boolean deleteByIds(@Param("list") List<Long> ids);
	
	/**
	* @author 七脉
	* 描述：批量删除
	* @param logicDeleteDemoEntitys
	* @return
	*/	@Update("<script>"		+"UPDATE logic_delete_demo SET delete_flag = true WHERE id IN "		+"<foreach collection='list' item='item' index='index' open='(' close=')' separator=','>"		+"#{item.id}"		+"</foreach>"		+"</script>")	boolean deleteBatch(@Param("list") List<LogicDeleteDemoEntity> logicDeleteDemoEntitys);
}