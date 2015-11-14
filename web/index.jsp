<%-- 
    Document   : index
    Created on : 13/11/2015, 21:27:45
    Author     : trbra
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>

        <link rel='stylesheet' href='fullcalendar/fullcalendar.css' />
        <script src='fullcalendar/lib/jquery.min.js'></script>
        <script src='fullcalendar/lib/moment.min.js'></script>

        <script src='fullcalendar/fullcalendar.js'></script>
        <script src='fullcalendar/lang-all.js'></script>
        <script>

            $(document).ready(function () {

                $('#calendar').fullCalendar({
                    lang: 'pt-br'
                });

            });

        </script>
    </head>
    <body>
        <div id='calendar'></div>
        <h1>Hello World!</h1>
    </body>
</html>
