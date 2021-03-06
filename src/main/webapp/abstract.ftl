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
        .form-control{width: 110px ; display: inline-block;}
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
            <span id="part1-1"></span>
        </h4>
        <h4>
            <span class="part-title part-title6">模拟时间范围：</span>
            <span id="part1-2"></span>
        </h4>
        <h4>
            <span class="part-title part-title6">模拟时间步长：</span>
            <span id="part1-3"></span>
        </h4>
        <h4>
            <span class="part-title part-title4">项目名称：</span>
            <span id="part1-4"></span>
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
					<option value="2013">2013</option>
					<option value="2012">2012</option>
					<option value="2011">2011</option>
					<option value="2010">2010</option>
					<option value="2009">2009</option>
					<option value="2008">2008</option>
					<option value="2007">2007</option>
					<option value="2006">2006</option>
					<option value="2005">2005</option>
					<option value="2004">2004</option>
					<option value="2003">2003</option>
					<option value="2002">2002</option>
					<option value="2001">2001</option>
					<option value="2000">2000</option>
				</select>
		    </div>
        <i class="line"></i>
    </div>

    <div class="part part2">
        <h4>气候情景</h4>
        <p id="IPCC" class="b-word"></p>
        <i class="line"></i>
    </div>
    <div class="part part2">
        <h4>产业与城市发展情景</h4>
        <ul class="list-unstyled">
            <li>
                <span class="part2-title">非农业人口比例变化率</span><span id="industry-1"></span>%
            </li>
            <li>
                <span class="part2-title">旅游业产值变化率</span><span id="industry-2"></span>%
            </li>
        </ul>
        <i class="line"></i>
    </div>
    <div class="part part3">
        <h4>土地利用情景</h4>
        <ul class="list-unstyled row">
            <li>
                <span class="part2-title">耕地面积变化率</span><span id="land-1"></span>%
            </li>
            <li class="col-md-6">
                <span class="part2-title">小麦种植面积变化率</span><span id="land-2"></span>%
            </li>
            <li class="col-md-6">
                <span class="part2-title">玉米种植面积变化率</span><span id="land-3"></span>%
            </li>
            <li class="col-md-6">
                <span class="part2-title">油料种植面积变化率</span><span id="land-4"></span>%
            </li>
            <li class="col-md-6">
                <span class="part2-title">蔬菜种植面积变化率</span><span id="land-5"></span>%
            </li>
            <li class="col-md-6">
                <span class="part2-title">果园种植面积变化率</span><span id="land-6"></span>%
            </li>
            <li class="col-md-6">
                <span class="part2-title">棉花种植面积变化率</span><span id="land-7"></span>%
            </li>
        </ul>
        <i class="line"></i>
    </div>
    <div class="part part3">
        <h4>社会经济发展情景</h4>
        <ul class="list-unstyled row">
            <li class="col-md-6">
                <span class="part2-title">GDP增长率</span><span id="conomy-1"></span>%
            </li>
            <li class="col-md-6">
                <span class="part2-title">人均GDP增长率</span><span id="conomy-2"></span>%
            </li>
        </ul>
    </div>
    <div class="text-right btn-wrapper">
        <button type="button" id="backToStuation" class="btn btn-primary pro-btn" onclick="javascript:location.href = 'toStuation.do?id=${projectId}'">情景设置</button>
        <button type="button" id="toResult" class="btn btn-primary pro-btn" onclick="javascript:;">情景模拟</button>
    </div>
</div>
<script src="js/jquery-1.11.1.min.js"></script>
<script>
	
	findDataByCountryAndYear();
	var options="";
	
	$.get(
		"getProjectById.do",
		{projectId:"${projectId}"},
		function(data){
			$("#part1-1").html("黑河流域"),
			$("#part1-2").html(data.baseYear+"~"+data.goalYear),
			$("#part1-3").html("年"),
			$("#part1-4").html(data.name);
			for(var i=parseInt(data.goalYear);i>=parseInt(data.baseYear);i--){
				options=options+"<option>"+i.toString()+"</option>";
			}
			$("#selectYears").empty();
			$("#selectYears").append(options);
		}
	)
	
	$("#toResult").on("click", function() {
		$("#toResult").attr("disabled","true");
		$.post("test.do", {
			"projectId" : "${projectId}",
		}, function(data) {
			$("#toResult").attr("disabled","false");
			alert(data+'\n'+'模型开始计算！');
			location.href = 'jumpToResult.do?id=${projectId}'
		});
	});
	
	$("#selectCounty,#selectYears").on("change",function(){
		findDataByCountryAndYear();
	})
	
	function findDataByCountryAndYear() {
		$.get("getSceParaByProjectIdAndCountryId.do", {
			"projectId" : "${projectId}",
			"countryId" : document.getElementById("selectCounty").value,
			"year" : document.getElementById("selectYears").value,
			"tab" : "1"
		}, function(data) {
			if (data.isEmpty != "1") {
				switch(data.fldCRPType)
				{
				case '8.5':
					$("#IPCC").html('高排放情景，2100年地表接收稳定辐射强度大于8.5 W/m2');
					break;
				case '6':
					$("#IPCC").html('较高排放情景，2100年地表接收稳定辐射强度控制在6 W/m2');
					break;
				case '4.5':
					$("#IPCC").html('中等排放情景，2100年地表接收稳定辐射强度控制在4.5 W/m2');
					break;
				case '2.6':
					$("#IPCC").html('低排放情景，2100年地表接收稳定辐射强度小于3 W/m2');
					break;
				}
			}else{
				$("#IPCC").html('无相关数据');
			}
		});
		
		$.get("getSceParaByProjectIdAndCountryId.do", {
			"projectId" : "${projectId}",
			"countryId" : document.getElementById("selectCounty").value,
			"year" : document.getElementById("selectYears").value,
			"tab" : "2"
		}, function(data) {
			if (data.isEmpty != "1") {
				$("#industry-1").html(data.nonFarmPercent);
				$("#industry-2").html(data.changeRateOfTourismIndustry)
			}else{
				$("#industry-1,#industry-2").html('0');
			}
		});
		
		$.get("getSceParaByProjectIdAndCountryId.do", {
			"projectId" : "${projectId}",
			"countryId" : document.getElementById("selectCounty").value,
			"year" : document.getElementById("selectYears").value,
			"tab" : "4"
		}, function(data) {
			if (data.isEmpty != "1") {
				$("#land-1").html(data.fldFarmAreaChgR);
				$("#land-2").html(data.wheatChgR);
				$("#land-3").html(data.cornChgR);
				$("#land-4").html(data.oilPlantsChgR);
				$("#land-5").html(data.vegetablesChgR);
				$("#land-6").html(data.orchardChgR);
				$("#land-7").html(data.cottonChgR);
			}else{
				$("#land-1,#land-2,#land-3,#land-4,#land-5,#land-6,#land-7").html('0');
			}
		});
		
		$.get("getSceParaByProjectIdAndCountryId.do", {
			"projectId" : "${projectId}",
			"countryId" : document.getElementById("selectCounty").value,
			"year" : document.getElementById("selectYears").value,
			"tab" : "3"
		}, function(data) {
			if (data.isEmpty != "1") {
				$("#conomy-1").html(data.perCapGDPR);
				$("#conomy-2").html(data.perCapGDP);
			}else{
				$("#conomy-1").html('8');
				$("#conomy-2").html('0.3')
			}
		});
		
	};
</script>
</body>
</html>