/*
 * Date: 22/7/2008
 * Author: rcote
 * File: uk.ac.ebi.jmzml.model.mzml.ObjectFactory
 *
 * jmzml is Copyright 2008 The European Bioinformatics Institute
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 *
 *
 */

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-558 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2008.06.19 at 10:48:08 AM BST 
//


package uk.ac.ebi.jmzml.model.mzml;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the uk.ac.ebi.pride3.model.mzml package.
 * <p>An ObjectFactory allows you to programatically
 * construct new instances of the Java representation
 * for XML content. The Java representation of XML
 * content can consist of schema derived interfaces
 * and classes representing the binding of schema
 * type definitions, element declarations and model
 * groups.  Factory methods for each of these are
 * provided in this class.
 */
// todo - note that the QName registered to the PSI namespace for the MzML element has been removed
// todo - because it interfered with the marshalling of other objects by reserving the "" uri prefix
// todo - and it was generally not required anyway because of the XML I/O mechanisms used.

@XmlRegistry
public class ObjectFactory {

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: uk.ac.ebi.pride3.model.mzml
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ParamGroup }
     */
    public ParamGroup createParamGroup() {
        return new ParamGroup();
    }

    /**
     * Create an instance of {@link SourceFileList }
     */
    public SourceFileList createSourceFileList() {
        return new SourceFileList();
    }

    /**
     * Create an instance of {@link FileDescription }
     */
    public FileDescription createFileDescription() {
        return new FileDescription();
    }

    /**
     * Create an instance of {@link SourceComponent }
     */
    public SourceComponent createSourceComponent() {
        return new SourceComponent();
    }

    /**
     * Create an instance of {@link ReferenceableParamGroupRef }
     */
    public ReferenceableParamGroupRef createReferenceableParamGroupRef() {
        return new ReferenceableParamGroupRef();
    }

    /**
     * Create an instance of {@link BinaryDataArray }
     */
    public BinaryDataArray createBinaryDataArray() {
        return new BinaryDataArray();
    }

    /**
     * Create an instance of {@link SelectedIonList }
     */
    public SelectedIonList createSelectedIonList() {
        return new SelectedIonList();
    }

    /**
     * Create an instance of {@link ReferenceableParamGroupList }
     */
    public ReferenceableParamGroupList createReferenceableParamGroupList() {
        return new ReferenceableParamGroupList();
    }

    /**
     * Create an instance of {@link CVList }
     */
    public CVList createCVList() {
        return new CVList();
    }

    /**
     * Create an instance of {@link CV }
     */
    public CV createCV() {
        return new CV();
    }

    /**
     * Create an instance of {@link ScanWindowList }
     */
    public ScanWindowList createScanWindowList() {
        return new ScanWindowList();
    }

    /**
     * Create an instance of {@link ChromatogramList }
     */
    public ChromatogramList createChromatogramList() {
        return new ChromatogramList();
    }

    /**
     * Create an instance of {@link Sample }
     */
    public Sample createSample() {
        return new Sample();
    }

    /**
     * Create an instance of {@link InstrumentConfiguration }
     */
    public InstrumentConfiguration createInstrumentConfiguration() {
        return new InstrumentConfiguration();
    }

    /**
     * Create an instance of {@link AcquisitionList }
     */
    public AcquisitionList createAcquisitionList() {
        return new AcquisitionList();
    }

    /**
     * Create an instance of {@link DetectorComponent }
     */
    public DetectorComponent createDetectorComponent() {
        return new DetectorComponent();
    }

    /**
     * Create an instance of {@link ComponentList }
     */
    public ComponentList createComponentList() {
        return new ComponentList();
    }

    /**
     * Create an instance of {@link InstrumentConfigurationList }
     */
    public InstrumentConfigurationList createInstrumentConfigurationList() {
        return new InstrumentConfigurationList();
    }

    /**
     * Create an instance of {@link DataProcessingList }
     */
    public DataProcessingList createDataProcessingList() {
        return new DataProcessingList();
    }

    /**
     * Create an instance of {@link SpectrumDescription }
     */
    public SpectrumDescription createSpectrumDescription() {
        return new SpectrumDescription();
    }

    /**
     * Create an instance of {@link Precursor }
     */
    public Precursor createPrecursor() {
        return new Precursor();
    }

    /**
     * Create an instance of {@link SoftwareParam }
     */
    public SoftwareParam createSoftwareParam() {
        return new SoftwareParam();
    }

    /**
     * Create an instance of {@link Spectrum }
     */
    public Spectrum createSpectrum() {
        return new Spectrum();
    }

    /**
     * Create an instance of {@link DataProcessing }
     */
    public DataProcessing createDataProcessing() {
        return new DataProcessing();
    }

    /**
     * Create an instance of {@link PrecursorList }
     */
    public PrecursorList createPrecursorList() {
        return new PrecursorList();
    }

    /**
     * Create an instance of {@link ReferenceableParamGroup }
     */
    public ReferenceableParamGroup createReferenceableParamGroup() {
        return new ReferenceableParamGroup();
    }

    /**
     * Create an instance of {@link SampleList }
     */
    public SampleList createSampleList() {
        return new SampleList();
    }

    /**
     * Create an instance of {@link AcquisitionSettings }
     */
    public AcquisitionSettings createAcquisitionSettings() {
        return new AcquisitionSettings();
    }

    /**
     * Create an instance of {@link ScanWindow }
     */
    public ScanWindow createScanWindow() {
        return new ScanWindow();
    }

    /**
     * Create an instance of {@link TargetList }
     */
    public TargetList createTargetList() {
        return new TargetList();
    }

    /**
     * Create an instance of {@link Scan }
     */
    public Scan createScan() {
        return new Scan();
    }

    /**
     * Create an instance of {@link Acquisition }
     */
    public Acquisition createAcquisition() {
        return new Acquisition();
    }

    /**
     * Create an instance of {@link ProcessingMethod }
     */
    public ProcessingMethod createProcessingMethod() {
        return new ProcessingMethod();
    }

    /**
     * Create an instance of {@link SoftwareRef }
     */
    public SoftwareRef createSoftwareRef() {
        return new SoftwareRef();
    }

    /**
     * Create an instance of {@link SourceFileRefList }
     */
    public SourceFileRefList createSourceFileRefList() {
        return new SourceFileRefList();
    }

    /**
     * Create an instance of {@link Run }
     */
    public Run createRun() {
        return new Run();
    }

    /**
     * Create an instance of {@link AnalyzerComponent }
     */
    public AnalyzerComponent createAnalyzerComponent() {
        return new AnalyzerComponent();
    }

    /**
     * Create an instance of {@link Chromatogram }
     */
    public Chromatogram createChromatogram() {
        return new Chromatogram();
    }

    /**
     * Create an instance of {@link SourceFileRef }
     */
    public SourceFileRef createSourceFileRef() {
        return new SourceFileRef();
    }

    /**
     * Create an instance of {@link CVParam }
     */
    public CVParam createCVParam() {
        return new CVParam();
    }

    /**
     * Create an instance of {@link MzML }
     */
    public MzML createMzML() {
        return new MzML();
    }

    /**
     * Create an instance of {@link SourceFile }
     */
    public SourceFile createSourceFile() {
        return new SourceFile();
    }

    /**
     * Create an instance of {@link UserParam }
     */
    public UserParam createUserParam() {
        return new UserParam();
    }

    /**
     * Create an instance of {@link SoftwareList }
     */
    public SoftwareList createSoftwareList() {
        return new SoftwareList();
    }

    /**
     * Create an instance of {@link Software }
     */
    public Software createSoftware() {
        return new Software();
    }

    /**
     * Create an instance of {@link BinaryDataArrayList }
     */
    public BinaryDataArrayList createBinaryDataArrayList() {
        return new BinaryDataArrayList();
    }

    /**
     * Create an instance of {@link AcquisitionSettingsList }
     */
    public AcquisitionSettingsList createAcquisitionSettingsList() {
        return new AcquisitionSettingsList();
    }

    /**
     * Create an instance of {@link SpectrumList }
     */
    public SpectrumList createSpectrumList() {
        return new SpectrumList();
    }

    /**
     * Create an instance of {@link Component }
     */
    public Component createComponent() {
        return new Component();
    }

}