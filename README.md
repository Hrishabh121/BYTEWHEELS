# BYTEWHEELS


Steps to run the project:

Import the project as maven project the eclipse.
    Right Click on project -> Properties ->Java Build Path     ->jre 1.8 ,jdk 1.8
                                                               ->Maven Dependencies
                                                               ->Web App Libraries
                                                               ->Tomcat Library (tomcat >=8)
                                         -> Deployment Assembly-> Click Add -> Select Java Build Path Entries-> Next -> Select Maven Dependencies   
                                                               -> Click Add -> Folder-> /src/main/webapp then click Finish
                                         -> Java Compiler -> Set Compiler compilance level: 1.8 -> Click Apply 
                                         ->Project facets  -> Check Dynamic Web module (2.2)
                                                           -> Java (1.8)
                                                           -> JavaScript (1.0)
                                         ->Targeted Runtimes-> Select Apache Tomcat server (tomcat >=8)/or any other webserver and then Apply
                                         
                                         
                                         
                                         

Right click on the project click Run As and than run on server.
Application starts with BYTEWHEELS home page
Copy the url in http://localhost:<portno>/BYTEWHEELS/ in chrome for best view.
  
  
Important Points :
1. I am not using any Database here.
2. Instead of database a set of hardcorded values has been used.
3. Once you will click BOOK CARS button from the homepage you will navigate to Date Selection page where default values for startdate and 
enddate will come(I have kept it according to my hardcoded data) which can be modified. (Hardcoded values as data range from 01/04/2018 to
08/04/2018).
4. As the database is hardcoded , After booking a car you can see the updated available cars within the same session.(Meaning you can go and select date again and upon selection this time table will have updated available cars or "NOT AVAILABLE" in the available car column.
5. Sending Invoice to Email id has not been implemented. Upon successful booking it will just show email has been sent to this <Email ID>.

so describe the challenges you faced, amount of work done and any necessary information that you think will be valuable for us to 
