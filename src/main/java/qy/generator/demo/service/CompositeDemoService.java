package qy.generator.demo.service;
import java.util.List;
import java.util.Map;
import com.qy.code.generator.query.Query;
import qy.generator.demo.entity.CompositeDemoEntity;
public interface CompositeDemoService {
	
	/**
	* @author 七脉
	* 描述 Query查询
	* @param query
	* @return
	*/
	List<CompositeDemoEntity> select(Query query);
	
	/**
	* @author 七脉
	* 描述：主键查询
	* @param userId
	* @param roleId
	* @return
	*/
	CompositeDemoEntity select(Integer userId, Integer roleId);
	
	/**
	* @author 七脉
	* 描述：查询
	* @param map
	* @return
	*/
	List<CompositeDemoEntity> select(Map<String,Object> map);
	
	/**
	* @author 七脉
	* 描述：插入
	* @param compositeDemoEntity
	* @return
	*/
	boolean insert(CompositeDemoEntity compositeDemoEntity);
	
	/**
	* @author 七脉
	* 描述：批量插入
	* @param compositeDemoEntitys
	* @return
	*/
	boolean insert(List<CompositeDemoEntity> compositeDemoEntitys);
	
	/**
	* @author 七脉
	* 描述：更新
	* @param compositeDemoEntity
	* @return
	*/
	boolean update(CompositeDemoEntity compositeDemoEntity);
	
	/**
	* @author 七脉
	* 描述：更新
	* @param compositeDemoEntity
	* @param setNull
	* @return
	*/
	boolean update(CompositeDemoEntity compositeDemoEntity, boolean setNull);
	
	/**
	* @author 七脉
	* 描述：批量更新
	* @param compositeDemoEntitys
	* @return
	*/
	boolean update(List<CompositeDemoEntity> compositeDemoEntitys);
	
	/**
	* @author 七脉
	* 描述：批量更新
	* @param compositeDemoEntitys
	* @param setNull
	* @return
	*/
	boolean update(List<CompositeDemoEntity> compositeDemoEntitys, boolean setNull);
	
	/**
	* @author 七脉
	* 描述：主键删除
	* @param userId
	* @param roleId
	* @return
	*/
	boolean delete(Integer userId, Integer roleId);
	
	/**
	* @author 七脉
	* 描述：主键删除
	* @param userId
	* @param roleId
	* @return
	*/
	boolean delete(CompositeDemoEntity compositeDemoEntity);
}