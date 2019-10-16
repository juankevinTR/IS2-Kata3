package com.juankevintrujillo;

/**
 *
 * @author juankevintr
 */
public class Main {

    public static void main(String[] args) {
        
        Histogram<String> histogram = new Histogram();

        histogram.increment("gmail.com");
        histogram.increment("yahoo.com");
        histogram.increment("outlook.com");
        histogram.increment("ulpgc.es");
        histogram.increment("dis.ulpgc.es");

        HistogramDisplay histogramDisplay = new HistogramDisplay(histogram);
        histogramDisplay.execute();
        
    }
    
}
