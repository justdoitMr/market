package bugcode.online.test.infrastructure;

import bugcode.online.infrastructure.persistent.dao.IAwarDao;
import bugcode.online.infrastructure.persistent.po.Award;
import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

/**
 * className: IAwarDaoTest
 * description:
 * author: MrR
 * date: 2024/8/23 10:01
 * version: 1.0
 */
@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class IAwarDaoTest {

    @Resource
    private IAwarDao iAwarDao;

    @Test
    public void test_queryAwardList() {
        List<Award> awards = iAwarDao.queryAwardList();
        log.info("测试结果：{}", JSON.toJSONString(awards));
    }


}
