package qy.generator.demo.service;
import java.util.List;
import java.util.Map;
import com.qy.code.generator.query.Query;
import qy.generator.demo.entity.CommentDemoEntity;
public interface CommentDemoService {
	
	/**
	* @author 七脉
	* 描述 Query查询
	* @param query
	* @return
	*/
	List<CommentDemoEntity> select(Query query);
	
	/**
	* @author 七脉
	* 描述：主键查询
	* @param id
	* @return
	*/
	CommentDemoEntity select(Long id);
	
	/**
	* @author 七脉
	* 描述：主键查询
	* @param ids
	* @return
	*/
	List<CommentDemoEntity> select(List<Long>ids);
	
	/**
	* @author 七脉
	* 描述：查询
	* @param map
	* @return
	*/
	List<CommentDemoEntity> select(Map<String,Object> map);
	
	/**
	* @author 七脉
	* 描述：插入
	* @param commentDemoEntity
	* @return
	*/
	boolean insert(CommentDemoEntity commentDemoEntity);
	
	/**
	* @author 七脉
	* 描述：批量插入
	* @param commentDemoEntitys
	* @return
	*/
	boolean insert(List<CommentDemoEntity> commentDemoEntitys);
	
	/**
	* @author 七脉
	* 描述：更新
	* @param commentDemoEntity
	* @return
	*/
	boolean update(CommentDemoEntity commentDemoEntity);
	
	/**
	* @author 七脉
	* 描述：更新
	* @param commentDemoEntity
	* @param setNull
	* @return
	*/
	boolean update(CommentDemoEntity commentDemoEntity, boolean setNull);
	
	/**
	* @author 七脉
	* 描述：批量更新
	* @param commentDemoEntitys
	* @return
	*/
	boolean update(List<CommentDemoEntity> commentDemoEntitys);
	
	/**
	* @author 七脉
	* 描述：批量更新
	* @param commentDemoEntitys
	* @param setNull
	* @return
	*/
	boolean update(List<CommentDemoEntity> commentDemoEntitys, boolean setNull);
	
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
	boolean delete(CommentDemoEntity commentDemoEntity);
	
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
	* @param commentDemoEntitys
	* @return
	*/
	boolean deletes(List<CommentDemoEntity> commentDemoEntitys);
}