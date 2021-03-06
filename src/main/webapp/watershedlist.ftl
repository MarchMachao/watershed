<!DOCTYPE html>
<html>
 
    <head>
        <meta charset="UTF-8">
        <title></title>
        <link rel="stylesheet" type="text/css" href="easyUI/themes/default/easyui.css">
        <link rel="stylesheet" type="text/css" href="easyUI/themes/icon.css">
        <link rel="stylesheet" type="text/css" href="css/web.css">
        <script type="text/javascript" src="easyUI/js/jquery.min.js"></script>
        <script type="text/javascript" src="easyUI/js/jquery.easyui.min.js"></script>
    </head>
 
    <body>
        <div>
            <div style="margin-bottom: 20px; display: inline;">
                <span class="paraName">流域名称:</span> <input class="easyui-textbox" id="name" name="name" style="width: 150px; height: 32px">
            </div>
            <a href="javascript:void(0)" id="search_btn" class="easyui-linkbutton" data-options="iconCls:'icon-search'" style="width: 70px;height: 30px;">查找</a>
        </div>
        <div class="hr"></div>
        <table id="dg" style="width:auto;height:auto;" data-options="rownumbers:true,singleSelect:true,pagination:true,url:'getWatershedByName.do',method:'get'" toolbar="#tb">
            <thead>
                <tr>
                    <th data-options="field:'id',width:200">流域ID</th>
                    <th data-options="field:'name',width:200">流域名称</th>
                    <th data-options="field:'describe',width:700">流域描述</th>
                </tr>
            </thead>
        </table>
        <div id="tb">
        <a href="#" class="easyui-linkbutton" iconCls="icon-add" plain="true" onclick="javascript:location.href = 'watershededit.html';">新增</a>
        <a href="javascript:void(0)" id="easyui-linkbutton" class="easyui-linkbutton" iconCls="icon-cut" plain="true" >删除</a>
        <a href="javascript:void(0)" id="easyui-linkbutton" class="easyui-linkbutton" iconCls="icon-redo" plain="true" >设置为默认流域</a>
    </div>
 
    </body>
 
    <script type="text/javascript">
        $(function() {
            var pager = $('#dg').datagrid().datagrid('getPager');
        })
        
                
        $("#search_btn").click(function(){
            var name = $("#name").val();
            $('#dg').datagrid('load',{
                name: name
            });
        })
        
        $("#easyui-linkbutton").click(function(){
            var row = $('#dg').datagrid('getSelected');
            if (row) {
                $.messager.confirm("操作提示", "您确定要删除这条记录吗？", function(data) {
                    if (data) {
                        $.get('deleteWatershed.do', {
                            id : row.id
                        }, function(data) {
                            $.messager.alert('提示', data.content, 'info');
                            $(".pagination-load").trigger("click");
                        })
                    } else {
                        
                    }
                });
            } else {
                $.messager.alert('提示', "请选中要删除的行", 'info');
            }
        })
        
        
    </script>
    
</html>
