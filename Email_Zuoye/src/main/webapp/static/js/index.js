
  $(function(){
  
               //��������ť���¼�
  			$("#addEmpBtn").click(function(){
  			
  				//ͨ��ajax�����ȡ������Ϣ
  				$.ajax({
  					url:"${pageContext.request.contextPath}/employee/selectname",
  					
  					success:function(data){
						//���������������
						$("#addEmpModal select").empty(); 
						
  						//data��ʾҪ�����ļ��ϻ�����
  						//index��ʾ�±�
  						//obj��ʾ����Ԫ��
  						$.each(data,function(index,obj){
  							//����option��ǩ
  							var option = $("<option value='"+obj.id+"'>"+obj.dname+"</option>");
  							
  							//��ӵ����ŵ���������
  							$("#addEmpModal select").append(option);
  						});
  					}
  				});
  				//�������õ�ģ̬��
  				$("#addEmpModal").modal("show");
  				
  			});
  			
  			
  			
               //�Ը��е��޸İ�ť���¼�
              $(".editupdate").click(function(){
                     var trele = $(this).parent().parent();
                     var empid = $(trele).find("td:eq(1)").text().trim();
                     var empname = $(trele).find("td:eq(2)").text().trim();
                     var emppwd = $(trele).find("td:eq(3)").text().trim();
  				     var empsalary = $(trele).find("td:eq(4)").text().trim();
  				     var empsex = $(trele).find("td:eq(5)").text().trim();
  				      var empse = $(trele).find("td:eq(6)").text().trim();
  				     //���޸��õ�ģ̬����и�ֵ
  				  
  				     $("#updateEmpModal input[name=id]").val(empid);
  				     $("#updateEmpModal input[name=name]").val(empname);
  				     $("#updateEmpModal input[name=pwd]").val(emppwd);
  				     $("#updateEmpModal input[name=salary]").val(empsalary);
  				     $("#updateEmpModal :radio[value="+empsex+"]").prop("checked",true);
  				     if(empse=='�г���'){
  				       a = 1;
  				     }
  				     if(empse=='������Դ��'){
  				       a = 2;
  				     }
  				     if(empse=='������'){
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
 					   alert("ɾ���ɹ�");
 					   console.log(b);
 					   }
 					   
 					   location.reload();
 					},"text"); 
                    /*  window.location.href="${pageContext.request.contextPath}/delete?ids="+array;
                  */
                  });
            });