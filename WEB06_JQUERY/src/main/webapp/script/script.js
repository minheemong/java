$(function(){
    var l = 0;
    var t = 0;
    $('li').click(function(){
        var num = $(this).index();
        switch(num){
            case 0 : 
                l = 0; t = 0; break;
                case 1 : 
                l = -600; t = 0; break;
                case 2 : 
                l = -1200; t = 0; break;
                case 3 : 
                l = 0; t = -400; break;
                case 4 : 
                l = -600; t = -400; break;
                case 5 : 
                l = -1200; t = -400; break;
        }
        $('#view').animate({left:l, top:t},1000);
    });
});