<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ include file="/WEB-INF/views/admin/common/include/path.jsp" %>
<c:url value="/j_spring_security_check" var="loginUrl" />

<!DOCTYPE html>
<html lang="ko">

<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Come It Admin Login Page</title>

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
<!--Demo [ DEMONSTRATION ]-->
<link href="${currentThemePath}/css/demo/nifty-demo.css" rel="stylesheet">
<!--SCRIPT-->
<!--=================================================-->

<!--Page Load Progress Bar [ OPTIONAL ]-->
<link href="${currentThemePath}/plugins/pace/pace.min.css" rel="stylesheet">
<script src="${currentThemePath}/plugins/pace/pace.min.js"></script>
</head>

<!--TIPS-->
<!--You may remove all ID or Class names which contain "demo-", they are only used for demonstration. -->

<body>
  <div id="container" class="cls-container">
    
    <!-- BACKGROUND IMAGE -->
    <!--===================================================-->
    <div id="bg-overlay" class="bg-img" style="background-image: url('${currentThemePath}/img/bg-img/bg-img-3.jpg')"></div>
    
    
    <!-- HEADER -->
    <!--===================================================-->
    <div class="cls-header cls-header-lg">
      <div class="cls-brand">
          <!-- <img alt="Nifty Admin" src="img/logo.png" class="brand-icon"> -->
          <span class="box-inline brand-title">올때그거 <span class="text-thin">관리자 로그인</span></span>
      </div>
    </div>
    <!--===================================================-->
    
    <!-- LOGIN FORM -->
    <!--===================================================-->
    <div class="cls-content">
      <div class="cls-content-sm panel">
        <div class="panel-body">
          <p class="pad-btm">관리자 ID/PASSWORD를 입력하세요.</p>
          <form name="form1" action="${loginUrl}" method="POST" onsubmit="return login();">
            <input type="hidden" id="loginType" name="loginType" value="00001" />
            <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
            <div class="form-group">
              <div class="input-group">
                <div class="input-group-addon"><i class="fa fa-user"></i></div>
                <input type="text" id="adminId" name="adminId" class="form-control" placeholder="관리자ID">
              </div>
            </div>
            <div class="form-group">
              <div class="input-group">
                <div class="input-group-addon"><i class="fa fa-asterisk"></i></div>
                <input type="password" id="password" name="password" class="form-control" placeholder="비밀번호">
              </div>
            </div>
            <div class="row">
              <div class="col-xs-8 text-left checkbox">
                <label class="form-checkbox form-icon">
                <input type="checkbox"> 기억하기
                </label>
              </div>
              <div class="col-xs-4">
                <div class="form-group text-right">
                <button class="btn btn-success text-uppercase" type="submit" id="btn_login">로그인</button>
                </div>
              </div>
            </div>
            <%--
            <div class="mar-btm"><em>- or -</em></div>
            <button class="btn btn-primary btn-lg btn-block" type="button">
              <i class="fa fa-facebook fa-fw"></i> Login with Facebook
            </button>
            --%>
          </form>
        </div>
      </div>
      <%--
      <div class="pad-ver">
        <a href="pages-password-reminder.html" class="btn-link mar-rgt">Forgot password ?</a>
        <a href="pages-register.html" class="btn-link mar-lft">Create a new account</a>
      </div>
      --%>
    </div>
    <!--===================================================-->
    
  </div>
  <!--===================================================-->
  <!-- END OF CONTAINER -->


    
  <!--JAVASCRIPT-->
  <!--=================================================-->
  <!--jQuery [ REQUIRED ]-->
  <script src="${commonJsPath}/jquery/jquery-2.2.1.js"></script>
  <!--BootstrapJS [ RECOMMENDED ]-->
  <script src="${currentThemePath}/js/bootstrap.min.js"></script>
  <!--Fast Click [ OPTIONAL ]-->
  <script src="${currentThemePath}/plugins/fast-click/fastclick.min.js"></script>
  <!--Nifty Admin [ RECOMMENDED ]-->
  <script src="${currentThemePath}/js/nifty.min.js"></script>
  
  <script src="${commonJsPath}/common.js"></script>
  
  <script>
  $(document).ready(function() {
  });
  
  function login() {
    if(isEmpty($("#adminId").val())) {
			//alertMessage("error.user.required.id");
			alert("아이디를 입력하세요.");
			$("#adminId").focus();
			return false;
	  }
	  if(isEmpty($("#password").val())) {
			//alertMessage("error.user.required.password");
			alert("비밀번호를 입력하세요.");
			$("#password").focus();
			return false;
	  }
	  
	  return true;
  }
  </script>
</body>
</html>
