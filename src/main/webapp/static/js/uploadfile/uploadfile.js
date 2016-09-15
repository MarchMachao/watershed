var base = getRootPath();//获取当前项目路径
var basin_id = document.getElementById("basin_id").value;//获取当前流域的编号
function getRootPath(){
	//获取当前网址
	var curWwwPath=window.document.location.href;
	//获取主机地址之后的目录
	var pathName=window.document.location.pathname;
	var pos=curWwwPath.indexOf(pathName);
	//获取主机地址
	var localhostPaht=curWwwPath.substring(0,pos);
	//获取带"/"的项目名，
	var projectName=pathName.substring(0,pathName.substr(1).indexOf('/')+1);
	return(projectName);
}

function ajaxFileUploadFile1() {  
	$.ajaxFileUpload({  
		url : base+'/uploadFile/addfile?label=ecomandsoc&basin_id='+basin_id, //url中添加label，用来区分上传文件类别（UpFileController）
		secureuri : false, 
		fileElementId : 'upload_file1', //文件上传空间的id属性  <input type="file" id="f_file" name="file" />  
		type : 'post',  
		dataType : 'json', //返回值类型 一般设置为json  
		success : function(data, status) //服务器成功响应处理函数  
		{  
			$("#upload_file_info1").html(data); 
		},  
		error : function(data, status, e)//服务器响应失败处理函数  
		{  

			$("#upload_file_info1").html(data);  
		}
	}); 
}  

function submitFile1(){  
	var file = $("#upload_file1");
	if($.trim(file.val())==''){
		$("#upload_file_info1").html("*请选择文件！!"); 

		return false;
	}else{
		$("#upload_file_info1").html("");
		ajaxFileUploadFile1();
		return true;
	} 

} 

function ajaxFileUploadFile2() {  
	$.ajaxFileUpload({  
		url : base+'/uploadFile/addfile?label=resource&basin_id='+basin_id,  
		secureuri : false, 
		fileElementId : 'upload_file2', //文件上传空间的id属性  <input type="file" id="f_file" name="file" />  
		type : 'post',  
		dataType : 'json', //返回值类型 一般设置为json  
		success : function(data, status) //服务器成功响应处理函数  
		{  
			$("#upload_file_info2").html(data); 
		},  
		error : function(data, status, e)//服务器响应失败处理函数  
		{  

			$("#upload_file_info2").html(data);  
		} 
	});  
}  

function submitFile2(){  
	var file = $("#upload_file2");
	if($.trim(file.val())==''){
		$("#upload_file_info2").html("*请选择文件！!"); 

		return false;
	}else{
		$("#upload_file_info2").html("");
		ajaxFileUploadFile2();
		return true;
	} 

} 

function ajaxFileUploadFile3() {  
	$.ajaxFileUpload({  
		url : base+'/uploadFile/addfile?label=recycling&basin_id='+basin_id,  
		secureuri : false, 
		fileElementId : 'upload_file3', //文件上传空间的id属性  <input type="file" id="f_file" name="file" />  
		type : 'post',  
		dataType : 'json', //返回值类型 一般设置为json  
		success : function(data, status) //服务器成功响应处理函数  
		{  
			$("#upload_file_info3").html(data); 
		},  
		error : function(data, status, e)//服务器响应失败处理函数  
		{  

			$("#upload_file_info3").html(data);  
		} 
	});  
}  

function submitFile3(){  
	var file = $("#upload_file3");
	if($.trim(file.val())==''){
		$("#upload_file_info3").html("*请选择文件！!"); 

		return false;
	}else{
		$("#upload_file_info3").html("");
		ajaxFileUploadFile3();
		return true;
	} 

} 

function ajaxFileUploadFile4() {  
	$.ajaxFileUpload({  
		url : base+'/uploadFile/addfile?label=ecotope&basin_id='+basin_id,  
		secureuri : false, 
		fileElementId : 'upload_file4', //文件上传空间的id属性  <input type="file" id="f_file" name="file" />  
		type : 'post',  
		dataType : 'json', //返回值类型 一般设置为json  
		success : function(data, status) //服务器成功响应处理函数  
		{  
			$("#upload_file_info4").html(data); 
		},  
		error : function(data, status, e)//服务器响应失败处理函数  
		{  

			$("#upload_file_info4").html(data);  
		} 
	});  
}  

function submitFile4(){  
	var file = $("#upload_file4");
	if($.trim(file.val())==''){
		$("#upload_file_info4").html("*请选择文件！!"); 

		return false;
	}else{
		$("#upload_file_info4").html("");
		ajaxFileUploadFile4();
		return true;
	} 

} 
