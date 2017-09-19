/**
 * This class represents a simple picture. It is intended to resemble someone 
 * driving down the road in a red convertable, but my art skills are seriously
 * lacking. 
 * 
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Matthew Schilling
 * @version 09.18.2017
 */
public class Picture
{

    private Triangle treeTop2;
    private Triangle treeMid2;
    private Triangle treeBase2;
    private Square trunk1;
    private Square trunk2;
    private Square trunk3;
    private Square trunk4;
    private Triangle treeTop;
    private Triangle treeMid;
    private Triangle treeBase;
    private Person abe;
    private Square body;
    private Square door;
    private Square front;
    private Circle wheel1;
    private Circle wheel2;
    private Triangle nose;
    private Triangle wing;
    private Square yellowLine1;
    private Square yellowLine2;
    private Square yellowLine3;
    private Square yellowLine4;
    private Square yellowLine5;
    private Square yellowLine6;
    private Square yellowLine7;
    private Square yellowLine8;
    private Square yellowLine9;
    private Square yellowLine10;
    private Square yellowLine11;
    private Square yellowLine12;
    private Square sky;
    private Square ground;
    private Square blacktop;
    
    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        // nothing to do... instance variables are automatically set to null
    }

    /**
     * Draw this picture.
     */
    
    public void draw()
    { 
               
        sky = new Square();
        sky.changeColor("blue");
        sky.changeSize(800);
        sky.makeVisible();
        
        ground = new Square();
        ground.changeColor("green");
        ground.changeSize(800);
        ground.moveVertical(125);
        ground.makeVisible();
        
        treeTop = new Triangle();
        treeTop.changeSize(30,20);
        treeTop.moveVertical(35);
        treeTop.moveHorizontal(400);
        treeTop.changeColor("forrest");
        treeTop.makeVisible();
        
        treeMid = new Triangle();
        treeMid.changeSize(60,40);
        treeMid.moveVertical(45);
        treeMid.moveHorizontal(400);
        treeMid.changeColor("forrest");
        treeMid.makeVisible();
        
        treeBase = new Triangle();
        treeBase.changeSize(120,80);
        treeBase.moveVertical(65);
        treeBase.moveHorizontal(400);
        treeBase.changeColor("forrest");
        treeBase.makeVisible();
        
        trunk1 = new Square();
        trunk1.changeSize(20);
        trunk1.moveVertical(185);
        trunk1.moveHorizontal(393);
        trunk1.changeColor("brown");
        trunk1.makeVisible();
        
        treeTop2 = new Triangle();
        treeTop2.changeSize(30,20);
        treeTop2.moveVertical(35);
        treeTop2.moveHorizontal(75);
        treeTop2.changeColor("forrest");
        treeTop2.makeVisible();
        
        treeMid2 = new Triangle();
        treeMid2.changeSize(60,40);
        treeMid2.moveVertical(45);
        treeMid2.moveHorizontal(75);
        treeMid2.changeColor("forrest");
        treeMid2.makeVisible();
        
        treeBase2 = new Triangle();
        treeBase2.changeSize(120,80);
        treeBase2.moveVertical(65);
        treeBase2.moveHorizontal(75);
        treeBase2.changeColor("forrest");
        treeBase2.makeVisible();
        
        trunk2 = new Square();
        trunk2.changeSize(20);
        trunk2.moveVertical(185);
        trunk2.moveHorizontal(70);
        trunk2.changeColor("brown");
        trunk2.makeVisible();
        
        blacktop = new Square();
        blacktop.changeColor("black");
        blacktop.changeSize(700);
        blacktop.moveVertical(200);
        blacktop.makeVisible();
       
        wing = new Triangle();
        wing.changeColor("red");
        wing.changeSize(-35, 55);
        wing.moveVertical(205);
        wing.moveHorizontal(163);
        wing.makeVisible();
        
        abe = new Person();
        abe.changeColor("blue");
        abe.moveHorizontal(245);
        abe.moveVertical(157);
        abe.makeVisible();
        
        body = new Square();
        body.changeColor("red");
        body.changeSize(40);
        body.makeVisible();
        body.moveHorizontal(165);
        body.moveVertical(170);
        
        door = new Square();
        door.changeColor("red");
        door.changeSize(40);
        door.moveHorizontal(205);
        door.moveVertical(170);
        door.makeVisible();
        
        front = new Square();
        front.changeColor("red");
        front.changeSize(40);
        front.moveHorizontal(245);
        front.moveVertical(170);
        front.makeVisible();
        
        wheel1 = new Circle();
        wheel1.changeColor("grey");
        wheel1.changeSize(30);
        wheel1.moveVertical(190);
        wheel1.moveHorizontal(172);
        wheel1.makeVisible();
        
        nose = new Triangle();
        nose.changeColor("red");
        nose.changeSize(40, 125);
        nose.moveHorizontal(287);
        nose.moveVertical(170);
        nose.makeVisible();
        
        wheel2 = new Circle();
        wheel2.changeColor("grey");
        wheel2.changeSize(30);
        wheel2.moveVertical(190);
        wheel2.moveHorizontal(265);
        wheel2.makeVisible();
        
        yellowLine1 = new Square();
        yellowLine1.changeSize(16);
        yellowLine1.changeColor("yellow");
        yellowLine1.moveVertical(235);
        yellowLine1.moveHorizontal(300);
        yellowLine1.makeVisible();
        
        yellowLine2 = new Square();
        yellowLine2.changeSize(16);
        yellowLine2.changeColor("yellow");
        yellowLine2.moveVertical(235);
        yellowLine2.moveHorizontal(284);
        yellowLine2.makeVisible();
        
        yellowLine3 = new Square();
        yellowLine3.changeSize(16);
        yellowLine3.changeColor("yellow");
        yellowLine3.moveVertical(235);
        yellowLine3.moveHorizontal(268);
        yellowLine3.makeVisible();
        
        yellowLine4 = new Square();
        yellowLine4.changeSize(16);
        yellowLine4.changeColor("yellow");
        yellowLine4.moveVertical(235);
        yellowLine4.moveHorizontal(168);
        yellowLine4.makeVisible();
        
        yellowLine5 = new Square();
        yellowLine5.changeSize(16);
        yellowLine5.changeColor("yellow");
        yellowLine5.moveVertical(235);
        yellowLine5.moveHorizontal(152);
        yellowLine5.makeVisible();
        
        yellowLine6 = new Square();
        yellowLine6.changeSize(16);
        yellowLine6.changeColor("yellow");
        yellowLine6.moveVertical(235);
        yellowLine6.moveHorizontal(136);
        yellowLine6.makeVisible();

        yellowLine7 = new Square();
        yellowLine7.changeSize(16);
        yellowLine7.changeColor("yellow");
        yellowLine7.moveVertical(235);
        yellowLine7.moveHorizontal(36);
        yellowLine7.makeVisible();
        
        yellowLine8 = new Square();
        yellowLine8.changeSize(16);
        yellowLine8.changeColor("yellow");
        yellowLine8.moveVertical(235);
        yellowLine8.moveHorizontal(20);
        yellowLine8.makeVisible();
        
        yellowLine9 = new Square();
        yellowLine9.changeSize(16);
        yellowLine9.changeColor("yellow");
        yellowLine9.moveVertical(235);
        yellowLine9.moveHorizontal(4);
        yellowLine9.makeVisible();
        
        yellowLine10 = new Square();
        yellowLine10.changeSize(16);
        yellowLine10.changeColor("yellow");
        yellowLine10.moveVertical(235);
        yellowLine10.moveHorizontal(400);
        yellowLine10.makeVisible();
        
        yellowLine11 = new Square();
        yellowLine11.changeSize(16);
        yellowLine11.changeColor("yellow");
        yellowLine11.moveVertical(235);
        yellowLine11.moveHorizontal(416);
        yellowLine11.makeVisible();
        
        yellowLine12 = new Square();
        yellowLine12.changeSize(16);
        yellowLine12.changeColor("yellow");
        yellowLine12.moveVertical(235);
        yellowLine12.moveHorizontal(432);
        yellowLine12.makeVisible();
        

    }


    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        if (abe != null)   // only if it's painted already...
        {
            sky.changeColor("black");
            blacktop.changeColor("white");
            wheel1.changeColor("black"); //keeping wheels under body to show the outline better
            wheel2.changeColor("black");
            abe.changeColor("white");
            body.changeColor("white");
            wing.changeColor("white");
            nose.changeColor("white");
            door.changeColor("white");
            front.changeColor("white");
            trunk1.changeColor("white");
            trunk2.changeColor("white");
            treeTop.changeColor("white");
            treeMid.changeColor("white");
            treeBase.changeColor("white");
            treeTop2.changeColor("white");
            treeMid2.changeColor("white");
            treeBase2.changeColor("white");
            yellowLine1.changeColor("black");
            yellowLine2.changeColor("black");
            yellowLine3.changeColor("black");
            yellowLine4.changeColor("black");
            yellowLine5.changeColor("black");
            yellowLine6.changeColor("black");
            yellowLine7.changeColor("black");
            yellowLine8.changeColor("black");
            yellowLine9.changeColor("black");
            yellowLine10.changeColor("black");
            yellowLine11.changeColor("black");
            yellowLine12.changeColor("black");
            
        }
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        if (abe != null)   // only if it's painted already...
        {
            sky.changeColor("blue");
            ground.changeColor("green");
            blacktop.changeColor("black");
            abe.changeColor("blue");
            body.changeColor("red");
            wing.changeColor("red");
            nose.changeColor("red");
            door.changeColor("red");
            front.changeColor("red");
            wheel1.changeColor("grey");
            wheel2.changeColor("grey");
            trunk1.changeColor("brown");
            trunk2.changeColor("brown");
            treeTop.changeColor("forrest");
            treeMid.changeColor("forrest");
            treeBase.changeColor("forrest");
            treeTop2.changeColor("forrest");
            treeMid2.changeColor("forrest");
            treeBase2.changeColor("forrest");
            yellowLine1.changeColor("yellow");
            yellowLine2.changeColor("yellow");
            yellowLine3.changeColor("yellow");
            yellowLine4.changeColor("yellow");
            yellowLine5.changeColor("yellow");
            yellowLine6.changeColor("yellow");
            yellowLine7.changeColor("yellow");
            yellowLine8.changeColor("yellow");
            yellowLine9.changeColor("yellow");
            yellowLine10.changeColor("yellow");
            yellowLine11.changeColor("yellow");
            yellowLine12.changeColor("yellow");
            
        }
    }
}
