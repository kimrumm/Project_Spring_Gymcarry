package com.project.gymcarry.mypage.service;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.gymcarry.carry.CarryMypageDto;
import com.project.gymcarry.dao.CarryMyPageDao;
import com.project.gymcarry.dao.MypageDao;
import com.project.gymcarry.mypage.MypageDto;
import com.project.gymcarry.mypage.MypageDto2;
import com.project.gymcarry.mypage.MypagePaymentDto;

@Service
public class MypageService {

	@Autowired
	private SqlSessionTemplate template;

	private MypageDao dao;

	public int memberMemo(MypageDto mypDto) {
		dao = template.getMapper(MypageDao.class);
		return dao.insertMemo(mypDto);
	}

	public int updateMemo(MypageDto mypDto) {
		dao = template.getMapper(MypageDao.class);
		return dao.updateMemo(mypDto);
	}

	public List<MypageDto> selectMemo(String memidx, String infodate, String infotype) {
		dao = template.getMapper(MypageDao.class);
		return dao.selectMemo(memidx, infodate, infotype);
	}

	public List<MypageDto> loadMemo(String arg0, String arg1) {
		dao = template.getMapper(MypageDao.class);
		return dao.loadMemo(arg0, arg1);
	}

	public List<MypageDto2> loadMemo2(int i, String arg1) {
		dao = template.getMapper(MypageDao.class);
		return dao.loadMemo2(i, arg1);
	}
	
	// 캐리마이페이지 달력때문에 은경이 추가 
	public int carrycalendar(List<CarryMypageDto> request){
		dao = template.getMapper(MypageDao.class);
		return dao.carrycalendar(request);
	}
		
	public List<CarryMypageDto> scheduleview(int cridx){
		dao = template.getMapper(MypageDao.class);
		return dao.scheduleview(cridx);
	}
	
	public void deleteschedule(int cridx) {
		dao = template.getMapper(MypageDao.class);
	}
	
}
