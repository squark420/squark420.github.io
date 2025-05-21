const green = document.getElementById("green");
const red = document.getElementById("red");
const yellow = document.getElementById("yellow");
const blue = document.getElementById("blue");
const triangle = document.getElementById("tri");
const petals = document.getElementById("petals");

green.addEventListener("mouseover", () => {
    triangle.classList.add("green");
    triangle.classList.remove("red");
    triangle.classList.remove("yellow");
    triangle.classList.remove("blue");
});
green.addEventListener("mouseout", () => {
    triangle.classList.remove("green");
});

red.addEventListener("mouseover", () => {
    triangle.classList.remove("green");
    triangle.classList.add("red");
    triangle.classList.remove("yellow");
    triangle.classList.remove("blue");
});
red.addEventListener("mouseout", () => {
    triangle.classList.remove("red");
});

yellow.addEventListener("mouseover", () => {
    triangle.classList.remove("green");
    triangle.classList.remove("red");
    triangle.classList.add("yellow");
    triangle.classList.remove("blue");
});
yellow.addEventListener("mouseout", () => {
    triangle.classList.remove("yellow");
});

blue.addEventListener("mouseover", () => {
    triangle.classList.remove("green");
    triangle.classList.remove("red");
    triangle.classList.remove("yellow");
    triangle.classList.add("blue");
});
blue.addEventListener("mouseout", () => {
    triangle.classList.remove("blue");
});

petals.addEventListener("click", () => {
    if (!document.getElementById("petal1").classList.contains("active")) {
        setTimeout(function(){
            document.getElementById("petal1").classList.add("active");
        }, 100);
        setTimeout(function(){
            document.getElementById("petal2").classList.add("active");
        }, 200);
        setTimeout(function(){
            document.getElementById("petal3").classList.add("active");
        }, 300);
        setTimeout(function(){
            document.getElementById("petal5").classList.add("active");
        }, 400);
        setTimeout(function(){
            document.getElementById("petal4").classList.add("active");
        }, 500);
    } else {
        setTimeout(function(){
            document.getElementById("petal1").classList.remove("active");
        }, 100);
        setTimeout(function(){
            document.getElementById("petal2").classList.remove("active");
        }, 200);
        setTimeout(function(){
            document.getElementById("petal3").classList.remove("active");
        }, 300);
        setTimeout(function(){
            document.getElementById("petal5").classList.remove("active");
        }, 400);
        setTimeout(function(){
            document.getElementById("petal4").classList.remove("active");
        }, 500);
    }
});