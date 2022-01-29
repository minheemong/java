$(function(){
    var play = false;
    var num = 0;
    var timer;
    var dist;
    $('li').click(function(){
        var clickIndex = $(this).index();
        switch(clickIndex){
            case 0 : // 왼쪽 한 칸
                if(num==0||play==true) return; //return 대신 break 가능
                num--;
                dist = -600*num;
                $('#view').animate({left:dist},300);
                $('li').removeClass('select');
                $('li').eq(num+1).addClass('select');
                break;
            case 1 : case 2 :case 3 :case 4 :case 5 :case 6 :case 7 : case 8 : 
                if(play==true) break;
                num = clickIndex-2;
                dist = -600*num;
                $('#view').animate({left:dist},300);
                $('li').removeClass('select');
                $('li').eq(num+1).addClass('select');
            case 9 : // 오른쪽 한 칸
                if(num==7||play==true) return; //return 대신 break 가능
                num++;
                dist = -600*num;
                $('#view').animate({left:dist},300);
                $('li').removeClass('select');
                $('li').eq(num+1).addClass('select');
                break;
            case 10 : // 자동버튼
                if(play==true){ // play => stop
                    play = false;
                    $('li').eq(clickIndex).html('▶');
                    window.clearInterval(timer);
                }else{ // stop = > play
                    play = true;
                    $('li').eq(clickIndex).html('■');
                    timer = window.setInterval(function(){
                        dist = -600*num;
                        $('#view').animate({left:dist},300);
                        $('li').removeClass('select');
                        $('li').eq(num+1).addClass('select');
                        num++;
                        if(num==8)num=0;
                    },1500);
                }
        }
    });

});