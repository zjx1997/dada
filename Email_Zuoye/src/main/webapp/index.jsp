<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
       <!-- 包含头部信息用于适应不同设备 -->
    <meta name="viewport" content="width=device-width, initial-scale=1">
<!-- 引入bootstrap的css样式 -->
	<link rel="stylesheet" type="text/css" href="static/bootstrap-3.3.7-dist/css/bootstrap.min.css">
     <!-- JavaScript 放置在文档最后面可以使页面加载速度更快 -->
    <!-- 可选: 包含 jQuery 库 -->
   <!-- 引入jquery -->
    <script type="text/javascript" src="static/js/jquery-3.2.1.js"></script>
    
    <!-- 引入bootstrap的js文件 -->
    
    <script type="text/javascript" src="static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
	<script type="text/javascript"  src="static/angular/angular.min.js"></script>
   
    <script type="text/javascript">
   
     var app = angular.module("app",[]);
     app.controller("controllers",["$scope","$http",function($scope,$http){
    
		$http({
		    method:"GET",
			url:"test/selectByExample",
			dataType:"json"
		}).then(function successCallback(response) {
				$scope.emailList = response.data;
				  
	   });
		//全选复选框的flag
		$scope.flag=false;
		$scope.checkAll = function(){
		   $scope.flag=!$scope.flag;
		   angular.element(".checkbox").prop("checked",$scope.flag);
		};	
		//校验全选状态
		$scope.checkOne = function(){
		    //普通复选框的个数
		    var num = angular.element(".checkbox").length;
		    
		    //普通复选框被选中的个数
		    var checkedNum = angular.element(".checkbox:checked").length;
		    
		    //通过判断复选框的个数是否与被选中的个数一致来决定全选框的状态
				$scope.flag = (num == checkedNum);
		};
		
		
     }]);
     </script>
     
  </head>
    
  <body ng-app="app" ng-controller="controllers">
  <nav class="navbar navbar-default col-xs-6 col-md-offset-3" role="navigation">
    <div class="container-fluid">
    <div class="navbar-header">
        <h3 style="color: gray">我的邮箱页面</h3>
        </div>
            <div class="col-xs-6 col-md-offset-5">
		                 <form>
			                 <select id="selectOp">
			                   <option>---请选择---</option>
			                   <option>已读邮箱</option>
			                   <option>未读邮箱</option>
			                 </select>
		                 </form>
              </div>
    </div>
    </nav>
    <div class="col-xs-8 col-md-offset-3">
	   <table class="table" >
	  <thead>
	    <tr>
	      <th><span class="glyphicon glyphicon-user"></span></th>
	      <th><button type="button" class="btn btn-success" >批量设为已读</button></th>
	      <th><button type="button" class="btn btn-danger" ng-click="deleteAll()">批量删除</button></th>
	      <th><button type="button" class="btn btn-primary">按时间升序排序</button></th>
	      <th><button type="button" class="btn btn-info">按时间降序排序</button></th>
	      </tr>
	    <tr>
	     <th>  <input type="checkbox" class="checkAll" ng-click="checkAll()" ng-checked="flag"></th>
	     <th ng-hide="true">编号</th>
	     <th>发件人</th>
	     <th>阅读状态</th>
	     <th>邮件标题</th>
	     <th>发件时间</th>
	      </tr>
	  </thead>
	 
	  <tbody>
	        
		    <tr class="active" ng-repeat="list in emailList">
		    <th><input type="checkbox" class="checkbox" ng-click="checkOne()"></th>
		            <th ng-hide="true">{{list.sendId}}</th>
				    <th>{{list.sendName}}</th>
				    <th ng-if="list.sendRead=='a' "><span class="glyphicon glyphicon-envelope"></span></th>
				    <th ng-if="list.sendRead=='b' "><span class="glyphicon glyphicon-ok"></span></th>
				    <th>{{list.sendTitle}}</th>
				    <th>{{list.sendTime | date:"yyyy-MM-dd"}}</th>
		    </tr>
		    
	  </tbody>
	</table>
</div>
  </body>
</html>
