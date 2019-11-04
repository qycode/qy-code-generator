package qy.generator.demo.service.impl;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.qy.code.generator.query.Query;
import qy.generator.demo.entity.CompositeDemoEntity;
import qy.generator.demo.mapper.CompositeDemoMapper;
import qy.generator.demo.service.CompositeDemoService;
@Service
public class CompositeDemoServiceImpl implements CompositeDemoService{
	@Autowired
	private CompositeDemoMapper compositeDemoMapper;

	/**
	* Query查询
	*/
	@Override
	public List<CompositeDemoEntity> select(Query query) {
		return compositeDemoMapper.selectByQuery(query);
	}

	/**
	* 主键查询
	*/
	@Override
	public CompositeDemoEntity select(Integer userId, Integer roleId) {
		return compositeDemoMapper.selectById(userId, roleId);
	}

	/**
	* 查询
	*/
	@Override
	public List<CompositeDemoEntity> select(Map<String,Object> map) {
		return compositeDemoMapper.selectByMap(map);
	}

	/**
	* 插入
	*/
	@Override
	public boolean insert(CompositeDemoEntity compositeDemoEntity) {
		return compositeDemoMapper.insert(compositeDemoEntity);
	}

	/**
	* 批量插入
	*/
	@Override
	public boolean insert(List<CompositeDemoEntity> compositeDemoEntitys) {
		return compositeDemoMapper.insertBatch(compositeDemoEntitys);
	}

	/**
	* 更新
	*/
	@Override
	public boolean update(CompositeDemoEntity compositeDemoEntity) {
		return compositeDemoMapper.update(compositeDemoEntity);
	}

	/**
	* 更新
	*/
	@Override
	public boolean update(CompositeDemoEntity compositeDemoEntity, boolean isSetNull) {
		return compositeDemoMapper.updateSetNull(compositeDemoEntity, isSetNull);
	}

	/**
	* 批量更新
	*/
	@Override
	public boolean update(List<CompositeDemoEntity> compositeDemoEntitys) {
		return compositeDemoMapper.updateBatch(compositeDemoEntitys);
	}

	/**
	* 批量更新
	*/
	@Override
	public boolean update(List<CompositeDemoEntity> compositeDemoEntitys, boolean isSetNull) {
		return compositeDemoMapper.updateBatchSetNull(compositeDemoEntitys, isSetNull);
	}

	/**
	* 主键删除
	*/
	@Override
	public boolean delete(Integer userId, Integer roleId) {
		return compositeDemoMapper.deleteById(userId, roleId);
	}

	/**
	* 主键删除
	*/
	@Override
	public boolean delete(CompositeDemoEntity compositeDemoEntity) {
		return compositeDemoMapper.deleteByEntity(compositeDemoEntity);
	}
}