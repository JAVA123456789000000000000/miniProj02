package org.kosa.hello;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.kosa.hello.entity.BoardFileVO;
import org.kosa.hello.entity.BoardVO;
import org.kosa.hello.entity.PageRequestVO;

@Mapper
public interface BoardFileMapper {

	List<BoardFileVO> getList(BoardVO boardVO);
	BoardFileVO getBoardFile(int board_file_no);
	BoardFileVO getBoardFileVO(BoardVO boardVO);
	int delete(BoardFileVO boardFileVO);
	int insert(BoardFileVO boardFileVO);

}
