# bootdubbo
dubbo 是 SOA 时代的产物，关注点主要在于服务的调用，流量分发、流量监控和熔断等；
而 Spring Cloud 诞生于微服务架构时代,考虑的是微服务治理的方方面面。

本工程采用SpringBoot+Dubbo+zookeeper搭建rpc远程服务调用开发示例

# 版本信息：
    springboot: 2.7.8
    dubbo: 3.1.7
    zookeeper: 3.5.10
# 模块说明：
    common: 工程通用module，存放util工具类，统一接口响应、异常封装
    model: 存放实体类，vo、dto对象等
    dubbo-api-service: 存放服务接口定义
    service: 服务实现module
    dubbo-consumer-web: 消费方服务调用web
    dubbo-provider-web: 服务提供方web

