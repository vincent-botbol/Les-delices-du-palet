package test;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.xml.sax.SAXException;

import com.delices.datastore.jaxb.hierarchy.LeagueType;

public class MyTest {

	public static void main(String[] args) throws JAXBException, SAXException {

		final JAXBContext jc = JAXBContext
				.newInstance("com.delices.datastore.jaxb.hierarchy");

		Unmarshaller um = jc.createUnmarshaller();

		@SuppressWarnings("unchecked")
		JAXBElement<LeagueType> st = (JAXBElement<LeagueType>) um
				.unmarshal(new File("data/hierarchy.xml"));

		LeagueType s = st.getValue();

		System.out.println(s.getId());
		System.out.println(s.getConference().get(0).getName());

	}
}
