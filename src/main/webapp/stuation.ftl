<!DOCTYPE html>
<html>

	<head>
		<meta charset="utf-8" />
		<title>流域可持续发展决策支持系统</title>
		<meta name="description" content="overview & stats" />
		<meta name="viewport" content="width=device-width, initial-scale=1.0" />

		<!-- basic styles -->
		<link rel="stylesheet" href="static/css/bootstrap.min.css" />
		<link rel="stylesheet" href="static/css/bootstrap-responsive.min.css" />
		<link rel="stylesheet" href="static/css/font-awesome.min.css" />

		<!-- page specific plugin styles -->
		<!--<link rel="stylesheet" href="static/css/jquery-ui-1.10.2.custom.min.css" />-->
		<link rel="stylesheet" href="css/jquery-ui.css">
		<!-- ace styles -->
		<link rel="stylesheet" href="static/css/ace.min.css" />
		
		<!-- 引入 -->
		<script src="static/1.9.1/jquery.min.js"></script>
		<script src="static/js/bootstrap.min.js"></script>
		<script src="static/js/ace-elements.min.js"></script>
		<script src="static/js/ace.min.js"></script>
		<!-- 引入 -->

		<!--<script type="text/javascript" src="static/js/jquery-ui-1.10.2.custom.min.js"></script>-->
		<!--<script type="text/javascript" src="static/js/jquery.ui.touch-punch.min.js"></script>-->
		<script type="text/javascript" src="static/js/chosen.jquery.min.js"></script>
		<!--<script type="text/javascript" src="static/js/fuelux.spinner.js"></script>-->
		<script type="text/javascript" src="static/js/jquery.knob.min.js"></script>
		<script type="text/javascript" src="static/js/jquery.autosize-min.js"></script>
		<script type="text/javascript" src="static/js/jquery.inputlimiter.1.3.1.min.js"></script>
		<script type="text/javascript" src="static/js/jquery.maskedinput.min.js"></script>

		<!-- 引入Echart -->
		<script type="text/javascript" src="static/js/echarts-all.js"></script>
		<script type="text/javascript" src="js/jquery-ui.js"></script>
		

	</head>

	<body>
		<input type="hidden" id="projectId" name="projectId" value="${projectId}" />
		<div class="container-fluid" id="main-container">
			<div id="page-content" class="clearfix">
				<div class="row-fluid">
					<div class="tabbable">
						<ul class="nav nav-tabs" id="situation">
							<li class="active">
								<a data-toggle="tab" href="#climate"><i class="pink icon-dashboard bigger-110"></i>气候情景</a>
							</li>
							<li>
								<a data-toggle="tab" href="#industry"><i class="blue icon-user bigger-110"></i>产业与城市发展情景</a>
							</li>
							<li>
								<a data-toggle="tab" href="#land"><span class="badge badge-success badge-icon">
									<i class="icon-caret-right"></i></span>土地利用情景</a>
							</li>
<!-- 		！！！！！！！！！！！！！！注意，这里“土地利用情景”和“社会经济发展情景”进行了标签的调换，代码没改变位置！！！！！！by 马超 -->
							<li>
								<a data-toggle="tab" href="#economy"><i class="blue icon-user bigger-110"></i>社会经济发展情景</a>
							</li>
							<li>
								<a data-toggle="tab" href="#water"><span class="badge badge-success badge-icon">
									<i class="icon-caret-right"></i></span>水资源管理情景</a>
							</li>

						</ul>
						<div class="tab-content">
							<!-- 设置气候情景区域 -->
							<div id="climate" class="tab-pane in active">

								<div class="row-fluid">
									<div class="span2"></div>
										<label style="margin-top: 10px;">
											<span>选择区县</span>
											<select id="IPCC-selectCounty">
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
											<span>选择年份</span>
											<select id="IPCC-selectYears">
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
										</label>
									<div class="span1" style="margin-left: 0px;"></div>
									<div class="span10">
										<h4 class="header smaller lighter blue">
										<i class="icon-certificate"></i>
										<span>选择气候情景(IPCC)</span>
									</h4>
									</div>
									<div class="span1"></div>
								</div>

								<div class="row-fluid">
									<div class="span2"></div>
									<div class="span6">
									<label>
									<span>选择气候情景(IPCC)</span>
									<select id="IPCC" name="IPCC" style="margin:0px; width:430px">
										<option value="8.5">高排放情景，2100年地表接收稳定辐射强度大于8.5 W/m2</option>
										<option value="6">较高排放情景，2100年地表接收稳定辐射强度控制在6 W/m2</option>
										<option value="4.5">中等排放情景，2100年地表接收稳定辐射强度控制在4.5 W/m2</option>
										<option value="2.6">低排放情景，2100年地表接收稳定辐射强度小于3 W/m2</option>
									</select>
									</label>
									</div>
								</div>
								<div class="row-fluid">
									<div class="span6" id="showArea-1" style="text-align:right;height:300px">
										<!-- ECharts图表显示 -->
									</div>
									<div class="span6" id="showArea-2" style="text-align:left;height:300px">
										<!-- ECharts图表显示 -->
									</div>
								</div>

								<div class="row-fluid">
									<div class="span1"></div>
									<div class="span10">
										<hr style="height:1px" color="#c2daee">
										<h4 class="header smaller lighter blue">
										<i class="icon-bolt"></i>
										<span >自定义气候情景</span>
									</h4>
									</div>
									<div class="span1"></div>
								</div>

								<div class="row-fluid">
									<div class="span2"></div>
									<div class="span2">
										<label>
										<span >降雨增加比例</span>
									</label>
									</div>
									<div class="span6">
										<div id="slider-1-1" style="float:right;display:inline;"></div>
									</div>
									<div class="span2">
										<input type="text" class="input-mini" id="rain_inc_ratio" value="2" />%
									</div>
								</div>
								<div class="row-fluid">
									<div class="span2"></div>
									<div class="span2">
										<label>
										<span >温度增加比例</span>
									</label>
									</div>
									<div class="span6">
										<div id="slider-1-2" style="float:right;display:inline;"></div>
									</div>
									<div class="span2">
										<input type="text" class="input-mini" id="temp_inc_ratio" value="2" />%
									</div>
								</div>
									<div class="form-actions" align="center" style="background-color: #FFFFFF;">
											<!-- 如果设置为type="submit"点击以后会触发页面刷新 -->
											<button class="btn btn-small btn-success" type="button" id="climate_submit">确定</button> &nbsp;
											<button class="btn btn-small btn-warning" type="reset" id="climate_reset">重置</button>
									</div>
							</div>

							<!-- 设置产业与城市发展情景 -->
							<div id="industry" class="tab-pane">
								<div class="row-fluid">
									<div class="span2"></div>
											<label style="margin-top: 10px;">
										<span>选择区县</span>
										<select id="industry-selectCounty">
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
										<span>选择年份</span>
										<select id="industry-selectYears">
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
									</label>
									<div class="span1" style="margin-left: 0px;"></div>
									<div class="span10">
										<div class="row-fluid" id="population_proportation">
											<h4 class="header smaller lighter blue">
											<i class="icon-group"></i> 非农业人口比例
										</h4>
											<div>
												<div class="span1"></div>
												<div class="span2">
													农业人口
												</div>
												<div class="span7">
													<div id="slider-farmpop-1" style="float:left;display:inline;"></div>
												</div>
												<div class="span2">
													<input type="text" id="text-farmpop-1" value="1" style="width:40px;height:20px">万人
												</div>
											</div>
											<div>
												<div class="span1"></div>
												<div class="span2">
													非农业人口
												</div>
												<div class="span7">
													<div id="slider-farmpop-2" style="float:left;display:inline;"></div>
												</div>
												<div class="span2">
													<input type="text" id="text-farmpop-2" value="1" style="width:40px;height:20px">万人
												</div>
											</div>
											<div>
												<div class="span1"></div>
												<div class="span10">
													非农业人口比例变化率：
													<input type="spinner" value="37.0" class="input-mini" id="population_proportation_spinner"/>%
												</div>
											</div>
											<div class="row-fluid">
												<div class="span12" style="margin-left:7%">
												<div id="showArea-3" style="height:300px;width:800px"></div>
													<!-- ECharts图表显示 -->
												</div>
											</div>
										</div>
										<hr style="height:1px" color="#c2daee">
										<div>
											<h4 class="header smaller lighter blue">
										<i class="icon-cogs"></i> 产业结构调整
										</h4>
											<div>
												<div>
													<div class="span9"></div>
													<div class="span1">
														产值比例
													</div>
													<div class="span2">
														产值
													</div>
												</div>
												<div>
													<div>
														<div class="span1"></div>
														<div class="span1">
															工业
														</div>
														<div class="span7">
															<div id="slider-1" style="float:left;display:inline;"></div>
														</div>
														<div class=span3>
															<input type="text" id="situation-1" value="26.8" style="width:40px;height:20px">%
															<input type="text" id="situation-1-2" value="33.17" style="width:60px;height:20px">亿元
														</div>
													</div>
													<div>
														<div class="span1"></div>
														<div class="span1">
															农业
														</div>
														<div class="span7">
															<div id="slider-2" style="float:left;display:inline;"></div>
														</div>
														<div class=span3>
															<input type="text" id="situation-2" value="29.4" style="width:40px;height:20px">%
															<input type="text" id="situation-2-2" value="36.4" style="width:60px;height:20px">亿元
														</div>
													</div>
													<div>
														<div class="span1"></div>
														<div class="span1">
															服务业
														</div>
														<div class="span7">
															<div id="slider-3" style="float:left;display:inline;"></div>
														</div>
														<div class=span3>
															<input type="text" id="situation-3" value="43.8" style="width:40px;height:20px">%
															<input type="text" id="situation-3-2" value="54.24" style="width:60px;height:20px">亿元
														</div>
													</div>
												</div>
												<div class="row-fluid">
													<div class="span12" style="margin-left:7%">
													<div id="showArea-4" style="height:300px;width:800px"></div>
														<!-- ECharts图表显示 -->
													</div>
												</div>
											</div>
										</div>
										<hr style="height:1px" color="#c2daee">
										<div>
											<h4 class="header smaller lighter blue">
										<i class="icon-cloud-upload"></i> 产业进步率
										</h4>
											<div>
												<div class="span1"></div>
												<div class="span2">
													产业进步率
												</div>
												<div class="span7">
													<div id="slider-4" style="float:left;display:inline;"></div>
												</div>
												<div class="span2">
													<input type="text" id="situation-4" value="1" style="width:40px;height:20px">%
												</div>
											</div>
											<p align="center"><span class="red">*科技进步，包括设备改进，方法创新与改进等引起的产业与产值的变化</span></p>
										</div>
										<hr style="height:1px" color="#c2daee">
										<div>
											<h4 class="header smaller lighter blue">
										<i class="icon-glass"></i>旅游业
										</h4>
											<div>
												<div class="span1"></div>
												<div class="span2">
													旅游业产值变化率
												</div>
												<div class="span7">
													<div id="slider-5" style="float:right;display:inline;"></div>
												</div>
												<div class="span2">
													<input type="text" id="situation-5" value="5" style="width:40px;height:20px">%
												</div>
											</div>
										</div>
										
									</div>
									<div class="span1"></div>
								</div>
								<div class="form-actions" align="center" style="background-color: #FFFFFF;">
											<!-- 如果设置为type="submit"点击以后会触发页面刷新 -->
											<button class="btn btn-small btn-success" type="button" id="IndUrbanScePara_submit">确定</button> &nbsp;
											<button class="btn btn-small btn-warning" type="reset" id="climate_reset">重置</button>
										</div>
							</div>

							<!-- 设置社会经济发展情景 -->
							<div id="economy" class="tab-pane">
								<div class="row-fluid">
									<div class="span2"></div>
											<label style="margin-top: 10px;">
										<span>选择区县</span>
										<select id="water-selectCounty">
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
										<span>选择年份</span>
										<select id="water-selectYears">
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
									</label>
										
										<div class="span1" style="margin-left:0px"></div>
									<div class="span10">
										
										<h4 class="header smaller lighter blue">
										<span class="lbl"><i class="icon-credit-card"></i> 人均GDP增长率</span>
									</h4>
									</div>
									<div class="span1">
									</div>
								</div>
								<div class="row-fluid">
									<div class="span2"></div>
									<div class="span8" style="font-family: '微软雅黑';">
										<span>人均GDP增长率：</span>
										<input type="spinner" class="input" id="GDPInc_spinner1" value= "0.3"/>%&nbsp(-1%~1%)&nbsp&nbsp
										<span>GDP增长率：</span>
										<input type="spinner" class="input" id="GDPInc_spinner2" value= "8"/>%&nbsp(-10%~20%)
									</div>

								</div>

								<div class="row-fluid">
									<div class="span1"></div>
									<div class="span12" style="margin-left:14%">
										<div id="economy-showArea-1" style="height:300px;width:800px">
											<!-- 显示人均GDP变化图表 -->
										</div>
									</div>
									<div class="span1"></div>
								</div>

								<div class="row-fluid">
									<div class="span1"></div>
									<div class="span10">
										<hr style="height:1px" color="#c2daee">
										<h4 class="header smaller lighter blue">
										<span ><i class="icon-group"></i> 人口政策</span>
									</h4>
									</div>
									<div class="span1"></div>
								</div>

								<div class="row-fluid">
									<div class="span2">
									</div>
									<div class="span8">
										<label>
									<input name="population_policy" type="radio" />
									<span class="lbl"> 一胎</span>
 
									<input name="population_policy" type="radio" />
									<span class="lbl"> 两胎</span>

									<input name="population_policy" type="radio" />
									<span class="lbl"> 全面放开</span>
								</label>
									</div>
									<div class="span2">
									</div>
								</div>

								<div class="row-fluid">
									<div class="span1"></div>
									<div class="span10">
										<hr style="height:1px" color="#c2daee">
										<h4 class="header smaller lighter blue">
										<span ><i class="icon-exchange"></i> 水利工程建设</span>
									</h4>
									</div>
									<div class="span1"></div>
								</div>

								<div class="row-fluid">
									<div class="span2"></div>
									<div class="span8">
										
										<div class="row-fluid">
											<div class="span8"></div>
											<div class="span4" style="text-align:left;padding-top: 6px;padding-left: 8px;">
												水利用率&nbsp;<span style="float: right;margin-right: 25px;">渠道长度</span>
											</div>
										</div>
										
										<div class="row-fluid">
											<div class="span1">
												<span>干渠</span>
											</div>
											<div class="span7" style="margin-top:4px">
												<div class="progress progress-small progress-striped active">
													<div id="ganQuBar" class="bar" style="width: 40%;"></div>
												</div>
											</div>
											<div class="span4">
												<input type="spinner" class="input" id="ganQu_spinner" value="40"/>%
												<span style="margin-bottom:8px;margin-top:0px;float:right">
													<input type="text" class="input" id="ganQu_text" value="943.08" style="width: 60px;"/>km
												</span>
											</div>
										</div>

										<div class="row-fluid">
											<div class="span1">
												<span>支渠</span>
											</div>
											<div class="span7" style="margin-top:4px">
												<div class="progress progress-small progress-striped active">
													<div id="zhiQuBar" class="bar" style="width: 45%;"></div>
												</div>
											</div>
											<div class="span4">
												<input type="spinner" class="input" id="zhiQu_spinner" value="45"/>%
												<span style="float:right">
													<input type="text" class="input" id="zhiQu_text" value="1033.63" style="width: 60px;"/>km
												</span>
											</div>
										</div>

										<div class="row-fluid">

											<div class="span1">
												<span class="lbl">斗渠</span>
											</div>
											<div class="span7" style="margin-top:4px">

												<div class="progress progress-small progress-striped active">
													<div id="douQuBar" class="bar" style="width: 90%;"></div>
												</div>

											</div>
											<div class="span4">
												<input type="spinner" class="input" id="douQu_spinner" value="90"/>%
												<span style="float:right">
													<input type="text" class="input" id="douQu_text" value="2318.42" style="width: 60px;"/>km
												</span>

											</div>

										</div>

										<div class="row-fluid">

											<div class="span1">
												<span class="lbl">农渠</span>
											</div>
											<div class="span7" style="margin-top:4px">

												<div class="progress progress-small progress-striped active">
													<div id="nongQuBar" class="bar" style="width: 0%;"></div>
												</div>

											</div>
											<div class="span4">
												<input type="spinner" class="input" id="nongQu_spinner" value="0"/>%
												<span style="float:right">
													<input type="text" class="input" id="nongQu_text" value="2.42" style="width: 60px;"/>km
												</span>
											</div>

										</div>

										<div class="row-fluid">

											<div class="span1">
												<span class="lbl">毛渠</span>
											</div>
											<div class="span7" style="margin-top:4px">

												<div class="progress progress-small progress-striped active">
													<div id="maoQuBar" class="bar" style="width: 0%;"></div>
												</div>

											</div>
											<div class="span4">
												<input type="spinner" class="input" id="maoQu_spinner" value="0"/>%
												<span style="float:right">
													<input type="text" class="input" id="maoQu_text" value="0" style="width: 60px;"/>km
													
												</span>
											</div>

										</div>

									</div>
									<div class="span2"></div>

								</div>

								<div class="row-fluid">
									<div class="span1"></div>
									<div class="span12" style="margin-left:14%">
										<div id="economy-showArea-2" style="height:300px;width:800px">
											<!-- 显示各级渠道长度与水利用率变化图表 -->
										</div>
									</div>
									<div class="span1"></div>
								</div>

								<div class="row-fluid">
									<div class="span2"></div>
									<div class="span8">
										<div class="row-fluid">
											<div class="span2">滴灌面积</div>
											<div class="span8">
												<div id="economy-slider-1" style="float:right;display:inline;"></div>
											</div>
											<div class="span2">
												<input type="text" id="economy-diGuanArea" class="input-mini" value="50">万亩
											</div>
										</div>
									</div>
									<div class="span2"></div>
								</div>
								
								<div class="row-fluid">
									<div class="span2"></div>
									<div class="span8">
										<div class="row-fluid">
											<div class="span2">喷灌面积</div>
											<div class="span8">
												<div id="economy-slider-2" style="float:right;display:inline;"></div>
											</div>
											<div class="span2">
												<input type="text" id="economy-penGuanArea" class="input-mini" value="50">万亩
											</div>
										</div>
									</div>
									<div class="span2"></div>
								</div>
								
								<div class="row-fluid">
									<div class="span1"></div>
									<div class="span10">
										<hr style="height:1px" color="#c2daee">
										<h4 class="header smaller lighter blue">
										<span ><i class="icon-exchange"></i> 优惠政策补贴</span>
									</h4>
									</div>
									<div class="span1"></div>
								</div>
								
								<div class="row-fluid">
									<div class="span2"></div>
									<div class="span8">
										<div class="row-fluid">
											<div class="span2">工业</div>
											<div class="span8">
												<div id="economy-slider-3" style="float:right;display:inline;"></div>
											</div>
											<div class="span2">
												<input type="text" id="economy-industry" class="input-mini" value="35">元&nbsp;(单位产值补贴金额)
											</div>
										</div>
									</div>
									<div class="span2"></div>
								</div>
								<div class="row-fluid">
									<div class="span2"></div>
									<div class="span8">
										<div class="row-fluid">
											<div class="span2">农业</div>
											<div class="span8">
												<div id="economy-slider-4" style="float:right;display:inline;"></div>
											</div>
											<div class="span2">
												<input type="text" id="economy-farm" class="input-mini" value="20">元&nbsp;(每亩补贴金额，包括税收)
											</div>
										</div>
									</div>
									<div class="span2"></div>
								</div>
								<div class="row-fluid">
									<div class="span2"></div>
									<div class="span8">
										<div class="row-fluid">
											<div class="span2">服务业</div>
											<div class="span8">
												<div id="economy-slider-5" style="float:right;display:inline;"></div>
											</div>
											<div class="span2">
												<input type="text" id="economy-service" class="input-mini" value="50">元&nbsp;(单位产值补贴金额，税收)
											</div>
										</div>
									</div>
									<div class="span2"></div>
								</div>
								<div class="row-fluid">
									<div class="span1"></div>
									<div class="span10">
										<hr style="height:1px" color="#c2daee">
										<h4 class="header smaller lighter blue">
										<i class="icon-cloud-upload"></i>节水技术情景
									</h4>
									</div>
									<div class="span1"></div>
								</div>
								<div class="row-fluid">
									<div class="span2"></div>
									<div class="span8">
										<div class="row-fluid">
											<div class="span2">节水技术提高</div>
											<div class="span8">
												<div id="slider-water-saving" style="float:right;display:inline;"></div>
											</div>
											<div class="span2">
												<input type="text" id="water-saving" class="input-mini" value="10" style="width:40px;height:20px">%
											</div>
											<div class="span12">
												<p align="center"><span class="red">*节水技术，包括水利工程改善、节水方式改善</span></p>
											</div>
										</div>
									</div>
									<div class="span2"></div>
								</div>
								
								<div class="form-actions" align="center" style="background-color: #FFFFFF;">
											<!-- 如果设置为type="submit"点击以后会触发页面刷新 -->
											<button class="btn btn-small btn-success" type="button" id="economy_submit">确定</button> &nbsp;
											<button class="btn btn-small btn-warning" type="reset" id="economy_reset">重置</button>
								</div>
							</div>

							<!-- 设置土地利用情景 -->
							<div id="land" class="tab-pane">
								<div class="row-fluid">
									<div class="span1"></div>
									<div class="span10">
										<div class="row-fluid" id="area_rateofchange">
											<div class="span1"></div>
											<label style="margin-top: 10px;">
										<span>选择区县</span>
										<select id="land_selectCounty">
											<option value="620702">甘州</option>
											<option value="620723">临泽</option>
											<option value="620724">高台</option>
											<option value="152923">额济纳旗</option>
											<option value="620921">金塔</option>
											<option value="620722">民乐</option>
											<option value="620721">肃南</option>
											<option value="620902" selected="selected">肃州</option>
											<option value="620200">嘉峪关市</option>
											<option value="632222">祁连</option>
										</select>
										<span>选择年份</span>
										<select id="land-selectYears">
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
									</label>
											<h4 class="header smaller lighter blue"><i class="icon-credit-card"></i>耕地面积变化</h4>
											<div>
												<div class="span1" style="margin-left:0px"></div>
												<div class="span1">耕地面积</div>
												<div class="span6">
													<div id="gengdi_slider_1" style="float:left;display:inline;"></div>
												</div>
												<div class=span4>
													<input type="text" id="gengdi_situation_1" value="0" style="width:60px;height:20px">万亩
												</div>
												<div class="span1"></div>
												<div class="span5" style="text-align:center">
													耕地面积变化率： <input type="spinner" class="input-mini" id="area_rateofchange_spinner" value="1"/>%
												</div>
											</div>
											<div class="row-fluid">
												<div class="span12" style="margin-left:7%">
												<div id="land_show_1" style="height:300px;width:800px"></div>
													<!-- ECharts图表显示 -->
												</div>
											</div>
										</div>
										<hr style="height:1px" color="#c2daee">
										<div>
											<h4 class="header smaller lighter blue"><i class="icon-glass"></i>种植结构调整</h4>
											<div>
												<div>
													<div class="span8"></div>
													<div class="span1">变化率</div>
													<div class="span1">&nbsp&nbsp面积</div>
													<div class="span2"></div>
												</div>
												<div>
													<div>
														<div class="span1"></div>
														<div class="span1">小麦</div>
														<div class="span6">
															<div id="land_slider_1" style="float:left;display:inline;"></div>
														</div>
														<div class=span4>
															<input type="text" id="land_situation_1" value="0" style="width:40px;height:20px">%&nbsp&nbsp&nbsp&nbsp
															<input type="text" id="land_situation_1_2" value="0" style="width:60px;height:20px">万亩
														</div>
													</div>
													<div>
														<div class="span1"></div>
														<div class="span1">玉米</div>
														<div class="span6">
															<div id="land_slider_2" style="float:left;display:inline;"></div>
														</div>
														<div class=span4>
															<input type="text" id="land_situation_2" value="0" style="width:40px;height:20px">%&nbsp&nbsp&nbsp&nbsp
															<input type="text" id="land_situation_2_2" value="0" style="width:60px;height:20px">万亩
														</div>
													</div>
													<div>
														<div class="span1"></div>
														<div class="span1">油料</div>
														<div class="span6">
															<div id="land_slider_3" style="float:left;display:inline;"></div>
														</div>
														<div class=span4>
															<input type="text" id="land_situation_3" value="0" style="width:40px;height:20px">%&nbsp&nbsp&nbsp&nbsp
															<input type="text" id="land_situation_3_2" value="0" style="width:60px;height:20px">万亩
														</div>
													</div>
												</div>
												<div>
													<div class="span1"></div>
													<div class="span1">蔬菜</div>
													<div class="span6">
														<div id="land_slider_4" style="float:left;display:inline;"></div>
													</div>
													<div class=span4>
														<input type="text" id="land_situation_4" value="0" style="width:40px;height:20px">%&nbsp&nbsp&nbsp&nbsp
														<input type="text" id="land_situation_4_2" value="0" style="width:60px;height:20px">万亩
													</div>
												</div>
											</div>
											<div>
												<div class="span1"></div>
												<div class="span1">果园</div>
												<div class="span6">
													<div id="land_slider_5" style="float:left;display:inline;"></div>
												</div>
												<div class=span4>
													<input type="text" id="land_situation_5" value="0" style="width:40px;height:20px">%&nbsp&nbsp&nbsp&nbsp
													<input type="text" id="land_situation_5_2" value="0" style="width:60px;height:20px">万亩
												</div>
											</div>

											<div>
												<div class="span1"></div>
												<div class="span1">棉花</div>
												<div class="span6">
													<div id="land_slider_6" style="float:left;display:inline;"></div>
												</div>
												<div class=span4>
													<input type="text" id="land_situation_6" value="0" style="width:40px;height:20px">%&nbsp&nbsp&nbsp&nbsp
													<input type="text" id="land_situation_6_2" value="0" style="width:60px;height:20px">万亩
												</div>
											</div>
										</div>

										<div class="row-fluid">
											<div class="span12" style="margin-left:7%">
											<div id="land_show_2" style="height:300px;width:800px"></div>
												<!-- ECharts图表显示 -->
											</div>
										</div>
										<hr style="height:1px" color="#c2daee">
										<div>
											<h4 class="header smaller lighter blue"><i class="icon-glass"></i>土地流转</h4>
												<div style="width:100%">
												</div>
													</br>
														<div class="span1" style="margin-left:0px"></div>
														<div class="span1">湿地面积</div>
														<div class="span6">
															<div id="landuse_slider_1" style="float:left;display:inline;"></div>
														</div>
														<div class=span4>
															<input type="text" id="landuse_situation_1" value="0" style="width:60px;height:20px">万亩
														</div>
														</br>
														<div class="span1" style="margin-left:0px"></div>
														<div class="span1">林地面积</div>
														<div class="span6">
															<div id="landuse_slider_2" style="float:left;display:inline;"></div>
														</div>
														<div class=span4>
															<input type="text" id="landuse_situation_2" value="0" style="width:60px;height:20px">万亩
														</div>
														</br>
														<div class="span1" style="margin-left:0px"></div>
														<div class="span1">草地面积</div>
														<div class="span6">
															<div id="landuse_slider_3" style="float:left;display:inline;"></div>
														</div>
														<div class=span4>
															<input type="text" id="landuse_situation_3" value="0" style="width:60px;height:20px">万亩
														</div>
														</br>
														<div class="span1" style="margin-left:0px"></div>
														<div class="span1">水域面积</div>
														<div class="span6">
															<div id="landuse_slider_4" style="float:left;display:inline;"></div>
														</div>
														<div class=span4>
															<input type="text" id="landuse_situation_4" value="0" style="width:60px;height:20px">万亩
														</div>
														</br>
													</div>
													<div class="row-fluid">
														<div class="span12" style="margin-left:7%">
														<div id="land_show_3" style="height:300px;width:800px"></div>
														<!-- ECharts图表显示 -->
													</div>
										</div>
												</div>
									<div class="span1"></div>
								</div>
								<div class="form-actions" align="center" style="background-color: #FFFFFF;">
											<!-- 如果设置为type="submit"点击以后会触发页面刷新 -->
											<button class="btn btn-small btn-success" type="button" id="landuse_submit">确定</button> &nbsp;
											<button class="btn btn-small btn-warning" type="reset" id="landuse_reset">重置</button>
										</div>
							</div>

							<!-- 设置水资源管理情景 -->
							<div id="water" class="tab-pane">
								<div class="span1"></div>
								<div class="span10">
									<form class="form-horizontal" id="form_water" name="form_water" action="#" method="post">
										<fieldset>
											<h4 class="header smaller lighter blue"><i class="icon-exchange"></i>流域中下游水分配</h4>

											<div class="row-fluid" style="margin-top:15px">
												<div class="span3" style="text-align:center">
													<span class="lbl">可供地表水</span>
													<input type="spinner" class="input" id="water_province_total" value="15880" />
													<span class="lbl">万m^3</span>
												</div>
												<div class="span1"></div>
												<div class="span3">
													<span class="lbl">中游</span>
													<input type="text" id="water_province_1" style="width:60px;height:28px" value="7940" />
													<!-- 设置该文本框显示的初始值 -->
													<span class="lbl">万m^3</span>
												</div>
												<div class="span2"></div>
												<div class="span3">
													<span class="lbl">下游</span>
													<input type="text" id="water_province_2" style="width:60px;height:28px" value="7940" />
													<!-- 设置该文本框显示的初始值 -->
													<span class="lbl">万m^3</span>
												</div>
											</div>
											<div class="row-fluid" style="margin-top: 10px">
												<div class="span4"></div>
												<div class="span7">
													<div id="slider-available-water" style="float:left;display:inline;"></div>
												</div>
												<div class="span1"></div>
											</div>
											<div class="row-fluid" style="margin-top:15px">
												<div class="span3" style="text-align:center">
													<span class="lbl">中下游用水量变化率</span>

												</div>
												<div class="span1"></div>
												<div class="span3">
													<span class="lbl">中游</span>
													<input type="text" class="input" id="water_province_ratio_1" style="width:60px;height:28px" value="50" />
													<!-- 设置该文本框显示的初始值 -->
													<span class="lbl">%</span>
												</div>
												<div class="span2"></div>
												<div class="span3">
													<span class="lbl">下游</span>
													<input type="text" class="input" id="water_province_ratio_2" style="width:60px;height:28px" value="50" />
													<!-- 设置该文本框显示的初始值 -->
													<span class="lbl">%</span>
												</div>
											</div>
											<div class="row-fluid">
												<div class="span12" id="using-water" style="height:300px;width:800px">
													<!-- ECharts图表显示 -->
												</div>
											</div>
											<hr style="height:1px" color="#c2daee">
											<h4 class="header smaller lighter blue"><i class="icon-exchange"></i>水权分配</h4>

											<div class="row-fluid">
												<div class="span1"></div>
												<div class="span9">
													选择地区：
													<select id="selectToCounty">
														<option value="ZhangYe">张掖市</option>
														<option value="JiaYuGuan">嘉峪关市</option>
													</select>
												</div>
												<div class="span1"></div>
											</div>

											<div id="dropdown1" class="row-fluid">
												<div class="row-fluid" style="margin-top: 15px">
													<div class="span3"></div>
													<div class="span2 water_county_span" id="620702">甘州</div>
													<div class="span2 water_county_span" id="620723">临则</div>
													<div class="span2 water_county_span" id="620724">高台</div>
												</div>
												<div class="row-fluid" style="margin-top:15px">
													<div class="span3" style="text-align:center">水权分配比例</div>
													<div class="span2">
														<input type="spinner" class="input water_county_ratio" id="water_county_ratio_1" value="95"/>
														<span class="lbl">%</span>
													</div>
													<div class="span2">
														<input type="spinner" class="input water_county_ratio" id="water_county_ratio_2" value="5"/>
														<span class="lbl">%</span>
													</div>
													<div class="span2">
														<input type="spinner" class="input water_county_ratio" id="water_county_ratio_3" value="0"/>
														<span class="lbl">%</span>
													</div>
												</div>
												<div class="row-fluid" style="margin-top:15px">
													<div class="span3" style="text-align:center">
														<span class="lbl">总可用水量</span> <input type="spinner" class="input" id="water_county_total" value="12000"/> <span class="lbl">万m^3</span>
													</div>
													<div class="span2">
														<input type="text" id="water_county_distribution1" style="width:60px;height:28px" value="11400" /> <span class="lbl">万m^3</span>
													</div>
													<div class="span2">
														<input type="text" id="water_county_distribution2" style="width:60px;height:28px" value="600" /> <span class="lbl">万m^3</span>
													</div>
													<div class="span2">
														<input type="text" id="water_county_distribution3" style="width:60px;height:28px" value="0" /> <span class="lbl">万m^3</span>
													</div>
												</div>
											</div>
											<div id="dropdown2" class="row-fluid">
												<div class="row-fluid" style="margin-top: 15px">
													<div class="span3"></div>
													<div class="span2 water_county_span" id="A">A</div>
													<div class="span2 water_county_span" id="B">B</div>
													<div class="span2 water_county_span" id="C">C</div>
													<div class="span2 water_county_span" id="D">D</div>
												</div>
												<div class="row-fluid" style="margin-top:15px">
													<div class="span3" style="text-align:center">水权分配比例</div>
													<div class="span2">
														<input type="spinner" class="input water_county_ratio" id="water_county_ratio_2_1" value="95"/> <span class="lbl">%</span>
													</div>
													<div class="span2">
														<input type="spinner" class="input water_county_ratio" id="water_county_ratio_2_2" value="5"/> <span class="lbl">%</span>
													</div>
													<div class="span2">
														<input type="spinner" class="input water_county_ratio" id="water_county_ratio_2_3" value="0"/> <span class="lbl">%</span>
													</div>
													<div class="span2">
														<input type="spinner" class="input water_county_ratio" id="water_county_ratio_2_4" value="0"/> <span class="lbl">%</span>
													</div>
												</div>
												<div class="row-fluid" style="margin-top:15px">
													<div class="span3" style="text-align:center">
														<span class="lbl">总可用水量</span> <input type="spinner" class="input" id="water_county_total2" value="12000"/> <span class="lbl">万m^3</span>
													</div>
													<div class="span2">
														<input type="text" id="water_county_distribution2_1" style="width:60px;height:28px" value="11400" /> <span class="lbl">万m^3</span>
													</div>
													<div class="span2">
														<input type="text" id="water_county_distribution2_2" style="width:60px;height:28px" value="600" /> <span class="lbl">万m^3</span>
													</div>
													<div class="span2">
														<input type="text" id="water_county_distribution2_3" style="width:60px;height:28px" value="0" /> <span class="lbl">万m^3</span>
													</div>
													<div class="span2">
														<input type="text" id="water_county_distribution2_4" style="width:60px;height:28px" value="0" /> <span class="lbl">万m^3</span>
													</div>
												</div>
											</div>

											<hr style="height:1px" color="#c2daee">
											<div class="row-fluid">
												<h4 class="header smaller lighter blue">
									<i class="icon-cogs"></i>水资源分配方式
									</h4>
												<div class="row-fluid">
													<div class="span1"></div>
													<div class="span9">
														<select id="distribution-selectCounty">
															<option value="PinJun">平均分配</option>
															<option value="ShuiQuan">水权分配</option>
															<option value="YouHua">优化分配</option>
														</select>
													</div>
													<div class="span1"></div>
												</div>
											</div>

										</fieldset>
										<div class="form-actions" align="center" style="background-color: #FFFFFF;">
											<!-- 如果设置为type="submit"点击以后会触发页面刷新 -->
											<button class="btn btn-small btn-success" type="button" id="watersce_submit">确定</button> &nbsp;
											<button class="btn btn-small btn-warning" type="reset" id="watersce_reset">重置</button>
											<div class="row" style="margin-top: 5px">
												<div class="col-sm-6 col-sm-offset-3"></div>
												<div class="col-sm-3" style="text-align: right">
													<button class="btn btn-primary" type="button" id="nextStep"
														onclick="javascript:;">
														下一步：情景摘要</button>
												</div>
											</div>
										</div>
									</form>
								</div>
								<div class="span1"></div>
							</div>

						</div>
					</div>
				</div>
			</div>
		</div>
		<script src="js/situation.jq.js"></script>
		
		<script type="text/javascript">
		
		var options="";
// 		加载select的option
		$.get(
			"getProjectById.do",
			{projectId:"${projectId}"},
			function(data){
				for(var i=parseInt(data.goalYear);i>=parseInt(data.baseYear);i--){
					options=options+"<option>"+i.toString()+"</option>";
				}
				$("#IPCC-selectYears").empty();
				$("#IPCC-selectYears").append(options);
				$("#industry-selectYears").empty();
				$("#industry-selectYears").append(options);
				$("#land-selectYears").empty();
				$("#land-selectYears").append(options);
				$("#water-selectYears").empty();
				$("#water-selectYears").append(options);
			}
		)
		
		$("#nextStep").on("click",function(){
			location.href = 'jumpToAbstract.do?projectId='+document.getElementById("projectId").value;
		})
		
		
		$("span").on("click",function(){
			$("input").trigger("change");
		});
			
		$("#IPCC").on("change",function(){
			$("#IPCC-selectCounty").trigger("change");
		});
			$("#IPCC-selectCounty").on("change", function() {
				//气候情景温度变化图
				showFigure_1();
				//气候情景：降水变化图
				showFigure_2();
				//从数据库取初值放上页面
				$.get(
						"getSceParaByProjectIdAndCountryId.do",
						{
							"projectId" : "${projectId}",
							"countryId" : document.getElementById("IPCC-selectCounty").value,
							"year": document.getElementById("IPCC-selectYears").value,
							"tab":"1"
						},function(data){
							if(data.isEmpty!="1"){
								document.getElementById("rain_inc_ratio").value=data.rainInc,
								document.getElementById("temp_inc_ratio").value=data.tempInc
							  } 
					});
			});
			
			$("#industry-selectCounty").on("change",function(){
				//非农业人口比例变化
				showFigure_3();
				//三产产值变化
				showFigure_4();
				
				$.get(
						"getSceParaByProjectIdAndCountryId.do",
						{
							"projectId" : "${projectId}",
							"countryId" : document.getElementById("industry-selectCounty").value,
							"year": document.getElementById("industry-selectYears").value,
							"tab":"2"
						},function(data){
							if(data.isEmpty!="1"){
							document.getElementById("population_proportation_spinner").value=data.nonFarmPercent,
							document.getElementById("situation-1").value=data.fldIndOutput,
							document.getElementById("situation-1-2").value=data.fldIndOutputPercent,
							document.getElementById("situation-2").value=data.fldAgrOutput,
							document.getElementById("situation-2-2").value=data.fldAgrOutputPercent,
							document.getElementById("situation-3").value=data.fldSerOutput,
							document.getElementById("situation-3-2").value=data.fldSerOutputPercent,
							document.getElementById("situation-4").value=data.industryProgressRate,
							document.getElementById("situation-5").value=data.changeRateOfTourismIndustry
							}
						});
			});
			
			$("#water-selectCounty").on("change", function(){
				//人均GDP变化
				showFigure_5();
				//各级渠道长度与水利用率变化
				showFigure_6();
				
				$.get(
						"getSceParaByProjectIdAndCountryId.do",
						{
							"projectId" : "${projectId}",
							"countryId" : document.getElementById("water-selectCounty").value,
							"year": document.getElementById("water-selectYears").value,
							"tab":"3"
						},function(data){
							if(data.isEmpty!="1"){
							document.getElementById("GDPInc_spinner1").value=data.perCapGDPR,
							document.getElementById("GDPInc_spinner2").value=data.perCapGDP,
							document.getElementById("ganQu_spinner").value=data.fldMainCanWUE,
							document.getElementById("ganQu_text").value=data.fldMainCannelLeng,
							document.getElementById("zhiQu_spinner").value=data.fldBranCanWUE,
							document.getElementById("zhiQu_text").value=data.fldBranCannelLeng,
							document.getElementById("douQu_spinner").value=data.fldDouWUE,
							document.getElementById("douQu_text").value=data.fldDouLeng,
							document.getElementById("nongQu_spinner").value=data.fldNongWUE,
							document.getElementById("nongQu_text").value=data.fldNongLeng,
							document.getElementById("maoQu_spinner").value=data.fldMaoWUE,
							document.getElementById("maoQu_text").value=data.fldMaoLeng,
							document.getElementById("economy-diGuanArea").value=data.fldSprinkingArea,
							document.getElementById("economy-penGuanArea").value=data.fldDropIrrArea,
							document.getElementById("economy-industry").value=data.fldIndustryAllowance,
							document.getElementById("economy-farm").value=data.fldFarmAllowance,
							document.getElementById("economy-service").value=data.fldServiceAllowance
							}
						});
			})
			
			$("#land_selectCounty").on("change",function(){
				//土地利用情景中的耕地面积变化图表
				land_show_1();
				//土地利用情景中的不同作物种植面积变化
				land_show_2();
				//土地利用情景中的不同土地类型面积变化
				land_show_3();
				
				$.get(
						"getSceParaByProjectIdAndCountryId.do",
						{
							"projectId" : "${projectId}",
							"countryId" : document.getElementById("land_selectCounty").value,
							"year": document.getElementById("land-selectYears").value,
							"tab":"4"
						},function(data){
							if(data.isEmpty!="1"){
							document.getElementById("area_rateofchange_spinner").value=data.fldFarmAreaChgR,
							document.getElementById("land_situation_1").value=data.wheatChgR,
							document.getElementById("land_situation_2").value=data.cornChgR,
							document.getElementById("land_situation_3").value=data.oilPlantsChgR,
							document.getElementById("land_situation_4").value=data.vegetablesChgR,
							document.getElementById("land_situation_5").value=data.orchardChgR,
							document.getElementById("land_situation_6").value=data.cottonChgR,
							document.getElementById("land_situation_1_2").value=data.wheatArea,
							document.getElementById("land_situation_2_2").value=data.cornArea,
							document.getElementById("land_situation_3_2").value=data.oilPlantsArea,
							document.getElementById("land_situation_4_2").value=data.vegetablesArea,
							document.getElementById("land_situation_5_2").value=data.orchardArea,
							document.getElementById("land_situation_6_2").value=data.cottonArea,
							document.getElementById("landuse_situation_1").value=data.wetlandArea,
							document.getElementById("landuse_situation_2").value=data.forestArea,
							document.getElementById("landuse_situation_3").value=data.grassArea,
							document.getElementById("landuse_situation_4").value=data.waterArea
							}
						});
			});
			
			$(function() {
				$("select").trigger("change");
				//页面初始化以后加载图表：气候情景温度变化图
// 				showFigure_1();
// 				//气候情景：降水变化图
// 				showFigure_2();
// 				//非农业人口比例变化
// 				showFigure_3();
// 				//三产产值变化
// 				showFigure_4();
// 				//人均GDP变化
// 				showFigure_5();
// 				//各级渠道长度与水利用率变化
// 				showFigure_6();
// 				//土地利用情景中的耕地面积变化图表
// 				land_show_1();
// 				//土地利用情景中的不同作物种植面积变化
// 				land_show_2();
// 				//土地利用情景中的不同土地类型面积变化
// 				land_show_3();
				//水资源管理情景中的用水量变化
				showArea_usingng_water()
			});
			
			function showFigure_1() {
			$.get("geTblClimateScenarioYearsByfldCRPType.do",
				{
				"fldCRPType" : $("#IPCC").val(),
				"countryId" : document.getElementById("IPCC-selectCounty").value,
				},
				function(data){
				var xdata=[],averageTemp=[],maxTemp=[],minTemp=[];
				for(var i=0; i<data.length; i++)
					{
					xdata[i]=data[i].fldDate;
					averageTemp[i]=data[i].fldAvgTemperature;
					maxTemp[i]=data[i].fldMaxTemp;
					minTemp[i]=data[i].fldMinTemp;
					}
				if (data.length>=1){
				var titletext=data[0].fldDate+'~'+data[data.length-1].fldDate+'年温度变化';
				}
				var Chart = echarts.init(document.getElementById('showArea-1'));
				var option = {
				title : {
					text : titletext,
					x: 'center',
					y: 'bottom'
				},
				tooltip : {
					trigger : 'axis',
				},
				legend : {
					data : [ '平均温度', '最高温度', '最低温度' ],
					x: 'right',
					padding: [25,5,5,5]
				},
				grid : {
					left : '3%',
					right : '4%',
					bottom : '3%',
					containLabel : true
				},
				toolbox : {
					feature : {
						saveAsImage : {}
					}
				},
				xAxis : {
					type : 'category',
					boundaryGap : false,
					data : xdata,
					name : '年份'
				},
				yAxis : {
					type : 'value',
//					axisLabel : {
//              		formatter: '{value} °C'
//          	},
					name : '温度(℃)'
				},
				series : [ {
					name : '平均温度',
					type : 'line',
					data : averageTemp
				}, {
					name : '最高温度',
					type : 'line',
					data : maxTemp
				}, {
					name : '最低温度',
					type : 'line',
					data : minTemp
				} ]
			};
			Chart.setOption(option);
					})}
		
		
		function showFigure_2() {
			$.get("geTblClimateScenarioYearsByfldCRPType.do",
				{
				"fldCRPType":$("#IPCC").val(),
				"countryId" : document.getElementById("IPCC-selectCounty").value,
				},
					function(data){
					var xdata=[],averagePrecip=[];
					for(var i=0; i<data.length; i++)
						{
						xdata[i]=data[i].fldDate;
						averagePrecip[i]=data[i].fldPrecipitation;
						}
					if (data.length>=1){
					var titletext=data[0].fldDate+'~'+data[data.length-1].fldDate+'年降水变化';
					}
				var Chart = echarts.init(document.getElementById('showArea-2'));
				var option = {
				title : {
					text : titletext,
					x: 'center',
					y: 'bottom'
				},
				tooltip : {
					trigger : 'axis'
				},
				legend : {
					data : [ '平均降水', 
					         ],
					x: 'right',
					padding: [25,5,5,5]
				},
				grid : {
					left : '3%',
					right : '4%',
					bottom : '3%',
					containLabel : true
				},
				toolbox : {
					feature : {
						saveAsImage : {}
					}
				},
				xAxis : {
					type : 'category',
					boundaryGap : false,
					name : '年份',
					data : xdata
				},
				yAxis : {
					type : 'value',
					name : '降水量(mm)'
				},
				series : [ {
					name : '平均降水',
					type : 'line',
					data : averagePrecip
// 				
				} ]
			};
			Chart.setOption(option);
					})}
		
		//人口比例变化
		function showFigure_3() {
			$.get('getTblIndustyUrbanSceByfldCountyCode.do',
				{fldCountyCode:$("#industry-selectCounty").val()},
				function(data){
				var xdata=[], farmpop=[], nonfarmpop=[];
				for(var i=0; i<data.length; i++)
				{
					xdata[i]=data[i].fldDate;
					farmpop[i]=data[i].fldFarmPop;
					nonfarmpop[i]=data[i].fldNonFarmPop;
				}
			if (data.length>=1){
			var titletext=data[0].fldDate+'~'+data[data.length-1].fldDate+'人口比例变化';						
			}
			var Chart = echarts.init(document.getElementById('showArea-3'));
			var option = {
				title : {
					text : titletext,
					x: 'center',
					y: 'bottom'
				},
				tooltip : {
					trigger : 'axis'
				},
				legend : {
					data : [ '农业人口', '非农业人口' ],
					x: 'right',
					padding: [25,5,5,5]
				},
				grid : {
					left : '3%',
					right : '4%',
					bottom : '3%',
					containLabel : true
				},
				toolbox : {
					feature : {
						saveAsImage : {}
					}
				},
				xAxis : {
					type : 'category',
					boundaryGap : false,
					name : '年份',
					data : xdata
				},
				yAxis : {
					type : 'value',
					name : '人口',
				},
				series : [ {
					name : '农业人口',
					type : 'line',
					data : farmpop
				}, {
					name : '非农业人口',
					type : 'line',
					data : nonfarmpop
				} ]
			};
			Chart.setOption(option);
			})
		}
		//三产产值变化
		function showFigure_4() {
			$.get('getTblIndustyUrbanSceByfldCountyCode.do',
					{fldCountyCode:$("#industry-selectCounty").val()},
					function(data){
				var xdata=[], indoutput=[], agroutput=[], seroutput=[], touroutput=[];
				for(var i=0; i<data.length; i++)
				{
					xdata[i]=data[i].fldDate;
					indoutput[i]=(data[i].fldIndOutput)/1000000000;
					agroutput[i]=(data[i].fldAgrOutput)/1000000000;
					seroutput[i]=(data[i].fldSerOutput)/1000000000;
					touroutput[i]=(data[i].fldTourOutput)/1000000000;
				}
			if (data.length>=1){
			var titletext=data[0].fldDate+'~'+data[data.length-1].fldDate+'年三产产值变化';	
			}
			var Chart = echarts.init(document.getElementById('showArea-4'));
			var option = {
				title : {
					text : titletext,
					x: 'center',
					y: 'bottom'
				},
				tooltip : {
					trigger : 'axis'
				},
				legend : {
					data : [ '工业产值', '农业产值', '服务业产值', '旅游业产值' ],
					x: 'right',
					padding: [25,5,5,5]
				},
				grid : {
					left : '3%',
					right : '4%',
					bottom : '3%',
					containLabel : true
				},
				toolbox : {
					feature : {
						saveAsImage : {}
					}
				},
				xAxis : {
					type : 'category',
					boundaryGap : false,
					name : '年份',
					data : xdata
				},
				yAxis : {
					type : 'value',
					name : '产值(亿元)'
				},
				series : [ {
					name : '工业产值',
					type : 'line',
					data : indoutput
				}, {
					name : '农业产值',
					type : 'line',
					data : agroutput
				}, {
					name : '服务业产值',
					type : 'line',
					data : seroutput
				}, {
					name : '旅游业产值',
					type : 'line',
					data : touroutput
				} ]
			};
			Chart.setOption(option);
			})}
		//人均GDP变化图表
		function showFigure_5() {
			$.get('getTblSocioEconSceByfldCountyCode.do',
				 {fldCountyCode:$("#water-selectCounty").val()},
				function(data){
				var xdata=[], percapGDP=[];
				for(var i=0; i<data.length; i++)
				{
					xdata[i]=data[i].fldDate;
					percapGDP[i]=data[i].fldPerCapGDP;
				}
			if (data.length>=1){
			var titletext=data[0].fldDate+'~'+data[data.length-1].fldDate+'年人均GDP变化';}	
			var Chart = echarts.init(document.getElementById('economy-showArea-1'));
			var option = {
				title : {
					text : titletext,
					x: 'center',
					y: 'bottom'
				},
				tooltip : {
					trigger : 'axis'
				},
				legend : {
					data : [ '人均GDP' ],
					x: 'right',
					padding: [25,5,5,5]
				},
				grid : {
					left : '3%',
					right : '4%',
					bottom : '3%',
					containLabel : true
				},
				toolbox : {
					feature : {
						saveAsImage : {}
					}
				},
				xAxis : {
					type : 'category',
					boundaryGap : false,
					name : '年份',
					data : xdata
				},
				yAxis : {
					type : 'value',
					name : '人均GDP(元)',
				},
				series : [ {
					name : '人均GDP',
					type : 'line',
					data : percapGDP
				} ]
			};
			Chart.setOption(option);
			})}
		
		//各级渠道长度与水利用率变化
		function showFigure_6() {
			$.get('getTblHydrEngineeringByfldCountyCode.do',
					{fldCountyCode:$("#water-selectCounty").val()},
					function(data){
				var xdata=[], fldMainCanWUE=[], fldBranCanWUE=[], fldDouWUE=[], fldNongWUE=[], fldMaoWUE=[], fldSprWUE=[], fldDropWUE=[];
				//            干渠利用率                               支渠利用率                              斗渠利用率                    农渠利用率			毛渠利用率			喷灌用水效率	滴灌用水效率
				for(var i=0; i<data.length; i++)
				{
					xdata[i]=data[i].fldDate;
					fldMainCanWUE[i]=data[i].fldMainCanWUE;
					fldBranCanWUE[i]=data[i].fldBranCanWUE;
					fldDouWUE[i]=data[i].fldDouWUE;
					fldNongWUE[i]=data[i].fldNongWUE;
					fldMaoWUE[i]=data[i].fldMaoWUE;
					fldSprWUE[i]=data[i].fldSprWUE;
					fldDropWUE[i]=data[i].fldDropWUE;
				}
			if (data.length>=1){
			var titletext=data[0].fldDate+'~'+data[data.length-1].fldDate+'年各级渠道长度与水利用率变化';	
			}
			var Chart = echarts.init(document.getElementById('economy-showArea-2'));
			var option = {
				title : {
					text : titletext,
					x: 'center',
					y: 'bottom'
				},
				tooltip : {
					trigger : 'axis'
				},
				legend : {
					data : [ '干渠利用率', '支渠利用率', '斗渠利用率', '农渠利用率', '毛渠利用率', '喷灌用水效率', '滴灌用水效率' ],
					x: 'right',
					padding: [25,5,5,5]
				},
				grid : {
					left : '3%',
					right : '4%',
					bottom : '3%',
					containLabel : true
				},
				toolbox : {
					feature : {
						saveAsImage : {}
					}
				},
				xAxis : {
					type : 'category',
					boundaryGap : false,
					name : '年份',
					data : xdata
				},
				yAxis : {
					type : 'value',
					name : '利用率(%)',
				},
				series : [ {
					name : '干渠利用率',
					type : 'line',
					data : fldMainCanWUE
				}, {
					name : '支渠利用率',
					type : 'line',
					data : fldBranCanWUE
				}, {
					name : '斗渠利用率',
					type : 'line',
					data : fldDouWUE
				}, {
					name : '农渠利用率',
					type : 'line',
					data : fldNongWUE
				}, {
					name : '毛渠利用率',
					type : 'line',
					data : fldMaoWUE
				}, {
					name : '喷灌用水效率',
					type : 'line',
					data : fldSprWUE
				}, {
					name : '滴灌用水效率',
					type : 'line',
					data : fldDropWUE
				} ]
			};
			Chart.setOption(option);
			})}
		//土地利用情景中的耕地面积变化图表
		function land_show_1() {
			$.get('getTblLandUseSceByfldCountyCode.do',
					{fldCountyCode:$("#land_selectCounty").val()},
					function(data){
				var xdata=[], fldFarmArea=[];
				for(var i=0; i<data.length; i++)
				{
					xdata[i]=data[i].fldDate;
					fldFarmArea[i]=data[i].fldFarmArea;
					
				}
				if (data.length>=1){
				var titletext=data[0].fldDate+'~'+data[data.length-1].fldDate+'年'+$("#land_selectCounty").find("option:selected").text()+'耕地面积变化';
				}
			var Chart = echarts.init(document.getElementById('land_show_1'));
			var option = {
				title : {
					text : titletext,
					x: 'center',
					y: 'bottom'
				},
				tooltip : {
					trigger : 'axis'
				},
				legend : {
					data : [ '耕地面积' ],
					x: 'right',
					padding: [25,5,5,5]
				},
				grid : {
					left : '3%',
					right : '4%',
					bottom : '3%',
					containLabel : true
				},
				toolbox : {
					feature : {
						saveAsImage : {}
					}
				},
				xAxis : {
					type : 'category',
					boundaryGap : false,
					name : '年份',
					data : xdata
				},
				yAxis : {
					type : 'value',
					name : '面积(亩)',
				},
				series : [ {
					name : '耕地面积',
					type : 'line',
					data : fldFarmArea
				}, ]
			};
			Chart.setOption(option);
			})}
		//土地利用情景中的不同作物种植面积变化
		function land_show_2() {
			$.get('getTblCropPatternByfldCountyCode.do',
					{fldCountyCode:$("#land_selectCounty").val()},
					function(data){
				var fldXiaomaiArea = [], fldYumiArea=[], fldYangyuArea=[], fldYouliaoArea=[],fldTiancaiArea=[],fldShucaiArea=[],fldGualeiArea=[];
				var xdata=[];
				var xcnt=0;xiaomaicnt=0;yumicnt=0;yangyucnt=0;youliaocnt=0;tiancaicnt=0;shucaicnt=0;gualeicnt=0;//控制数据下标的变量
				for(var i=0; i<data.length; i=i+7){
					xdata[xcnt]=data[i].fldDate;
					xcnt++;
				}
				for(var i=0; i<data.length; i++){
					
					switch(data[i].fldCropType){
					case('小麦'):
						fldXiaomaiArea[xiaomaicnt]=data[i].fldCropArea;
						xiaomaicnt++;
						break;
					case('玉米'):
						fldYumiArea[yumicnt]=data[i].fldCropArea;
						yumicnt++;	
						break;
					case('洋芋'):
						fldYangyuArea[yangyucnt]=data[i].fldCropArea;
						yangyucnt++;
						break;
					case('油料'):
						fldYouliaoArea[youliaocnt]=data[i].fldCropArea;
						youliaocnt++;
						break;
					case('甜菜'):
						fldTiancaiArea[tiancaicnt]=data[i].fldCropArea;
						tiancaicnt++;
						break;
					case('蔬菜'):
						fldShucaiArea[shucaicnt]=data[i].fldCropArea;
						shucaicnt++;
						break;
					case('瓜类'):
						fldGualeiArea[gualeicnt]=data[i].fldCropArea;
						gualeicnt++;
						break;
					}
				}
				if (data.length>=1){
				var titletext=data[0].fldDate+'~'+data[data.length-1].fldDate+'年'+$("#land_selectCounty").find("option:selected").text()+'不同作物种植面积变化';
				}
			var Chart = echarts.init(document.getElementById('land_show_2'));
			var option = {
				title : {
					text : titletext,
					x: 'center',
					y: 'bottom'
				},
				tooltip : {
					trigger : 'axis'
				},
				legend : {
					data : [ '小麦', '玉米','洋芋','油料','甜菜','蔬菜','瓜类'],
					x: 'right',
					padding: [25,5,5,5]
				},
				grid : {
					left : '3%',
					right : '4%',
					bottom : '3%',
					containLabel : true
				},
				toolbox : {
					feature : {
						saveAsImage : {}
					}
				},
				xAxis : {
					type : 'category',
					boundaryGap : false,
					name : '年份',
					data : xdata
				},
				yAxis : {
					type : 'value',
					name : '种植面积(亩)',
				},
				series : [ {
					name : '小麦',
					type : 'line',
					data : fldXiaomaiArea
				}, {
					name : '玉米',
					type : 'line',
					data : fldYumiArea
				}, {
					name : '洋芋',
					type : 'line',
					data : fldYangyuArea
				}, {
					name : '油料',
					type : 'line',
					data : fldYouliaoArea
				}, {
					name : '甜菜',
					type : 'line',
					data : fldTiancaiArea
				}, {
					name : '蔬菜',
					type : 'line',
					data : fldShucaiArea
				}, {
					name : '瓜类',
					type : 'line',
					data : fldGualeiArea
				} ]
			};
			Chart.setOption(option);
			})}
		//土地类型中不同土地类型面积变化
		function land_show_3() {
			$.get('getTblLandUseSceByfldCountyCode.do',
					{fldCountyCode : $("#land_selectCounty").val()},
					function(data){
						var xdata=[], fldWetlandArea=[], fldForestArea=[], fldGrassArea=[], fldHuYangArea=[], fldWaterArea=[];
						for(var i=0; i<data.length; i++)
						{
							xdata[i]=data[i].fldDate;
							fldWetlandArea[i]=data[i].fldWetlandArea;
							fldForestArea[i]=data[i].fldForestArea;
							fldGrassArea[i]=data[i].fldGrassArea;
							fldHuYangArea[i]=data[i].fldHuYangArea;
							fldWaterArea[i]=data[i].fldWaterArea;
						}
						if (data.length>=1){
						var titletext=data[0].fldDate+'~'+data[data.length-1].fldDate+'年'+$("#land_selectCounty").find("option:selected").text()+'不同土地类型面积变化';
						}
			var Chart = echarts.init(document.getElementById('land_show_3'));
			var option = {
				title : {
					text : titletext,
					x: 'center',
					y: 'bottom'
				},
				tooltip : {
					trigger : 'axis'
				},
				legend : {
					data : [ '湿地面积', '森林面积','草地面积','胡杨面积','水域面积' ],
					x: 'right',
					padding: [25,5,5,5]
				},
				grid : {
					left : '3%',
					right : '4%',
					bottom : '3%',
					containLabel : true
				},
				toolbox : {
					feature : {
						saveAsImage : {}
					}
				},
				xAxis : {
					type : 'category',
					boundaryGap : false,
					name : '年份',
					data : xdata
				},
				yAxis : {
					type : 'value',
					name : '面积(亩)',
				},
				series : [  {
					name : '湿地面积',
					type : 'line',
					data : fldWetlandArea
				}, {
					name : '森林面积',
					type : 'line',
					data : fldForestArea
				}, {
					name : '草地面积',
					type : 'line',
					data : fldGrassArea
				}, {
					name : '胡杨面积',
					type : 'line',
					data : fldHuYangArea
				}, {
					name : '水域面积',
					type : 'line',
					data : fldWaterArea
				} ]
			};
			Chart.setOption(option);
			})}
		
		//水资源管理情景中的用水量变化
		function showArea_usingng_water() {
			$.get('getTblMidDownWaterAllo.do',
					[],
					function(data){
				var xdata=[], fldWaterUseMid=[], fldWaterUseDown=[];
				for(var i=0; i<data.length; i++)
				{
					xdata[i]=data[i].fldDate;
					fldWaterUseMid[i]=data[i].fldWaterUseMid/100000000;
					fldWaterUseDown[i]=data[i].fldWaterUseDown/100000000;
				}
				if (data.length>=1){
				var titletext=data[0].fldDate+'~'+data[data.length-1].fldDate+'年流域中游与下游分水量变化';
				}
			var Chart = echarts.init(document.getElementById('using-water'));
			var option = {
				title : {
					text : titletext,
					x: 'center',
					y: 'bottom'
				},
				tooltip : {
					trigger : 'axis'
				},
				legend : {
					data : [ '中游分水量', '下游分水量' ],
					x: 'right',
					padding: [25,5,5,5]
				},
				grid : {
					left : '3%',
					right : '4%',
					bottom : '3%',
					containLabel : true
				},
				toolbox : {
					feature : {
						saveAsImage : {}
					}
				},
				xAxis : {
					type : 'category',
					boundaryGap : false,
					name : '年份',
					data : xdata
				},
				yAxis : {
					type : 'value',
					name : '用水量(亿m³)',
				},
				series : [ {
					name : '中游分水量',
					type : 'line',
					data : fldWaterUseMid
				}, {
					name : '下游分水量',
					type : 'line',
					data : fldWaterUseDown
				
				} ]
			};
			Chart.setOption(option);
			})};
		
		</script>
		<script type="text/javascript">
		$("#climate_submit").click(function() {
			$.post(
				"saveClimatePara.do",
				{
					"projectId" : "${projectId}",
					"countryId" : document.getElementById("IPCC-selectCounty").value,
					"year": document.getElementById("IPCC-selectYears").value,
					"rainInc" : document.getElementById("rain_inc_ratio").value,
					"tempInc" : document.getElementById("temp_inc_ratio").value,
					"fldCRPType":document.getElementById("IPCC").value
				}, function(data) {
					alert(data.content);
			})
		})
						
						
		$("#IndUrbanScePara_submit").click(function() {
			$.post(
				"saveIndUrbanScePara.do",
				{
					"projectId" : "${projectId}",
					"countryId" : document.getElementById("industry-selectCounty").value,
					"year" : document.getElementById("industry-selectYears").value,
					"nonFarmPercent" : document.getElementById("population_proportation_spinner").value,
					"fldIndOutput" : document.getElementById("situation-1").value,
					"fldIndOutputPercent" : document.getElementById("situation-1-2").value,
					"fldAgrOutput" : document.getElementById("situation-2").value,
					"fldAgrOutputPercent" : document.getElementById("situation-2-2").value,
					"fldSerOutput" : document.getElementById("situation-3").value,
					"fldSerOutputPercent" : document.getElementById("situation-3-2").value,
					"industryProgressRate" : document.getElementById("situation-4").value,
					"changeRateOfTourismIndustry" : document.getElementById("situation-5").value
				}, function(data) {
					alert(data.content);
			})
		})
		
		$("#landuse_submit").click(function() {
			$.post(
				"saveTbLanduseScePara.do",
				{
					"projectId" : "${projectId}",
					"countryId" : document.getElementById("land_selectCounty").value,
					"year":document.getElementById("land-selectYears").value,
					"fldFarmArea":document.getElementById("gengdi_situation_1").value,
					"fldFarmAreaChgR" : document.getElementById("area_rateofchange_spinner").value,
					"wheatChgR" : document.getElementById("land_situation_1").value,
					"cornChgR" : document.getElementById("land_situation_2").value,
					"oilPlantsChgR" : document.getElementById("land_situation_3").value,
					"vegetablesChgR" : document.getElementById("land_situation_4").value,
					"orchardChgR":document.getElementById("land_situation_5").value,
					"cottonChgR" : document.getElementById("land_situation_6").value,
					"wheatArea" : document.getElementById("land_situation_1_2").value,
					"cornArea" : document.getElementById("land_situation_2_2").value,
					"oilPlantsArea" : document.getElementById("land_situation_3_2").value,
					"vegetablesArea":document.getElementById("land_situation_4_2").value,
					"orchardArea":document.getElementById("land_situation_5_2").value,
					"cottonArea":document.getElementById("land_situation_6_2").value,
					"wetlandArea":document.getElementById("landuse_situation_1").value,
					"forestArea":document.getElementById("landuse_situation_2").value,
					"grassArea":document.getElementById("landuse_situation_3").value,
					"waterArea":document.getElementById("landuse_situation_4").value
				}, function(data) {
					alert(data.content);
			})
		})
		
		$("#economy_submit").click(function() {
			var contents="";
			$.post(
				"saveTbSocioEconomyScePara.do",
				{
					"projectId" : "${projectId}",
					"year":document.getElementById("water-selectYears").value,
					"countryId" : document.getElementById("water-selectCounty").value,
					"perCapGDPR" : document.getElementById("GDPInc_spinner1").value,
					"perCapGDP" : document.getElementById("GDPInc_spinner2").value,
					"fldMainCannelLeng": document.getElementById("ganQu_text").value,
					"fldMainCanWUE" : document.getElementById("ganQu_spinner").value,
					"fldBranCannelLeng" : document.getElementById("zhiQu_text").value,
					"fldBranCanWUE" : document.getElementById("zhiQu_spinner").value,
					"fldDouLeng" : document.getElementById("douQu_text").value,
					"fldDouWUE":document.getElementById("douQu_spinner").value,
					"fldNongLeng" : document.getElementById("nongQu_text").value,
					"fldNongWUE" : document.getElementById("nongQu_spinner").value,
					"fldMaoLeng" : document.getElementById("maoQu_text").value,
					"fldMaoWUE" : document.getElementById("maoQu_spinner").value,
					"fldSprinkingArea":document.getElementById("economy-diGuanArea").value,
					"fldDropIrrArea":document.getElementById("economy-penGuanArea").value,
					"fldIndustryAllowance":document.getElementById("economy-industry").value,
					"fldFarmAllowance":document.getElementById("economy-farm").value,
					"fldServiceAllowance":document.getElementById("economy-service").value
				}, function(data) {
// 					contents=contents+data.content+"\n";
					alert(data.content);
			})
			$.post(
				"addSaveWater.do",
				{
					"projectId" : "${projectId}",
					"countryId" : document.getElementById("water-selectCounty").value,
					"savewater" : document.getElementById("water-saving").value,
				}, function(data) {
// 					alert(contents+data.content);
			})
		})
		
		$("#watersce_submit").click(function() {
			$.post(
				"addMidAndDownStreamPercentPara.do",
				{
					"projectId" : "${projectId}",
					"watershedId" : "AKH13002",
					"serfaceWater": document.getElementById("water_province_total").value,
					"midstreamPercent" : document.getElementById("water_province_1").value,
					"downstreamPercent" : document.getElementById("water_province_2").value,
				}, function(data) {
					alert(data.content);
			})
			
			for(var i=0;i<=document.getElementsByClassName("water_county_ratio").length;i++ ){
				$.post(
					"addtbWaterManSceWRPara.do",
					{
						"fldProjectCode" : "${projectId}",
						"fldWatershedCode" : "AKH13002",
						"fldCountyCode": document.getElementsByClassName("water_county_span")[i].id,
						"fldDate" : null,
						"fldWaterRightRatio" : document.getElementsByClassName("water_county_ratio")[i].value,
					}, function(data) {
						
				})
			}
			alert(document.getElementsByClassName("countrycode").length);
			
		})
		
	</script>
	</body>

</html>