package qy.generator.demo.service.impl;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.qy.code.generator.query.Query;
import qy.generator.demo.entity.CommentDemoEntity;
import qy.generator.demo.mapper.CommentDemoMapper;
import qy.generator.demo.service.CommentDemoService;
@Service
public class CommentDemoServiceImpl implements CommentDemoService{
	@Autowired
	private CommentDemoMapper commentDemoMapper;

	/**
	* Query查询
	*/
	@Override
	public List<CommentDemoEntity> select(Query query) {
		return commentDemoMapper.selectByQuery(query);
	}

	/**
	* 主键查询
	*/
	@Override
	public CommentDemoEntity select(Long id) {
		return commentDemoMapper.selectById(id);
	}

	/**
	* 主键查询
	*/
	@Override
	public List<CommentDemoEntity> select(List<Long> ids) {
		return commentDemoMapper.selectByIds(ids);
	}

	/**
	* 查询
	*/
	@Override
	public List<CommentDemoEntity> select(Map<String,Object> map) {
		return commentDemoMapper.selectByMap(map);
	}

	/**
	* 插入
	*/
	@Override
	public boolean insert(CommentDemoEntity commentDemoEntity) {
		return commentDemoMapper.insert(commentDemoEntity);
	}

	/**
	* 批量插入
	*/
	@Override
	public boolean insert(List<CommentDemoEntity> commentDemoEntitys) {
		return commentDemoMapper.insertBatch(commentDemoEntitys);
	}

	/**
	* 更新
	*/
	@Override
	public boolean update(CommentDemoEntity commentDemoEntity) {
		return commentDemoMapper.update(commentDemoEntity);
	}

	/**
	* 更新
	*/
	@Override
	public boolean update(CommentDemoEntity commentDemoEntity, boolean isSetNull) {
		return commentDemoMapper.updateSetNull(commentDemoEntity, isSetNull);
	}

	/**
	* 批量更新
	*/
	@Override
	public boolean update(List<CommentDemoEntity> commentDemoEntitys) {
		return commentDemoMapper.updateBatch(commentDemoEntitys);
	}

	/**
	* 批量更新
	*/
	@Override
	public boolean update(List<CommentDemoEntity> commentDemoEntitys, boolean isSetNull) {
		return commentDemoMapper.updateBatchSetNull(commentDemoEntitys, isSetNull);
	}

	/**
	* 主键删除
	*/
	@Override
	public boolean delete(Long id) {
		return commentDemoMapper.deleteById(id);
	}

	/**
	* 主键删除
	*/
	@Override
	public boolean delete(CommentDemoEntity commentDemoEntity) {
		return commentDemoMapper.deleteByEntity(commentDemoEntity);
	}

	/**
	* 主键批量删除
	*/
	@Override
	public boolean delete(List<Long> ids) {
		return commentDemoMapper.deleteByIds(ids);
	}

	/**
	* 批量删除
	*/
	@Override
	public boolean deletes(List<CommentDemoEntity> commentDemoEntitys) {
		return commentDemoMapper.deleteBatch(commentDemoEntitys);
	}
}