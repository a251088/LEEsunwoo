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
		MemberVO member = new MemberVO();
		System.out.println("*******************");
		System.out.println("조회할 ID를 입력하세요.");
		member.setId(GB.sc.nextLine());GB.sc.nextLine();
		member = memberDao.memberSelect(member);
		if(member!=null) {
			member.toString();
		}else {
			System.out.println("존재하지 않는 ID 입니다.");
		}
		System.out.println("*******************************");
	}

}
