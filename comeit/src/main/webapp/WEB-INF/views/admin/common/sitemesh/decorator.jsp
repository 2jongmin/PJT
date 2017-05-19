<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Geun`s Page Sample</title>
</head>
<body>
  <table style="width: 100%;">
    <col width="25%"/>
    <col width="*"/>
    <tr >
      <th colspan="2" style="border:1px solid blue;">
        HEADER
      </th>
    </tr>
    <tr>
      <td style="border:1px solid orange;">
        <sitemesh:decorate decorator="/WEB-INF/views/admin/common/sitemesh/menu.jsp"/>
      </td>
      <td style="border:1px solid gray;">
        <sitemesh:write property="body" />
      </td>
    </tr>
    <tr>
      <td colspan="2" style="border:1px solid red;">
        FOOTER
      </td>
    </tr>
  </table>
</body>
</html>