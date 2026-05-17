const express = require("express");

const app = express();

const PORT = 3000;



// Middleware 1
// Logs request path
app.use((req, res, next) => {
    console.log("Request Path:", req.path);

    next();
});



// Middleware 2
// Logs request method
app.use((req, res, next) => {
    console.log("Request Method:", req.method);

    next();
});



// Built-in middleware
// Reads form data
app.use(express.urlencoded({ extended: true }));



// Route for Home Page
app.get("/", (req, res) => {
    res.send("<h1>Welcome to Home Page</h1>");
});



// Route for Contact Us page
app.get("/contact-us", (req, res) => {

    res.send(`
        <h1>Contact Us</h1>

        <form method="POST" action="/contact-us">

            <input 
                type="text" 
                name="name" 
                placeholder="Enter Name"
            />

            <br><br>

            <input 
                type="email" 
                name="email" 
                placeholder="Enter Email"
            />

            <br><br>

            <button type="submit">
                Submit
            </button>

        </form>
    `);
});



// Handle POST request
app.post("/contact-us", (req, res) => {

    console.log(req.body);

    const userName = req.body.name;
    const userEmail = req.body.email;

    res.send(`
        <h2>Form Submitted Successfully</h2>

        <p>Name: ${userName}</p>

        <p>Email: ${userEmail}</p>
    `);
});



// Start server
app.listen(PORT, () => {
    console.log(`Server running on port ${PORT}`);
});