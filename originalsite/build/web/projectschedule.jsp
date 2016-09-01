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
            #draggable { width: 100px; height: 100px; padding: 0.5em;}
            .hover { background: #faf0e6 !important;}
            .ui-selected { background: red;}
        </style>
        <script>
            $( function() {
                $( "#draggable" ).draggable({
//                    axis: 'y',
                    opacity: 0.5,
                    handle: '.handle',
                    helper: 'clone'
                });
                $('.target').droppable({
                    accept: '#draggable',
                    hoverClass: 'hover',
                    drop: function(event, ui) {
                        ui.draggable.clone().appendTo(this);
                        console.log('dropped!');
                    },
                });
            } );
        </script>
    </head>
    <body>
        <%@ include file="header.jsp" %>
        <div class="jumbotron target" style="margin-top: 50px;">
            <div id="draggable" class="ui-widget-content" style="margin: 0 0 20px 20px">
                <div class="handle">Drag me around</div>
            </div>
        </div>
        
        <ul id="sortable">
            <li id="item_1">item1</li>
            <li id="item_2">item2</li>
            <li id="item_3">item3</li>
            <li id="item_4">item4</li>
            <li id="item_5">item5</li>
        </ul>
        <script>
//            $( function() {
//                var selected = new Array();
//                $('#selectable').selectable({
//                    selected: function(event, ui) {
//                        if(selected.indexOf(ui.selected.id) == -1) {
//                            selected.push(ui.selected.id);
//                        }
//                        console.log(selected);
//                    },
//                    unselected: function(event, ui) {
//                        var id = ui.unselected.id;
//                        selected.splice(selected.indexOf(id), 1);
//                        console.log(selected);
//                    }
//                });
//            });
                $(function() {
                    $('#sortable').sortable({
                        cursor: 'move',
                        opacity: 0.5,
                        update: function(event, ui) {
                            console.log($(this).sortable("serialize"));
                        }
                    });
                })
        </script>
        
        <div id="accordion">
            <h3><a href="">Title</a></h3>
            <div>こんにちは！</div>
            <h3><a href="">Title</a></h3>
            <div>こんにちは！</div>
            <h3><a href="">Title</a></h3>
            <div>こんにちは！</div>
        </div>
        
        <script>
            $(function() {
                $('#accordion').accordion();
            });
        </script>
        
        <input type="text" id="datepicker">
        
        <script>
            $(function() {
                $('#datepicker').datepicker({
                    dateFormat: "yy-mm-dd",
                    minDate: -2,
                    maxDate: "+1M"
                });
            })
        </script>
        
        <div id="bar" style="width: 200px; margin-top: 20px"></div>
        <div id="slider" style="width: 200px; margin-top: 20px"></div>
        
        <script>
            $(function() {
                $('#bar').progressbar({
                    value: 33
                });
                $('#slider').slider({
                    slide: function(event, ui) {
                        console.log(ui.value);
                        $('#bar').progressbar('option', 'value', ui.value);
                    }
                });
            })
        </script>
        <%@ include file="footer.jsp" %>
    </body>
</html>
