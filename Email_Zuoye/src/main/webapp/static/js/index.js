
  $(function(){
  
               //对新增按钮绑定事件
  			$("#addEmpBtn").click(function(){
  			
  				//通过ajax请求获取部门信息
  				$.ajax({
  					url:"${pageContext.request.contextPath}/employee/selectname",
  					
  					success:function(data){
						//清空下拉框中数据
						$("#addEmpModal select").empty(); 
						
  						//data表示要遍历的集合或数组
  						//index表示下标
  						//obj表示各个元素
  						$.each(data,function(index,obj){
  							//创建option标签
  							var option = $("<option value='"+obj.id+"'>"+obj.dname+"</option>");
  							
  							//添加到部门的下拉框中
  							$("#addEmpModal select").append(option);
  						});
  					}
  				});
  				//打开新增用的模态框
  				$("#addEmpModal").modal("show");
  				
  			});
  			
  			
  			
               //对各行的修改按钮绑定事件
              $(".editupdate").click(function(){
                     var trele = $(this).parent().parent();
                     var empid = $(trele).find("td:eq(1)").text().trim();
                     var empname = $(trele).find("td:eq(2)").text().trim();
                     var emppwd = $(trele).find("td:eq(3)").text().trim();
  				     var empsalary = $(trele).find("td:eq(4)").text().trim();
  				     var empsex = $(trele).find("td:eq(5)").text().trim();
  				      var empse = $(trele).find("td:eq(6)").text().trim();
  				     //对修改用的模态框进行赋值
  				  
  				     $("#updateEmpModal input[name=id]").val(empid);
  				     $("#updateEmpModal input[name=name]").val(empname);
  				     $("#updateEmpModal input[name=pwd]").val(emppwd);
  				     $("#updateEmpModal input[name=salary]").val(empsalary);
  				     $("#updateEmpModal :radio[value="+empsex+"]").prop("checked",true);
  				     if(empse=='市场部'){
  				       a = 1;
  				     }
  				     if(empse=='人力资源部'){
  				       a = 2;
  				     }
  				     if(empse=='技术部'){
  				       a = 3;
  				     }
  		  			$("#updateEmpModal select option[value="+a+"]").prop("selected",true);
  		  			
                   $("#updateEmpModal").modal("show");
              });
  
                 $("#selectAll").click(function(){
                   $("input[type=checkbox]:gt(0)").prop("checked",this.checked);
                 });
                 
                 $("#deleteAll").click(function(){
                
                 var array = new Array();
                     $("input[type=checkbox]:gt(0):checked").each(function(){
                         array.push($(this).parent().next().text());
                     });
                     
 					/* $.post("${pageContext.request.contextPath}/employee/queryByIds","ids="+ids,function(d){ */
 					$.post("${pageContext.request.contextPath}/employee/delete","ids="+array,function(b){
 					   if(b=="select"){
 					   alert("删除成功");
 					   console.log(b);
 					   }
 					   
 					   location.reload();
 					},"text"); 
                    /*  window.location.href="${pageContext.request.contextPath}/delete?ids="+array;
                  */
                  });
            });