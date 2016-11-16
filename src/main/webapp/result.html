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
        .table th .tabale td{text-align: center; }
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
        <div class="progress-bar" role="progressbar" aria-valuenow="0" aria-valuemin="0" aria-valuemax="100" style="width: 0%;">
            0%
        </div>
    </div>
    <h4>模拟结果</h4>
    <div class="table-responsive">
	    <table class="table table-hover">
	    	<thead>
	        <tr>
	            <th>年份/指标</th>
	            <th>水生产力(%)</th>
	            <th>水压力(%)</th>
	            <th>安全饮用水比例(%)</th>
	            <th>水资源管理执行度(%)</th>
	            <th>可操作合约有效性(%)</th>
	            <th>可持续湿地面积(万亩)</th>
	            <th>下游可持续最小水量(亿m³)</th>
	            <th>中游地下水开采量(亿m³)</th>
	            <th>中游生态系统用水量(亿m³)</th>
	            <th>森林覆盖率(%)</th>
	            <th>可持续森林管理覆盖(%)</th>
	            <th>山地绿色覆盖指数(%)</th>
	            <th>人均GDP</th>
	            <th>人均 GDP增长率(%)</th>
	            <th>年轻人在教育、就业和培训中的比例 (%)</th>
	            <th>年轻人失业率(%) </th>
	            <th>旅游业在 GDP中的比例 (%)</th>
	            <th>旅游消费 </th>
	            <th>土地消耗率与人口增长率的比率(%)</th>
	            <th>城镇化率(%) </th>
	            <th>农业水生产力 </th>
	            <th>农业水利用效率 </th>
	            <th>每公顷农产品产值 </th>
	            <th>维持可持续的农业种植面积 </th>
	            <th>可持续社会福利指数  </th>
	        </tr>
	        </thead>
	        <tbody>
	        </tbody>
	    </table>
    </div>
    <div class="text-right btn-wrapper">
        <button type="button" class="btn btn-primary pro-btn">发展评价</button>
    </div>
</div>
<script src="js/jquery-1.11.1.min.js"></script>
<script>
//  var num = 30;
//  $(".progress-bar").attr({
//      "aria-valuenow" : num
//  }).width(num + "%").html(num + "%");
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
	
    $.ajax({
        type    : "post",
        url     : "queryAvailablews.do",
        success : function(data){
            var num = data.length*10;
            $(".progress-bar").attr({
                "aria-valuenow" : num
            }).width(num + "%").html(num + "%");
        },
        error   :function(){
            console.log("queryAvailablews error!")
        }
    });
    
    
		$.post(
			"getDataYearlyws.do",
			{
				"year":parseInt("2000")
			},function(data){
				if(data.length>0){
					$(".table tbody").empty();
					var newTr = '<tr><td>2000</td>';
					for(i=0;i<data.length;i++){
						var newTd='<td>'+data[i]+'</td>';
						newTr=newTr+newTd;
					}
					newTr=newTr+'<tr>';
					$(".table tbody").append(newTr);
				}else{
					var newTr = '<tr><td>暂无数据</td></tr>';
					console.log("没数据!")
				}
			}
		)
	
</script>
</body>
</html>