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
import qy.generator.demo.entity.IndexDemoEntity;
@Mapper
public interface IndexDemoMapper {
	
	/**
	* @author 七脉
	* 描述 Query查询
	* @param query
	* @return
	*/	@Select("<script>"		+"SELECT  id AS id, unique_index AS uniqueIndex, common_index AS commonIndex, common_index1 AS commonIndex1, common_index2 AS commonIndex2 FROM index_demo "		+QySqlUtils.SQL_QUERY_PART		+"</script>")	List<IndexDemoEntity> selectByQuery(@Param("query") Query query);
	
	/**
	* @author 七脉
	* 描述：主键查询
	* @param id
	* @return
	*/	@Select("SELECT id AS id, unique_index AS uniqueIndex, common_index AS commonIndex, common_index1 AS commonIndex1, common_index2 AS commonIndex2 FROM index_demo WHERE id = #{id}")	IndexDemoEntity selectById(@Param("id") Long id);
	
	/**
	* @author 七脉
	* 描述：主键查询
	* @param ids
	* @return
	*/	@Select("<script>"		+"SELECT id AS id, unique_index AS uniqueIndex, common_index AS commonIndex, common_index1 AS commonIndex1, common_index2 AS commonIndex2 FROM index_demo WHERE id IN "		+"<foreach collection='list' item='id' index='index' open='(' close=')' separator=','>"		+"#{id}"		+"</foreach>"		+"</script>")	List<IndexDemoEntity> selectByIds(@Param("list") List<Long>ids);
	
	/**
	* @author 七脉
	* 描述：查询
	* @param map
	* @return
	*/	@Select("<script>"		+"SELECT id AS id, unique_index AS uniqueIndex, common_index AS commonIndex, common_index1 AS commonIndex1, common_index2 AS commonIndex2 FROM index_demo"		+"<trim prefix='WHERE' prefixOverrides='and|or'>"		+"<if test='id != null'> AND id = #{id}</if>"		+"<if test='uniqueIndex != null'> AND unique_index = #{uniqueIndex}</if>"		+"<if test='commonIndex != null'> AND common_index = #{commonIndex}</if>"		+"<if test='commonIndex1 != null'> AND common_index1 = #{commonIndex1}</if>"		+"<if test='commonIndex2 != null'> AND common_index2 = #{commonIndex2}</if>"		+"</trim>"		+"</script>")	List<IndexDemoEntity> selectByMap(Map<String,Object> map);
	
	/**
	* @author 七脉
	* 描述：插入
	* @param indexDemoEntity
	* @return
	*/	@Insert("INSERT INTO index_demo ( ID, UNIQUE_INDEX, COMMON_INDEX, COMMON_INDEX1, COMMON_INDEX2) VALUES ( #{id}, #{uniqueIndex}, #{commonIndex}, #{commonIndex1}, #{commonIndex2})")	boolean insert(IndexDemoEntity indexDemoEntity);
	
	/**
	* @author 七脉
	* 描述：批量插入
	* @param indexDemoEntitys
	* @return
	*/	@Insert("<script>"		+"INSERT INTO index_demo"		+"( ID, UNIQUE_INDEX, COMMON_INDEX, COMMON_INDEX1, COMMON_INDEX2)"		+"VALUES "		+"<foreach collection='list' item='item' index='index' separator=','>"		+"( #{item.id}, #{item.uniqueIndex}, #{item.commonIndex}, #{item.commonIndex1}, #{item.commonIndex2})"		+"</foreach>"		+"</script>")	boolean insertBatch(@Param("list") List<IndexDemoEntity> indexDemoEntitys);
	
	/**
	* @author 七脉
	* 描述：更新
	* @param indexDemoEntity
	* @return
	*/	@Update("<script>"		+"UPDATE index_demo"		+"<trim prefix='set' suffixOverrides=',' suffix=' WHERE id=#{id}'>"		+" id=#{id},"		+" unique_index=#{uniqueIndex},"		+" common_index=#{commonIndex},"		+" common_index1=#{commonIndex1},"		+" common_index2=#{commonIndex2},"		+"</trim>"		+"</script>")	boolean update(IndexDemoEntity indexDemoEntity);
	
	/**
	* @author 七脉
	* 描述：更新
	* @param indexDemoEntity
	* @param setNull
	* @return
	*/	@Update("<script>"		+"UPDATE index_demo"		+"<trim prefix='set' suffixOverrides=',' suffix=' WHERE id=#{entity.id}'>"		+"<if test='setNull==true || entity.id!=null'>id=#{entity.id},</if>"		+"<if test='setNull==true || entity.uniqueIndex!=null'>unique_index=#{entity.uniqueIndex},</if>"		+"<if test='setNull==true || entity.commonIndex!=null'>common_index=#{entity.commonIndex},</if>"		+"<if test='setNull==true || entity.commonIndex1!=null'>common_index1=#{entity.commonIndex1},</if>"		+"<if test='setNull==true || entity.commonIndex2!=null'>common_index2=#{entity.commonIndex2},</if>"		+"</trim>"		+"</script>")	boolean updateSetNull(@Param("entity") IndexDemoEntity indexDemoEntity, @Param("setNull") boolean setNull);
	
	/**
	* @author 七脉
	* 描述：批量更新
	* @param indexDemoEntitys
	* @return
	*/	@Update("<script>"		+"<foreach collection='list' item='item' index='index' open='' close='' separator=';'>"		+"UPDATE index_demo"		+"<trim prefix='set' suffixOverrides=',' suffix='WHERE id=#{item.id}'>"		+" id=#{item.id},"		+" unique_index=#{item.uniqueIndex},"		+" common_index=#{item.commonIndex},"		+" common_index1=#{item.commonIndex1},"		+" common_index2=#{item.commonIndex2},"		+"</trim>"		+"</foreach>"		+"</script>")	boolean updateBatch(@Param("list") List<IndexDemoEntity> indexDemoEntitys);
	
	/**
	* @author 七脉
	* 描述：批量更新
	* @param indexDemoEntitys
	* @param setNull
	* @return
	*/	@Update("<script>"		+"<foreach collection='list' item='item' index='index' open='' close='' separator=';'>"		+"UPDATE index_demo"		+"<trim prefix='set' suffixOverrides=',' suffix='WHERE id=#{item.id}'>"		+"<if test='setNull==true || item.id!=null'>id=#{item.id},</if>"		+"<if test='setNull==true || item.uniqueIndex!=null'>unique_index=#{item.uniqueIndex},</if>"		+"<if test='setNull==true || item.commonIndex!=null'>common_index=#{item.commonIndex},</if>"		+"<if test='setNull==true || item.commonIndex1!=null'>common_index1=#{item.commonIndex1},</if>"		+"<if test='setNull==true || item.commonIndex2!=null'>common_index2=#{item.commonIndex2},</if>"		+"</trim>"		+"</foreach>"		+"</script>")	boolean updateBatchSetNull(@Param("list") List<IndexDemoEntity> indexDemoEntitys, @Param("setNull") boolean setNull);
	
	/**
	* @author 七脉
	* 描述：主键删除
	* @param id
	* @return
	*/	@Delete("DELETE FROM index_demo WHERE id = #{id}")	boolean deleteById(@Param("id") Long id);
	
	/**
	* @author 七脉
	* 描述：实体删除
	* @param indexDemoEntity
	* @return
	*/	@Delete("DELETE FROM index_demo WHERE id = #{id}")	boolean deleteByEntity(IndexDemoEntity indexDemoEntity);
	
	/**
	* @author 七脉
	* 描述：主键批量删除
	* @param ids
	* @return
	*/	@Delete("<script>"		+"DELETE FROM index_demo WHERE id IN "		+"<foreach collection='list' item='id' index='index' open='(' close=')' separator=','>"		+"#{id}"		+"</foreach>"		+"</script>")	boolean deleteByIds(@Param("list") List<Long> ids);
	
	/**
	* @author 七脉
	* 描述：批量删除
	* @param indexDemoEntitys
	* @return
	*/	@Delete("<script>"		+"DELETE FROM index_demo WHERE id IN "		+"<foreach collection='list' item='item' index='index' open='(' close=')' separator=','>"		+"#{item.id}"		+"</foreach>"		+"</script>")	boolean deleteBatch(@Param("list") List<IndexDemoEntity> indexDemoEntitys);
}