const express = require("express");
const app = express();
app.use((req,res,next) =>{
  console.log("came in first middleware",req.url,req.method);
});
app.use((req,res,next) =>{
  console.log("came in first middleware",req.url,req.method);
});
const port = 3000;

app.get("/", (req, res) => {
  //   res.send("Hello World!");
  res.json({
    name: "Soumya",
  });
});

app.listen(port, () => {
  console.log(`Example app listening on port ${port}`);
});
