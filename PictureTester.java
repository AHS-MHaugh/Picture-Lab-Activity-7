
/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  


  /** Method to test keepOnlyBlue */
  public static void testKeepOnlyBlue()
  {
    //Use the beach.jpg image
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    //Use the keepOnlyBlue method
    beach.keepOnlyBlue();
    beach.explore();
  }
  

    /** Method to test negate */
  public static void testNegate()
  {
    //Use the beach.jpg image
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    //Use the negate method
    beach.negate();
    beach.explore();
  }

    /** Method to test negate */
  public static void testGrayscale()
  {
    //Use the beach.jpg image
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    //Use the grayscale method
    beach.grayscale();
    beach.explore();
  }

    /** Method to test negate */
  public static void testFixUnderwater()
  {
    //Use the water.jpg image
    Picture water = new Picture("water.jpg");
    water.explore();
    //Use the fixUnderwater method
    water.fixUnderwater();
    water.explore();
  }
  
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
  
    /** Method to test mirrorVerticalRightToLeft */
  public static void testMirrorVerticalRightToLeft()
  {
    //Use the caterpillar.jpg image
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    //Use the mirrorVerticalRightToLeft method
    caterpillar.mirrorVerticalRightToLeft();
    caterpillar.explore();
  }
  
  
  /** Method to test mirrorHorizontal */
  public static void testMirrorHorizontal()
  {
    //Use the caterpillar.jpg image
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    //Use the mirrorHorizontal method
    caterpillar.mirrorHorizontal();
    caterpillar.explore();
  }
 
  /** Method to test mirrorHorizontalBotToTop */
  public static void testMirrorHorizontalBotToTop()
  {
    //Use the caterpillar.jpg image
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    //Use the mirrorHorizontalBotToTop method
    caterpillar.mirrorHorizontalBotToTop();
    caterpillar.explore();
  }  
  
      /** Method to test mirrorDiagonal */
  public static void testMirrorDiagonal()
  {
    //Use the beach.jpg image
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    //Use the mirrorDiagonal method
    beach.mirrorDiagonal();
    beach.explore();
  }
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    //Use the temple.jpg image
    Picture temple = new Picture("temple.jpg");
    temple.explore();
    //Use the mirrorTemple method
    temple.mirrorTemple();
    temple.explore();
  }

    /** Method to test mirrorArms */
    public static void testMirrorArms()
  {
    //Use the snowman.jpg image
    Picture snowman = new Picture("snowman.jpg");
    snowman.explore();
    //Use the mirrorArms method
    snowman.mirrorArms();
    snowman.explore();
  }
    
      /** Method to test mirrorGull */
    public static void testMirrorGull()
  {
    //Use the seagull.jpg image
    Picture seagull = new Picture("seagull.jpg");
    seagull.explore();
    //Use the mirrorGull method
    seagull.mirrorGull();
    seagull.explore();
  }

  
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }
  
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
    //testZeroBlue();
    //testKeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
    //testNegate();
    //testGrayscale();
    //testFixUnderwater();
    //testMirrorVertical();
    //testMirrorVerticalRightToLeft();
    //testMirrorHorizontal();
    //testMirrorHorizontalBotToTop();
    testMirrorTemple();
    testMirrorArms();
    testMirrorGull();
    //testMirrorDiagonal();
    //testCollage();
    //testCopy();
    //testEdgeDetection();
    //testEdgeDetection2();
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
  }
}