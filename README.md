CLIENT <=> WEB SERVER <=> APP SERVER
BROWER => CLIENT => http://localhost:63342/SpringMVC_JFSD/ => http://127.0.0.1:63342/SpginMVC_JSFD => web.xml
Tomcat => WEB SERVER => http://127.0.0.1:63342/SpginMVC_JSFD => WEB.XML =>
Server => 1GB Ram => Filter => 1000 Users => 1000 requests => 1000 logic gets executed
Client => Filter => 1 Request
Client => Filter => 1 Request
Client => Filter => 1 Request
REQUEST RESPONSE CYCLE
TOMCAT SERVER RUNS => Editor => Configuration
=> 1. CLIENT => BROWSER => http://localhost:8080
=> 2. http://localhost:8080 => reached to Tomcat => web.xml => player.do => http://localhost:8080/player.do
=> 3. HTTPServlet => doGet=> request, response => request.getRequestDispatcher().forward(request, response => welcome.jsp => the response displays the html