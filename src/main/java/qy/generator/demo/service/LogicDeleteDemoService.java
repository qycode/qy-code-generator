package qy.generator.demo.service;
import java.util.List;
import java.util.Map;
import com.qy.code.generator.query.Query;
import qy.generator.demo.entity.LogicDeleteDemoEntity;
public interface LogicDeleteDemoService {
	
	/**
	* @author 七脉
	* 描述 Query查询
	* @param query
	* @return
	*/
	List<LogicDeleteDemoEntity> select(Query query);
	
	/**
	* @author 七脉
	* 描述：主键查询
	* @param id
	* @return
	*/
	LogicDeleteDemoEntity select(Long id);
	
	/**
	* @author 七脉
	* 描述：主键查询
	* @param ids
	* @return
	*/
	List<LogicDeleteDemoEntity> select(List<Long>ids);
	
	/**
	* @author 七脉
	* 描述：查询
	* @param map
	* @return
	*/
	List<LogicDeleteDemoEntity> select(Map<String,Object> map);
	
	/**
	* @author 七脉
	* 描述：插入
	* @param logicDeleteDemoEntity
	* @return
	*/
	boolean insert(LogicDeleteDemoEntity logicDeleteDemoEntity);
	
	/**
	* @author 七脉
	* 描述：批量插入
	* @param logicDeleteDemoEntitys
	* @return
	*/
	boolean insert(List<LogicDeleteDemoEntity> logicDeleteDemoEntitys);
	
	/**
	* @author 七脉
	* 描述：更新
	* @param logicDeleteDemoEntity
	* @return
	*/
	boolean update(LogicDeleteDemoEntity logicDeleteDemoEntity);
	
	/**
	* @author 七脉
	* 描述：更新
	* @param logicDeleteDemoEntity
	* @param setNull
	* @return
	*/
	boolean update(LogicDeleteDemoEntity logicDeleteDemoEntity, boolean setNull);
	
	/**
	* @author 七脉
	* 描述：批量更新
	* @param logicDeleteDemoEntitys
	* @return
	*/
	boolean update(List<LogicDeleteDemoEntity> logicDeleteDemoEntitys);
	
	/**
	* @author 七脉
	* 描述：批量更新
	* @param logicDeleteDemoEntitys
	* @param setNull
	* @return
	*/
	boolean update(List<LogicDeleteDemoEntity> logicDeleteDemoEntitys, boolean setNull);
	
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
	boolean delete(LogicDeleteDemoEntity logicDeleteDemoEntity);
	
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
	* @param logicDeleteDemoEntitys
	* @return
	*/
	boolean deletes(List<LogicDeleteDemoEntity> logicDeleteDemoEntitys);
}