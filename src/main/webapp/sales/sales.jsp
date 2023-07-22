<!DOCTYPE html>
<html>
<head>
    <title>Sale Details</title>
</head>
<body>
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
