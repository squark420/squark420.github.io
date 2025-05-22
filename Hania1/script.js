
const petals = document.getElementById("petals");

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
