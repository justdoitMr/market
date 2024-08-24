package bugcode.online.infrastructure.persistent.po;

import lombok.Data;

import java.util.Date;


@Data
public class Strategy {

    private Long id;

    private Long strategyId;

    private String strategyDesc;

    private Date createTm;

    private Date updateTm;

}
