package qy.generator.demo.service.impl;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.qy.code.generator.query.Query;
import qy.generator.demo.entity.IndexDemoEntity;
import qy.generator.demo.mapper.IndexDemoMapper;
import qy.generator.demo.service.IndexDemoService;
@Service
public class IndexDemoServiceImpl implements IndexDemoService{
	@Autowired
	private IndexDemoMapper indexDemoMapper;

	/**
	* Query查询
	*/
	@Override
	public List<IndexDemoEntity> select(Query query) {
		return indexDemoMapper.selectByQuery(query);
	}

	/**
	* 主键查询
	*/
	@Override
	public IndexDemoEntity select(Long id) {
		return indexDemoMapper.selectById(id);
	}

	/**
	* 主键查询
	*/
	@Override
	public List<IndexDemoEntity> select(List<Long> ids) {
		return indexDemoMapper.selectByIds(ids);
	}

	/**
	* 查询
	*/
	@Override
	public List<IndexDemoEntity> select(Map<String,Object> map) {
		return indexDemoMapper.selectByMap(map);
	}

	/**
	* 插入
	*/
	@Override
	public boolean insert(IndexDemoEntity indexDemoEntity) {
		return indexDemoMapper.insert(indexDemoEntity);
	}

	/**
	* 批量插入
	*/
	@Override
	public boolean insert(List<IndexDemoEntity> indexDemoEntitys) {
		return indexDemoMapper.insertBatch(indexDemoEntitys);
	}

	/**
	* 更新
	*/
	@Override
	public boolean update(IndexDemoEntity indexDemoEntity) {
		return indexDemoMapper.update(indexDemoEntity);
	}

	/**
	* 更新
	*/
	@Override
	public boolean update(IndexDemoEntity indexDemoEntity, boolean isSetNull) {
		return indexDemoMapper.updateSetNull(indexDemoEntity, isSetNull);
	}

	/**
	* 批量更新
	*/
	@Override
	public boolean update(List<IndexDemoEntity> indexDemoEntitys) {
		return indexDemoMapper.updateBatch(indexDemoEntitys);
	}

	/**
	* 批量更新
	*/
	@Override
	public boolean update(List<IndexDemoEntity> indexDemoEntitys, boolean isSetNull) {
		return indexDemoMapper.updateBatchSetNull(indexDemoEntitys, isSetNull);
	}

	/**
	* 主键删除
	*/
	@Override
	public boolean delete(Long id) {
		return indexDemoMapper.deleteById(id);
	}

	/**
	* 主键删除
	*/
	@Override
	public boolean delete(IndexDemoEntity indexDemoEntity) {
		return indexDemoMapper.deleteByEntity(indexDemoEntity);
	}

	/**
	* 主键批量删除
	*/
	@Override
	public boolean delete(List<Long> ids) {
		return indexDemoMapper.deleteByIds(ids);
	}

	/**
	* 批量删除
	*/
	@Override
	public boolean deletes(List<IndexDemoEntity> indexDemoEntitys) {
		return indexDemoMapper.deleteBatch(indexDemoEntitys);
	}
}