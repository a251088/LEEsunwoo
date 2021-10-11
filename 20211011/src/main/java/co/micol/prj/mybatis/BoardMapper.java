package co.micol.prj.mybatis;

import java.util.List;

import co.micol.prj.board.service.BoardVO;

public interface BoardMapper {
	List<BoardVO> boardSelectList(); //��ü��� ��������
	BoardVO boardSelect(BoardVO board); //�Ѱ� �� ��ȸ
	int boardInsert(BoardVO board); //�Խñ� ���
	int boardUpdate(BoardVO board); //�Խñ� ����
	int boardDelete(BoardVO board); //�Խñ� ����
}
