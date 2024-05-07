package org.kosa.hello;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.kosa.hello.entity.BoardVO;
import org.kosa.hello.entity.CodeVO;
import org.kosa.hello.entity.PageRequestVO;

@Mapper
public interface CodeMapper {

	List<CodeVO> getList();
}
