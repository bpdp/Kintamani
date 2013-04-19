<html>
  <head>
    <title>jQuery Hello World</title>
     
    <script type="text/javascript" src="/js/jquery-1.9.1.js"></script>
     
  </head>
   
  <body>
     
    <script type="text/javascript">
       
      $(document).ready(function(){
         $("#msgid").html("This is Hello World by JQuery");
       });
        
     </script>
      
     Say hello from HTML to {{.Name}}
      
     <div id="msgid">
     </div>
      
   </body>
 </html>
