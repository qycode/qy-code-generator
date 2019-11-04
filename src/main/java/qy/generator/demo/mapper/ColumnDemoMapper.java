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
import qy.generator.demo.entity.ColumnDemoEntity;
@Mapper
public interface ColumnDemoMapper {
	
	/**
	* @author 七脉
	* 描述 Query查询
	* @param query
	* @return
	*/	@Select("<script>"		+"SELECT  id AS id, name AS name, gender AS gender, interest AS interest, married AS married FROM column_demo "		+QySqlUtils.SQL_QUERY_PART		+"</script>")	List<ColumnDemoEntity> selectByQuery(@Param("query") Query query);
	
	/**
	* @author 七脉
	* 描述：主键查询
	* @param id
	* @return
	*/	@Select("SELECT id AS id, name AS name, gender AS gender, interest AS interest, married AS married FROM column_demo WHERE id = #{id}")	ColumnDemoEntity selectById(@Param("id") Long id);
	
	/**
	* @author 七脉
	* 描述：主键查询
	* @param ids
	* @return
	*/	@Select("<script>"		+"SELECT id AS id, name AS name, gender AS gender, interest AS interest, married AS married FROM column_demo WHERE id IN "		+"<foreach collection='list' item='id' index='index' open='(' close=')' separator=','>"		+"#{id}"		+"</foreach>"		+"</script>")	List<ColumnDemoEntity> selectByIds(@Param("list") List<Long>ids);
	
	/**
	* @author 七脉
	* 描述：查询
	* @param map
	* @return
	*/	@Select("<script>"		+"SELECT id AS id, name AS name, gender AS gender, interest AS interest, married AS married FROM column_demo"		+"<trim prefix='WHERE' prefixOverrides='and|or'>"		+"<if test='id != null'> AND id = #{id}</if>"		+"<if test='name != null'> AND name = #{name}</if>"		+"<if test='gender != null'> AND gender = #{gender}</if>"		+"<if test='interest != null'> AND interest = #{interest}</if>"		+"<if test='married != null'> AND married = #{married}</if>"		+"</trim>"		+"</script>")	List<ColumnDemoEntity> selectByMap(Map<String,Object> map);
	
	/**
	* @author 七脉
	* 描述：插入
	* @param columnDemoEntity
	* @return
	*/	@Insert("INSERT INTO column_demo ( ID, NAME, GENDER, INTEREST, MARRIED) VALUES ( #{id}, #{name}, #{gender}, #{interest}, #{married})")	boolean insert(ColumnDemoEntity columnDemoEntity);
	
	/**
	* @author 七脉
	* 描述：批量插入
	* @param columnDemoEntitys
	* @return
	*/	@Insert("<script>"		+"INSERT INTO column_demo"		+"( ID, NAME, GENDER, INTEREST, MARRIED)"		+"VALUES "		+"<foreach collection='list' item='item' index='index' separator=','>"		+"( #{item.id}, #{item.name}, #{item.gender}, #{item.interest}, #{item.married})"		+"</foreach>"		+"</script>")	boolean insertBatch(@Param("list") List<ColumnDemoEntity> columnDemoEntitys);
	
	/**
	* @author 七脉
	* 描述：更新
	* @param columnDemoEntity
	* @return
	*/	@Update("<script>"		+"UPDATE column_demo"		+"<trim prefix='set' suffixOverrides=',' suffix=' WHERE id=#{id}'>"		+" id=#{id},"		+" name=#{name},"		+" gender=#{gender},"		+" interest=#{interest},"		+" married=#{married},"		+"</trim>"		+"</script>")	boolean update(ColumnDemoEntity columnDemoEntity);
	
	/**
	* @author 七脉
	* 描述：更新
	* @param columnDemoEntity
	* @param setNull
	* @return
	*/	@Update("<script>"		+"UPDATE column_demo"		+"<trim prefix='set' suffixOverrides=',' suffix=' WHERE id=#{entity.id}'>"		+"<if test='setNull==true || entity.id!=null'>id=#{entity.id},</if>"		+"<if test='setNull==true || entity.name!=null'>name=#{entity.name},</if>"		+"<if test='setNull==true || entity.gender!=null'>gender=#{entity.gender},</if>"		+"<if test='setNull==true || entity.interest!=null'>interest=#{entity.interest},</if>"		+"<if test='setNull==true || entity.married!=null'>married=#{entity.married},</if>"		+"</trim>"		+"</script>")	boolean updateSetNull(@Param("entity") ColumnDemoEntity columnDemoEntity, @Param("setNull") boolean setNull);
	
	/**
	* @author 七脉
	* 描述：批量更新
	* @param columnDemoEntitys
	* @return
	*/	@Update("<script>"		+"<foreach collection='list' item='item' index='index' open='' close='' separator=';'>"		+"UPDATE column_demo"		+"<trim prefix='set' suffixOverrides=',' suffix='WHERE id=#{item.id}'>"		+" id=#{item.id},"		+" name=#{item.name},"		+" gender=#{item.gender},"		+" interest=#{item.interest},"		+" married=#{item.married},"		+"</trim>"		+"</foreach>"		+"</script>")	boolean updateBatch(@Param("list") List<ColumnDemoEntity> columnDemoEntitys);
	
	/**
	* @author 七脉
	* 描述：批量更新
	* @param columnDemoEntitys
	* @param setNull
	* @return
	*/	@Update("<script>"		+"<foreach collection='list' item='item' index='index' open='' close='' separator=';'>"		+"UPDATE column_demo"		+"<trim prefix='set' suffixOverrides=',' suffix='WHERE id=#{item.id}'>"		+"<if test='setNull==true || item.id!=null'>id=#{item.id},</if>"		+"<if test='setNull==true || item.name!=null'>name=#{item.name},</if>"		+"<if test='setNull==true || item.gender!=null'>gender=#{item.gender},</if>"		+"<if test='setNull==true || item.interest!=null'>interest=#{item.interest},</if>"		+"<if test='setNull==true || item.married!=null'>married=#{item.married},</if>"		+"</trim>"		+"</foreach>"		+"</script>")	boolean updateBatchSetNull(@Param("list") List<ColumnDemoEntity> columnDemoEntitys, @Param("setNull") boolean setNull);
	
	/**
	* @author 七脉
	* 描述：主键删除
	* @param id
	* @return
	*/	@Delete("DELETE FROM column_demo WHERE id = #{id}")	boolean deleteById(@Param("id") Long id);
	
	/**
	* @author 七脉
	* 描述：实体删除
	* @param columnDemoEntity
	* @return
	*/	@Delete("DELETE FROM column_demo WHERE id = #{id}")	boolean deleteByEntity(ColumnDemoEntity columnDemoEntity);
	
	/**
	* @author 七脉
	* 描述：主键批量删除
	* @param ids
	* @return
	*/	@Delete("<script>"		+"DELETE FROM column_demo WHERE id IN "		+"<foreach collection='list' item='id' index='index' open='(' close=')' separator=','>"		+"#{id}"		+"</foreach>"		+"</script>")	boolean deleteByIds(@Param("list") List<Long> ids);
	
	/**
	* @author 七脉
	* 描述：批量删除
	* @param columnDemoEntitys
	* @return
	*/	@Delete("<script>"		+"DELETE FROM column_demo WHERE id IN "		+"<foreach collection='list' item='item' index='index' open='(' close=')' separator=','>"		+"#{item.id}"		+"</foreach>"		+"</script>")	boolean deleteBatch(@Param("list") List<ColumnDemoEntity> columnDemoEntitys);
}