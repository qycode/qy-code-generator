package qy.generator.demo.service.impl;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.qy.code.generator.query.Query;
import qy.generator.demo.entity.LogicDeleteDemoEntity;
import qy.generator.demo.mapper.LogicDeleteDemoMapper;
import qy.generator.demo.service.LogicDeleteDemoService;
@Service
public class LogicDeleteDemoServiceImpl implements LogicDeleteDemoService{
	@Autowired
	private LogicDeleteDemoMapper logicDeleteDemoMapper;

	/**
	* Query查询
	*/
	@Override
	public List<LogicDeleteDemoEntity> select(Query query) {
		return logicDeleteDemoMapper.selectByQuery(query);
	}

	/**
	* 主键查询
	*/
	@Override
	public LogicDeleteDemoEntity select(Long id) {
		return logicDeleteDemoMapper.selectById(id);
	}

	/**
	* 主键查询
	*/
	@Override
	public List<LogicDeleteDemoEntity> select(List<Long> ids) {
		return logicDeleteDemoMapper.selectByIds(ids);
	}

	/**
	* 查询
	*/
	@Override
	public List<LogicDeleteDemoEntity> select(Map<String,Object> map) {
		return logicDeleteDemoMapper.selectByMap(map);
	}

	/**
	* 插入
	*/
	@Override
	public boolean insert(LogicDeleteDemoEntity logicDeleteDemoEntity) {
		return logicDeleteDemoMapper.insert(logicDeleteDemoEntity);
	}

	/**
	* 批量插入
	*/
	@Override
	public boolean insert(List<LogicDeleteDemoEntity> logicDeleteDemoEntitys) {
		return logicDeleteDemoMapper.insertBatch(logicDeleteDemoEntitys);
	}

	/**
	* 更新
	*/
	@Override
	public boolean update(LogicDeleteDemoEntity logicDeleteDemoEntity) {
		return logicDeleteDemoMapper.update(logicDeleteDemoEntity);
	}

	/**
	* 更新
	*/
	@Override
	public boolean update(LogicDeleteDemoEntity logicDeleteDemoEntity, boolean isSetNull) {
		return logicDeleteDemoMapper.updateSetNull(logicDeleteDemoEntity, isSetNull);
	}

	/**
	* 批量更新
	*/
	@Override
	public boolean update(List<LogicDeleteDemoEntity> logicDeleteDemoEntitys) {
		return logicDeleteDemoMapper.updateBatch(logicDeleteDemoEntitys);
	}

	/**
	* 批量更新
	*/
	@Override
	public boolean update(List<LogicDeleteDemoEntity> logicDeleteDemoEntitys, boolean isSetNull) {
		return logicDeleteDemoMapper.updateBatchSetNull(logicDeleteDemoEntitys, isSetNull);
	}

	/**
	* 主键删除
	*/
	@Override
	public boolean delete(Long id) {
		return logicDeleteDemoMapper.deleteById(id);
	}

	/**
	* 主键删除
	*/
	@Override
	public boolean delete(LogicDeleteDemoEntity logicDeleteDemoEntity) {
		return logicDeleteDemoMapper.deleteByEntity(logicDeleteDemoEntity);
	}

	/**
	* 主键批量删除
	*/
	@Override
	public boolean delete(List<Long> ids) {
		return logicDeleteDemoMapper.deleteByIds(ids);
	}

	/**
	* 批量删除
	*/
	@Override
	public boolean deletes(List<LogicDeleteDemoEntity> logicDeleteDemoEntitys) {
		return logicDeleteDemoMapper.deleteBatch(logicDeleteDemoEntitys);
	}
}