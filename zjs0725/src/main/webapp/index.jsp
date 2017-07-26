<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
     
	<link rel="stylesheet" type="text/css" href="static/bootstrap-3.3.7-dist/css/bootstrap.min.css">
		<script type="text/javascript" src="static/js/jquery-3.2.1.js"></script>
	<script type="text/javascript" src="static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>

	<script type="text/javascript" src="static/js/angular.min.js"></script>
	   
	<script type="text/javascript">
	     var app = angular.module("app",[]);
	     
	    app.controller("MyController",["$scope","$http",function($scope,$http){
	    alert(11);
	    $scope.selectAll=function(){
	    
	    $http({
		method: "GET",
		url: "department/select",
		dataType:"json"
	  }).then(function successCallback(response) {
			$scope.AllList = response.data;
			alert($scope.AllList);
		},function errorCallback(response){
			
	   });
	    
	    };
	    
	    $scope.selectAll();
	 
	 
	 }]);
	    
	      
	</script>
  </head>
  
  <body ng-app="app" ng-controller="MyController">
    <table class="table table-bordered">
	<caption>边框表格布局</caption>
	<thead>
		<tr>
		    <th>编号</th>
			<th>姓名</th>
			<th>级别</th>
			<th>部门</th>
		</tr>
	</thead>
	<tbody>
		<tr ng-repeat="a in AllList">
			<td>{{a.eid}}</td>
			<td>{{a.ename}}</td>
			<td ><div ng-if="a.level==1">高级工程师</div>
			<div ng-if="a.level==2">中级工程师</div>
			<div ng-if="a.level==3">初级工程师</div>
			</td> 
			<td>{{a.department.dname}}</td>
		</tr>
		
	</tbody>
</table>
  </body>
</html>
