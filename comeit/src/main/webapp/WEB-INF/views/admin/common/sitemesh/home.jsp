<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<c:set var="tmpNowDate"><fmt:formatDate value="<%=new java.util.Date()%>" pattern="yyyyMMddhhmmss"/></c:set>
홈 화면 입니다.<br>
<fmt:parseDate value="${tmpNowDate}" var="parseTmpNowDate" pattern="yyyyMMddHHmmss" />
<fmt:formatDate pattern="yyyy-MM-dd HH:mm:ss" value="${parseTmpNowDate}" />