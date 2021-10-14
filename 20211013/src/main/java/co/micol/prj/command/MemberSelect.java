package co.micol.prj.command;

import co.micol.prj.comm.Command;
import co.micol.prj.comm.GB;
import co.micol.prj.member.service.MemberService;
import co.micol.prj.member.service.MemberVO;
import co.micol.prj.member.serviceImpl.MemberServiceImpl;

public class MemberSelect implements Command {

	@Override
	public void execute() {
		MemberService memberDao = new MemberServiceImpl();
		MemberVO vo = new MemberVO();

		if (GB.AUTHOR.equals("ADMIN")) {
			System.out.println("************************");
			System.out.println("!! 조회할 회원의 아이디를 입력하세요.");
			vo.setId(GB.sc.nextLine());
			GB.sc.nextLine();
			vo = memberDao.memberSelect(vo);
			if (vo != null)
				vo.toString();
			else
				System.out.println("존재하지 않는 회원");

		} else {
			vo.setId(GB.ID);
			vo = memberDao.memberSelect(vo);
			vo.toString();
		}
		System.out.println("********************************");
	}
}

//		MemberService memberDao = new MemberServiceImpl();
//		MemberVO member = new MemberVO();
//		System.out.println("*******************");
//		System.out.println("조회할 ID를 입력하세요.");
//		member.setId(GB.sc.nextLine());GB.sc.nextLine();
//		member = memberDao.memberSelect(member);
//		if(member!=null) {
//			member.toString();
//		}else {
//			System.out.println("존재하지 않는 ID 입니다.");
//		}
//		System.out.println("*******************************");

