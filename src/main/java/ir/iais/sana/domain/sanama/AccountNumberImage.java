package ir.iais.sana.domain.sanama;

import javax.xml.bind.annotation.XmlElement;
import java.util.List;

public class AccountNumberImage {
    @XmlElement(name = "Attachment_List")
    private List<Attachment> attachments;
}
