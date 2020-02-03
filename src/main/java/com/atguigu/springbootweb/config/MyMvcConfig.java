package com.atguigu.springbootweb.config;

//mvc配置类
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
//@enableWebMvc  就是完全掌控springmvc  springboot的配置就不会生效

@Configuration
public class MyMvcConfig extends WebMvcConfigurerAdapter {
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        //super.addViewControllers(registry);
        //浏览器发送@硅谷请求来到请求页面
        registry.addViewController("/atguigu").setViewName("success");
    }


    //所有的WebMvcConfigurerAdapter组件都会一起起作用
    @Bean  //将组建注册再容器
    public WebMvcConfigurerAdapter webMvcConfigurerAdapter()
    {
        WebMvcConfigurerAdapter adapter=new  WebMvcConfigurerAdapter(){
            @Override
            public void addViewControllers(ViewControllerRegistry registry) {
                registry.addViewController("/index.html").setViewName("login");
            }

          /*  //注册拦截器
            @Override
            public void addInterceptors(InterceptorRegistry registry) {
                registry.addInterceptor().addPathPatterns("/**").excludePathPatterns("/index.html")
            }
*/
        };


        return adapter;
    }

}
