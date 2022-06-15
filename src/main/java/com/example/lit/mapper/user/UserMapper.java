package com.example.lit.mapper.user;

import com.example.lit.domain.vo.user.UserVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserMapper {
    //회원 가입
    public void insert(UserVO userVO);
    //로그인
    public int login(String email, String password);
    //회원 탈퇴
    public void delete(Long userNumber);
    //내 정보 가져 오기
    public UserVO getUser(Long userNumber);
    //내 정보 수정
    public void update(UserVO userVO);
    //비밀 번호 변경
    public void updatePw(@Param("userVO") UserVO userVO, @Param("newPassword") String newPassword);
    // 대표 메달 설정
    public void updateMedal(UserVO userVO);


}