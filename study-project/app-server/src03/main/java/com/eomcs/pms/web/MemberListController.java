package com.eomcs.pms.web;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.eomcs.pms.domain.Member;
import com.eomcs.pms.service.MemberService;

@Controller
public class MemberListController {

  public static String requestMapping = "/member/list"; // 이런 요청에 연결할거다!
  MemberService memberService;

  public MemberListController(MemberService memberService) {
    this.memberService = memberService;
  }

  @RequestMapping
  public String List(HttpServletRequest request, HttpServletResponse response) throws Exception {

    response.setContentType("text/html;charset=UTF-8");
    List<Member> list = memberService.list();

    request.setAttribute("list", list);
    return "/member/list.jsp";
  }
}
