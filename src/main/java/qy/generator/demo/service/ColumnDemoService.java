package qy.generator.demo.service;
import java.util.List;
import java.util.Map;
import com.qy.code.generator.query.Query;
import qy.generator.demo.entity.ColumnDemoEntity;
public interface ColumnDemoService {
	
	/**
	* @author 七脉
	* 描述 Query查询
	* @param query
	* @return
	*/
	List<ColumnDemoEntity> select(Query query);
	
	/**
	* @author 七脉
	* 描述：主键查询
	* @param id
	* @return
	*/
	ColumnDemoEntity select(Long id);
	
	/**
	* @author 七脉
	* 描述：主键查询
	* @param ids
	* @return
	*/
	List<ColumnDemoEntity> select(List<Long>ids);
	
	/**
	* @author 七脉
	* 描述：查询
	* @param map
	* @return
	*/
	List<ColumnDemoEntity> select(Map<String,Object> map);
	
	/**
	* @author 七脉
	* 描述：插入
	* @param columnDemoEntity
	* @return
	*/
	boolean insert(ColumnDemoEntity columnDemoEntity);
	
	/**
	* @author 七脉
	* 描述：批量插入
	* @param columnDemoEntitys
	* @return
	*/
	boolean insert(List<ColumnDemoEntity> columnDemoEntitys);
	
	/**
	* @author 七脉
	* 描述：更新
	* @param columnDemoEntity
	* @return
	*/
	boolean update(ColumnDemoEntity columnDemoEntity);
	
	/**
	* @author 七脉
	* 描述：更新
	* @param columnDemoEntity
	* @param setNull
	* @return
	*/
	boolean update(ColumnDemoEntity columnDemoEntity, boolean setNull);
	
	/**
	* @author 七脉
	* 描述：批量更新
	* @param columnDemoEntitys
	* @return
	*/
	boolean update(List<ColumnDemoEntity> columnDemoEntitys);
	
	/**
	* @author 七脉
	* 描述：批量更新
	* @param columnDemoEntitys
	* @param setNull
	* @return
	*/
	boolean update(List<ColumnDemoEntity> columnDemoEntitys, boolean setNull);
	
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
	boolean delete(ColumnDemoEntity columnDemoEntity);
	
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
	* @param columnDemoEntitys
	* @return
	*/
	boolean deletes(List<ColumnDemoEntity> columnDemoEntitys);
}