<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="utf-8"/>
    <title>流域可持续发展决策支持系统</title>
    <meta name="description" content="overview & stats"/>
    <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
    <link rel="stylesheet" href="static/css/bootstrap.min.css"/>
    <link rel="stylesheet" href="static/css/bootstrap-responsive.min.css"/>
    <link rel="stylesheet" href="static/css/font-awesome.min.css"/>
    <link rel="stylesheet" href="static/css/jquery-ui-1.10.2.custom.min.css"/>
    <link rel="stylesheet" href="static/css/ace.min.css"/>
    <link rel="stylesheet" href="css/canvasXpress.css" type="text/css"/>

    <!--[if lt IE 9]><script type="text/javascript" src="./js/flashcanvas.js"></script><![endif]-->
    <script type="text/javascript" src="js/canvasXpress.min.js"></script>
    <script type="text/javascript" src="static/1.9.1/jquery.min.js"></script>
    <script type="text/javascript" src="static/js/jquery-ui-1.10.2.custom.min.js"></script>
    <script type="text/javascript" src="js/echarts-all.js"></script>
    <style>
        body{overflow: hidden; position: relative; width: 100%;}
        #mapframe{width:100%;border: 0;}
        #right_flash,#right_flash2{width: 433px; height: auto; position: absolute; right: -400px; top: 5%; margin-top: 0;}
        .situation-toggle{font-size: 14px; text-align:left;width:20px; position: absolute; left: 0px;top: 40px;z-index: 110;}
        .situation{width:400px; position: relative; right:-33px; top:0px; z-index:10;}
        #right_flash2{right: -600px; margin-top: 100px; height: 300px; z-index: 20; width: 633px;}
        #right_flash2.down{margin-top: 278px;}
        .widget-body{border-top: 1px solid #CCCCCC;}
    </style>
</head>

<body onload="showDemo();">
<iframe id="mapframe" src="http://210.77.79.201:19001/map/index.jsp" scrolling="no"></iframe>
<div id="right_flash">
    <div class="widget-header situation-toggle" id="situation-toggle1" style="cursor: pointer; font-family: '微软雅黑';">
        	情景控制<br /><
    </div>
    <div id="situation1" class="widget-box situation">
        <div class="widget-body">
            <div class="widget-main">
                <div class="row-fluid">
                    	上游耕地面积：
                    <input type="text" id="situation-1" value="${value1}" style="width:30px;height:10px">万亩
                    <div id="slider-1" style="float:right;display:inline;"></div>
                    <hr style="margin:0px;height:4px">
                </div>
                <div class="row-fluid">
                    <span style="visibility:hidden">中下游分水：</span> 中游&nbsp;下游
                </div>
                <div class="row-fluid">
                    	中下游分水：
                    <input type="text" id="situation-2-1" value="${value6}" style="width:25px;height:10px">
                    <input type="text" id="situation-2-2" value="${value7}" style="width:25px;height:10px">亿m^3
                    <div id="slider-2" style="float:right;display:inline;"></div>
                </div>
                <div class="row-fluid">
                    	中游耕地面积：
                    <input type="text" id="situation-3" value="${value2}" style="width:30px;height:10px">万亩
                    <div id="slider-3" style="float:right;display:inline;"></div>
                </div>
                <div class="row-fluid">
                    	中游湿地面积：
                    <input type="text" id="situation-4" value="${value3}" style="width:30px;height:10px">万亩
                    <div id="slider-4" style="float:right;display:inline;"></div>
                </div>
                <div class="row-fluid">
                    	中游滴灌面积：
                    <input type="text" id="situation-5" value="${value4}" style="width:30px;height:10px">万亩
                    <div id="slider-5" style="float:right;display:inline;"></div>
                    <hr style="margin:0px;height:4px">
                </div>
                <div class="row-fluid">
                    	下游耕地面积：
                    <input type="text" id="situation-6" value="${value5}" style="width:30px;height:10px">万亩
                    <div id="slider-6" style="float:right;display:inline;"></div>
                    <hr style="margin:0px;height:4px">
                </div>
                <div class="row-fluid" style="text-align:center;">
                    <button class="btn btn-mini btn-success" type="button" id="btn_eval">评价分析</button>
                </div>

            </div>
        </div>
    </div>
</div>

<div id="right_flash2" style="top:12%">
    <div class="widget-header situation-toggle" id="situation-toggle2" style="cursor: pointer; font-family: '微软雅黑';">
        	评价结果<br /><
    </div>
    <div id="situation2" class="widget-box situation" style="width: 600px;">
        <div class="widget-body">
        	<button id="switch" class="btn btn-info" style="border: 3px;padding: 0 8px;margin-bottom: -10px;z-index: 9999;">切换视图</button>
        	<button id="downexcel" class="btn btn-info" style="border: 3px;padding: 0 8px;margin-bottom: -10px;z-index: 9999;" onclick="window.location.href= 'downexcel1.do'">导出数据</button>
        	<button id="downpdf" class="btn btn-info" style="border: 3px;padding: 0 8px;margin-bottom: -10px;z-index: 9999;" onclick="window.location.href= 'downPDF.do'">下载评价结果</button>
            <div id="echarts" class="widget-main" style="margin-top: -22px;">
            	
            	<div id="gis-chart-1" style="width:100%; height: 300px;"></div>
            </div>
            <div id="scatter" class="widget-main" style="display: none; height: 338px; padding: 0;margin-top: -22px;">
            	<canvas id='canvas2' width='600' height='340'></canvas>
            </div>
        </div>
    </div>
</div>
<!-- 情景控制slider模块显示及控制 -->
<script type="text/javascript">
    $(function () {
    	drawchart();
    	
        $("#mapframe").attr("height", $(window).height());
        $("#slider-1").css({
            width: '42%',
            margin: '5px 5px 15px 5px'
        }).slider({
            value: ${value1},
            range: "min",
            min: 0,
            max: 500,
            step: 1,
            slide: function (event, ui) {
                var val = parseInt(ui.value);
                $("#situation-1").val(val);
            }
        });

        $("#slider-2").css({
            width: '42%',
            margin: '5px 5px 15px 5px'
        }).slider({
            value: ${value6},
            range: "min",
            min: 0,
            max: 500,
            step: 1,
            slide: function (event, ui) {
                var val = parseInt(ui.value);
                $("#situation-2-1").val(val);
                $("#situation-2-2").val(500 - val);
            }
        });

        $("#slider-3").css({
            width: '42%',
            margin: '5px 5px 15px 5px'
        }).slider({
            value: ${value2},
            range: "min",
            min: 0,
            max: 500,
            step: 10,
            slide: function (event, ui) {
                var val = parseInt(ui.value);
                $("#situation-3").val(val);
            }
        });

        $("#slider-4").css({
            width: '42%',
            margin: '5px 5px 15px 5px'
        }).slider({
            value: ${value3},
            range: "min",
            min: 0,
            max: 500,
            step: 1,
            slide: function (event, ui) {
                var val = parseInt(ui.value);
                $("#situation-4").val(val);
            }
        });

        $("#slider-5").css({
            width: '42%',
            margin: '5px 5px 15px 5px'
        }).slider({
            value: ${value4},
            range: "min",
            min: 0,
            max: 500,
            step: 5,
            slide: function (event, ui) {
                var val = parseInt(ui.value);
                $("#situation-5").val(val);
            }
        });

        $("#slider-6").css({
            width: '42%',
            margin: '5px 5px 15px 5px'
        }).slider({
            value: ${value5},
            range: "min",
            min: 0,
            max: 500,
            step: 5,
            slide: function (event, ui) {
                var val = parseInt(ui.value);
                $("#situation-6").val(val);
            }
        });

    });
    //绑定btn_eval按钮的点击事件
    $("#btn_eval").bind("click", function () {
        //使用ajax将数据发送到服务端
        $.get("stuationControl.do",{
        	 "upstreamCultivatedArea":document.getElementById("situation-1").value,
        	 "midstreamWater":document.getElementById("situation-2-1").value,
 			 "downstreamWater":document.getElementById("situation-2-1").value,
 			 "midStreamCultivatedArea":document.getElementById("situation-3").value,
 			 "midStreamWetLandArea":document.getElementById("situation-4").value,
 			 "midStreamDripIrrigation":document.getElementById("situation-5").value,
 			 "downStreamCultivatedArea":document.getElementById("situation-6").value
        },function(data){
        	if(data.success){
        		location.href = "jumpToAbstract.do";
        	}else{
        		alert(data.content);
        	}
        	
        	
        });

    });

    /*最右测滑入滑出*/
    var clicknum1 = false,
        clicknum2 = false;
    $("#situation-toggle1").click(function () {
        if(!clicknum2){
            if(!clicknum1){
                $("#right_flash").animate({right: "0"});
                $("#right_flash2").addClass("down");
                $(this).html('情景控制<br />>')
            }else {
                $("#right_flash").animate({right: "-400px"});
                $(this).html('情景控制<br /><')
                $("#right_flash2").removeClass("down");
            }
        }else{
            $("#right_flash2").animate({right: "-600px"}).addClass("down");
            $("#situation-toggle2").html('评价结果<br /><')
            $("#right_flash").animate({right: "0"});
            $(this).html('情景控制<br />>')
            
            clicknum2 = !clicknum2;
        }
        clicknum1 = !clicknum1;
        console.log(clicknum1+"///"+clicknum2);
    });
    $("#situation-toggle2").click(function () {
        if(!clicknum1){
            if(!clicknum2){
                $("#right_flash2").animate({right: "0px"});
                $(this).html('评价结果<br />>')
            }else {
                $("#right_flash2").animate({right: "-600px"});
                $(this).html('评价结果<br /><')
            }
        }else{
            $("#right_flash").animate({right: "-400px"});
            $("#situation-toggle1").html('情景控制<br /><')
            $("#right_flash2").animate({right: "0px"}).removeClass("down");
            $(this).html('评价结果<br />>');
            clicknum1 = !clicknum1;
        }
        clicknum2 = !clicknum2;
        console.log(clicknum1+"///"+clicknum2);
    });

    function drawchart(){
        var myChart = echarts.init(document.getElementById('gis-chart-1'));
        $.get("getGisEcharts.do",
                [],function(data){
                var xdata=[], Overall=[],P1=[],P2=[],P3=[];
                for(var i=0;i<data.length;i++){
                    xdata[i]=data[i].year,
                    Overall[i]=data[i].resultOverall,
                    P1[i]=data[i].resultP1,
                    P2[i]=data[i].resultP2,
                    P3[i]=data[i].resultP3;
                }
        
                var option = {
                    title : {
                        text: '流域可持续发展目标评价',
                        x:'center',
                    },
                    tooltip : {
                        trigger: 'axis'
                    },
                    dataZoom: {
                        show: true,
                        start : 0,
                        height: 15
                    },
                    legend: {
                    	x : 'left',
                    	y : '32',
                        data:['流域可持续发展','水资源发展','生态发展','经济发展',]
                    },
                    toolbox: {
                        show : true,
                        feature : {
                            restore : {show: true},
                            saveAsImage : {show: true}
                        }
                    },
                    calculable : true,
                    xAxis : [
                        {
                            type : 'category',
                            boundaryGap : false,
                            data : xdata
                        }
                    ],
                    yAxis : [
                        {
                            type : 'value'
                        }
                    ],
                    series : [
                        {
                            name:'流域可持续发展',
                            type:'line',
                            stack: '总量',
                            data: Overall
                        },
                        {
                            name:'水资源发展',
                            type:'line',
                            stack: '总量',
                            data: P1
                        },
                        {
                            name:'生态发展',
                            type:'line',
                            stack: '总量',
                            data:P2
                        },
                        {
                            name:'经济发展',
                            type:'line',
                            stack: '总量',
                            data:P3
                        }
                        
                    ]
                };
                myChart.setOption(option); 
		});
                   
	};
</script>
<script>
//	评价结果切换显示
var switchnum = true;
$("#switch").click(function(){
	if(switchnum == true){
		console.log("switchtrue");
		switchnum = false;
		$("#echarts").css("display","none");
		$("#scatter").css("display","block");
	}else{
		console.log("switchfalse");
		switchnum = true;
		$("#scatter").css("display","none");
		$("#echarts").css("display","block");
	}
});

		var showDemo = function(){
			var cx2 = new CanvasXpress("canvas2",
	          {
	            "y" : {
	              "vars" : ["Variable1", "Variable2", "Variable3", "Variable4", "Variable5", "Variable6", "Variable7", "Variable8", "Variable9", "Variable10", "Variable11", "Variable12", "Variable13", "Variable14", "Variable15", "Variable16", "Variable17", "Variable18", "Variable19", "Variable20", "Variable21", "Variable22", "Variable23", "Variable24", "Variable25", "Variable26", "Variable27", "Variable28", "Variable29", "Variable30", "Variable31", "Variable32", "Variable33", "Variable34", "Variable35", "Variable36", "Variable37", "Variable38", "Variable39", "Variable40", "Variable41", "Variable42", "Variable43", "Variable44", "Variable45", "Variable46", "Variable47", "Variable48", "Variable49", "Variable50", "Variable51", "Variable52", "Variable53", "Variable54", "Variable55", "Variable56", "Variable57", "Variable58", "Variable59", "Variable60", "Variable61", "Variable62", "Variable63", "Variable64", "Variable65", "Variable66", "Variable67", "Variable68", "Variable69", "Variable70", "Variable71", "Variable72", "Variable73", "Variable74", "Variable75", "Variable76", "Variable77", "Variable78", "Variable79", "Variable80", "Variable81"],
	              "smps" : ["Sample1", "Sample2", "Sample3"],
	              "data" : [[-5, 5, 5], [-5, 15, 15], [-5, 25, 25], [-5, 35, 35], [-5, 45, 45], [-5, 35, 55], [-5, 25, 65], [-5, 15, 75], [-5, 5, 85], [-15, 15, 5], [-15, 25, 15], [-15, 35, 25], [-15, 45, 35], [-15, 55, 45], [-15, 45, 55], [-15, 35, 65], [-15, 25, 75], [-15, 15, 85], [-25, 25, 5], [-25, 35, 15], [-25, 45, 25], [-25, 55, 35], [-25, 65, 45], [-25, 55, 55], [-25, 45, 65], [-25, 35, 75], [-25, 25, 85], [-35, 35, 5], [-35, 45, 15], [-35, 55, 25], [-35, 65, 35], [-35, 75, 45], [-35, 65, 55], [-35, 55, 65], [-35, 45, 75], [-35, 35, 85], [-45, 45, 5], [-45, 55, 15], [-45, 65, 25], [-45, 75, 35], [-45, 85, 45], [-45, 75, 55], [-45, 65, 65], [-45, 55, 75], [-45, 45, 85], [-55, 35, 5], [-55, 45, 15], [-55, 55, 25], [-55, 65, 35], [-55, 75, 45], [-55, 65, 55], [-55, 55, 65], [-55, 45, 75], [-55, 35, 85], [-65, 25, 5], [-65, 35, 15], [-65, 45, 25], [-65, 55, 35], [-65, 65, 45], [-65, 55, 55], [-65, 45, 65], [-65, 35, 75], [-65, 25, 85], [-75, 15, 5], [-75, 25, 15], [-75, 35, 25], [-75, 45, 35], [-75, 55, 45], [-75, 45, 55], [-75, 35, 65], [-75, 25, 75], [-75, 15, 85], [-85, 5, 5], [-85, 15, 15], [-85, 25, 25], [-85, 35, 35], [-85, 45, 45], [-85, 35, 55], [-85, 25, 65], [-85, 15, 75], [-85, 5, 85]]
	            }
	          },
	          {"graphType": "Scatter3D",
	           "scatterType": "bar",
	           "xAxis": ["Sample1"],
	           "yAxis": ["Sample2"],
	           "zAxis": ["Sample3"]
	          }
	        );
	        var showCode = function (e, id) {
		        var cx = CanvasXpress.getObject(id)
		        cx.stopEvent(e);
		        cx.cancelEvent(e);
		        cx.updateCodeDiv(10000);
		        return false;
		    }
		}
</script>
</body>
