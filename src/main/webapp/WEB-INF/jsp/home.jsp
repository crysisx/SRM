<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://shiro.apache.org/tags" prefix="shiro" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>尚学堂-百战程序员</title>
	<link rel="stylesheet" type="text/css" href="easyui/themes/default/easyui.css">
	<link rel="stylesheet" type="text/css" href="easyui/themes/icon.css">
	<link rel="stylesheet" type="text/css" href="easyui/demo.css">
	<script type="text/javascript" src="easyui/jquery.min.js"></script>
	<script type="text/javascript" src="easyui/jquery.easyui.min.js"></script>
	<script type="text/javascript" src="easyui/locale/easyui-lang-zh_CN.js"></script>
	
	<style type="text/css">
	
	.topNav
    {
        position:absolute;right:8px;top:12px;        
        font-size:14px;
    }
    .topNav a
    {
        text-decoration:none;        
        font-weight:normal;
        font-size:12px;
        margin-left:3px;
        margin-right:3px;
        color:#333;        
    }
    .topNav a:hover
    {
        text-decoration:underline;        
    }
    
    #tt a{
    	text-decoration:none;
    	color:#000;
    }   
	</style>
</head>
<body class="easyui-layout">
		<!-- 顶部  Logo -->
		<div data-options="region:'north',border:true,split:true"
			style="height: 100px;background: url(img/logo.png) no-repeat 0% 50%;  ">
			
			<div class="topNav" style="border: 0px red solid; width: 230px; height: 80px; line-height:80px; float: right;">
				<a href="https://www.itbaizhan.com/" target="_blank" style="color:red">百战程序员</a>  | 
				 <a href="#"><shiro:principal property="nickname"></shiro:principal></a> | 
				<a href="logout.do"> 安全退出 </a>
			</div>
			
		</div>
		<!-- 右侧  菜单栏 -->
		<div data-options="region:'west',title:'导航栏',split:true"
			style="width: 180px;">
			    <ul id="tt" class="easyui-tree">
			        <li>
			    		<span>系统管理</span>
			    		<ul>
			    			<li>
			    				<a href="javascript:void(0)" onclick="goTabs('/sys/user/user','用户管理')"><span>用户管理</span></a>
			    				
			    			</li>
			    			<li>
			    				<a href="javascript:void(0)" onclick="goTabs('/sys/role/role','角色管理')"><span>角色管理</span></a>
			    				
			    			</li>
			    			<!-- <li>
			    				<a href="javascript:void(0)" onclick="goTabs('user/user')"><span>菜单管理</span></a>
			    			</li> -->
			    		</ul>
			    	</li>
			        <li>
						<span>教学管理</span>
			    		<ul>
			    			<li>
			    				<a href="javascript:void(0)" onclick="goTabs('teach/classes/classes','班级管理')"><span>班级管理</span></a>
			    				
			    			</li>
			    			<li>
			    				<a href="javascript:void(0)" onclick="goTabs('teach/student/student','学生管理')"><span>学生管理</span></a>
			    				
			    			</li>
			    		</ul>
					</li>
					<li>
						<span>博客管理</span>
			    		<ul>
			    			<li>
			    				<a href="javascript:void(0)" onclick="goTabs('blogs/blogsType/blogs_type','类型管理')"><span>类型管理</span></a>
			    				
			    			</li>
			    			<li>
			    				<a href="javascript:void(0)" onclick="goTabs('blogs/blogs/blogs','博客管理')"><span>博客管理</span></a>
			    				
			    			</li>
			    		</ul>
					</li>
			    </ul>
		</div>
		<!-- 中间  内容主体 -->
		<div data-options="region:'center',border:false"
			style="padding: 0px; background: #eee;">
			    <div id="tabs" class="easyui-tabs" data-options="fit:true" style="width:500px;height:250px;">
			        <div title="首页" style="padding:20px;display:none;">
			    		欢迎光临
			        </div>
			    </div>
		</div>
		
		<script type="text/javascript">
			function goTabs(path,title){
				// 动态添加一个标签页
			    // 添加一个新的标签页面板（tab panel）
			    $('#tabs').tabs('add',{
			        title:title,
			        content:'<iframe src="'+path+'" width="100%" height="100%" style="border: 0px;"></iframe>',
			        closable:true
			    });
			}
			
		</script>
		
		
</body>
</html>