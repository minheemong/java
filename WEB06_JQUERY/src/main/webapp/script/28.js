$(function(){
    var mstate = false;
    $('#title').click(function(){
        if(mstate==true){
            mstate=false;
            $('#dropmenu').slideUp();
        }else{
            mstate=true;
            $('#dropmenu').slideDown();
        }
    });
    $('#dropmenu div').hover(
        function(){ $(this).css('background','silver')},
        function(){ $(this).css('background','white')}
    );
    $('#dropmenu div').click(function(){
        var num = $(this).html();
        var blank = num.indexOf(' ')
        num = num.substring(0,blank);
        //alert(num);
        $('#num').html(num);
        mstate=false;
        $('#dropmenu').slideUp();
    });
});