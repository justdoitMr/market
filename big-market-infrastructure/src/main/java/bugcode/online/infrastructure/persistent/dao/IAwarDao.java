package bugcode.online.infrastructure.persistent.dao;


import bugcode.online.infrastructure.persistent.po.Award;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 *
 * @author yourname
 * @date 9:31 2024/8/23
 * @param null
 * @return null
 **/
@Mapper
public interface IAwarDao {

    /**
     * 查询奖品列表
     * @author yourname
     * @date 9:37 2024/8/23
     * @return java.util.List<bugcode.online.infrastructure.persistent.po.Award>
     **/
    List<Award> queryAwardList();
}
