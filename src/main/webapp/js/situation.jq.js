/**
 * 
 */
//设置气候情景中的增加降雨比例slider
			$("#slider-1-1").css({
				width: '100%',
				margin: '5px 5px 15px 5px'
			}).slider({
				value: 2,
				range: "min",
				min: -20,
				max: 20,
				step: 1,
				slide: function(event, ui) {
					var val = parseInt(ui.value);
					$("#rain_inc_ratio").val(val);
				}
			});
			
			//温度增加比例
			$("#slider-1-2").css({
				width: '100%',
				margin: '5px 5px 15px 5px'
			}).slider({
				value: 2,
				range: "min",
				min: -20,
				max: 20,
				step: 1,
				slide: function(event, ui) {
					var val = parseInt(ui.value);
					$("#temp_inc_ratio").val(val);
				}
			});

			//设置产业与城市发展情景中的spinner
			//设置产业与城市发展情景中的非农业人口比例的spinner
			$('#population_proportation_spinner').ace_spinner({
					value: 37,
					min: 0,
					max: 100,
					step: 1,
					icon_up: 'icon-caret-up',
					icon_down: 'icon-caret-down'
				})
				.css({
					height: '28px',
					width: '60px',
					margin: '0px'
				})
				.on('change', function() {

				});

			//设置产业与城市发展情景中的农业的slider
			$("#slider-1").css({
				width: '100%',
				margin: '5px 1px 15px 5px'
			}).slider({
				value: 26.8,
				value2: 33.17,
				range: "min",
				min: 0,
				max: 100,
				step: 1,
				slide: function(event, ui) {
					var val = parseInt(ui.value);
					var val2 = val3 = (100 - val) / 2;

					$("#situation-1").val(val);
					$("#situation-1-2").val(val * 123.81 / 100);

					$("#situation-2").val(val2);
					$("#situation-2-2").val(val2 * 123.81 / 100);

					$("#situation-3").val(val3);
					$("#situation-3-2").val(val3 * 123.81 / 100);
				}
			});

			//设置产业与城市发展情景中的工业的slider
			$("#slider-2").css({
				width: '100%',
				margin: '5px 5px 15px 5px'
			}).slider({
				value: 29.4,
				range: "min",
				min: 0,
				max: 100,
				step: 1,
				slide: function(event, ui) {
					var val2 = parseInt(ui.value);
					var val1 = $("#situation-1").val();
					var val3 = 100 - val1 - val2;
					$("#situation-2").val(val2);
					$("#situation-2-2").val(val2 * 123.81 / 100);
					$("#situation-3").val(val3);
					$("#situation-3-2").val(val3 * 123.81 / 100);
				}
			});

			//设置产业与城市发展情景中的服务业的slider
			$("#slider-3").css({
				width: '100%',
				margin: '5px 5px 15px 5px'
			}).slider({
				value: 43.8,
				range: "min",
				min: 0,
				max: 100,
				step: 1,
				slide: function(event, ui) {
					var val = parseInt(ui.value);
					$("#situation-3").val(val);
					$("#situation-3-2").val(val * 123.81 / 100);
				}
			});

			//设置产业与城市发展情景中的产业进步率的slider
			$("#slider-4").css({
				width: '100%',
				margin: '5px 5px 15px 5px'
			}).slider({
				value: 1,
				range: "min",
				min: 0,
				max: 100,
				step: 1,
				slide: function(event, ui) {
					var val = parseInt(ui.value);
					$("#situation-4").val(val);
				}
			});

			//设置产业与城市发展情景中的旅游业产值变化率的slider
			$("#slider-5").css({
				width: '100%',
				margin: '5px 5px 15px 5px'
			}).slider({
				value: 5,
				range: "min",
				min: 0,
				max: 100,
				step: 1,
				slide: function(event, ui) {
					var val = parseInt(ui.value);
					$("#situation-5").val(val);
				}
			});

			//设置社会经济发展情景中的人均GDP增长率spinner
			$('#GDPInc_spinner1').ace_spinner({
					value: 9,
					min: 1,
					max: 20,
					step: 1,
					icon_up: 'icon-caret-up',
					icon_down: 'icon-caret-down'
				})
				.css({
					height: '28px',
					width: '60px',
					margin: '0px'
				}) //设置输入框的高度
				.on('change', function() {});

			//设置社会经济发展情景中的灌溉输水网络水利用率snipper
			$('#ganQu_spinner').ace_spinner({
					value: 40,
					min: 0,
					max: 100,
					step: 5,
					icon_up: 'icon-caret-up',
					icon_down: 'icon-caret-down'
				})
				.css({
					height: '28px',
					width: '40px',
					margin: '0px'
				})
				.on('change', function() {
					$("#ganQuBar").css({
						width: this.value + "%"
					});
				});
			$('#zhiQu_spinner').ace_spinner({
					value: 45,
					min: 0,
					max: 100,
					step: 5,
					icon_up: 'icon-caret-up',
					icon_down: 'icon-caret-down'
				})
				.css({
					height: '28px',
					width: '40px',
					margin: '0px'
				})
				.on('change', function() {
					$("#zhiQuBar").css({
						width: this.value + "%"
					});
				});
			$('#douQu_spinner').ace_spinner({
					value: 90,
					min: 0,
					max: 100,
					step: 5,
					icon_up: 'icon-caret-up',
					icon_down: 'icon-caret-down'
				})
				.css({
					height: '28px',
					width: '40px',
					margin: '0px'
				})
				.on('change', function() {
					$("#douQuBar").css({
						width: this.value + "%"
					});
				});
			$('#nongQu_spinner').ace_spinner({
					value: 0,
					min: 0,
					max: 100,
					step: 5,
					icon_up: 'icon-caret-up',
					icon_down: 'icon-caret-down'
				})
				.css({
					height: '28px',
					width: '40px',
					margin: '0px'
				})
				.on('change', function() {
					$("#nongQuBar").css({
						width: this.value + "%"
					});
				});
			$('#maoQu_spinner').ace_spinner({
					value: 0,
					min: 0,
					max: 100,
					step: 5,
					icon_up: 'icon-caret-up',
					icon_down: 'icon-caret-down'
				})
				.css({
					height: '28px',
					width: '40px',
					margin: '0px'
				})
				.on('change', function() {
					$("#maoQuBar").css({
						width: this.value + "%"
					});
				});

			//设置社会经济发展情景中滴灌面积的slider
			$("#economy-slider-1").css({
				width: '100%',
				margin: '5px 5px 15px 5px'
			}).slider({
				value: 50,
				range: "min",
				min: 0,
				max: 100,
				step: 1,
				slide: function(event, ui) {
					var val = parseInt(ui.value);
					$("#economy-diGuanArea").val(val);
				}
			});

			//设置土地利用中耕地面积变化率的spinner
			$('#area_rateofchange_spinner').ace_spinner({
					value: 37,
					min: 0,
					max: 100,
					step: 1,
					icon_up: 'icon-caret-up',
					icon_down: 'icon-caret-down'
				})
				.css({
					height: '28px',
					width: '60px',
					margin: '0px'
				})
				.on('change', function() {

				});
			//
			//设置土地利用中小麦种植结构调整的slider
			$("#land_slider_1").css({
				width: '100%',
				margin: '5px 1px 15px 5px'
			}).slider({
				value: 0,
				range: "min",
				min: 0,
				max: 100,
				step: 1,
				slide: function(event, ui) {
					var val = parseInt(ui.value);
					var val2 = val3 = (100 - val) / 2;
					$("#land_situation_1").val(val);
					$("#land_situation_1_2").val(val * 10);

				}
			});

			//设置土地利用中玉米种植结构调整的slider
			$("#land_slider_2").css({
				width: '100%',
				margin: '5px 5px 15px 5px'
			}).slider({
				value: 0,
				range: "min",
				min: 0,
				max: 100,
				step: 1,
				slide: function(event, ui) {
					var val2 = parseInt(ui.value);
					$("#land_situation_2").val(val2);
					$("#land_situation_2_2").val(val2 * 10);

				}
			});

			//设置土地利用中油料种植结构调整的slider
			$("#land_slider_3").css({
				width: '100%',
				margin: '5px 5px 15px 5px'
			}).slider({
				value: 0,
				range: "min",
				min: 0,
				max: 100,
				step: 1,
				slide: function(event, ui) {
					var val = parseInt(ui.value);
					$("#land_situation_3").val(val);
					$("#land_situation_3_2").val(val * 10);
				}
			});

			//设置土地利用中蔬菜种植结构调整的slider
			$("#land_slider_4").css({
				width: '100%',
				margin: '5px 5px 15px 5px'
			}).slider({
				value: 0,
				range: "min",
				min: 0,
				max: 100,
				step: 1,
				slide: function(event, ui) {
					var val = parseInt(ui.value);
					$("#land_situation_4").val(val);
					$("#land_situation_4_2").val(val * 10);

				}
			});

			//设置土地利用中果园种植结构的slider
			$("#land_slider_5").css({
				width: '100%',
				margin: '5px 5px 15px 5px'
			}).slider({
				value: 0,
				range: "min",
				min: 0,
				max: 100,
				step: 1,
				slide: function(event, ui) {
					var val = parseInt(ui.value);
					$("#land_situation_5").val(val);
					$("#land_situation_5_2").val(val * 10);
				}
			});
			//设置土地利用中棉花种植结构的slider
			$("#land_slider_6").css({
				width: '100%',
				margin: '5px 5px 15px 5px'
			}).slider({
				value: 0,
				range: "min",
				min: 0,
				max: 100,
				step: 1,
				slide: function(event, ui) {
					var val = parseInt(ui.value);
					$("#land_situation_6").val(val);
					$("#land_situation_6_2").val(val * 10);
				}
			});

			//设置水资源管理情景中的可供地表水silder
			$("#slider-available-water").css({
				width: '100%',
				margin: '5px 5px 15px 5px'
			}).slider({
				value: 50,
				range: "min",
				min: 0,
				max: 100,
				step: 1,
				slide: function(event, ui) {
					var ratio = parseInt(ui.value);
					var totalWater = $("#water_province_total").val();
					$("#water_province_ratio_1").val(ratio);
					$("#water_province_ratio_2").val(100 - ratio);
					$("#water_province_1").val((ratio / 100) * totalWater);
					$("#water_province_2").val(totalWater - (ratio / 100) * totalWater);
				}
			});

			//设置水资源管理情景中流域中下游可供地表水设为固定
			$('#water_province_total').ace_spinner({
					value: 15880,
					min: 15880,
					max: 15880,
					step: 5,
					icon_up: 'icon-caret-up',
					icon_down: 'icon-caret-down'
				})
				.css({
					height: '28px',
					width: '60px'
				});

			//设置水资源管理情景中的城市选择
			$("#dropdown1").show();
			$("#dropdown2").hide();
			$("#selectToCounty").change(function() {

				//alert($("#selectCounty").val());获取选中记录的value值  
				//alert($("#selectCounty option:selected").text());获取选中记录的text值   

				var p = $("#selectToCounty").val()
				if(p == 'ZhangYe') {
					$("#dropdown1").show();
					$("#dropdown2").hide();
				}
				if(p == 'JiaYuGuan') {
					$("#dropdown2").show();
					$("#dropdown1").hide();
				}
			});

			//设置水资源管理情景中的县区水分配spinner
			$('#water_county_ratio_1').ace_spinner({
					value: 95,
					min: 0,
					max: 100,
					step: 5,
					icon_up: 'icon-caret-up',
					icon_down: 'icon-caret-down'
				})
				.css({
					height: '28px',
					width: '40px'
				})
				.on('change', function() {
					var ratio_1 = this.value;
					var totalWater = $("#water_county_total").val();
					var ratio_2 = ratio_3 = (100 - ratio_1) / 2;
					$("#water_county_ratio_2").val(ratio_2);
					$("#water_county_ratio_3").val(ratio_3);
					$("#water_county_distribution1").val((ratio_1 / 100) * totalWater);
					$("#water_county_distribution2").val((ratio_2 / 100) * totalWater);
					$("#water_county_distribution3").val((ratio_3 / 100) * totalWater);

				});
			$('#water_county_ratio_2').ace_spinner({
					value: 5,
					min: 0,
					max: 100,
					step: 5,
					icon_up: 'icon-caret-up',
					icon_down: 'icon-caret-down'
				})
				.css({
					height: '28px',
					width: '40px'
				})
				.on('change', function() {
					var ratio_2 = this.value;
					var ratio_1 = $("#water_county_ratio_1").val();
					var totalWater = $("#water_county_total").val();
					var ratio_3 = 100 - ratio_1 - ratio_2;
					$("#water_county_ratio_3").val(ratio_3);
					$("#water_county_distribution1").val((ratio_1 / 100) * totalWater);
					$("#water_county_distribution2").val((ratio_2 / 100) * totalWater);
					$("#water_county_distribution3").val((ratio_3 / 100) * totalWater);

				});
			$('#water_county_ratio_3').ace_spinner({
					value: 0,
					min: 0,
					max: 100,
					step: 5,
					icon_up: 'icon-caret-up',
					icon_down: 'icon-caret-down'
				})
				.css({
					height: '28px',
					width: '40px'
				});
			$('#water_county_total').ace_spinner({
					value: 12000,
					min: 12000,
					max: 12000,
					step: 5,
					icon_up: 'icon-caret-up',
					icon_down: 'icon-caret-down'
				})
				.css({
					height: '28px',
					width: '60px'
				});

			//复制
			//设置水资源管理情景中的县区水分配总量
			$('#water_county_total2').ace_spinner({
					value: 12000,
					min: 12000,
					max: 12000,
					step: 5,
					icon_up: 'icon-caret-up',
					icon_down: 'icon-caret-down'
				})
				.css({
					height: '28px',
					width: '60px'
				});

			//设置水资源管理情景中的县区水分配spinner
			$('#water_county_ratio_2_1').ace_spinner({
					value: 95,
					min: 0,
					max: 100,
					step: 5,
					icon_up: 'icon-caret-up',
					icon_down: 'icon-caret-down'
				})
				.css({
					height: '28px',
					width: '40px'
				})
				.on('change', function() {
					var ratio_1 = this.value;
					var totalWater = $("#water_county_total2").val();
					var ratio_2 = ratio_3 = ratio_4 = (100 - ratio_1) / 3;
					$("#water_county_ratio_2_2").val(ratio_2);
					$("#water_county_ratio_2_3").val(ratio_3);
					$("#water_county_ratio_2_4").val(ratio_4);
					$("#water_county_distribution2_1").val((ratio_1 / 100) * totalWater);
					$("#water_county_distribution2_2").val((ratio_2 / 100) * totalWater);
					$("#water_county_distribution2_3").val((ratio_3 / 100) * totalWater);
					$("#water_county_distribution2_4").val((ratio_4 / 100) * totalWater);
				});
			$('#water_county_ratio_2_2').ace_spinner({
					value: 5,
					min: 0,
					max: 100,
					step: 5,
					icon_up: 'icon-caret-up',
					icon_down: 'icon-caret-down'
				})
				.css({
					height: '28px',
					width: '40px'
				})
				.on('change', function() {
					var ratio_2 = this.value;
					var ratio_1 = $("#water_county_ratio_2_1").val();
					var totalWater = $("#water_county_total2").val();
					var ratio_3 = ratio_4 = (100 - ratio_1 - ratio_2) / 2;
					$("#water_county_ratio_2_3").val(ratio_3);
					$("#water_county_ratio_2_4").val(ratio_4);
					$("#water_county_distribution2_1").val((ratio_1 / 100) * totalWater);
					$("#water_county_distribution2_2").val((ratio_2 / 100) * totalWater);
					$("#water_county_distribution2_3").val((ratio_3 / 100) * totalWater);
					$("#water_county_distribution2_4").val((ratio_4 / 100) * totalWater);
				});
			$('#water_county_ratio_2_3').ace_spinner({
					value: 0,
					min: 0,
					max: 100,
					step: 5,
					icon_up: 'icon-caret-up',
					icon_down: 'icon-caret-down'
				})
				.css({
					height: '28px',
					width: '40px'
				})
				.on('change', function() {
					var ratio_3 = this.value;
					var ratio_1 = $("#water_county_ratio_2_1").val();
					var ratio_2 = $("#water_county_ratio_2_1").val();
					var totalWater = $("#water_county_total2").val();
					var ratio_4 = (100 - ratio_1 - ratio_2 - ratio_3);
					$("#water_county_ratio_2_4").val(ratio_4);
					$("#water_county_distribution2_1").val((ratio_1 / 100) * totalWater);
					$("#water_county_distribution2_2").val((ratio_2 / 100) * totalWater);
					$("#water_county_distribution2_3").val((ratio_3 / 100) * totalWater);
					$("#water_county_distribution2_4").val((ratio_4 / 100) * totalWater);
				});

			$('#water_county_ratio_2_4').ace_spinner({
					value: 0,
					min: 0,
					max: 100,
					step: 5,
					icon_up: 'icon-caret-up',
					icon_down: 'icon-caret-down'
				})
				.css({
					height: '28px',
					width: '40px'
				})
				.on('change', function() {
					var ratio_4 = this.value;
					var ratio_1 = ratio_2 = ratio_3 = (100 - ratio_4) / 3;
					$("#water_county_ratio_2_1").val(ratio_1);
					$("#water_county_ratio_2_2").val(ratio_2);
					$("#water_county_ratio_2_3").val(ratio_3);
					$("#water_county_distribution2_1").val((ratio_1 / 100) * totalWater);
					$("#water_county_distribution2_2").val((ratio_2 / 100) * totalWater);
					$("#water_county_distribution2_3").val((ratio_3 / 100) * totalWater);
					$("#water_county_distribution2_4").val((ratio_4 / 100) * totalWater);
				});

			//设置水资源管理情景中的节水silider
			$("#slider-water-saving").css({
				width: '100%',
				margin: '5px 5px 15px 5px'
			}).slider({
				value: 10,
				range: "min",
				min: 0,
				max: 100,
				step: 1,
				slide: function(event, ui) {
					var val = parseInt(ui.value);
					$("#water-saving").val(val);
				}
			});