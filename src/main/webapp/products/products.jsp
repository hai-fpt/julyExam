<!DOCTYPE html>
<html>
<head>
    <title>Product Details</title>
</head>
<body>
<h2>Product Details</h2>
<table border="1">
    <tr>
        <th>Product ID</th>
        <th>Product Name</th>
        <th>Description</th>
        <th>Date of Manufacture</th>
        <th>Price</th>
    </tr>
    <c:forEach var="product" items="${products}">
        <tr>
            <td>${product.prodID}</td>
            <td>${product.prodName}</td>
            <td>${product.description}</td>
            <td>${product.dateOfManf}</td>
            <td>${product.price}</td>
        </tr>
    </c:forEach>
</table>
<h2>Sale Details</h2>
<table border="1">
    <tr>
        <th>Serial No</th>
        <th>Salesman ID</th>
        <th>Product Name</th>
        <th>Salesman Name</th>
        <th>Date of Sale</th>
    </tr>
    <c:forEach var="sale" items="${sales}">
        <tr>
            <td>${sale.slNo}</td>
            <td>${sale.salesmanID}</td>
            <td>${sale.product.prodName}</td>
            <td>${sale.salesmanName}</td>
            <td>${sale.dos}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
