package co.micol.prj.board.serviceImpl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import co.micol.prj.board.service.BoardMapper;
import co.micol.prj.board.service.BoardService;
import co.micol.prj.board.service.BoardVO;
import co.micol.prj.comm.DataSource;

public class BoardServiceImpl implements BoardService {
	private SqlSession sqlSession = DataSource.getInstance().openSession(true);
	private BoardMapper map = sqlSession.getMapper(BoardMapper.class);
	// 사실상 여기서 모든 작업이 이뤄지게 되는데...
		/*
		 * 
		 * sqlSession : sqlSessionFactory를 통해서 만들 수 있는 친구.
		 * sqlSesssionFacotry.openSession = sqlSession을 열어주는 것. 
		 * sqlSession = 실제로 우리가 SQL이랑 연동하 ㄹ대 db에서 처리하는 명령어들을 실행시켜주는 친구.
		 */
	@Override
	public List<BoardVO> boardSelectList() {
		return map.boardSelectList();
	}

	@Override
	public BoardVO boardSelect(BoardVO vo) {
		vo = map.boardSelect(vo);
		if (vo != null) {
			map.updateHit(vo.getBId());
		}
		return vo;
	}

	@Override
	public int boardInsert(BoardVO vo) {
		return map.boardInsert(vo);
	}

	@Override
	public int boardUpdate(BoardVO vo) {
		return map.boardUpdate(vo);
	}

	@Override
	public int boardDelete(BoardVO vo) {
		return map.boardDelete(vo);
	}

	@Override
	public List<BoardVO> boardSelecList() {
		return null;
	}

}