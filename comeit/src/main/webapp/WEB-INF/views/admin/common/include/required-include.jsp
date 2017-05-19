<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ include file="/WEB-INF/views/admin/common/include/path.jsp" %>

<!DOCTYPE html>
<html lang="ko">

<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Data Tables | Nifty - Responsive admin template.</title>


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