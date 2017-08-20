#watershed
###项目介绍
本项目为本人与某研究所合作开发的系统V1.0，主要是（1）数据展示和（2）计算模型交互
###项目实现简介
1. spring做容器
1. springMVC做MVC控制
1. shiro实现项目的安全管理,拦截器,角色管理等
1. mybatis作为orm对数据库进行操作
1. Apache CXF 作为WebService框架
1. EasyUI、Bootstrap作为前台框架
1. log4j做日志输出

###MyBatis
####MyBatis配置
```xml
<!-- spring和MyBatis完美整合，不需要mybatis的配置映射文件 -->
<bean id="sqlSessionFactory" class="org.mybatis.spring.SqlSessionFactoryBean">
    <property name="dataSource" ref="dataSource" />
	<!-- 自动扫描mapping.xml文件 -->
	<property name="mapperLocations" value="classpath:com/smates/dbc2/xml/*.xml"></property>
	<property name="typeAliasesPackage" value="com.smates.dbc2.po,com.smates.dbc2.vo" />
</bean>

<!-- DAO接口所在包名，Spring会自动查找其下的类 -->
<bean class="org.mybatis.spring.mapper.MapperScannerConfigurer">
	<property name="basePackage" value="com.smates.dbc2.mapper" />
	<property name="sqlSessionFactoryBeanName" value="sqlSessionFactory"></property>
</bean>
```
###FreeMarker
####FreeMarker配置
```xml
<!-- 配置freeMarker的模板路径 -->
<bean id="freemarkerConfig"
	class="org.springframework.web.servlet.view.freemarker.FreeMarkerConfigurer">
	<property name="templateLoaderPath">
		<value>/</value>
	</property>
	<property name="freemarkerVariables">
		<map>
			<entry key="xml_escape" value-ref="fmXmlEscape" />
		</map>
	</property>
	<property name="freemarkerSettings">
		<props>
			<prop key="tag_syntax">auto_detect</prop>
			<prop key="template_update_delay">100000000</prop>
			<prop key="default_encoding">UTF-8</prop>
			<prop key="output_encoding">UTF-8</prop>
			<prop key="url_escaping_charset">UTF-8</prop>
			<prop key="locale">zh_CN</prop>
			<prop key="date_format">yyyy-MM-dd</prop>
			<prop key="time_format">HH:mm:ss</prop>
			<prop key="datetime_format">yyyy-MM-dd HH:mm:ss</prop>
			<prop key="number_format">0.###############</prop>
			<prop key="classic_compatible">true</prop>
			<!--  
			<prop key="auto_include">templates/Page.ftl</prop>
			-->
		</props>
	</property>
</bean>

<bean id="fmXmlEscape" class="freemarker.template.utility.XmlEscape" />

<!-- 配置freeMarker视图解析器 -->
<bean id="freeMarkerViewResolver"
	class="org.springframework.web.servlet.view.freemarker.FreeMarkerViewResolver">
	<property name="viewNames" value="*.ftl" />
	<property name="contentType" value="text/html; charset=utf-8" />
	<property name="cache" value="true" />
	<property name="prefix" value="" />
	<property name="suffix" value="" />
	<property name="order" value="2" />
	<property name="requestContextAttribute" value="rc" />
</bean>
```
###Apache CXF
####CXF配置
```xml
<!-- 引入CXF核心配置 -->
<import resource="classpath:META-INF/cxf/cxf.xml"/>
<import resource="classpath:META-INF/cxf/cxf-extension-soap.xml"/>
	
<!--  声明远端服务 -->
<jaxws:client id="RisDSSModelServiceImplService"
	serviceClass="com.smates.dbc2.ws.RisDSSModelService"
	address="http://localhost:8080/Webservice-Demo/RisDSSModelServiceWS">
</jaxws:client>
```

###shiro
####shiro配置
```xml
<!-- 配置缓存管理器 -->
<bean id="cacheManager" class="org.apache.shiro.cache.ehcache.EhCacheManager">
    <property name="cacheManagerConfigFile" value="classpath:ehcache.xml" />
</bean>
<!-- 授权和认证的realm -->
<bean id="myrealm" class="com.smates.dbc2.support.shiro.MyRealm"></bean>
<!-- shiro securityManager -->
<bean id="securityManager" class="org.apache.shiro.web.mgt.DefaultWebSecurityManager">
    <property name="cacheManager" ref="cacheManager" />
    <property name="realm" ref="myrealm" />
</bean>
<!-- 后置处理器，会自动调用和spring整合后的组件的生命周期方法 -->
<bean id="lifecycleBeanPostProcessor" class="org.apache.shiro.spring.LifecycleBeanPostProcessor" />
<!-- shiroFilter,id和web.xml一致 -->
<bean id="shiroFilter" class="org.apache.shiro.spring.web.ShiroFilterFactoryBean">
    <property name="securityManager" ref="securityManager" />
    <property name="loginUrl" value="/login.do" />
    <property name="successUrl" value="/home.do" />
    <property name="unauthorizedUrl" value="/logout.do" />
    <property name="filterChainDefinitions">
        <value>
            /admin/*.do = roles[1]  <!-- 角色权限限制 -->
            /logout.do = anon       <!-- 不要登录认证 -->
            /submit.do = anon       <!-- 不要登录认证 -->
            /*.do= authc            <!-- 需要登录认证 -->
        </value>
    </property>
</bean>
```
####项目目前权限说明
|权限值|权限名|
|----|----|
|0|普通用户|
|1|管理员|

####接口说明

1.根据用户输入的气候情景排放类型返回List<TblClimateScenarioYear>
+ 接口名      geTblClimateScenarioYearsByfldCRPType.do
+ 参数         String fldCRPType   气候情景排放类型
+ 结果类型  JSON
