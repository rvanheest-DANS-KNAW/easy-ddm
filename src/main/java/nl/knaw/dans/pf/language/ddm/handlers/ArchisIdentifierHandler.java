package nl.knaw.dans.pf.language.ddm.handlers;

import nl.knaw.dans.pf.language.emd.types.BasicIdentifier;
import org.xml.sax.SAXException;

import java.net.URI;
import java.net.URISyntaxException;

public class ArchisIdentifierHandler extends IdentifierHandler {

  public ArchisIdentifierHandler() {
    super("Archis_onderzoek_m_nr");
  }

  @Override protected void setScheme(BasicIdentifier identifier) throws SAXException {
    super.setScheme(identifier);

    identifier.setSchemeId("archaeology.dc.identifier");

    try {
      String value = identifier.getValue();
      if (value.length() < 10) {
        identifier.setIdentificationSystem(new URI("http://archis2.archis.nl"));
      }
      else if (value.length() == 10) {
        identifier.setIdentificationSystem(new URI("https://archis.cultureelerfgoed.nl"));
      }
      else {
        throw new SAXException("identifier '" + value + "' should have 10 or less characters");
      }
    }
    catch (URISyntaxException e) {
      throw new SAXException(e);
    }
  }
}
