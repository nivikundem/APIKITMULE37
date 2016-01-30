package com.vbsapi.org;


import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;


@XmlAccessorType(XmlAccessType.FIELD)
public class VBLoadArray {
	
	@XmlElement(name="return")
	protected List<VBLoad> vbloads;

	public List<VBLoad> getVbloads() {
		return vbloads;
	}

	public void setVbloads(List<VBLoad> vbloads) {
		this.vbloads = vbloads;
	}
	
}

