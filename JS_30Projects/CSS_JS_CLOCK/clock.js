const secHand = document.querySelector('.sec-hand');
const minsHand = document.querySelector('.min-hand');
const hourHand = document.querySelector('.hour-hand');


function setDate(){
    var d = new Date();
    var secs = d.getSeconds();
    var mins = d.getMinutes();
    var hours = d.getHours();
    
    var secDegrees = secs * (360/60) + 90;
    var minsDegrees = mins * (360/60) + 90;
    var hourDegrees = hours * (360/12) + 90;

    secHand.style.transform = `rotate(${secDegrees}deg)`;
    minsHand.style.transform = `rotate(${minsDegrees}deg)`;
    hourHand.style.transform = `rotate(${hourDegrees}deg)`;

}



setInterval(setDate,1000);