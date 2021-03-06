package net.ripe.db.whois.api.rest.domain;

import com.google.common.collect.Lists;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "primary-key")
@XmlAccessorType(XmlAccessType.FIELD)
public class PrimaryKey {

    @XmlElement(name = "attribute")
    private List<Attribute> attributes;

    public PrimaryKey(final List<Attribute> attributes) {
        this.attributes = attributes;
    }

    public PrimaryKey() {
        this.attributes = Lists.newArrayList();
    }

    public List<Attribute> getAttributes() {
        return this.attributes;
    }
}
