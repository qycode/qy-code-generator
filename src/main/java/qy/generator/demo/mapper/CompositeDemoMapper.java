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
import qy.generator.demo.entity.CompositeDemoEntity;
@Mapper
public interface CompositeDemoMapper {
	
	/**
	* @author 七脉
	* 描述 Query查询
	* @param query
	* @return
	*/	@Select("<script>"		+"SELECT  user_id AS userId, role_id AS roleId FROM composite_demo "		+QySqlUtils.SQL_QUERY_PART		+"</script>")	List<CompositeDemoEntity> selectByQuery(@Param("query") Query query);
	
	/**
	* @author 七脉
	* 描述：主键查询
	* @param userId
	* @param roleId
	* @return
	*/	@Select("SELECT user_id AS userId, role_id AS roleId FROM composite_demo WHERE user_id = #{userId} AND role_id = #{roleId}")	CompositeDemoEntity selectById(@Param("userId") Integer userId, @Param("roleId") Integer roleId);
	
	/**
	* @author 七脉
	* 描述：查询
	* @param map
	* @return
	*/	@Select("<script>"		+"SELECT user_id AS userId, role_id AS roleId FROM composite_demo"		+"<trim prefix='WHERE' prefixOverrides='and|or'>"		+"<if test='userId != null'> AND user_id = #{userId}</if>"		+"<if test='roleId != null'> AND role_id = #{roleId}</if>"		+"</trim>"		+"</script>")	List<CompositeDemoEntity> selectByMap(Map<String,Object> map);
	
	/**
	* @author 七脉
	* 描述：插入
	* @param compositeDemoEntity
	* @return
	*/	@Insert("INSERT INTO composite_demo ( USER_ID, ROLE_ID) VALUES ( #{userId}, #{roleId})")	boolean insert(CompositeDemoEntity compositeDemoEntity);
	
	/**
	* @author 七脉
	* 描述：批量插入
	* @param compositeDemoEntitys
	* @return
	*/	@Insert("<script>"		+"INSERT INTO composite_demo"		+"( USER_ID, ROLE_ID)"		+"VALUES "		+"<foreach collection='list' item='item' index='index' separator=','>"		+"( #{item.userId}, #{item.roleId})"		+"</foreach>"		+"</script>")	boolean insertBatch(@Param("list") List<CompositeDemoEntity> compositeDemoEntitys);
	
	/**
	* @author 七脉
	* 描述：更新
	* @param compositeDemoEntity
	* @return
	*/	@Update("<script>"		+"UPDATE composite_demo"		+"<trim prefix='set' suffixOverrides=',' suffix=' WHERE user_id=#{userId} AND role_id=#{roleId}'>"		+" user_id=#{userId},"		+" role_id=#{roleId},"		+"</trim>"		+"</script>")	boolean update(CompositeDemoEntity compositeDemoEntity);
	
	/**
	* @author 七脉
	* 描述：更新
	* @param compositeDemoEntity
	* @param setNull
	* @return
	*/	@Update("<script>"		+"UPDATE composite_demo"		+"<trim prefix='set' suffixOverrides=',' suffix=' WHERE user_id=#{entity.userId} AND role_id=#{entity.roleId}'>"		+"<if test='setNull==true || entity.userId!=null'>user_id=#{entity.userId},</if>"		+"<if test='setNull==true || entity.roleId!=null'>role_id=#{entity.roleId},</if>"		+"</trim>"		+"</script>")	boolean updateSetNull(@Param("entity") CompositeDemoEntity compositeDemoEntity, @Param("setNull") boolean setNull);
	
	/**
	* @author 七脉
	* 描述：批量更新
	* @param compositeDemoEntitys
	* @return
	*/	@Update("<script>"		+"<foreach collection='list' item='item' index='index' open='' close='' separator=';'>"		+"UPDATE composite_demo"		+"<trim prefix='set' suffixOverrides=',' suffix='WHERE user_id=#{item.userId} AND role_id=#{item.roleId}'>"		+" user_id=#{item.userId},"		+" role_id=#{item.roleId},"		+"</trim>"		+"</foreach>"		+"</script>")	boolean updateBatch(@Param("list") List<CompositeDemoEntity> compositeDemoEntitys);
	
	/**
	* @author 七脉
	* 描述：批量更新
	* @param compositeDemoEntitys
	* @param setNull
	* @return
	*/	@Update("<script>"		+"<foreach collection='list' item='item' index='index' open='' close='' separator=';'>"		+"UPDATE composite_demo"		+"<trim prefix='set' suffixOverrides=',' suffix='WHERE user_id=#{item.userId} AND role_id=#{item.roleId}'>"		+"<if test='setNull==true || item.userId!=null'>user_id=#{item.userId},</if>"		+"<if test='setNull==true || item.roleId!=null'>role_id=#{item.roleId},</if>"		+"</trim>"		+"</foreach>"		+"</script>")	boolean updateBatchSetNull(@Param("list") List<CompositeDemoEntity> compositeDemoEntitys, @Param("setNull") boolean setNull);
	
	/**
	* @author 七脉
	* 描述：主键删除
	* @param userId
	* @param roleId
	* @return
	*/	@Delete("DELETE FROM composite_demo WHERE user_id = #{userId} AND role_id = #{roleId}")	boolean deleteById(@Param("userId") Integer userId, @Param("roleId") Integer roleId);
	
	/**
	* @author 七脉
	* 描述：实体删除
	* @param compositeDemoEntity
	* @return
	*/	@Delete("DELETE FROM composite_demo WHERE user_id = #{userId} AND role_id = #{roleId}")	boolean deleteByEntity(CompositeDemoEntity compositeDemoEntity);
}