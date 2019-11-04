package qy.generator.demo.service;
import java.util.List;
import java.util.Map;
import com.qy.code.generator.query.Query;
import qy.generator.demo.entity.IndexDemoEntity;
public interface IndexDemoService {
	
	/**
	* @author 七脉
	* 描述 Query查询
	* @param query
	* @return
	*/
	List<IndexDemoEntity> select(Query query);
	
	/**
	* @author 七脉
	* 描述：主键查询
	* @param id
	* @return
	*/
	IndexDemoEntity select(Long id);
	
	/**
	* @author 七脉
	* 描述：主键查询
	* @param ids
	* @return
	*/
	List<IndexDemoEntity> select(List<Long>ids);
	
	/**
	* @author 七脉
	* 描述：查询
	* @param map
	* @return
	*/
	List<IndexDemoEntity> select(Map<String,Object> map);
	
	/**
	* @author 七脉
	* 描述：插入
	* @param indexDemoEntity
	* @return
	*/
	boolean insert(IndexDemoEntity indexDemoEntity);
	
	/**
	* @author 七脉
	* 描述：批量插入
	* @param indexDemoEntitys
	* @return
	*/
	boolean insert(List<IndexDemoEntity> indexDemoEntitys);
	
	/**
	* @author 七脉
	* 描述：更新
	* @param indexDemoEntity
	* @return
	*/
	boolean update(IndexDemoEntity indexDemoEntity);
	
	/**
	* @author 七脉
	* 描述：更新
	* @param indexDemoEntity
	* @param setNull
	* @return
	*/
	boolean update(IndexDemoEntity indexDemoEntity, boolean setNull);
	
	/**
	* @author 七脉
	* 描述：批量更新
	* @param indexDemoEntitys
	* @return
	*/
	boolean update(List<IndexDemoEntity> indexDemoEntitys);
	
	/**
	* @author 七脉
	* 描述：批量更新
	* @param indexDemoEntitys
	* @param setNull
	* @return
	*/
	boolean update(List<IndexDemoEntity> indexDemoEntitys, boolean setNull);
	
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
	boolean delete(IndexDemoEntity indexDemoEntity);
	
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
	* @param indexDemoEntitys
	* @return
	*/
	boolean deletes(List<IndexDemoEntity> indexDemoEntitys);
}