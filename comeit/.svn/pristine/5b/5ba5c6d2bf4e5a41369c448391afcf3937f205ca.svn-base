<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<%@ include file="/WEB-INF/views/admin/common/include/path.jsp" %>

<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title><tiles:insertAttribute name="title" ignore="true" /></title>
  
  <!--STYLESHEET-->
  <!--=================================================-->
  
  <!--Open Sans Font [ OPTIONAL ] -->
  <link href="http://fonts.googleapis.com/css?family=Open+Sans:300,400,600,700&amp;subset=latin" rel="stylesheet">
  
  <!--Bootstrap Stylesheet [ REQUIRED ]-->
  <link href="${currentThemePath}/css/bootstrap.min.css" rel="stylesheet">
  
  <!--Nifty Stylesheet [ REQUIRED ]-->
  <link href="${currentThemePath}/css/nifty.min.css" rel="stylesheet">
  
  <!--Font Awesome [ OPTIONAL ]-->
  <link href="${currentThemePath}/plugins/font-awesome/css/font-awesome.min.css" rel="stylesheet">
  
  <!--Switchery [ OPTIONAL ]-->
  <link href="${currentThemePath}/plugins/switchery/switchery.min.css" rel="stylesheet">
  
  <!--Bootstrap Select [ OPTIONAL ]-->
  <link href="${currentThemePath}/plugins/bootstrap-select/bootstrap-select.min.css" rel="stylesheet">
  
  <!--Bootstrap Table [ OPTIONAL ]-->
  <link href="${currentThemePath}/plugins/datatables/media/css/dataTables.bootstrap.css" rel="stylesheet">
  <link href="${currentThemePath}/plugins/datatables/extensions/Responsive/css/dataTables.responsive.css" rel="stylesheet">
  
  <!--Demo [ DEMONSTRATION ]-->
  <link href="${currentThemePath}/css/demo/nifty-demo.min.css" rel="stylesheet">
  
  <!--SCRIPT-->
  <!--=================================================-->
  
  <!-- 페이지 상단 로딩바 [ OPTIONAL ]-->
  <link href="${currentThemePath}/plugins/pace/pace.min.css" rel="stylesheet">
  <script src="${currentThemePath}/plugins/pace/pace.min.js"></script>
</head>
<!--TIPS-->
<!--You may remove all ID or Class names which contain "demo-", they are only used for demonstration. -->

<body>
  <div id="container" class="effect mainnav-lg">
    
    <%-- 헤더 시작 --%>
    <!--===================================================-->
    <tiles:insertAttribute name="header" />
    <!--===================================================-->
    <%-- 헤더 종료 --%>

    <div class="boxed">

      <!--CONTENT CONTAINER-->
      <!--===================================================-->
      <div id="content-container">
        <tiles:insertAttribute name="content" />
      </div>
      <!--===================================================-->
      <!--END CONTENT CONTAINER-->
      
      <%-- 레프트 사이드 메뉴 --%>
      <tiles:insertAttribute name="sidebar" />
      
      <%-- 라이트 사이드 메뉴 --%>
      <tiles:insertAttribute name="asidebar" />

    </div>

    <%-- 푸터 --%>
    <tiles:insertAttribute name="footer" />

    <!-- SCROLL TOP BUTTON -->
    <!--===================================================-->
    <button id="scroll-top" class="btn"><i class="fa fa-chevron-up"></i></button>
    <!--===================================================-->

  </div>
  <!--===================================================-->
  <!-- END OF CONTAINER -->
  
  
  <!--JAVASCRIPT-->
  <!--=================================================-->

  <!--jQuery [ REQUIRED ]-->
  <script src="${jqueryPath}/jquery-2.2.1.js"></script>


  <!--BootstrapJS [ RECOMMENDED ]-->
  <script src="${currentThemePath}/js/bootstrap.min.js"></script>


  <!--Fast Click [ OPTIONAL ]-->
  <script src="${currentThemePath}/plugins/fast-click/fastclick.min.js"></script>

  
  <!--Nifty Admin [ RECOMMENDED ]-->
  <script src="${currentThemePath}/js/nifty.min.js"></script>


  <!--Switchery [ OPTIONAL ]-->
  <script src="${currentThemePath}/plugins/switchery/switchery.min.js"></script>


  <!--Bootstrap Select [ OPTIONAL ]-->
  <script src="${currentThemePath}/plugins/bootstrap-select/bootstrap-select.min.js"></script>


  <!--DataTables [ OPTIONAL ]-->
  <script src="${currentThemePath}/plugins/datatables/media/js/jquery.dataTables.js"></script>
  <script src="${currentThemePath}/plugins/datatables/media/js/dataTables.bootstrap.js"></script>
  <script src="${currentThemePath}/plugins/datatables/extensions/Responsive/js/dataTables.responsive.min.js"></script>


  <!--Demo script [ DEMONSTRATION ]-->
  <script src="${currentThemePath}/js/demo/nifty-demo.min.js"></script>


  <!--DataTables Sample [ SAMPLE ]-->
  <script src="${currentThemePath}/js/demo/tables-datatables.js"></script>

</body>
</html>