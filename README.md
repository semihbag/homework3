# homework3

Write a program that draws the coordinate system and some geometric shapes on the console     
screen as described below.                                
Ask the user to select one of the following shapes:         
1. Line                 
2. Rectangle                
3. Triangle                 
4. Parabola                   
5. Circle                                                                                           

Line -> If the user selects to draw a line, ask for the coefficients a and b that describe the line         
on the coordinate system such that y = ax + b.                                

Triangle -> If the user selects to draw a triangle, ask for the coordinates of the three vertices                 
vertex 1 (a, b), vertex 2 (c, d), and vertex 3 (e, f) that describe the triangle.         

Rectangle -> If the user selects to draw a rectangle, ask for the coordinates of the three                  
vertices vertex 1 (a, b), vertex 2 (c, d), and vertex 3 (e, f) that describe the rectangle. Vertex 2 and              
vertex 3 are in the neighborhood of vertex 1, and vertex 4 is in the opposite of vertex 1, i.e. the first         
diagonal is between vertex 1 and vertex 4, and the second one is between vertex 2 and vertex 3. You         
will the coordinates of vertex 4 using the information for other vertices. Also, you will check whether               
the points given construct a rectangle; if not, you will notice the user and will not the the rectangle.   

Parabola -> Similarly, for the parabola, ask for the coefficients a, b, c to draw the parabola for              
the equation y = ax2 + bx + c.            

Circle -> Finally, for the circle, ask for the radius (r) and the center (a, b) to define the circle                  
equation (x - a)2 + (y - b)2 = r2.        

After getting required parameters, draw the coordinate system on the console screen using           
the characters – and |. Draw the geometric shape using the character *.                   
Both x and y values in the coordinate system should range at least in [-10, 10]. You may draw         
a larger coordinate system as it will look clearer. However, make sure that your coordinate system                
fits in the console screen.               
