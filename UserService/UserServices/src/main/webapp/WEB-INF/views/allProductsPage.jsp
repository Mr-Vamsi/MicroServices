<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="jakarta.tags.core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Product Table</title>
</head>
<body>
    <h2>Product Table</h2>
    <table border="1">
        <thead>
            <tr>
                <th>Product Name</th>
                <th>Product Type</th>
                <th>Product Description</th>
                <th>Product Cost</th>
                <th>Product Quantity</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${response}" var="product">
                <tr>
                    <td>${product.productname}</td>
                    <td>${product.producttype}</td>
                    <td>${product.productdescription}</td>
                    <td>${product.productcost}</td>
                    <td>${product.productquantity}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>
