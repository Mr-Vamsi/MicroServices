<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="jakarta.tags.core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <form action="createProduct" method="post">
        <pre>
            Product Name <input type="text" name="productname">
            product Type <input type="text" name="producttype">
            product Descreption <input type="text" name="productdescription">
            product Cost <input type="text" name="productcost">
            product Quantity <input type="text" name="productquantity">
            <button type="submit">Create Product</button>
        </pre>
        ${msg}
    </form>
</body>
</html>