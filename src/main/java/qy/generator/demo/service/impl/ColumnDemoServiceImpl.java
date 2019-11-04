package qy.generator.demo.service.impl;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.qy.code.generator.query.Query;
import qy.generator.demo.entity.ColumnDemoEntity;
import qy.generator.demo.mapper.ColumnDemoMapper;
import qy.generator.demo.service.ColumnDemoService;
@Service
public class ColumnDemoServiceImpl implements ColumnDemoService{
	@Autowired
	private ColumnDemoMapper columnDemoMapper;

	/**
	* Query查询
	*/
	@Override
	public List<ColumnDemoEntity> select(Query query) {
		return columnDemoMapper.selectByQuery(query);
	}

	/**
	* 主键查询
	*/
	@Override
	public ColumnDemoEntity select(Long id) {
		return columnDemoMapper.selectById(id);
	}

	/**
	* 主键查询
	*/
	@Override
	public List<ColumnDemoEntity> select(List<Long> ids) {
		return columnDemoMapper.selectByIds(ids);
	}

	/**
	* 查询
	*/
	@Override
	public List<ColumnDemoEntity> select(Map<String,Object> map) {
		return columnDemoMapper.selectByMap(map);
	}

	/**
	* 插入
	*/
	@Override
	public boolean insert(ColumnDemoEntity columnDemoEntity) {
		return columnDemoMapper.insert(columnDemoEntity);
	}

	/**
	* 批量插入
	*/
	@Override
	public boolean insert(List<ColumnDemoEntity> columnDemoEntitys) {
		return columnDemoMapper.insertBatch(columnDemoEntitys);
	}

	/**
	* 更新
	*/
	@Override
	public boolean update(ColumnDemoEntity columnDemoEntity) {
		return columnDemoMapper.update(columnDemoEntity);
	}

	/**
	* 更新
	*/
	@Override
	public boolean update(ColumnDemoEntity columnDemoEntity, boolean isSetNull) {
		return columnDemoMapper.updateSetNull(columnDemoEntity, isSetNull);
	}

	/**
	* 批量更新
	*/
	@Override
	public boolean update(List<ColumnDemoEntity> columnDemoEntitys) {
		return columnDemoMapper.updateBatch(columnDemoEntitys);
	}

	/**
	* 批量更新
	*/
	@Override
	public boolean update(List<ColumnDemoEntity> columnDemoEntitys, boolean isSetNull) {
		return columnDemoMapper.updateBatchSetNull(columnDemoEntitys, isSetNull);
	}

	/**
	* 主键删除
	*/
	@Override
	public boolean delete(Long id) {
		return columnDemoMapper.deleteById(id);
	}

	/**
	* 主键删除
	*/
	@Override
	public boolean delete(ColumnDemoEntity columnDemoEntity) {
		return columnDemoMapper.deleteByEntity(columnDemoEntity);
	}

	/**
	* 主键批量删除
	*/
	@Override
	public boolean delete(List<Long> ids) {
		return columnDemoMapper.deleteByIds(ids);
	}

	/**
	* 批量删除
	*/
	@Override
	public boolean deletes(List<ColumnDemoEntity> columnDemoEntitys) {
		return columnDemoMapper.deleteBatch(columnDemoEntitys);
	}
}