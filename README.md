
## 关于 ServletRegistrationBean

背景：

- 一个默认的 DispatcherServlet
- 基于 ServletRegistrationBean 配置 app 和 api 两个Servlet

请求：

- http://localhost:2222/x
- http://localhost:2222/api/a
- http://localhost:2222/app/b

问题:

1. 请求匹配 Servlet 的逻辑？
2. 当前代码的问题是什么？