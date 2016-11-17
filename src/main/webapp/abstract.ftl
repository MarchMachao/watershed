<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>决策项目情景摘要</title>
    <link rel="stylesheet" href="bootstrap/css/bootstrap.min.css">
    <style>
        .b-wrapper{padding: 0 20px 50px; font-family: "微软雅黑";}
        .part1{padding-left: 20px;}
        .part1 h4{margin-left: 18%;}
        .part h4{height: 30px; margin-left: 5%; color: #375a5d; font-weight: bold;}
        .part-title{width: 140px; display: inline-block; text-align: justify; }
        .b-word{font-size: 18px; color: #333; padding-left: 130px;}
        .b-wrapper ul{margin-left: 115px;}
        .b-wrapper li{font-size: 18px; color: #333; padding-left: 15px;}
        .part{margin-top: 20px; padding-left: 20px;}
        .part2-title{display: inline-block; width: 230px;}
        .line{display: block; width: 90%; margin: 20px auto; height: 0; border: none; border-top: 1px solid #c2daee;}
        .part3 ul{width: 80%;}
        .btn-wrapper{padding-right: 15%; margin-top: 50px;}
        .pro-btn{padding: 8px 40px; box-shadow: 3px 3px 3px #275f8f; margin-left: 20px;}
        .form-control{width: 100px ; display: inline-block;}
    </style>
</head>
<body>
<div class="b-wrapper">
	<input type="hidden" id="projectId" name="projectId" value="${projectId}" />
    <h2>
        <p class="text-center">决策项目情景摘要</p>
    </h2>
    <div class="part1">
        <h4>
            <span class="part-title part-title4">研究区域：</span>
            <span></span>
        </h4>
        <h4>
            <span class="part-title part-title6">模拟时间范围：</span>
            <span></span>
        </h4>
        <h4>
            <span class="part-title part-title6">模拟时间步长：</span>
            <span></span>
        </h4>
        <h4>
            <span class="part-title part-title4">项目名称：</span>
            <span></span>
        </h4>
            <div class="part" style="padding-left: 0px; margin-left: 18%;font-size: 18px;">
				<span>选择区县:</span>
				<select id="selectCounty" class="form-control">
					<option value="620702">甘州</option>
					<option value="620723">临泽</option>
					<option value="620724">高台</option>
					<option value="152923">额济纳旗</option>
					<option value="620921">金塔</option>
					<option value="620722">民乐</option>
					<option value="620721">肃南</option>
					<option value="620902">肃州</option>
					<option value="620200">嘉峪关市</option>
					<option value="632222">祁连</option>
				</select>
				<span style="margin-left: 5%;">选择年份:</span>
				<select id="selectYears" class="form-control">
					<option value="2016">2016</option>
					<option value="2015">2015</option>
					<option value="2014">2014</option>
					<option value="2013">2013</option>
					<option value="2012">2012</option>
					<option value="2011">2011</option>
					<option value="2010">2010</option>
				</select>
		    </div>
        <i class="line"></i>
    </div>

    <div class="part part2">
        <h4>气候情景</h4>
        <p class="b-word"></p>
        <i class="line"></i>
    </div>
    <div class="part part2">
        <h4>产业与城市发展情景</h4>
        <ul class="list-unstyled">
            <li>
                <span class="part2-title">非农业人口比例变化率</span><span></span>
            </li>
            <li>
                <span class="part2-title">旅游业产值变化率</span><span></span>
            </li>
        </ul>
        <i class="line"></i>
    </div>
    <div class="part part3">
        <h4>土地利用情景</h4>
        <ul class="list-unstyled row">
            <li>
                <span class="part2-title">耕地面积变化率</span><span></span>
            </li>
            <li class="col-md-6">
                <span class="part2-title">小麦种植面积变化率</span><span></span>
            </li>
            <li class="col-md-6">
                <span class="part2-title">玉米种植面积变化率</span><span></span>
            </li>
            <li class="col-md-6">
                <span class="part2-title">油料种植面积变化率</span><span></span>
            </li>
            <li class="col-md-6">
                <span class="part2-title">蔬菜种植面积变化率</span><span></span>
            </li>
            <li class="col-md-6">
                <span class="part2-title">果园种植面积变化率</span><span></span>
            </li>
            <li class="col-md-6">
                <span class="part2-title">棉花种植面积变化率</span><span></span>
            </li>
        </ul>
        <i class="line"></i>
    </div>
    <div class="part part3">
        <h4>社会经济发展情景</h4>
        <ul class="list-unstyled row">
            <li class="col-md-6">
                <span class="part2-title">GDP增长率</span><span></span>
            </li>
            <li class="col-md-6">
                <span class="part2-title">人均GDP增长率</span><span></span>
            </li>
        </ul>
    </div>
    <div class="text-right btn-wrapper">
        <button type="button" id="backToStuation" class="btn btn-primary pro-btn" onclick="javascript:location.href = 'toStuation.do?id=${projectId}'">设置</button>
        <button type="button" id="toResult" class="btn btn-primary pro-btn" onclick="javascript:location.href = 'jumpToResult.do?projectId=${projectId}'">模拟</button>
    </div>
</div>
<script src="js/jquery-1.11.1.min.js"></script>
<script>
	$("#toResult").on("click",function(){
		$.post(
				"test.do",
				{
					"projectId":"${projectId}",
				},function(data){
					alert(data);
					location.href = 'toStuation.do?id=${projectId}'
				}
			);
	})
</script>
</body>
</html>