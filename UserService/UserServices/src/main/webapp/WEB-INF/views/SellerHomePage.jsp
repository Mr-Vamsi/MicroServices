<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="jakarta.tags.core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Your Page Title</title>
    <style>
        /* Global styles */
        body {
            margin: 0;
            padding: 0;
            background-image: url('https://unsplash.com/photos/I-uYa5P-EgM/download?ixid=M3wxMjA3fDB8MXxzZWFyY2h8MzF8fGZydWl0JTIwYmFza2V0fGVufDB8fHx8MTcxNDIxNTI1MXww&force=true');
            /* Replace 'background-image-url.jpg' with your actual image URL */
            background-size: cover;
            background-repeat: no-repeat;
            font-family: Arial, sans-serif;
        }

        /* Styles for the header */
        header {
            background-color: rgba(0, 0, 0, 0.432);
            /* Semi-transparent background */
            color: #fff;
            padding: 10px;
            display: flex;
            justify-content: space-between;
            align-items: center;
        }

        /* Style for the tabs container */
        .tabs {
            display: flex;
            margin-left: 20px;
        }

        /* Style for individual tab */
        .tab {
            color: #0a0a0a;
            text-decoration: none;
            padding: 5px 10px;
            border-radius: 5px;
            background-color: #91cec4;
            padding-right: 10px;
        }

        /* Style for active tab */
        .tab.active {
            background-color: #000000;
            color: #fff;
        }

        /* Style for logout button */
        #logout-btn {
            background-color: #007bff;
            color: #fff;
            border: none;
            padding: 8px 16px;
            border-radius: 5px;
            cursor: pointer;
            margin-right: 20px;
        }

        /* Style for the welcome text */
        #welcome-text {
            text-align: center;
            color: #00ff73;
            /* Yellow color for better visibility */
            font-weight: bold;
            margin-bottom: 20px;
        }

        /* Style for the search container */
        .search-container {
            text-align: center;
            margin-top: 300px;
            margin-bottom: 20px;
        }

        /* Style for the search input */
        #search-bar {
            padding: 10px;
            border-radius: 5px;
            border: 1px solid #ccc;
            width: 60%;
            max-width: 400px;
        }

        /* Style for the search button */
        #search-btn {
            padding: 10px 20px;
            border-radius: 5px;
            border: none;
            background-color: #007bff;
            color: #fff;
            cursor: pointer;
        }
    </style>
</head>

<body>
    <header>
        <div class="tabs">
            <a href="ListProducts" class="tab active">List My Product</a>
            <a href="ProductsData" class="tab">All Products</a>
        </div>
        <form action="Logout" method="post">
            <button id="logout-btn" onclick="logout()">Logout</button>
        </form>
    </header>
    <h2 id="welcome-text">Welcome ${name} ! Please list your products by clicking the "List My Product" button</h2>

    <!-- Search container -->
    <form action="RestProductSearch">
        <div class="search-container">
            <input type="text" id="search-bar" placeholder="Search...">
            <button id="search-btn">Search</button>
        </div>
    </form>

    <script>
        function logout() {
            // Add logout functionality here
            alert("Logout clicked!"); // Example: show an alert
        }
    </script>
</body>

</html>