package opencvtutorial;
import java.util.Arrays;
import java.io.File;
import org.opencv.core.*;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.imgproc.Imgproc;

public class TestOpenCv {
    public static void main(String[] args) {
    	//use eclipse to open project
    	//use this article to set up https://medium.com/javarevisited/setting-up-opencv-for-java-44c6eb6ae7e1
        // Load the image
    	System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
        Mat image = Imgcodecs.imread("C:\\Red.jpg");
        
        // Convert the image to the HSV color space
        Mat hsvImage = new Mat();
        Imgproc.cvtColor(image, hsvImage, Imgproc.COLOR_BGR2HSV);

        // Calculate the histogram of the image
        Mat hist = new Mat();
        Imgproc.calcHist(Arrays.asList(hsvImage), new MatOfInt(0, 1), new Mat(), hist, new MatOfInt(180, 256), new MatOfFloat(0, 180, 0, 256));

        // Get the index of the maximum value in the histogram
        Core.MinMaxLocResult maxResult = Core.minMaxLoc(hist);
        Point maxLoc = maxResult.maxLoc;

        // Get the most common color in HSV
        double[] mostCommonColorHSV = new double[] { maxLoc.x, maxLoc.y, 255 };

        // Convert the most common color from HSV to RGB
        Mat mostCommonColorBGRMat = new Mat(1, 1, CvType.CV_8UC3, new Scalar(mostCommonColorHSV));
        Mat mostCommonColorRGBMat = new Mat();
        Imgproc.cvtColor(mostCommonColorBGRMat, mostCommonColorRGBMat, Imgproc.COLOR_HSV2RGB);

        // Convert to Java Color object
        double[] mostCommonColorRGB = mostCommonColorRGBMat.get(0, 0);
        for(int i = 0; i < mostCommonColorRGB.length; i++) {
        	System.out.println(mostCommonColorRGB[i]);
        }
    }
}
