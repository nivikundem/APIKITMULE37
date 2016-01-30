package com.vbsapi.component;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import org.mule.api.MuleEventContext;
import org.mule.api.MuleMessage;
import org.mule.api.lifecycle.Callable;
import org.mule.api.transport.PropertyScope;

import com.vbsapi.org.VBLoad;

	public class BuildJAXB implements Callable {
		
		VBLoad vbload = null;  		
		@Override
		public Object onCall(MuleEventContext eventContext) throws Exception {

			List<VBLoad> vbList = new ArrayList<VBLoad>();	 
			try
			{
				JAXBContext jaxbContext = JAXBContext.newInstance(VBLoad.class); 		   
				Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
				InputStream is = null;
				MuleMessage msg = eventContext.getMessage();
				LinkedList<Map> xmlList=(LinkedList<Map>)msg.getProperty("xmlList", PropertyScope.SESSION);					
				for(int i = 0 ; i < xmlList.size(); i++)
				{
					Map rowmap = xmlList.get(i);	
					if(rowmap.get("MessageData") != null)
					vbList.add((VBLoad)unmarshaller.unmarshal(new ByteArrayInputStream(((String)rowmap.get("MessageData").toString()).getBytes("UTF-8"))));				
				}					
			}
			catch (Exception e)
			{
			   e.printStackTrace();
			}
			return vbList;	
		}

	}
	
