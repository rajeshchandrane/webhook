package Zwayam;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import Zwayam.WebhookResponse;

@Controller
@RequestMapping("/webhook")
public class WebhookController {

	static final Logger logger = Logger.getLogger(WebhookController.class);
	
	/*@RequestMapping(value = "/WsJobTitlePost", method = RequestMethod.POST, consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody String  WsJobTitlePost(HttpServletRequest request, HttpServletResponse response) throws IOException{
		Enumeration en = request.getParameterNames();
		String data = null;
		while (en.hasMoreElements()) {
			data = (String) en.nextElement();
		}
		return "Java Developer";
	}*/

    @RequestMapping(method = RequestMethod.POST)
    public @ResponseBody WebhookResponse webhook(@RequestBody String obj) throws JsonProcessingException{
    	ObjectMapper mapperObj = new ObjectMapper();
    	
    	logger.info("Enter into post method"+obj);
        System.out.println(obj);
        logger.info(mapperObj.writeValueAsString(new WebhookResponse()));
        return new WebhookResponse();
    }
	
}
