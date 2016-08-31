<%-- 
    Document   : projectschedule
    Created on : 2016/08/30, 14:22:01
    Author     : yoshi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Schedule</title>
        <link rel="stylesheet" type="text/css" href="css/bootstrap.css">
        <link href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap-glyphicons.css" rel="stylesheet">
        <link href="http://getbootstrap.com/examples/sticky-footer/sticky-footer.css" rel="stylesheet">
        <link rel="stylesheet" href="http://code.jquery.com/ui/1.11.2/themes/smoothness/jquery-ui.css">
        <script src="http://code.jquery.com/jquery-1.10.2.js"></script>
        <script src="http://code.jquery.com/ui/1.11.2/jquery-ui.js"></script>
        <style>
            #draggable { width: 150px; height: 150px; padding: 0.5em; }
        </style>
        <script>
            $( function() {
                $( "#draggable" ).draggable({
                    axis: 'y',
                    opacity: 0.5,
                    handle: '.handle'
                });
                $('.target').droppable({
                    accept: '#draggable',
                    drop: function(event, ui) {
                        console.log('dropped!');
                    }
                });
            } );
            
            
        </script>
    </head>
    <body>
        <%@ include file="header.jsp" %>
        <div class="jumbotron target" style="margin-top: 50px;">
            <div class="container">
                <div id="draggable" class="ui-widget-content">
                    <div class="handle">Drag me around</div>
                </div>
            </div>
        </div>
        <%@ include file="footer.jsp" %>
    </body>
</html>
