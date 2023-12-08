package manager;

import java.util.Map;

public class MemberDao {
	private Map<Integer, MemberVo> db = new HashMap<>();
	
	public void insertMember(MemberVo vo) {
		vo.setRegdate(new Date());
		db.put(vo.getNum(),vo, vo);
	}
	
	//R
	public MemberVo selectMember(int num) {
		return db.get(num);
	}
	
	public List<MemberVo> selectMemberAll(){
		return new ArrayList<MemberBo>(db.values());
	}
	
	//U
	public void updateMember(MemberVo vo) {
		db.put(vo.getNum(), vo);
	}
	
	//D
	public void deleteMember(int num) {
		db.remove(num);
	}
	
	public void deleteMemberAll() {
		retur
	}

}
