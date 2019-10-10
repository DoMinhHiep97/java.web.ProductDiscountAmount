<%--
  Created by IntelliJ IDEA.
  User: 19tha
  Date: 10/10/2019
  Time: 3:22 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Product Discount Calculator</title>
  <link rel="stylesheet" href="calculator.css">
</head>
<body>
<div class="product">
    <h2>Product Discount Calculator</h2>
    <form method="post" action="/discount">
        <label>Product Description: </label><br/>
        <input type="text" name="product" value="da huong"/><br/>
        <label>List Price: </label><br/>
        <input type="text" name="price" value="2000"/><br/>
        <label>Discount Percent: </label><br/>
        <input type="text" name="discount" value="0.5"/>%<br/>
        <input type="submit" id="submit" value="Calculate Discount">
    </form>
  <h3>da huong-2000</h3>
  <h3>lifeBoy-500</h3>
  <h3>sunlight-700</h3>
</div>
</body>
</html>
