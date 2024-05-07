package org.kosa.hello.entity;

import org.springframework.web.multipart.MultipartFile;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BoardVO {
	
	private String bno;
	private String btitle;
	private String bcontent;
	private String member_id;
	private String bdate;
	private String view_count;
	private String bwriter;
	private String board_token;
	
	//업로드 파일 
	private MultipartFile file;
	
	public void setBoardFileVO(BoardFileVO boardFileVO) {
		// TODO Auto-generated method stub
		
	}
	public String getBoard_token() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
