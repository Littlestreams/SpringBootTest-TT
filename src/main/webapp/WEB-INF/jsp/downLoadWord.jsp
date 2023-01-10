<?xml version="1.0" encoding="UTF-8" ?>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>额度变更申请表</title>
    <!-- 路径写全 -->
    <script src="/js/jquery/jquery.min.js"></script>
    <script type="text/javascript" src="/js/wordTemplate/FileSaver.js"></script>
    <script type="text/javascript" src="/js/wordTemplate/jquery.wordexport.js"></script>
</head>
<body>
<form  id="frm"  action="#"   method="post" >
    <div class="line_tit"><a href="#" class="lkblack">首页</a>&nbsp;<span class="font10pxblack">&gt;&gt;</span>&nbsp;<a href="#" class="lkblack">业务报告</a>&nbsp;<span class="font10pxblack">&gt;&gt;</span>&nbsp;<span class="font9ptblueb">额度变更申请表</span></div>
    <br>
    <div id = "wordExportDiv">
    <div style="text-align:center">
        <p><font size="4" style="font-weight:bold">额度变更申请表</font></p>
        <br>
        <table width="90%" align="center" class="tableBorder" cellpadding="0" cellspacing="0" border="1" style="table-layout:fixed; border-collapse:collapse;">
            <tr>
                <td>申请时间</td>
                <td>2017-12-11 14:45:45 </td>
                <td>商户编号</td>
                <td>M262</td>
            </tr>
            <tr>
                <td>商户名称</td>
                <td >Teamo</td>
                <td>航协号</td>
                <td>08303406</td>
            </tr>
            <tr>
                <td>产品名称</td>
                <td></td>
                <td>分支机构</td>
                <td></td>
            </tr>
            <tr>
                <td colspan="4" bgcolor="#D1EDFB" align="left" >原评级结果</td>
            </tr>
            <tr>
                <td>综合评分</td>
                <td>32.4</td>
                <td>额度系数</td>
                <td>0.0</td>
            </tr>
            <tr>
                <td>风险等级</td>
                <td>C</td>
                <td>日均交易额（万）</td>
                <td>0</td>
            </tr>
            <tr>
                <td colspan="4" bgcolor="#D1EDFB" align="left"  >信用额度信息（万）</td>
            </tr>
            <tr>
                <td>担保函额度</td>
                <td>0</td>
                <td>当前额度</td>
                <td>10000.00</td>
            </tr>
            <tr>
                <td>中航鑫港担保额度</td>
                <td>0</td>
                <td>当前调款额度</td>
                <td>0</td>
            </tr>
            <tr>
                <td colspan="4" bgcolor="#D1EDFB" align="left"  >处置方案</td>
            </tr>
            <tr>
                <td>处置原因</td>
                <td>
                    日监控
                </td>
                <td>发生日期</td>
                <td>	20171211</td>
            </tr>
            <tr>
                <td>处置原因说明</td>
                <td  colspan="3">

                </td>
            </tr>
            <tr><td colspan="4">
                <table align="center" cellpadding="0" cellspacing="0" width="100%" border="0" style="table-layout:fixed; border-collapse:collapse;">
                    <tr>
                        <td>预迟付累计次数:</td>
                        <td>1 </td>
                        <td>ASD累计次数:</td>
                        <td>1</td>
                        <td>BOPES累计次数:</td>
                        <td>1</td>
                    </tr>
                </table>
            </td>
            </tr>
            <tr><td colspan="4">
                <table align="center" class="tableBorder" cellpadding="0" cellspacing="0" width="100%" style="table-layout:fixed; border-collapse:collapse;">
                    <tr>
                        <td>预迟付连续次数:</td>
                        <td> 1</td>
                        <td>ASD连续次数:</td>
                        <td>1</td>
                        <td>BOPES连续次数:</td>
                        <td>1</td>
                    </tr>
                </table>
            </td>
            </tr>

            <tr>
                <td colspan="1"  align="left"  >
                    1  是否需要重新评级，重新评级结果：
                </td>
                <td colspan="3">
                </td>
            </tr>
            <tr>

                <td colspan="1"  align="left"  >
                    2  额度调整结果：
                </td>
                <td colspan="3">
                </td>
            </tr>
            <tr>
                <td colspan="1"  align="left"  >
                    3 确定的调整额度：
                </td>
                <td colspan="3">
                </td>
            </tr>
            <tr>
                <td colspan="1"  align="left"  >
                    4  其他处置：
                </td>
                <td colspan="3">
                </td>
            </tr>
        </table>
        <table width="90%">
            <tr>
                <td style="height: 15px;">填表人 ：</td><td></td>
                <td style="height: 15px;">复核人 ：</td><td></td>
                <td style="height: 15px;">审核人：</td><td></td>
                <td style="height: 25px;">风管会领导 ：</td><td></td>
            </tr>
            <tr id="transPanle">
                <td colspan="4" align="right"><br>
                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                    <a style="color: blue;cursor: hand; "  href="###"  onclick="window.history.go(-1);">返回</a>
                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                    <a style="color: blue;cursor: hand;"   href="###"  onclick="javascript:window.print();" ><span >打印</span></a> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                    <a style="color: blue; cursor: hand;"  href="###"   onclick="wordExport()">word导出</a>  &nbsp;&nbsp;&nbsp;&nbsp; </td>
            </tr>
        </table>
    </div>
    </div><br /><br /><br />
</form>
    <script type="text/javascript">
       function wordExport() {
            //选择性到处把不想导出的内容先隐藏掉
            $("#transPanle").attr("style", "display:none;");
            $("#wordExportDiv").wordExport('额度变更申请表');
            //导出后把刚才隐藏掉的东西放开
            $("#transPanle").attr("style", "display:block;");
        }
    </script>
</body>
</html>