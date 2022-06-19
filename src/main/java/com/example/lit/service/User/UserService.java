package com.example.lit.service.User;

import com.example.lit.domain.vo.SearchDTO;
import com.example.lit.domain.vo.user.*;
import com.example.lit.domain.vo.user.achievement.AchievementVO;

import java.util.List;

public interface UserService {

    //회원 가입
    public void register(UserVO userVO);
    //로그인
    public boolean login(String email, String pw);
    //회원 탈퇴
    public void remove(Long userNumber);
    //내 정보 가져 오기
    public UserVO read(Long userNumber);
    //내 정보 수정
    public void modify(UserVO userVO);
    //비밀 번호 변경
    public void modifyPw(UserVO userVO, String newPassword);
    // 대표 메달 설정
    public void modifyMedal(UserVO userVO);
    //카카오 로그인/회원가입
    public void kakaoRegister(UserVO userVO);
    //이메일 중복체크
    public boolean dbEmailCheck(String email);
    //닉네임 중복체크
    public boolean dbNicknameCheck(String nickname);



    //유저 파일 업로드
    public void registerImg(UserFileVO userFileVO);
    //유저 파일 지우기
    public void removeImg(Long userNumber);
    //유저 파일 수정
    public void modifyImg(UserFileVO userFileVO);
    // 사진
    public UserFileVO getImg(Long userNumber);
    // DB에 없는 이미지 삭제
    public List<UserFileVO> getOldFiles();


    // 팔로우
    public void follow(FollowVO followVO);
    // 팔로우 취소
    public void removeFollow(FollowVO followVO);
    // 팔로잉 카운트 (내가 한 사람)
    public int followingCount(FollowVO followVO);
    // 팔로워 카운트 (다른 사람)
    public int followerCount(FollowVO followVO);


    //메세지 룸 생성
    public void registerMessageRoom(MessageVO messageVO);
    //메세지 리스트 띄우기
    public List<MessageVO> getMessageList(MessageVO messageVO);


    //메달 추가
    public void registerMedal(AchievementVO achievementVO);
    //메달 전체 해금 유무 (?)
    public List<AchievementVO> getMedalList(Long userNumber);
    //메달 하나 보기
    public AchievementVO readMedal(Long userNumber);


    // 관리자 유저 검색
    public List<UserVO> userSearch(SearchDTO searchDTO);
    // 유저 토탈
    public int getTotal();
    // 차트 정보
    public Long getUserChart(String date);
}
