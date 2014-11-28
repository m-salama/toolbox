package eu.amidst.core.huginlink;


import COM.hugin.HAPI.*;
import eu.amidst.core.models.BayesianNetwork;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by afa on 19/11/14.
 */
public class ConverterToAmidstTest {

    private BayesianNetwork amidstBN;
    private Domain huginBN;

    @Before
    public void setUp() throws ExceptionHugin {

        ParseListener parseListener = new DefaultClassParseListener();
        this.huginBN = new Domain ("networks/huginNetworkFromAMIDST.net", parseListener);
        System.out.println("\n\nConverting the Hugin network into AMIDST format ...");
        ConverterToAMIDST converter = new ConverterToAMIDST(this.huginBN);
        converter.convertToAmidstBN();
        this.amidstBN = converter.getAmidstNetwork();
        System.out.println("\nAMIDST network object created.");
    }

    @Test
    public void testAmidstAndHuginModels() throws ExceptionHugin {


    }


}