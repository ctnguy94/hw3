<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE html>
<html>
<head>
    <title>Hiking & Camping Shop</title>

</head>
<body>

<h2>Hiking & Camping Shop</h2>

<table>
    <tr>
        <th>ID</th>
        <th>Description</th>
        <th>Price</th>
        <th>Color</th>
    </tr>
    <c:forEach var = "listitem" items = "${productlist}">
        <tr>
            <td>${listitem.getId()}</td>
            <td>${listitem.getDescription()}</td>
            <td>$${listitem.getPrice()}</td>
            <td>${listitem.getColor()}</td>
        </tr>
    </c:forEach>
</table>
<style>
    table {
        border-collapse: collapse;
        width: 100%;
    }

    td, th {
        border: 1px solid #dddddd;
        text-align: left;
        padding: 8px;
        width: 150px;
    }

    tr:nth-child(even) {
        background-color: #dddddd;
    }
</style>
</body>
</html>
