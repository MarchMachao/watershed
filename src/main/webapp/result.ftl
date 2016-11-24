<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>可持续性评价</title>
    <link rel="stylesheet" href="bootstrap/css/bootstrap.min.css">
    <style>
        .wrapper{padding: 0 20px;}
        .wrapper h4{margin-top: 40px;}
        .wrapper .progress{width: 60%; height: 30px; line-height: 30px; min-width: 400px; border: 2px solid #000;}
        .wrapper .progress-bar{line-height: 30px; font-size: 15px;}
        .wrapper table{width: 80%;}
        .btn-wrapper{padding-right: 15%; margin-top: 50px;}
        .pro-btn{padding: 8px 30px; box-shadow: 3px 3px 3px #275f8f;}
    </style>
</head>
<body>
<div class="wrapper">
    <h2>
        <p class="text-center">情景模拟进度</p>
    </h2>
    <h4>模型模拟状态</h4>
    <h5>模型当前状态：<span id="state"></span></h5>
    <h4>模拟进度</h4>
    <div class="progress">
        <div class="progress-bar" role="progressbar" aria-valuenow="0" aria-valuemin="0" aria-valuemax="100" 
        		style="width: 0%;">
            0%
        </div>
    </div>
    <button onclick="queryAvailable();">点我！进度条会变（测试用）</button>
    <h4>模拟结果</h4>
    <div class="table-responsive" style="margin-top: 20px;">
	    <table id="resultTable" class="table table-hover">
	      	<tr><th style="min-width: 200px;">年份/指标</th></tr>
	      	<tr><td>水生产力(%)</td></tr>
	      	<tr><td>水压力(%)</td></tr>
	      	<tr><td>安全饮用水比例(%)</td></tr>
	      	<tr><td>水资源管理执行度(%)</td></tr>
	      	<tr><td>可操作合约有效性(%)</td></tr>
	      	<tr><td>可持续湿地面积(万亩)</td></tr>
	      	<tr><td>下游可持续最小水量(亿m³)</td></tr>
	      	<tr><td>中游地下水开采量(亿m³)</td></tr>
	      	<tr><td>中游生态系统用水量(亿m³)</td></tr>
	      	<tr><td>森林覆盖率(%)</td></tr>
	      	<tr><td>可持续森林管理覆盖(%)</td></tr>
	      	<tr><td>山地绿色覆盖指数(%)</td></tr>
	      	<tr><td>人均GDP</td></tr>
	      	<tr><td>人均 GDP增长率(%)</td></tr>
	      	<tr><td>教育就业培训的年轻人比例(%)</td></tr>
	      	<tr><td>年轻人失业率(%)</td></tr>
	      	<tr><td>旅游业在 GDP中的比例 (%)</td></tr>
	      	<tr><td>旅游消费</td></tr>
	      	<tr><td>土地消耗率/人口增长率(%)</td></tr>
	      	<tr><td>城镇化率(%)</td></tr>
	      	<tr><td>农业水生产力 </td></tr>
	      	<tr><td>农业水利用效率(%)</td></tr>
	      	<tr><td>每公顷农产品产值</td></tr>
	      	<tr><td>维持可持续的农业种植面积</td></tr>
	      	<tr><td>可持续社会福利指数</td></tr>
	    </table>
    </div>
    <div class="text-right btn-wrapper">
        <button id="startEvalModel" type="button" class="btn btn-primary pro-btn" onclick="">发展评价</button>
    </div>
</div>
<script src="js/jquery-1.11.1.min.js"></script>
<script>

	var jsonData = [];
	
	queryStatews();
					
	function queryStatews(){
		$.post(
			"queryStatews.do",
			[],
			function(data){
				switch(data){
				case(1):
					$("#state").html("成功，模型状态为1-ready");
					queryStatews();
					break;
				case(2):
					$("#state").html("成功，模型状态为2-running");
					queryStatews();
					break;
				case(3):
					$("#state").html("成功，模型状态为3-accessible");
					queryAvailable();
					break;
				case(4):
					$("#state").html("成功，模型状态为4-finished");
					break;
				default:
					$("#state").html("失败，请检查!");
					console.log("queryStatews error!");
				}
			}
		);
	}
	
	function queryAvailable(){
	    $.ajax({
	        type    : "post",
	        url     : "queryAvailablews.do",
	        success : function(data){
	        	if(data.length>=1){
		        	for(var i=0; i<data.length; i++){
		        		var newTh = '<th>'+data[i]+'</th>';
						$("#resultTable tr:eq(0)").append(newTh);
		        	}
		        	jsonData = data;
		        	getDataYearlyAsList(data);
		            var num = data.length*7.7;
		            num = (num >= 100) ? 100 : num;
		            $(".progress-bar").attr({
		                "aria-valuenow" : num
		            }).width(num + "%").html(num + "%");
	        	}
	        },
	        error   : function(){
	            console.log("queryAvailablews error!")
	        }
	    });
	};
	
    function getDataYearlyAsList(years){
    	for(var i=0;i<years.length;i++){
//     		var yearnum = years[i];
			$.get("getDataYearlyws.do", {
					"year" : years[i]
				}, function(data) {
					if (data.length > 0) {
						for (i = 0; i < data.length; i++) {
							data[i] = (data[i].toFixed(2).toString().length>=12)?(data[i]/100000000):data[i];
							var newTd = '<td>' + data[i].toFixed(2) + '</td>';
							var j = i + 1;
							$("#resultTable tr:eq(" + j + ")").append(newTd);
						}
					} else {
						console.log("没数据!")
					}
			})}
	};
	
	$("#startEvalModel").on("click",function(){
		$.post("getDataYearlyAsIndicators.do", {
			"years" : jsonData
		}, function(data) {
			var inputdata = JSON.stringify(data).replace(']','')+','+JSON.stringify(data).replace('[','');
			//因为传一年数据指标计算模型不工作，传入两年相同数据
			$.ajax({
				type:"get",
				url:"http://210.77.67.251/EvalModel/startEvalModel.do?indicators="+inputdata,
				success:function(msg){
					$.post("saveGisEcharts.do",
						{
						year : '2000',
						resultOverall : msg[0].resultOverall,
						resultP1 : msg[0].resultP1,
						resultP2 : msg[0].resultP2,
						resultP3 : msg[0].resultP3
						},function(data){
							alert(data.content+'\n单击确定后跳转');
							window.location.href='GIS.html';
						}
					);
				},
				error:function(msg){
					alert("出错！ 错误代码："+JSON.stringify(msg));
				}
			});
// 			$.get("http://210.77.67.251:8000/EvalModel/startEvalModel.do", {
// 				indicators : JSON.stringify(data)
// 			}, function(msg) {
// 				alert(JSON.stringify(msg));
// 			})
		})
	});
</script>
</body>
</html>