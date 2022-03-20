$(document).ready(function(){

    $("#my-button").click(function(){
        $("#artists-table").fadeOut("slow");
    });


    $("#artists-table").click(function(){
        $("#artists-table").animate({
            left: '250px',
            height: '+=150px',
            width: '+=150px'
        });
    })
});