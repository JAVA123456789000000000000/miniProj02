package org.kosa.hello;


import lombok.RequiredArgsConstructor;

import org.kosa.hello.entity.MemberVO;
import org.kosa.hello.member.MemberService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class MemberController {
	
	 private final MemberService memberService;

	    @GetMapping("/")
	    public String root() {
	        return "index";
	    }
	    
	    @GetMapping("/member/updateForm")
	    public String member() {
	        return "member/updateForm";
	    }

	   
	    @GetMapping("/register")
	    public String registerForm() {
	        return "register";
	    }

	    
	    @PostMapping("/register")
	    public String register(MemberVO member) {
	        memberService.joinMember(member);
	        return "redirect:/register";
	    }
	}
	


