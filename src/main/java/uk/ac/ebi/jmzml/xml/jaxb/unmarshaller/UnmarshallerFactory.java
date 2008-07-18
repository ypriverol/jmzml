/**
 * User: rcote
 * Date: 13-Jun-2008
 * Time: 12:08:25
 * $Id: $
 */
package uk.ac.ebi.jmzml.xml.jaxb.unmarshaller;

import org.apache.log4j.Logger;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import uk.ac.ebi.jmzml.model.mzml.ModelConstants;
import uk.ac.ebi.jmzml.xml.jaxb.adapters.*;
import uk.ac.ebi.jmzml.xml.jaxb.unmarshaller.cache.AdapterObjectCache;
import uk.ac.ebi.jmzml.xml.jaxb.unmarshaller.filters.MzMLNamespaceFilter;
import uk.ac.ebi.jmzml.xml.xxindex.MzMLIndexer;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.UnmarshallerHandler;
import javax.xml.bind.helpers.DefaultValidationEventHandler;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

public class UnmarshallerFactory {

    private static final Logger logger = Logger.getLogger(UnmarshallerFactory.class);

    private static UnmarshallerFactory instance = new UnmarshallerFactory();

    public static UnmarshallerFactory getInstance() {
        return instance;
    }

    private UnmarshallerFactory() {
    }

    public Unmarshaller initializeUnmarshaller(MzMLIndexer index, MzMLNamespaceFilter xmlFilter, AdapterObjectCache cache) {

        try {

            //create unmarshaller
            JAXBContext jc = JAXBContext.newInstance(ModelConstants.PACKAGE);
            Unmarshaller unmarshaller = jc.createUnmarshaller();

            /*
               Sometimes it's convenient to maintain application states inside adapters; for example, if you have
               an adapter that converts string on XML into a java.lang.Class object, you might want to have a
                ClassLoader in an adapter.

               In JAXB, this is done by allowing applications to set configured instances of XmlAdapters
               to the unmarshaller/marshaller. This is also an opportunity to pass in a sub-class of the
               declared adapter, if you so wish.

               If the application doesn't provide a configured instance, JAXB will create
               one by calling the default constructor.
                */

            //it is not possible to concurrently reuse a common unmarshaller
            //across all the Adapters because of internal state conflicts
            //when trying to unmarshall a referenced object from within a
            //parent object.

            //create a cache object that will be common to all adapters in this unmarshaller
            unmarshaller.setAdapter(new CVAdapter(index, cache));
            unmarshaller.setAdapter(new DataProcessingAdapter(index, cache));
            unmarshaller.setAdapter(new InstrumentConfigurationAdapter(index, cache));
            unmarshaller.setAdapter(new ReferenceableParamGroupAdapter(index, cache));
            unmarshaller.setAdapter(new SampleAdapter(index, cache));
            unmarshaller.setAdapter(new SoftwareAdapter(index, cache));
            unmarshaller.setAdapter(new SourceFileAdapter(index, cache));
            unmarshaller.setAdapter(new SpectrumAdapter(index, cache));
            unmarshaller.setEventHandler(new DefaultValidationEventHandler());
            UnmarshallerHandler uh = unmarshaller.getUnmarshallerHandler();

            // Create a new XML parser
            SAXParserFactory factory = SAXParserFactory.newInstance();
            factory.setNamespaceAware(true);
            SAXParser parser = factory.newSAXParser();
            XMLReader xmlReader = parser.getXMLReader();

            // Create a filter to intercept events -- and patch the missing namespace
            xmlFilter.setParent(xmlReader);
            xmlFilter.setContentHandler(uh);

            logger.info("Unmarshaller Initialized");

            return unmarshaller;

        } catch (JAXBException e) {
            logger.error("UnmarshallerFactory.initializeUnmarshaller", e);
            throw new IllegalStateException("Could not initialize unmarshaller");
        } catch (SAXException e) {
            logger.error("UnmarshallerFactory.initializeUnmarshaller", e);
            throw new IllegalStateException("Could not initialize unmarshaller");
        } catch (ParserConfigurationException e) {
            logger.error("UnmarshallerFactory.initializeUnmarshaller", e);
            throw new IllegalStateException("Could not initialize unmarshaller");
        }

    }

}
