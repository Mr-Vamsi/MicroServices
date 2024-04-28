
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="jakarta.tags.core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Registration Page</title>
    <style>
        body {
            margin: 0;
            padding: 0;
            font-family: Arial, sans-serif;
            background-image: url('https://unsplash.com/photos/I-uYa5P-EgM/download?ixid=M3wxMjA3fDB8MXxzZWFyY2h8MzF8fGZydWl0JTIwYmFza2V0fGVufDB8fHx8MTcxNDIxNTI1MXww&force=true'); /* Replace with your background image */
            background-size: cover;
            background-position: center;
            height: 100vh;
            display: flex;
            align-items: center;
            justify-content: center;
            flex-direction: column;
        }
        .form-container {
            width: 400px; /* Adjust the width as needed */
            background-color: rgba(255, 255, 255, 0.8); /* Semi-transparent white background */
            padding: 20px;
            border-radius: 10px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.2); /* Drop shadow effect */
        }
        .form-group {
            margin-bottom: 20px;
            padding-right: 20px;
        }
        .form-group label {
            display: block;
            margin-bottom: 5px;
        }
        .form-group input, .form-group select {
            width: 100%;
            padding: 10px;
            border: 1px solid #ccc;
            border-radius: 5px;
        }
        .button {
            padding: 10px 20px;
            background-color: #007bff;
            color: #fff;
            border: none;
            border-radius: 5px;
            cursor: pointer;
            text-decoration: none;
            font-size: 16px;
            transition: background-color 0.3s;
        }
        .button:hover {
            background-color: #0056b3;
        }
    </style>
</head>
<body>
    <div class="form-container">
        <h2>Register</h2>
        <form action="saveUserData" method="post">
            <div class="form-group">
                <label for="name">Name:</label>
                <input type="text" id="name" name="name" required>
            </div>
            <div class="form-group">
                <label for="email">Email:</label>
                <input type="email" id="email" name="email" required>
            </div>
            <div class="form-group">
                <label for="phone">Phone:</label>
                <input type="text" id="phone" name="phone" required>
            </div>
            <div class="form-group" id="companyField">
                <label for="company">Company:</label>
                <input type="text" id="company" name="company">
            </div>
            <div class="form-group">
                <label for="userType">UserType:</label>
                <select id="userType" name="userType" onchange="toggleCompanyField()">
                    <option value="">Select User Type</option>
                    <option value="Buyer">Buyer</option>
                    <option value="Seller">Seller</option>
                </select>
            </div>
            <div class="form-group">
                <label for="password">Password:</label>
                <input type="password" id="password" name="password" required>
            </div>
            <button type="submit" class="button">Register</button>
        </form>
    </div>

    <script>
        function toggleCompanyField() {
            var userType = document.getElementById("userType").value;
            var companyField = document.getElementById("companyField");

            if (userType === "Seller") {
                companyField.style.display = "block";
            } else {
                companyField.style.display = "none";
            }
        }

        // Set default state
        toggleCompanyField();
    </script>
</body>
</html>
