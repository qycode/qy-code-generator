package qy.generator.demo.service.impl;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.qy.code.generator.query.Query;
import qy.generator.demo.entity.SimpleDemoEntity;
import qy.generator.demo.mapper.SimpleDemoMapper;
import qy.generator.demo.service.SimpleDemoService;
@Service
public class SimpleDemoServiceImpl implements SimpleDemoService{
	@Autowired
	private SimpleDemoMapper simpleDemoMapper;

	/**
	* Query查询
	*/
	@Override
	public List<SimpleDemoEntity> select(Query query) {
		return simpleDemoMapper.selectByQuery(query);
	}

	/**
	* 主键查询
	*/
	@Override
	public SimpleDemoEntity select(Long id) {
		return simpleDemoMapper.selectById(id);
	}

	/**
	* 主键查询
	*/
	@Override
	public List<SimpleDemoEntity> select(List<Long> ids) {
		return simpleDemoMapper.selectByIds(ids);
	}

	/**
	* 查询
	*/
	@Override
	public List<SimpleDemoEntity> select(Map<String,Object> map) {
		return simpleDemoMapper.selectByMap(map);
	}

	/**
	* 插入
	*/
	@Override
	public boolean insert(SimpleDemoEntity simpleDemoEntity) {
		return simpleDemoMapper.insert(simpleDemoEntity);
	}

	/**
	* 批量插入
	*/
	@Override
	public boolean insert(List<SimpleDemoEntity> simpleDemoEntitys) {
		return simpleDemoMapper.insertBatch(simpleDemoEntitys);
	}

	/**
	* 更新
	*/
	@Override
	public boolean update(SimpleDemoEntity simpleDemoEntity) {
		return simpleDemoMapper.update(simpleDemoEntity);
	}

	/**
	* 更新
	*/
	@Override
	public boolean update(SimpleDemoEntity simpleDemoEntity, boolean isSetNull) {
		return simpleDemoMapper.updateSetNull(simpleDemoEntity, isSetNull);
	}

	/**
	* 批量更新
	*/
	@Override
	public boolean update(List<SimpleDemoEntity> simpleDemoEntitys) {
		return simpleDemoMapper.updateBatch(simpleDemoEntitys);
	}

	/**
	* 批量更新
	*/
	@Override
	public boolean update(List<SimpleDemoEntity> simpleDemoEntitys, boolean isSetNull) {
		return simpleDemoMapper.updateBatchSetNull(simpleDemoEntitys, isSetNull);
	}

	/**
	* 主键删除
	*/
	@Override
	public boolean delete(Long id) {
		return simpleDemoMapper.deleteById(id);
	}

	/**
	* 主键删除
	*/
	@Override
	public boolean delete(SimpleDemoEntity simpleDemoEntity) {
		return simpleDemoMapper.deleteByEntity(simpleDemoEntity);
	}

	/**
	* 主键批量删除
	*/
	@Override
	public boolean delete(List<Long> ids) {
		return simpleDemoMapper.deleteByIds(ids);
	}

	/**
	* 批量删除
	*/
	@Override
	public boolean deletes(List<SimpleDemoEntity> simpleDemoEntitys) {
		return simpleDemoMapper.deleteBatch(simpleDemoEntitys);
	}
}