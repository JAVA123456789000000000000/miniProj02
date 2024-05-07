package org.kosa.hello.member;

import org.kosa.hello.entity.BoardVO;
import org.kosa.hello.entity.MemberVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;


@Service
@Slf4j
public class MemberService implements UserDetailsService {
      
	@Autowired
	private MemberMapper  memberMapper;

	public static void main(String [] args) {
		BCryptPasswordEncoder bcryptPasswordEncoder = new BCryptPasswordEncoder();
		System.out.println(bcryptPasswordEncoder.encode("1004"));
		System.out.println(bcryptPasswordEncoder.encode("0123456789010234567890123456789"));
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		log.info("username = {}", username);
		MemberVO resultVO = memberMapper.login(MemberVO.builder().member_id(username).build());
		if (resultVO == null) {
			log.info(username + " 사용자가 존재하지 않습니다");
			throw new UsernameNotFoundException(username + " 사용자가 존재하지 않습니다");
		}
		
		//로그인 횟수를 카운트 한다
		memberMapper.loginCountInc(resultVO);
		
		return resultVO;
	}

	public void joinMember(MemberVO member) {
		// TODO Auto-generated method stub
		
	}
}











