package com.gd.dzh.mapper;

import com.gd.dzh.domain.VRoomorder;
import com.gd.dzh.domain.VRoomorderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VRoomorderMapper {
    long countByExample(VRoomorderExample example);

    int deleteByExample(VRoomorderExample example);

    int insert(VRoomorder record);

    int insertSelective(VRoomorder record);

    List<VRoomorder> selectByExample(VRoomorderExample example);

    int updateByExampleSelective(@Param("record") VRoomorder record, @Param("example") VRoomorderExample example);

    int updateByExample(@Param("record") VRoomorder record, @Param("example") VRoomorderExample example);
}