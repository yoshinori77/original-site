<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
    <head>
        <link rel="stylesheet" type="text/css" href="http://yui.yahooapis.com/3.18.1/build/cssreset/cssreset-min.css">
        <link rel="stylesheet" type="text/css" href="css/bootstrap.css">
        <link rel="stylesheet" type="text/css" href="css/index.css">
        <link href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap-glyphicons.css" rel="stylesheet">
        <link href="http://getbootstrap.com/examples/sticky-footer/sticky-footer.css" rel="stylesheet">
        
        <script src="http://code.jquery.com/jquery.js"></script>
        <script src="js/bootstrap.min.js"></script>
        
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome to Spring Web MVC project</title>
    </head>

    <body> 
        <div class="container"><%@ include file="header.jsp" %></div><br>
        
        <div id="wrap">
            <div id="carousel-example-generic" class="carousel slide" data-ride="carousel" data-interval="7000">
                <!-- Indicators -->
                <ol class="carousel-indicators">
                  <li data-target="#carousel-example-generic" data-slide-to="0" class="active" style="background: black"></li>
                  <li data-target="#carousel-example-generic" data-slide-to="1" style="background: black"></li>
                  <li data-target="#carousel-example-generic" data-slide-to="2" style="background: red"></li>
                </ol>
                
                <!--カルーセル-->
                <!-- Wrapper for slides -->
                <div class="carousel-inner" role="listbox">
                  <div class="item active">
                    <img src="asset/makingisfun.jpg" alt="photo1" style="margin: 0 auto; display: block;">
                    <div class="carousel-caption">
                      <!--文章入れられる-->
                    </div>
                  </div>
                  <div class="item">
                    <img src="asset/photo1.jpg" alt="photo2" style="margin: 0 auto; display: block">
                    <div class="carousel-caption">
                      <!--文章入れられる-->
                    </div>
                  </div>
                  <div class="item">
                    <img src="asset/photo3.jpg" alt="photo3" style="margin: 0 auto; display: block">
                    <div class="carousel-caption">
                      <!--文章入れられる-->
                    </div>
                  </div>
                </div>

                <!-- Controls -->
                <a class="left carousel-control" href="#carousel-example-generic" role="button" data-slide="prev" style="margin: 0 0 0 10%; background: white">
                  <span class="glyphicon glyphicon-chevron-left" aria-hidden="true" style="color: black"></span>
                  <span class="sr-only">Previous</span>
                </a>
                <a class="right carousel-control" href="#carousel-example-generic" role="button" data-slide="next" style="margin: 0 10% 0 0; background: white">
                  <span class="glyphicon glyphicon-chevron-right" aria-hidden="true" style="color: black"></span>
                  <span class="sr-only">Next</span>
                </a>
            </div>
            
            <!--各プロジェクト-->
            <div class="container" style="margin-top: 5%">
                <div class="row">
                    <div class="jumbotron col-md-4 col-sm-4 col-xs-4" style="display: inline-block; margin-left: 10%; padding: 10px 10px 10px 10px; border-radius: 10px">
                        <a href="Chat" style="text-decoration: none !important; color: black; font-size: 20px">
                            <img src="asset/newCar.jpg" style="display: block; margin: 0 auto; padding-bottom: 10px; border-radius: 15px">
                            <div>
                                <div class="title" style="padding-bottom: 30px;">Super Car</div>
                                <div class="description" style="padding-bottom: 10px">It's a miracle car like a Delorean!! </div>
                                <div class="progress">
                                    <div class="progress-bar progress-bar-success" style="width: 50%; "></div>
                                </div>
                            </div>
                        </a>
                    </div>
                    <div class="jumbotron col-md-4 col-sm-4 col-xs-4" style="display: inline-block; margin-left: 15%; padding: 10px 10px 10px 10px; border-radius: 10px">
                        <a href="Chat" style="text-decoration: none; color: black; font-size: 20px">
                            <img src="asset/newDrone.jpg" style="display: block; margin: 0 auto; padding-bottom: 10px; border-radius: 15px">
                            <div>
                                <div class="title" style="padding-bottom: 30px;">Next Drone</div>
                                <div class="description" style="padding-bottom: 10px">Superb drone is higher than phantom!!</div>
                                <div class="progress">
                                    <div class="progress-bar progress-bar-success" style="width: 80%; "></div>
                                </div>
                            </div>
                        </a>
                    </div>
                </div>
            </div>
        </div>
        
        <%@ include file="footer_home.jsp" %>
        
    </body>
</html>

