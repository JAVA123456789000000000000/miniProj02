package org.kosa.hello;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.kosa.hello.entity.BoardImageFileVO;
import org.kosa.hello.entity.BoardVO;

@Mapper
public interface BoardImageFileMapper {

	int insert(BoardImageFileVO boardImageFileVO);
	BoardImageFileVO findById(String board_image_file_id);
	int updateBoardNo(BoardVO board);

	//스케줄러에서 임시 파일 삭제를 위한 목록(파일 삭제을 목록)을 얻는다  
	public List<BoardImageFileVO> getBoardImageFileList(Map<String, Object> map);

	//스케줄러에서 임시 파일 삭제을 삭제한다  
	public int deleteBoardToken(Map<String, Object> map);
	
	//게시물 완료 시 token관련 첨부 파일 목록을 얻는다  
	public List<BoardImageFileVO> getBoardImages(String board_token);
	
	
	//게시물 완료 시 임시 파일 삭제을 삭제한다  
	public int deleteBoardImageFiles(Map<String, Object> map);
	
	
}
