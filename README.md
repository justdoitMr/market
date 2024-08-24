# 笔记

## 系统表结构设计

首先梳理出系统的业务流程，业务流程是指用户的行为动作流程，将用户的行为流程抽象成流程图。

抽奖系统映射出的领域模型，按照DDD拆分系统的原则，对业务进行领域划分：

- 活动领域：活动领域下面有库存数据，所以 因为活动需要修改库存数据，所以将库存作为一个子领域
- 抽奖策略：用户抽奖的规则
  - 子领域规则：抽奖多少次才解锁，所以需要给每一个抽奖策略配置一个子领域来限制。
- 活动账户：抽奖后给账户增加运气值 积分等。
- 奖品领域：抽奖后获取具体的奖品




## Docker-compose

容器编排工具