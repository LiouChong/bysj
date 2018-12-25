<%@page contentType="text/html; charset=utf-8" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html lang="en" class="no-js">

    <head>

        <meta charset="utf-8">
        <title>Fullscreen Login</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="description" content="">
        <meta name="author" content="">

        <!-- CSS -->
        <link rel='stylesheet' href='http://fonts.googleapis.com/css?family=PT+Sans:400,700'>
        <link rel="stylesheet" href="../../assets/css/reset.css">
        <link rel="stylesheet" href="../../assets/css/supersized.css">
        <link rel="stylesheet" href="../../assets/css/style.css">

        <!-- HTML5 shim, for IE6-8 support of HTML5 elements -->
        <!--[if lt IE 9]>
            <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
        <![endif]-->
        <style type="text/css">
           /* div {
                border: 1px solid black;
            }*/
            input[type="button"]{
                background: rgba(22, 115, 11, 0.38);
                border: 0 none;
                width: 280px;
                height: 40px;
                border-radius: 3px;
                color: white;
            }
            #tags {
                position: absolute;
                right:400px;
                top:500px;
                font-weight: 700;
                font-size: 25px;
                text-shadow: 0 1px 3px rgba(0,0,0,.2);
                color: deepskyblue;
                text-decoration: none;
            }
            .null{
                width: 20px;
                height:20px;
            }


        </style>


        <script src="http://code.jquery.com/jquery-latest.js"></script>
        <script>
            $(document).ready(function(){
                $("#register").click(function(){
                    $(".page-container").slideUp();
                    $(".page-containerRe").slideDown();
                    $("#email").val('');
                    $("#passwordRe").val('');
                    $("#passwordRepeat").val('');
                    $("#code").val('');
                    $("#sendidcode").val('发送验证码');
                    $("#sendidcode").removeAttr("disabled");
                    $(".error").hide();
                });

                $("#registerRe").click(function(){
                    $(".page-containerRe").slideUp();
                    $(".page-container").slideDown();

                });

                $("#email").blur(function() {
                    if($("#email").val() == ''){
                        $("#message").text("邮箱不能为空");
                    } else {
                        $.post("/checkName",{
                            email:$("#email").val()
                        },function (data,status) {
                            // alert(data);
                            $("#message").text(data);
                        });
                    }
                });
                $("#passwordRepeat").blur(function () {
                    if($("#passwordRe").val() != $("#passwordRepeat").val() ){
                        $("#message2").text("两次输入的密码不一致！");
                    } else {
                        $("#message2").text(" ");
                    }
                })

                $("#sendidcode").click(function(){
                    if($("#email").val() == ""){
                        $("#sendidcode").attr("disabled","true");
                        $("#sendidcode").val("邮箱地址未填");
                        setTimeout(function(){
                            $("#sendidcode").removeAttr("disabled");
                            $("#sendidcode").val("发送验证码");
                        },900);
                        return;
                    }
                    var myreg = /^([a-zA-Z0-9]+[_|\_|\.]?)*[a-zA-Z0-9]+@([a-zA-Z0-9]+[_|\_|\.]?)*[a-zA-Z0-9]+\.[a-zA-Z]{2,3}$/;
                    if(!myreg.test($("#email").val())){
                        $("#sendidcode").attr("disabled","true");
                        $("#sendidcode").val("邮箱格式错误");
                        setTimeout(function(){
                            $("#sendidcode").removeAttr("disabled");
                            $("#sendidcode").val("发送验证码");
                        },900);
                        return;
                    }
                    $("#sendidcode").attr("value","已发送");
                    $("#sendidcode").attr("disabled","true");

                    $.ajax({
                        url:"/sendMail",
                        type:"GET",
                        //发送数据的第一种格式，字符串...
                        data:"mail="+$("#email").val(),
                        timeout:5000,
                        seccess:function(data){
                            // $("#sendidcode").attr("value","验证码已发送");
                            // alert("以发送!")
                        },
                        error:function(){

                        }
                    });
                });


                $("#registerbut").click(function () {
                    if ($("#email").val() == "") {
                        alert("用户名不能为空！");
                    } else {
                        $.post("/regist",{
                            email:$("#email").val(),
                            psw:$("#passwordRe").val(),
                            code:$("#code").val()
                        },function (data,stutas) {
                            $(".error").show();
                            $("#regis_info").text(data);
                        });
                    }
                });

               /* $("#loginsubmit").click(function () {
                    $.post("/userLogin",{
                        email:$("#username").val(),
                        psw:$("#password").val()
                    },function (data,status) {
                        $("#login_info").text(data);
                    })
                })*/

            });

        </script>
    </head>

    <body>
        <div class="page-container">

            <h1>BBS</h1>
            <form action="/login" method="post">
                <input id="username" type="text" name="username" class="username" placeholder="邮箱">
                <input id="password" type="password" name="password" class="password" placeholder="密码"> <br><br>
                <span id = "login_info">${login_info}</span><br>
                <div style="height: 20px;"><input class="null" type="checkbox" value="true" name="rememberMe"><span style="font-size: 18px">记住我</span></div>
                <br><button type="submit" id="loginsubmit">登录</button>

            </form>
            <div class="connect">
                <a id="register"> 注册</a>
            </div>
        </div>

        <div class="page-containerRe">
            <h1>注册</h1>
            <%--<form action="/regist" method="post">--%>
                <input id="email" type="text" name="usernameRe" class="username" placeholder="验证邮箱"><br>
                    <span id="message" style="color: red;float: right"></span><br>

                <input id="passwordRe" type="password" name="passwordRe" class="password" placeholder="密码"><br>
                <input id="passwordRepeat" type="password" name="passwordRepeat" class="password" placeholder="请再次输入密码"><br>
                    <span id="message2" style="color: red;float: right"></span><br>

                <input type="button" value="点击发送验证码" id="sendidcode">
                <input id="code" type="text" required="required" placeholder="验证码" name="idcode"/>

            <%--在这里如果将shiro中的/regis设置为有权限才可访问的花，他就直接向/login发送请求--%>
            <button id="registerbut" value="注册">注册</button>
            <%--</form>--%>
                <div class="error"><span id="regis_info"> </span></div>
            <div class="connectRe">
                <a id="registerRe"> 登录</a>
            </div>
        </div>


        <!-- Javascript -->
        <script src="../../assets/js/jquery-1.8.2.min.js"></script>
        <script src="../../assets/js/supersized.3.2.7.min.js"></script>
        <script src="../../assets/js/supersized-init.js"></script>
        <script src="../../assets/js/scripts.js"></script>
    </body>

</html>

