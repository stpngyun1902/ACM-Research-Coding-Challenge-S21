import ca.ualberta.stothard.cgview.*;
import java.io.*;
import java.awt.*;
import java.io.IOException;
import java.util.*;

public class CgviewTest1 implements CgviewConstants {

    public static void main(String[ ] args)
{
        int length = 2766;
        Cgview cgview = new Cgview(length);


        File inputFile = new File("/c/Users/Nguyen Ngoc Van Anh/ACM-Research-Coding-Challenge-S21/Genome.gb");
        FileInputStream inStream = new FileInputStream(inputFile);
        Scanner sc = new Scanner(inStream);
        String sequence;
        String line;
        while(sc.hasNextLine())
            {
                line = sc.nextLine();
                sequence += line + "\n";
            }
        sequence = sequence.substring(sequence.indexOf("ORIGIN") + 6, sequence.indexOf("//"));

        //some optional settings
        cgview.setWidth(600);
        cgview.setHeight(600);
        cgview.setBackboneRadius(140.0f);
cgview.setTitle("Tomato Curly Scunt Virus");
        cgview.setLabelPlacementQuality(5);
        cgview.setShowWarning(false);
        cgview.setLabelLineLength(15.0d);
        cgview.setLabelLineThickness(1.0f);
        cgview.setUseInnerLabels(INNER_LABELS_SHOW);
        cgview.setMoveInnerLabelsToOuter(true);
        cgview.setMinimumFeatureLength(1.0d);

        Legend legend = new Legend(cgview);
        legend.setPosition(LEGEND_UPPER_CENTER);
        LegendItem legendItem = new LegendItem(legend);
        legendItem.setLabel("Tomato Curly Scunt Virus");
        legendItem.setFont(new Font("SansSerif", Font.BOLD + Font.ITALIC, 22));

        //create FeatureSlots to hold sequence features
        FeatureSlot directSlot0 = new FeatureSlot(cgview, DIRECT_STRAND);
        //FeatureSlot directSlot1 = new FeatureSlot(cgview, DIRECT_STRAND);
        //FeatureSlot reverseSlot0 = new FeatureSlot(cgview, REVERSE_STRAND);

        //Features to add to the FeatureSlots
        Feature feature0 = new Feature(directSlot0, "A");
        feature0.setColor(Color.blue);
     Feature feature1 = new Feature(directSlot0, "C");
        feature1.setColor(Color.red);

        Feature feature2 = new Feature(directSlot0, "G");
        feature2.setColor(Color.green);

        Feature feature3 = new Feature(directSlot0, "T");
        featurre3.setColor(Color.yellow);


        //create random sequence features
        int num = sequence.length();
        for (int i = 1; i < num - 1; i = i + 1) {
            String temp = sequence.substring(i, i+1);

            int j = Math.round((float)((float)(length - 2) * Math.random())) + 1;
            int k = Math.round((float)((float)(length - 2) * Math.random())) + 1;
            int l = Math.round((float)((float)(length - 2) * Math.random())) + 1;
            int m = Math.round((float)((float)(length - 2) * Math.random())) + 1;

            if(temp.equals("a")) { FeatureRange featureRange0 = new FeatureRange (feature0, j, j + 1);}
            else if(temp.equals("c")) { FeatureRange featureRange1 = new FeatureRange (feature1, k, k + 1);}
            else if(temp.equals("g")) { FeatureRange featureRange2 = new FeatureRange (feature2, l, l + 1);}
            else if(temp.equals("t")) { FeatureRange featureRange3 = new FeatureRange (feature3, m, m + 1);
        }
       try {
            File outputFile = new File("CircularGenomeMap.png");
            //create a PNG file
            CgviewIO.writeToPNGFile(cgview, "CircularGenomeMap.png");
            //create an SVG file
            CgviewIO.writeToSVGFile(cgview, "CircularGenomeMap.svg", false);
        }
        catch (IOException e) {
            e.printStackTrace(System.err);
            System.exit(1);
        }
        }
}
}


