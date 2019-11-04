package qy.generator.demo.service;
import java.util.List;
import java.util.Map;
import com.qy.code.generator.query.Query;
import qy.generator.demo.entity.SimpleDemoEntity;
public interface SimpleDemoService {
	
	/**
	* @author 七脉
	* 描述 Query查询
	* @param query
	* @return
	*/
	List<SimpleDemoEntity> select(Query query);
	
	/**
	* @author 七脉
	* 描述：主键查询
	* @param id
	* @return
	*/
	SimpleDemoEntity select(Long id);
	
	/**
	* @author 七脉
	* 描述：主键查询
	* @param ids
	* @return
	*/
	List<SimpleDemoEntity> select(List<Long>ids);
	
	/**
	* @author 七脉
	* 描述：查询
	* @param map
	* @return
	*/
	List<SimpleDemoEntity> select(Map<String,Object> map);
	
	/**
	* @author 七脉
	* 描述：插入
	* @param simpleDemoEntity
	* @return
	*/
	boolean insert(SimpleDemoEntity simpleDemoEntity);
	
	/**
	* @author 七脉
	* 描述：批量插入
	* @param simpleDemoEntitys
	* @return
	*/
	boolean insert(List<SimpleDemoEntity> simpleDemoEntitys);
	
	/**
	* @author 七脉
	* 描述：更新
	* @param simpleDemoEntity
	* @return
	*/
	boolean update(SimpleDemoEntity simpleDemoEntity);
	
	/**
	* @author 七脉
	* 描述：更新
	* @param simpleDemoEntity
	* @param setNull
	* @return
	*/
	boolean update(SimpleDemoEntity simpleDemoEntity, boolean setNull);
	
	/**
	* @author 七脉
	* 描述：批量更新
	* @param simpleDemoEntitys
	* @return
	*/
	boolean update(List<SimpleDemoEntity> simpleDemoEntitys);
	
	/**
	* @author 七脉
	* 描述：批量更新
	* @param simpleDemoEntitys
	* @param setNull
	* @return
	*/
	boolean update(List<SimpleDemoEntity> simpleDemoEntitys, boolean setNull);
	
	/**
	* @author 七脉
	* 描述：主键删除
	* @param id
	* @return
	*/
	boolean delete(Long id);
	
	/**
	* @author 七脉
	* 描述：主键删除
	* @param id
	* @return
	*/
	boolean delete(SimpleDemoEntity simpleDemoEntity);
	
	/**
	* @author 七脉
	* 描述：主键批量删除
	* @param ids
	* @return
	*/
	boolean delete(List<Long> ids);
	
	/**
	* @author 七脉
	* 描述：批量删除
	* @param simpleDemoEntitys
	* @return
	*/
	boolean deletes(List<SimpleDemoEntity> simpleDemoEntitys);
}