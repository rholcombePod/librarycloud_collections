/**
*
* package-info is the reserved name for the jaxb class used to set package-level information for
* jaxb classes; here it is used to set namespaces for our "item" api, as well as for mods and xlink
* (otherwise jaxb generates ns1, ns2, etc)
* 
* @author Michael Vandermillen
*
*/

@javax.xml.bind.annotation.XmlSchema(namespace = "http://api.lib.harvard.edu/v2/collection/",  
    xmlns = {   
		@javax.xml.bind.annotation.XmlNs(namespaceURI = "http://api.lib.harvard.edu/v2/collection/", prefix = ""),
		@javax.xml.bind.annotation.XmlNs(namespaceURI = "http://purl.org/dc/elements/1.1/", prefix = "dc"),
		@javax.xml.bind.annotation.XmlNs(namespaceURI = "http://purl.org/dc/terms/", prefix = "dcterms"),
		@javax.xml.bind.annotation.XmlNs(namespaceURI = "http://purl.org/dc/dcmitype/", prefix = "dcmitype"),
		@javax.xml.bind.annotation.XmlNs(namespaceURI = "http://www.loc.gov/loc.terms/relators/", prefix = "marcrel"),
		@javax.xml.bind.annotation.XmlNs(namespaceURI = "http://purl.org/cld/terms/", prefix = "cld"),
		@javax.xml.bind.annotation.XmlNs(namespaceURI = "http://purl.org/cld/cdtype/", prefix = "cdtype")
    },  
    elementFormDefault = javax.xml.bind.annotation.XmlNsForm.QUALIFIED) 
package edu.harvard.librarycloud.collections.model;