package org.kosa.hello;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.kosa.hello.entity.BoardVO;
import org.kosa.hello.entity.PageRequestVO;

@Mapper
public interface BoardMapper {

	List<BoardVO> getList(PageRequestVO pageRequestVO);
	int  getTotalCount(PageRequestVO pageRequestVO);
	BoardVO view(BoardVO boardVO);
	int incViewCount(BoardVO boardVO);
	int delete(BoardVO boardVO);
	int update(BoardVO boardVO);
	void allDelete();
	int insert(BoardVO boardVO);

}
